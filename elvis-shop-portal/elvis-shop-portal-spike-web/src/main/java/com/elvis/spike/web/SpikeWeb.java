package com.elvis.spike.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.spike.web
 * @Author: elvis
 * @CreateTime: 2020-03-28 04:04
 * @Description: 秒杀web启动
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class SpikeWeb {

    public static void main(String[] args) {
        SpringApplication.run(SpikeWeb.class, args);
    }

}