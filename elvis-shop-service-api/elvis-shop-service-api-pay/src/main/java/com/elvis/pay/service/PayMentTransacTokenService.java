package com.elvis.pay.service;

import com.elvis.base.BaseResponse;
import com.elvis.weixin.input.dto.PayCreatePayTokenDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import com.alibaba.fastjson.JSONObject;


/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: service
 * @Author: elvis
 * @CreateTime: 2020-03-20 15:19
 * @Description:　支付交易服务接口
 */
public interface PayMentTransacTokenService {

	/**
	 * 创建支付令牌
	 * 
	 * @return
	 */
	@GetMapping("/createPayToken")
	public BaseResponse<JSONObject> createPayToken(@Validated PayCreatePayTokenDto payCreatePayTokenDto);

}
