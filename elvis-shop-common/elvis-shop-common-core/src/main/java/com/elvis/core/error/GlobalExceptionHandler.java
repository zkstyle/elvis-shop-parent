package com.elvis.core.error;

import com.elvis.base.BaseApiService;
import com.elvis.base.BaseResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.core.utils
 * @Author: elvis
 * @CreateTime: 2020-03-06 10:37
 * @Description: 全局捕获异常
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends BaseApiService<JSONObject> {
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public BaseResponse<JSONObject> exceptionHandler(Exception e) {
		log.info("###全局捕获异常###,error:{}", e);
		return setResultError("系统错误!");
	}
}
