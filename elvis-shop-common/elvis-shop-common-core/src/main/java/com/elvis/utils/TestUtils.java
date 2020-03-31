package com.elvis.utils;

import com.elvis.sign.SignUtil;
import java.util.HashMap;
import java.util.Map;


public class TestUtils {

	public static void main(String[] args) {
		Map<String, String> sParaTemp = new HashMap<String, String>();
		sParaTemp.put("payAmount", "300222");
		sParaTemp.put("orderId", "2019010203501502");
		sParaTemp.put("userId", "201389103");
		String result = HttpClientUtils.doPost("http://127.0.0.1/api-pay/createPayToken", SignUtil.sign(sParaTemp));
		System.out.println("result:" + result);
	}
}
