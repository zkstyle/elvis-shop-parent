package com.elvis.mapper;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import java.util.List;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.mapper
 * @Author: elvis
 * @CreateTime: 2020-03-21 16:34
 * @Description: mapper工具类
 */
public class MapperUtils {
    static MapperFactory mapperFactory;
    static {
        mapperFactory = new DefaultMapperFactory.Builder().build();
    }

    public static <S, D> List<D> mapAsList(Iterable<S> source, Class<D> destinationClass) {
        return mapperFactory.getMapperFacade().mapAsList(source, destinationClass);
    }
}
