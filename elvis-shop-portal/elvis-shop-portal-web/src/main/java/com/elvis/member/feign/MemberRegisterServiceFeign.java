package com.elvis.member.feign;


import com.elvis.member.MemberRegisterService;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;


@FeignClient("app-elvis-member")
@Headers({ "Content-Type: application/json", "Accept: application/json" })
public interface MemberRegisterServiceFeign extends MemberRegisterService {

}
