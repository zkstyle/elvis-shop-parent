package com.elvis;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigChangeListener;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis
 * @Author: elvis
 * @CreateTime: 2020-03-04 20:54
 * @Description: 分布式阿波罗分布式配置中心方法监听
 */
@Component
@Slf4j
public class MyCommandLineRunner implements CommandLineRunner {
    @ApolloConfig
    private Config config;

    @Override
    public void run(String... args) throws Exception {
        log.info("###############MyCommandLineRunner启动#############");
        // 阿波罗方法监听
        config.addChangeListener(new ConfigChangeListener() {

            @Override
            public void onChange(ConfigChangeEvent changeEvent) {
                log.info("####分布式配置中心监听#####" + changeEvent.changedKeys().toString());
            }
        });
    }

}
