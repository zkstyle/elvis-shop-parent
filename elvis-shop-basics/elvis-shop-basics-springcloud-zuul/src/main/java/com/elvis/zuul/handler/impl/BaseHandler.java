package com.elvis.zuul.handler.impl;

import com.elvis.zuul.handler.GatewayHandler;
import com.netflix.zuul.context.RequestContext;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.zuul.handler.impl
 * @Author: elvis
 * @CreateTime: 2020-03-27 05:26
 * @Description: BaseHandler
 */
public class BaseHandler {
	public GatewayHandler nextGatewayHandler;

	public void setNextHandler(GatewayHandler nextGatewayHandler) {
		this.nextGatewayHandler = nextGatewayHandler;
	}

	public void resultError(Integer code, RequestContext ctx, String errorMsg) {
		ctx.setResponseStatusCode(code);
		// 网关响应为false 不会转发服务
		ctx.setSendZuulResponse(false);
		ctx.setResponseBody(errorMsg);
		ctx.getResponse().setContentType("text/html;charset=UTF-8");

	}

}
