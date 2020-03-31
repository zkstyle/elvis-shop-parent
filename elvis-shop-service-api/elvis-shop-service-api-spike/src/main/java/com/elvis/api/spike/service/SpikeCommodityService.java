package com.elvis.api.spike.service;

import com.alibaba.fastjson.JSONObject;
import com.elvis.base.BaseResponse;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.api.spike.service
 * @Author: elvis
 * @CreateTime: 2020-03-27 04:27
 * @Description: 秒杀商品服务接口
 */
public interface SpikeCommodityService {

    /**
     * 用户秒杀接口 phone和userid都可以的
     *
     * @phone 手机号码<br>
     * @seckillId 库存id
     * @return
     */
    @RequestMapping("/spike")
    public BaseResponse<JSONObject> spike(String phone, Long seckillId);

    /**
     * 新增对应商品库存令牌桶　秒杀高并发方案　提前生成好token拿到token意味抢购成功
     *
     * @seckillId 商品库存id
     */
    @RequestMapping("/addSpikeToken")
    public BaseResponse<JSONObject> addSpikeToken(Long seckillId, Long tokenQuantity);

}
