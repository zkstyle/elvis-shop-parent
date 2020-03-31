package com.elvis.zuul.feign;

import com.elvis.auth.service.api.AuthorizationService;
import org.springframework.cloud.openfeign.FeignClient;


@FeignClient("app-elvis-auth")
public interface AuthorizationServiceFeign extends AuthorizationService {

}
