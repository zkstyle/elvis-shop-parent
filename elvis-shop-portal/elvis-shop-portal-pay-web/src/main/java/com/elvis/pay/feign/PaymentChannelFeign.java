package com.elvis.pay.feign;

import com.elvis.pay.service.PaymentChannelService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("app-elvis-pay")
public interface PaymentChannelFeign extends PaymentChannelService {

}
