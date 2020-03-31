package com.elvis.pay.compensation.strategy;

import com.elvis.pay.mapper.entity.PaymentChannelEntity;
import com.elvis.pay.mapper.entity.PaymentTransactionEntity;

/**
 * @BelongsProject: elvis-shop-parent
 * @BelongsPackage: com.elvis.pay.compensation.strategy.impl
 * @Author: elvis
 * @CreateTime: 2020-03-22 23:13
 * @Description: 对账抽象策略角色
 *
 */
public interface PaymentCompensationStrategy {
	/**
	 * 渠道名称
	 * 
	 * @param paymentChannel
	 * @return
	 */
	public Boolean payMentCompensation(PaymentTransactionEntity paymentTransaction, PaymentChannelEntity paymentChannel);
}
