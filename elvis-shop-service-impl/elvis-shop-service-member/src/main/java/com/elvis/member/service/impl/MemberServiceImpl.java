package com.elvis.member.service.impl;

import com.elvis.base.BaseApiService;
import com.elvis.base.BaseResponse;
import com.elvis.constants.Constants;
import com.elvis.core.bean.ElvisBeanUtils;
import com.elvis.member.input.dto.UserInpDTO;
import com.elvis.member.mapper.UserMapper;
import com.elvis.member.MemberService;
import com.elvis.member.mapper.entity.UserDo;
import com.elvis.member.output.dto.UserOutDTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
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
public class MemberServiceImpl extends BaseApiService<UserOutDTO> implements MemberService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public BaseResponse<UserOutDTO> existMobile(String mobile) {
        //验证参数
        if (StringUtils.isEmpty(mobile)){
            return setResultError("手机号不能为空！");
        }
        //2. 根据手机号查询用户信息
        UserDo userDo = userMapper.existMobile(mobile);
        if (userDo == null){
            return setResultError(Constants.HTTP_RES_CODE_EXIST_MOBILE_203,"用户信息不存在！");
        }
        return setResultSuccess(ElvisBeanUtils.doToDto(userDo,UserOutDTO.class));
    }
}
