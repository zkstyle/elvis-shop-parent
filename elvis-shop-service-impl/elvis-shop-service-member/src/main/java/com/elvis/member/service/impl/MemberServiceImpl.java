package com.elvis.member.service.impl;

import com.elvis.base.BaseApiService;
import com.elvis.base.BaseResponse;
import com.elvis.constants.Constants;
import com.elvis.member.entity.UserEntity;
import com.elvis.member.mapper.UserMapper;
import com.elvis.member.MemberService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.member.service.impl
 * @Author: elvis
 * @CreateTime: 2020-02-28 20:32
 * @Description:
 */
@RestController
public class MemberServiceImpl extends BaseApiService<UserEntity> implements MemberService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public BaseResponse<UserEntity> existMobile(String mobile) {
        //验证参数
        if (StringUtils.isEmpty(mobile)){
            return setResultError("手机号不能为空！");
        }
        //2. 根据手机号查询用户信息
        UserEntity userEntity = userMapper.existMobile(mobile);
        if (userEntity == null){
            return setResultError(Constants.HTTP_RES_CODE_EXIST_MOBILE_203,"用户信息不存在！");
        }
        //对特殊字段做脱敏
        userEntity.setPassword(null);
        return setResultSuccess(userEntity);

    }
}
