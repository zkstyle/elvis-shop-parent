package com.elvis.member.mapper;

import com.elvis.member.mapper.entity.UserDo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.member.service.impl
 * @Author: elvis
 * @CreateTime: 2020-03-06 22:06
 * @Description: 用户Mapper
 */

public interface UserMapper {

	@Insert("INSERT INTO `elvis_user` VALUES (null,#{mobile}, #{email}, #{password}, #{userName}, null, null, null, '1', null, null, null);")
	int register(UserDo userDo);

	@Select("SELECT * FROM elvis_user WHERE MOBILE=#{mobile};")
	UserDo existMobile(@Param("mobile") String mobile);

	//登录sql
	@Select("SELECT USER_ID AS USERID ,MOBILE AS MOBILE,EMAIL AS EMAIL,PASSWORD AS PASSWORD, USER_NAME AS USER_NAME ,SEX AS SEX ,AGE AS AGE ,CREATE_TIME AS CREATETIME,IS_AVALIBLE AS ISAVALIBLE,PIC_IMG AS PICIMG,QQ_OPENID AS QQOPENID,WX_OPENID AS WXOPENID "
			+ "  FROM elvis_user  WHERE MOBILE=#{0} and password=#{1};")
	UserDo login(@Param("mobile") String mobile, @Param("password") String password);

	//通过id查询用户
	@Select("SELECT USER_ID AS USERID ,MOBILE AS MOBILE,EMAIL AS EMAIL,PASSWORD AS PASSWORD, USER_NAME AS USER_NAME ,SEX AS SEX ,AGE AS AGE ,CREATE_TIME AS CREATETIME,IS_AVALIBLE AS ISAVALIBLE,PIC_IMG AS PICIMG,QQ_OPENID AS QQOPENID,WX_OPENID AS WXOPENID"
			+ " FROM elvis_user WHERE user_Id=#{userId}")
	UserDo findByUserId(@Param("userId") Long userId);
}
