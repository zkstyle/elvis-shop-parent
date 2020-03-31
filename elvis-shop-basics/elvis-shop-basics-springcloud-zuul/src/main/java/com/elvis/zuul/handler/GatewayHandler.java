package com.elvis.zuul.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.netflix.zuul.context.RequestContext;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.zuul.handler
 * @Author: elvis
 * @CreateTime: 2020-03-27 05:26
 * @Description: 定义网关请求的Handler
 */
public interface GatewayHandler {

	/**
	 * 每一个Handler执行的方法
	 */
	public void service(RequestContext ctx, HttpServletRequest req, HttpServletResponse response);

	/**
	 * 指向下一个Handler
	 * 
	 * @param gatewayHandler
	 */
	public void setNextHandler(GatewayHandler gatewayHandler);
}
