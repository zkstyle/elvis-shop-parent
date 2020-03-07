package com.elvis.weixin.service;

import com.elvis.base.BaseResponse;
import com.elvis.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: service
 * @Author: elvis
 * @CreateTime: 2020-02-28 15:19
 * @Description:
 */
@Api(tags = "微信服务接口")
public interface WexinService {

    @ApiOperation(value = "微信应用服务接口")
    @GetMapping("/getApp")
    public BaseResponse<AppEntity> getApp();
}
