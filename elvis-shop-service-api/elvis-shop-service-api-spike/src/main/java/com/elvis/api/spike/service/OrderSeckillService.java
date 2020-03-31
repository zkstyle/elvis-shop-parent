package com.elvis.api.spike.service;

import com.alibaba.fastjson.JSONObject;
import com.elvis.base.BaseResponse;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.api.spike.service
 * @Author: elvis
 * @CreateTime: 2020-03-27 04:31
 * @Description: 查询秒杀记录
 */
public interface OrderSeckillService {

    @RequestMapping("/getOrder")
    public BaseResponse<JSONObject> getOrder(String phone, Long seckillId);

}