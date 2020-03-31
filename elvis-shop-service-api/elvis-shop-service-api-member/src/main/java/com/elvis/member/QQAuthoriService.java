package com.elvis.member;

import com.alibaba.fastjson.JSONObject;
import com.elvis.base.BaseResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.member
 * @Author: elvis
 * @CreateTime: 2020-03-15 03:47
 * @Description: QQ授权Service
 */
public interface QQAuthoriService {
    /**
     * 根据 openid查询是否已经绑定,如果已经绑定，则直接实现自动登陆
     *
     * @param qqOpenId
     * @return
     */
    @RequestMapping("/findByOpenId")
    BaseResponse<JSONObject> findByOpenId(@RequestParam("qqOpenId") String qqOpenId);

}
