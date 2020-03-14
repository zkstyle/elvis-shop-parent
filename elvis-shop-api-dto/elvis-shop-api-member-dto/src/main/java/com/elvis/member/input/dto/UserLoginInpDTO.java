package com.elvis.member.input.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.member.entity
 * @Author: elvis
 * @CreateTime: 2020-03-06 21:31
 * @Description:　用户登录请求参数
 */
@Data
@ApiModel(value = "用户登陆参数")
public class UserLoginInpDTO {
	/**
	 * 手机号码
	 */
	@ApiModelProperty(value = "手机号码")
	private String mobile;
	/**
	 * 密码
	 */
	@ApiModelProperty(value = "密码")
	private String password;

	/**
	 * 登陆类型 PC、Android 、IOS
	 */
	@ApiModelProperty(value = "登陆类型")
	private String loginType;
	/**
	 * 设备信息
	 */
	@ApiModelProperty(value = "设备信息")
	private String deviceInfor;
	// 为什么一个接口单独定义一个 dto请求参数类 swagger 接口文档对称

}
