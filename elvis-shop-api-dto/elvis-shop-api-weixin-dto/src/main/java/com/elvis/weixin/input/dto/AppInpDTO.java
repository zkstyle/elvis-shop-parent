package com.elvis.weixin.input.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.member.entity
 * @Author: elvis
 * @CreateTime: 2020-03-06 21:31
 * @Description:
 */
@Data
public class AppInpDTO {

    private String name;
    private String description;

    public AppInpDTO(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
