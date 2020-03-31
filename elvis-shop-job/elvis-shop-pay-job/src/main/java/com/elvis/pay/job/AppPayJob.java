package com.elvis.pay.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.pay.job
 * @Author: elvis
 * @CreateTime: 2020-03-24 04:21
 * @Description: 支付服务任务调度
 */
@SpringBootApplication
public class AppPayJob {

    public static void main(String[] args) {
        SpringApplication.run(AppPayJob.class, args);
    }

}
