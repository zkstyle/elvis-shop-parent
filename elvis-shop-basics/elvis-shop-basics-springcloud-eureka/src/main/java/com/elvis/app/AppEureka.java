package com.elvis.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description: eurekaa注册中心
 * @author: elvis
 * @contact: 微信ZKLOVE9527 www.vazh.cn
 * @date: 2019-03-07 10:57
 */
@SpringBootApplication
@EnableEurekaServer
public class AppEureka {

	public static void main(String[] args) {
		SpringApplication.run(AppEureka.class, args);
	}

}
