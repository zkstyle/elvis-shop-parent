package com.elvis.integral;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.integral
 * @Author: elvis
 * @CreateTime: 2020-03-24 05:37
 * @Description: 积分服务启动
 */
@SpringBootApplication
@MapperScan(basePackages = "com.elvis.integral.mapper")
public class AppIntegral {

    public static void main(String[] args) {
        SpringApplication.run(AppIntegral.class, args);
    }

}