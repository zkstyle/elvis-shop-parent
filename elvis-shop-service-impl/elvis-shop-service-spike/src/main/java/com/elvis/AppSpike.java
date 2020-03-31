package com.elvis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis
 * @Author: elvis
 * @CreateTime: 2020-03-27 04:37
 * @Description: 秒杀启动
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.elvis.spike.service.mapper")
@EnableAsync
@EnableHystrix
public class AppSpike {

    public static void main(String[] args) {
        SpringApplication.run(AppSpike.class, args);
    }

}