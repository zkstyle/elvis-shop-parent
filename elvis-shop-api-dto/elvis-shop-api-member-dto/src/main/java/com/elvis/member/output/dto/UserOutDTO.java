package com.elvis.member.output.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.member.entity
 * @Author: elvis
 * @CreateTime: 2020-03-06 21:31
 * @Description:
 */
@Data
@ApiModel(value = "用户返回参数")
public class UserOutDTO {

    /**
     * userid　
     */
    @ApiModelProperty(value = "用户id")
    private Long userId;
    /**
     * 手机号码
     */
    @ApiModelProperty(value = "手机号码")
    private String mobile;
    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String email;
    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;
    /**
     * 用户名称
     */
    @ApiModelProperty(value = "用户名称")
    private String userName;
    /**
     * 性别 0 男 1女
     */
    @ApiModelProperty(value = "用户性别")
    private char sex;
    /**
     * 年龄
     */
    @ApiModelProperty(value = "用户年龄")
    private Long age;
    /**
     * 注册时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
    /**
     * 修改时间
     *
     */
    @ApiModelProperty(value = "修改时间")
    private Date updateTime;
    /**
     * 账号是否可以用 1 正常 0冻结
     */
    @ApiModelProperty(value = "账号是否可以用 1 正常 0冻结")
    private char isAvalible;
    /**
     * 用户头像
     */
    @ApiModelProperty(value = " 用户头像")
    private String picImg;
    /**
     * 用户关联 QQ 开放ID
     */
    @ApiModelProperty(value = "用户关联 QQ 开放ID")
    private Date qqOpenid;
    /**
     * 用户关联 微信 开放ID
     */
    @ApiModelProperty(value = "用户关联 微信 开放ID")
    private Date wxOpenId;

    //private Boolean isVip;

    /**
     * 目前存在的问题　接口层传递实体类->  数据库传递实体类都是相同的
     * 注册的时候不需要传递某些字段
     * 查询用户相关信息　不需要将密码返回给客户端
     * 请求参数返回参数如果公用同一个实体类　可能会存在哪些问题　可能会暴露数据库字段攻击　安全性
     * 修改用户密码
     *
     * DTO主要用户外部接口参数传递封装
     * DO主要操作用户数据库层传递
     * VO主要用于视图层展示
     * DTO转DO（接口接收参数　转换为数据库实体类插入数据库中） DO转换DTO(向数据库查询数据转换DTO返回给客户端
     */
}
