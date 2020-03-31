package com.elvis.pay.job.job.handler;

import org.omg.PortableInterceptor.SUCCESSFUL;
import org.springframework.stereotype.Component;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;

import lombok.extern.slf4j.Slf4j;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.pay.job
 * @Author: elvis
 * @CreateTime: 2020-03-24 04:21
 * @Description: 使用任务调度实现自动化补偿
 */
@JobHandler(value = "payJobHandler")
@Component
@Slf4j
public class PayJobHandler extends IJobHandler {

	@Override
	public ReturnT<String> execute(String param) throws Exception {
		log.info(">>>使用任务调度实现自动化对账");
		return SUCCESS;
	}

}
