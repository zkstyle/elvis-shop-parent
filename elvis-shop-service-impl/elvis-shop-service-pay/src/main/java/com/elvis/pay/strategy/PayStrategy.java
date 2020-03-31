package com.elvis.pay.strategy;

import com.elvis.pay.mapper.entity.PaymentChannelEntity;
import com.elvis.weixin.out.dto.PayMentTransacDTO;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.pay.strategy.PayStrategy
 * @Author: elvis
 * @CreateTime: 2020-03-20 22:06
 * @Description:　支付接口共同实现行为算法
 */
public interface PayStrategy {

	/**
	 * 
	 * @param pymentChannel
	 *            渠道参数
	 * @param payMentTransacDTO
	 *            支付参数
	 * @return
	 */
	public String toPayHtml(PaymentChannelEntity pymentChannel, PayMentTransacDTO payMentTransacDTO);

}
