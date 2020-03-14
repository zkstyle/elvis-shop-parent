package com.elvis.base;

import lombok.Data;

import java.util.Date;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.base
 * @Author: elvis
 * @CreateTime: 2020-03-10 23:11
 * @Description: 公共属性抽取类
 */
@Data
public class BaseDo {
    /**
     * 注册时间
     */
    private Date createTime;
    /**
     * 修改时间
     *
     */
    private Date updateTime;
    /**
     * id
     */
    private Long id;

    /**
     * 是否可用 0可用 1不可用
     */
    private Long isAvailability;
}
