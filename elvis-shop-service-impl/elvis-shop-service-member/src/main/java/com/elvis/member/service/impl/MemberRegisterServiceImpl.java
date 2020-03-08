package com.elvis.member.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.elvis.base.BaseApiService;
import com.elvis.base.BaseResponse;
import com.elvis.constants.Constants;
import com.elvis.core.bean.ElvisBeanUtils;
import com.elvis.core.utils.MD5Util;
import com.elvis.member.feign.VerificaCodeServiceFeign;
import com.elvis.member.input.dto.UserInpDTO;
import com.elvis.member.mapper.UserMapper;
import com.elvis.member.MemberRegisterService;
import com.elvis.member.mapper.entity.UserDo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.member.service.impl
 * @Author: elvis
 * @CreateTime: 2020-03-06 22:06
 * @Description: 会员注册实现
 */
@RestController
public class MemberRegisterServiceImpl extends BaseApiService<JSONObject> implements MemberRegisterService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private VerificaCodeServiceFeign verificaCodeServiceFeign;

    @Transactional //开启事务
    public BaseResponse<JSONObject> register(@RequestBody UserInpDTO userInpDTO, String registCode) {
        // 1.参数验证
        String userName = userInpDTO.getUserName();
        if (StringUtils.isEmpty(userName)) {
            return setResultError("用户名称不能为空!");
        }
        String mobile = userInpDTO.getMobile();
        if (StringUtils.isEmpty(mobile)) {
            return setResultError("手机号码不能为空!");
        }
        String password = userInpDTO.getPassword();
        if (StringUtils.isEmpty(password)) {
            return setResultError("密码不能为空!");
        }
        // 2.验证码注册码是否正确 暂时省略 会员调用微信接口实现注册码验证
        BaseResponse<JSONObject> verificaWeixinCode = verificaCodeServiceFeign.verificaWeixinCode(mobile, registCode);
        if (!verificaWeixinCode.getCode().equals(Constants.HTTP_RES_CODE_200)) {
            return setResultError(verificaWeixinCode.getMsg());
        }
        // 3.对用户的密码进行加密 // MD5 可以解密 暴力破解
        String newPassword = MD5Util.MD5(password);
        userInpDTO.setPassword(newPassword);
        //4将请求的DTO转化为DO
        UserDo userDo = ElvisBeanUtils.dtoToDo(userInpDTO,UserDo.class);
        // 4.调用数据库插入数据
        return userMapper.register(userDo) > 0 ? setResultSuccess("注册成功") : setResultError("注册失败!");
    }
    //dto do可能存在相同参数
}
