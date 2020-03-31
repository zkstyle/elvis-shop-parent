package com.elvis.auth.service.api;

import com.alibaba.fastjson.JSONObject;
import com.elvis.base.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.auth.service.api
 * @Author: elvis
 * @CreateTime: 2020-03-25 01:35
 * @Description: 第三方用户授权接口
 */
public interface AuthorizationService {
    /**
     * 机构申请 获取appid 和appsecret
     *
     * @return
     */
    @GetMapping("/applyAppInfo")
    public BaseResponse<JSONObject> applyAppInfo(@RequestParam("appName") String appName);

    /*
     * 使用appid 和appsecret密钥获取AccessToken
     */
    @GetMapping("/getAccessToken")
    public BaseResponse<JSONObject> getAccessToken(@RequestParam("appId") String appId,
                                                   @RequestParam("appSecret") String appSecret);

    /*
     * 验证Token是否失效
     */
    @GetMapping("/getAppInfo")
    public BaseResponse<JSONObject> getAppInfo(@RequestParam("accessToken") String accessToken);

}