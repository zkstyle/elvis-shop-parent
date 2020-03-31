package com.elvis.pay.service;

import com.elvis.base.BaseResponse;
import com.elvis.weixin.out.dto.PayMentTransacDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: service
 * @Author: elvis
 * @CreateTime: 2020-03-20 15:19
 * @Description:　服务接口
 */
public interface PayMentTransacInfoService {
	@GetMapping("/tokenByPayMentTransac")
	public BaseResponse<PayMentTransacDTO> tokenByPayMentTransac(@RequestParam("token") String token);
}
