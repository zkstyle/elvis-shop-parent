package com.elvis.auth.mapper;

import com.elvis.auth.mapper.entity.ElvisAppInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface AppInfoMapper {

	@Insert("INSERT INTO `elvis_app_info` VALUES (null,#{appName}, #{appId}, #{appSecret}, '0', null, null, null, null, null);")
	public int insertAppInfo(ElvisAppInfo elvisAppInfo);

	@Select("SELECT ID AS ID ,app_id as appId, app_name AS appName ,app_secret as appSecret  FROM elvis_app_info where app_id=#{appId} and app_secret=#{appSecret}; ")
	public ElvisAppInfo selectByAppInfo(@Param("appId") String appId, @Param("appSecret") String appSecret);

	@Select("SELECT ID AS ID ,app_id as appId, app_name AS appName ,app_secret as appSecret  FROM elvis_app_info where app_id=#{appId}  ")
	public ElvisAppInfo findByAppInfo(@Param("appId") String appId);
}
