package com.elvis.pay.service.impl;

import com.elvis.base.BaseApiService;
import com.elvis.base.BaseResponse;
import com.elvis.pay.factory.StrategyFactory;
import com.elvis.pay.mapper.PaymentChannelMapper;
import com.elvis.pay.mapper.entity.PaymentChannelEntity;
import com.elvis.pay.service.PayContextService;
import com.elvis.pay.service.PayMentTransacInfoService;
import com.elvis.pay.strategy.PayStrategy;
import com.elvis.weixin.out.dto.PayMentTransacDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONObject;


@RestController
public class PayContextServiceImpl extends BaseApiService<JSONObject> implements PayContextService {
	//根据channelId查询classAddres(反射全类名)
	@Autowired
	private PaymentChannelMapper paymentChannelMapper;
	@Autowired
	private PayMentTransacInfoService payMentTransacInfoService;

	@Override
	public BaseResponse<JSONObject> toPayHtml(String channelId, String payToken) {

		// 1.使用渠道id获取渠道信息 classAddres
		PaymentChannelEntity pymentChannel = paymentChannelMapper.selectBychannelId(channelId);
		if (pymentChannel == null) {
			return setResultError("没有查询到该渠道信息");
		}
		// 2.使用payToken获取支付参数
		BaseResponse<PayMentTransacDTO> tokenByPayMentTransac = payMentTransacInfoService
				.tokenByPayMentTransac(payToken);
		if (!isSuccess(tokenByPayMentTransac)) {
			return setResultError(tokenByPayMentTransac.getMsg());
		}
		PayMentTransacDTO payMentTransacDTO = tokenByPayMentTransac.getData();
		// 3.执行具体的支付渠道的算法获取html表单数据 策略设计模式 使用java反射机制 执行具体方法
		String classAddres = pymentChannel.getClassAddres();
		PayStrategy payStrategy = StrategyFactory.getPayStrategy(classAddres);
		String payHtml = payStrategy.toPayHtml(pymentChannel, payMentTransacDTO);
		// 4.直接返回html
		JSONObject data = new JSONObject();
		data.put("payHtml", payHtml);
		return setResultSuccess(data);
	}

}
