package com.elvis.pay.strategy.impl;

import com.elvis.pay.mapper.entity.PaymentChannelEntity;
import com.elvis.pay.strategy.PayStrategy;
import com.elvis.weixin.out.dto.PayMentTransacDTO;
public class XiaoPayStrategy implements PayStrategy {

	@Override
	public String toPayHtml(PaymentChannelEntity pymentChannel, PayMentTransacDTO payMentTransacDTO) {

		return "小米支付from表单提交";
	}
	//com.elvis.pay.strategy.impl.XiaoPayStrategy

}
