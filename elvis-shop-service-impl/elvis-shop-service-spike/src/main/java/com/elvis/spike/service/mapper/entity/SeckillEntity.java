package com.elvis.spike.service.mapper.entity;

import lombok.Data;
import java.util.Date;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.spike.service.mapper.entity
 * @Author: elvis
 * @CreateTime: 2020-03-27 04:39
 * @Description: 商品库存
 */
@Data
public class SeckillEntity {

	/**
	 * 库存id
	 * 
	 */
	private Long seckillId;
	/**
	 * 商品名称
	 */
	private String name;

	/**
	 * 库存数量
	 */
	private Long inventory;

	/**
	 * 开启时间
	 */
	private Date startTime;

	/**
	 * 结束时间
	 */
	private Date endTime;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 秒杀抢购
	 */
	private Long version;
}
