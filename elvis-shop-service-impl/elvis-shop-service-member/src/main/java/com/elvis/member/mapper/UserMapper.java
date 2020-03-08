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
}
