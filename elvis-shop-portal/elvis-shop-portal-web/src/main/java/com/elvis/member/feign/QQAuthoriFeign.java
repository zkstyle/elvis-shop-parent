package com.elvis.member.feign;

import com.elvis.member.QQAuthoriService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.member.feign
 * @Author: elvis
 * @CreateTime: 2020-03-14 23:52
 * @Description: qq授权feign客户端
 */
@FeignClient("app-elvis-member")
public interface QQAuthoriFeign extends QQAuthoriService {
}
