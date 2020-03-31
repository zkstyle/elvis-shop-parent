package com.elvis.pay.callback.template;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.elvis.pay.constant.PayConstant;
import com.elvis.pay.mapper.PaymentTransactionLogMapper;
import com.elvis.pay.mapper.PaymentTransactionMapper;
import com.elvis.pay.mapper.entity.PaymentTransactionLogEntity;
import org.apache.commons.lang.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.transaction.annotation.Transactional;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.pay.constant
 * @Author: elvis
 * @CreateTime: 2020-03-22 23:13
 * @Description: 使用模版方法重构异步回调代码
 *
 */
@Slf4j
public abstract class AbstractPayCallbackTemplate {
    @Autowired
    private PaymentTransactionLogMapper paymentTransactionLogMapper;
    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;
    /**
     * 获取所有请求的参数，封装成Map集合 并且验证是否被篡改
     *
     * @param req
     * @param resp
     * @return
     */
    @Transactional
    public abstract Map<String, String> verifySignature(HttpServletRequest req, HttpServletResponse resp);

    /**
     * 异步回调执行业务逻辑
     *
     * @param verifySignature
     */
    public abstract String asyncService(Map<String, String> verifySignature);

    public abstract String failResult();

    public abstract String successResult();

    /**
     * *1. 将报文数据存放到es <br>
     * 1. 验证报文参数<br>
     * 2. 将日志根据支付id存放到数据库中<br>
     * 3. 执行的异步回调业务逻辑<br>
     */
    @Transactional
    public String asyncCallBack(HttpServletRequest req, HttpServletResponse resp) {
        // 1. 验证报文参数 相同点 获取所有的请求参数封装成为map集合 并且进行参数验证
        Map<String, String> verifySignature = verifySignature(req, resp);
        // 2.将日志根据支付id存放到数据库中
        String paymentId = verifySignature.get("paymentId");
        if (StringUtils.isEmpty(paymentId)) {
            return failResult();
        }
        // 3.采用异步形式写入日志到数据库中
        payLog(paymentId, verifySignature);

        String result = verifySignature.get(PayConstant.RESULT_NAME);
        // 4.201报文验证签名失败
        if (result.equals(PayConstant.RESULT_PAYCODE_201)) {
            return failResult();
        }
        // 5.执行的异步回调业务逻辑
        return asyncService(verifySignature);
    }

    /**
     * 采用多线程技术或者MQ形式进行存放到数据库中
     *
     * @param paymentId
     * @param verifySignature
     */
    private void payLog(String paymentId, Map<String, String> verifySignature) {
        log.info(">>paymentId:{paymentId},verifySignature:{}", verifySignature);
        PaymentTransactionLogEntity paymentTransactionLog = new PaymentTransactionLogEntity();
        paymentTransactionLog.setTransactionId(paymentId);
        paymentTransactionLog.setAsyncLog(verifySignature.toString());
        paymentTransactionLogMapper.insertTransactionLog(paymentTransactionLog);
    }

    // A 1423 B 1234
    /**
     * 使用多线程写入日志目的：加快响应 提高程序效率 使用线程池维护线程
     */
    class PayLogThread implements Runnable {
        private String paymentId;
        private Map<String, String> verifySignature;

        public PayLogThread(String paymentId, Map<String, String> verifySignature) {
            this.paymentId = paymentId;
            this.verifySignature = verifySignature;
        }

        @Override
        public void run() {
            log.info(">>>>>asyncCallBack service 02");
            payLog(paymentId, verifySignature);
            log.info(">>>>>asyncCallBack service 03");
        }

    }


}
