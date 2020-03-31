package com.elvis.pay.feign;

import com.elvis.pay.service.PayMentTransacInfoService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("app-elvis-pay")
public interface PayMentTransacInfoFeign extends PayMentTransacInfoService {

}
