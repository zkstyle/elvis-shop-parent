package com.elvis.member.feign;

import com.elvis.weixin.service.VerificaCodeService;
import org.springframework.cloud.openfeign.FeignClient;


@FeignClient("app-elvis-weixin")
public interface VerificaCodeServiceFeign extends VerificaCodeService {

}
