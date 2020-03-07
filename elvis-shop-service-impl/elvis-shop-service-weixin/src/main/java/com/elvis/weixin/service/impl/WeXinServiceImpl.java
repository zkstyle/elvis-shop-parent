package com.elvis.weixin.service.impl;

import com.elvis.base.BaseApiService;
import com.elvis.base.BaseResponse;
import com.elvis.entity.AppEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import com.elvis.weixin.service.WexinService;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.weixin.service
 * @Author: elvis
 * @CreateTime: 2020-02-28 15:36
 * @Description: 微信接口的实现
 */

@RestController
public class WeXinServiceImpl extends BaseApiService<AppEntity> implements WexinService {
    /*@Value("${elvis.weixin.name}")
    private String name;*/
    @Override
    public BaseResponse<AppEntity> getApp() {
        return setResultSuccess(new AppEntity("吴珊珊","呆呆呆"));
    }
    //问题：为什么命名为Service 而不是Controller
    //问题：实现中需要写springmvc url映射注释吗？　不需要
}
