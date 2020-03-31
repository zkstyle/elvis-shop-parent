package com.elvis.pay.service.impl;

import java.util.List;

import com.elvis.base.BaseApiService;
import com.elvis.mapper.MapperUtils;
import com.elvis.pay.mapper.PaymentChannelMapper;
import com.elvis.pay.mapper.entity.PaymentChannelEntity;
import com.elvis.pay.service.PaymentChannelService;
import com.elvis.weixin.out.dto.PaymentChannelDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PaymentChannelServiceImpl extends BaseApiService<List<PaymentChannelDTO>>
		implements PaymentChannelService {
	@Autowired
	private PaymentChannelMapper paymentChannelMapper;

	@Override
	public List<PaymentChannelDTO> selectAll() {
		List<PaymentChannelEntity> paymentChanneList = paymentChannelMapper.selectAll();
		return MapperUtils.mapAsList(paymentChanneList, PaymentChannelDTO.class);
	}

}
