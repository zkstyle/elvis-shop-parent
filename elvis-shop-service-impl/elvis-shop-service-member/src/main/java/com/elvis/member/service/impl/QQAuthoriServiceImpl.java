package com.elvis.member.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.elvis.base.BaseApiService;
import com.elvis.base.BaseResponse;
import com.elvis.constants.Constants;
import com.elvis.core.token.GenerateToken;
import com.elvis.member.QQAuthoriService;
import com.elvis.member.mapper.UserMapper;
import com.elvis.member.mapper.entity.UserDo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.member.service.impl
 * @Author: elvis
 * @CreateTime: 2020-03-15 03:49
 * @Description: QQ授权服务实现类
 */
@RestController
public class QQAuthoriServiceImpl extends BaseApiService<JSONObject> implements QQAuthoriService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private GenerateToken generateToken;

    @Override
    public BaseResponse<JSONObject> findByOpenId(String qqOpenId) {
        // 1.根据qqOpenId查询用户信息
        if (StringUtils.isEmpty(qqOpenId)) {
            return setResultError("qqOpenId不能为空!");
        }
        // 2.如果没有查询到 直接返回状态码203
        UserDo userDo = userMapper.findByOpenId(qqOpenId);
        if (userDo == null) {
            return setResultError(Constants.HTTP_RES_CODE_NOTUSER_203, "根据qqOpenId没有查询到用户信息");
        }
        // 3.如果能够查询到用户信息的话 返回对应用户信息token
        String keyPrefix = Constants.MEMBER_TOKEN_KEYPREFIX + "QQ_LOGIN";
        Long userId = userDo.getUserId();
        String userToken = generateToken.createToken(keyPrefix, userId + "");
        JSONObject data = new JSONObject();
        data.put("token", userToken);
        return setResultSuccess(data);
    }

}