package com.elvis.zuul.wrapper;

import com.netflix.zuul.http.HttpServletRequestWrapper;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.zuul.wrapper
 * @Author: elvis
 * @CreateTime: 2020-03-25 04:28
 * @Description: 防止xss攻击
 */
public class XssAndSqlHttpServletRequestWrapper extends HttpServletRequestWrapper {

    public XssAndSqlHttpServletRequestWrapper(HttpServletRequest request) {
        super(request);

    }

    @Override
    public String getParameter(String name) {
        String value = super.getParameter(name);
        if (!StringUtils.isEmpty(value)) {
            value = StringEscapeUtils.escapeJava(value);
        }
        return value;
    }
}