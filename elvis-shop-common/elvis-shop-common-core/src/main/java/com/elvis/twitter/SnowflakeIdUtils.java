package com.elvis.twitter;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.mapper
 * @Author: elvis
 * @CreateTime: 2020-03-21 16:34
 * @Description: 使用雪花算法生成全局id
 */
public class SnowflakeIdUtils {
	private static SnowflakeIdWorker idWorker;
	static {
		// 使用静态代码块初始化 SnowflakeIdWorker
		idWorker = new SnowflakeIdWorker(1, 1);
	}

	public static String nextId() {
		return idWorker.nextId() + "";
	}

}
