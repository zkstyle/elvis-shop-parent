package com.elvis.pay.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.elvis.pay.mq.producer.IntegralProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.pay.service.impl
 * @Author: elvis
 * @CreateTime: 2020-03-24 05:23
 * @Description: 生产者测试消息
 */
@RestController
public class MQTestServiceImpl {
    @Autowired
    private IntegralProducer integralProducer;

    @RequestMapping("/send")
    public String send() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("paymentId", System.currentTimeMillis());
        jsonObject.put("userId", "123456");
        jsonObject.put("integral", 100);
        integralProducer.send(jsonObject);
        return "success";
    }
}
