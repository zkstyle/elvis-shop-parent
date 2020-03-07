package com.elvis.base;

import lombok.Data;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.base
 * @Author: elvis
 * @CreateTime: 2020-03-05 15:36
 * @Description: 微服务接口统一返回码
 */
@Data
public class BaseResponse<T> {

	/**
	 * 返回码
	 */
	private Integer code;
	/**
	 * 消息
	 */
	private String msg;
	/**
	 * 返回
	 */
	private T data;
	// 分页

	public BaseResponse() {

	}

	public BaseResponse(Integer code, String msg, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

}
