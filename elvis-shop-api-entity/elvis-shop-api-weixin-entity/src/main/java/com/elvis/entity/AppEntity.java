package com.elvis.entity;

import lombok.Data;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.entity
 * @Author: elvis
 * @CreateTime: 2020-02-28 14:09
 * @Description:
 */
@Data
public class AppEntity {

    /**
     * 应用id
     */
    private String appId;
    /**
     * 应用密钥
     */
    private String appSecret;

    public AppEntity() {

    }

    public AppEntity(String appId, String appSecret) {
        super();
        this.appId = appId;
        this.appSecret = appSecret;
    }

}