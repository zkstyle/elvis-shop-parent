package com.elvis.zuul.mapper;

import com.elvis.zuul.mapper.entity.GatewayHandlerEntity;
import org.apache.ibatis.annotations.Select;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.zuul.mapper
 * @Author: elvis
 * @CreateTime: 2020-03-27 05:26
 * @Description: 网关handler数据库访问
 */
public interface GatewayHandlerMapper {

    /**
     * 获取第一个GatewayHandler
     *
     * @return
     */
    @Select("SELECT  handler_name AS handlerName,handler_id AS handlerid ,prev_handler_id AS prevhandlerid ,next_handler_id AS nexthandlerid  ,is_open AS ISOPEN FROM gateway_handler WHERE is_open ='1' and prev_handler_id is null;;")
    public GatewayHandlerEntity getFirstGatewayHandler();

    @Select("SELECT  handler_name AS handlerName,handler_id AS handlerid ,prev_handler_id AS prevhandlerid ,next_handler_id AS nexthandlerid  ,is_open AS ISOPEN FROM gateway_handler WHERE is_open ='1' and handler_id=#{handlerId}")
    public GatewayHandlerEntity getByHandler(String handlerId);

}
