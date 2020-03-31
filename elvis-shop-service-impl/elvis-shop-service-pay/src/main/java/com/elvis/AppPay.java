package com.elvis;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis
 * @Author: elvis
 * @CreateTime: 2020-03-21 04:49
 * @Description: 支付启动类
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableSwagger2Doc
@MapperScan(basePackages = "com.elvis.pay.mapper")
public class AppPay {
    public static void main(String[] args) {
        SpringApplication.run(AppPay.class, args);
    }
}
