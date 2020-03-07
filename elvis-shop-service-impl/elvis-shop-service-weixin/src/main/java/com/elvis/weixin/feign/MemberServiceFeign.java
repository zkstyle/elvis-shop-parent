package com.elvis.weixin.feign;

import com.elvis.member.MemberService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.weixin.feign
 * @Author: elvis
 * @CreateTime: 2020-03-07 10:54
 * @Description:
 */
@FeignClient("app-elvis-member")
public interface MemberServiceFeign extends MemberService {


}
