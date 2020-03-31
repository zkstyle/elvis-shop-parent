package com.elvis.product.es.reposiory;

import com.elvis.product.es.entity.ProductEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductReposiory extends ElasticsearchRepository<ProductEntity, Long> {

}
 