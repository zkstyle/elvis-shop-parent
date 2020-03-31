package com.elvis.auth.utils;

import com.elvis.core.utils.MD5Util;
import java.util.UUID;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.utils
 * @Author: elvis
 * @CreateTime: 2020-03-25 01:44
 * @Description: 生成appKey app_secret工具类
 */
public class Guid {
	public String appKey;

	/**
	 * @description:随机获取key值
	 * @return
	 */
	public String guid() {
		UUID uuid = UUID.randomUUID();
		String key = uuid.toString();
		return key;
	}

	/**
	 * 这是其中一个url的参数，是GUID的，全球唯一标志符
	 */
	public String getAppId() {
		Guid g = new Guid();
		String guid = g.guid();
		appKey = guid;
		return appKey;
	}

	/**
	 * 根据md5加密 appid+key 实现MD5
	 */
	public String getAppScrect() {
		String mw = "key" + appKey;
		String app_sign = MD5Util.MD5(mw).toUpperCase();// 得到以后还要用MD5加密。
		return app_sign;
	}

}