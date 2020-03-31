package com.elvis.product.api.service;

import com.elvis.base.BaseResponse;
import com.elvis.member.output.dto.ProductDto;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.product.api.service
 * @Author: elvis
 * @CreateTime: 2020-03-18 05:32
 * @Description: 商品服务接口
 */
public interface ProductSearchService {

    @GetMapping("/search")
    public BaseResponse<List<ProductDto>> search(String name);

}