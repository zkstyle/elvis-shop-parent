package com.elvis.pay.callback.template.factory;

import com.elvis.core.utils.SpringContextUtil;
import com.elvis.pay.callback.template.AbstractPayCallbackTemplate;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.pay.constant
 * @Author: elvis
 * @CreateTime: 2020-03-22 23:13
 * @Description: 获取具体实现的模版工厂方案
 */
public class TemplateFactory {

	public static AbstractPayCallbackTemplate getPayCallbackTemplate(String beanId) {
		return (AbstractPayCallbackTemplate) SpringContextUtil.getBean(beanId);
	}

}

