package com.elvis.zuul.handler.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.elvis.zuul.handler.GatewayHandler;
import org.springframework.stereotype.Component;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.zuul.handler.impl
 * @Author: elvis
 * @CreateTime: 2020-03-27 05:26
 * @Description: api验证TokenHandler
 */
@Component
@Slf4j
public class ApiAuthorityHandler extends BaseHandler implements GatewayHandler {

	@Override
	public void service(RequestContext ctx, HttpServletRequest req, HttpServletResponse response) {
		log.info(">>>>>>>第四关api验证TokenHandler执行>>>>");
	}

}
