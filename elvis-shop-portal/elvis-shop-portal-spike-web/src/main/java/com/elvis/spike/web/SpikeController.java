package com.elvis.spike.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.spike.web
 * @Author: elvis
 * @CreateTime: 2020-03-28 04:05
 * @Description: 秒杀访问相关请求
 */
@Controller
public class SpikeController {
    /**
     * 秒杀商品详情页面
     *
     * @return
     */
    @RequestMapping("/details/{id}")
    public String details(@PathVariable("id") Long id) {
        return "details";
    }
}