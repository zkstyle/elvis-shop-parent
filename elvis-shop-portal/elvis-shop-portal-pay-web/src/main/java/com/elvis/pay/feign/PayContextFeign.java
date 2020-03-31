package com.elvis.pay.feign;

import com.elvis.pay.service.PayContextService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("app-elvis-pay")
public interface PayContextFeign extends PayContextService {

}
