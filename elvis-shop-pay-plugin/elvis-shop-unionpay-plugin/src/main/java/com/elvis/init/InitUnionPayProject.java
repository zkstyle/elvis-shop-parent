package com.elvis.init;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.unionpay.acp.sdk.SDKConfig;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.init.InitUnionPayProject
 * @Author: elvis
 * @CreateTime: 2020-03-21 22:06
 * @Description:　银联支付项目初始化
 */
@Component
public class InitUnionPayProject implements ApplicationRunner {

	// springboot 项目启动的时候 执行该方法
	@Override
	public void run(ApplicationArguments args) throws Exception {
		SDKConfig.getConfig().loadPropertiesFromSrc();
	}
}
