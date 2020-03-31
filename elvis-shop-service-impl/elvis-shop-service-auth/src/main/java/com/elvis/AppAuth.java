package com.elvis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis
 * @Author: elvis
 * @CreateTime: 2020-03-25 01:44
 * @Description: 认证启动
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
// @EnableApolloConfig
@MapperScan(basePackages = "com.elvis.auth.mapper")
public class AppAuth {

    public static void main(String[] args) {
        SpringApplication.run(AppAuth.class, args);
    }

}