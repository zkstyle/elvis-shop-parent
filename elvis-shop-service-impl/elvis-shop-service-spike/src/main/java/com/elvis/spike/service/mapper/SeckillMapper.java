package com.elvis.spike.service.mapper;

import com.elvis.spike.service.mapper.entity.SeckillEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SeckillMapper {

	@Select("SELECT seckill_id AS seckillId,name as name,inventory as inventory,start_time as startTime,end_time as endTime,create_time as createTime,version as version from elvis_seckill where seckill_id=#{seckillId}")
	SeckillEntity findBySeckillId(Long seckillId);

	/**
	 * 不用乐官锁，如何实现库存防止超卖呢？
	 * 
	 * @param seckillId
	 * @return
	 */

	@Update("update elvis_seckill set inventory=inventory-1, version=version+1 where  seckill_id=#{seckillId} and inventory>0  and version=#{version} ;")
	int inventoryDeduction(@Param("seckillId") Long seckillId, @Param("version") Long version);

	@Update("update elvis_seckill set inventory=inventory-1, version=version+1 where  seckill_id=#{seckillId}  ")
	int modifyInventory(@Param("seckillId") Long seckillId, @Param("version") Long version);

	// update elvis_seckill set inventory=inventory-1 where
	// seckill_id=#{seckillId} and 1>0;
	// update elvis_seckill set inventory=inventory-1 where
	// seckill_id=#{seckillId} and 1>0;
	// 在mysql中每次在更新数据库有行锁机制

	// UPDATE elvis_seckill SET inventory=inventory-1 ,version=version+1 FROM
	// elvis_seckill WHERE seckill_id='10001' and version='1';

}