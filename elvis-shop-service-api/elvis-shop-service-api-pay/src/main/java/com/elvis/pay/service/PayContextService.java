package com.elvis.pay.service;

import com.alibaba.fastjson.JSONObject;
import com.elvis.base.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.pay.service
 * @Author: elvis
 * @CreateTime: 2020-03-21 05:25
 * @Description: 根据不同的渠道id 返回不同的支付提交表单
 */
public interface PayContextService {

    @GetMapping("/toPayHtml")
    public BaseResponse<JSONObject> toPayHtml(@RequestParam("channelId") String channelId,
                                              @RequestParam("payToken") String payToken);

}
