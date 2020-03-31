package com.elvis.zuul.build;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.netflix.zuul.context.RequestContext;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.zuul.build
 * @Author: elvis
 * @CreateTime: 2020-03-24 20:59
 * @Description: 网关行为建造者
 */
public interface GatewayBuild {

	/**
	 * 黑名单拦截
	 */
	Boolean blackBlock(RequestContext ctx, String ipAddres, HttpServletResponse response);

	/**
	 * 参数验证
	 */
	Boolean toVerifyMap(RequestContext ctx, String ipAddres, HttpServletRequest request);

}
