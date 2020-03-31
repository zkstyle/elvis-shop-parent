package com.elvis.integral.mapper;


import com.elvis.integral.mapper.entity.IntegralEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.integral
 * @Author: elvis
 * @CreateTime: 2020-03-24 05:37
 * @Description: 积分Mapper
 */
public interface IntegralMapper {
	@Insert("INSERT INTO `elvis_integral` VALUES (NULL, #{userId}, #{paymentId},#{integral}, #{availability}, 0, null, now(), null, now());")
	public int insertIntegral(IntegralEntity eiteIntegralEntity);

	@Select("SELECT  id as id ,USER_ID as userId, PAYMENT_ID as PAYMENTID ,INTEGRAL as INTEGRAL ,AVAILABILITY as AVAILABILITY  FROM elvis_integral where PAYMENT_ID=#{paymentId}  AND AVAILABILITY='1';")
	public IntegralEntity findIntegral(String paymentId);
}
