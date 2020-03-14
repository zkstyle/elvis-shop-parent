package com.elvis.member.feign;


import com.elvis.member.MemberService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("app-elvis-member")
public interface MemberServiceFeign extends MemberService {

}
