package com.elvis.member.feign;

import com.elvis.base.BaseResponse;
import com.elvis.entity.AppEntity;
import com.elvis.weixin.service.WexinService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.member.feign
 * @Author: elvis
 * @CreateTime: 2020-02-28 20:28
 * @Description: weixin feigh服务
 */
@FeignClient("app-elvis-weixin")
public interface WeiXinServiceFeigh extends WexinService {

    @GetMapping("/getApp")
    public BaseResponse<AppEntity> getApp();
}
