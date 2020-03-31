package com.elvis.zuul.mapper;

import com.elvis.zuul.mapper.entity.ElvisBlacklist;
import org.apache.ibatis.annotations.Select;



public interface BlacklistMapper {

	@Select(" select ID AS ID ,ip_addres AS ipAddres,restriction_type  as restrictionType, availability  as availability from elvis_blacklist where  ip_addres =#{ipAddres} and  restriction_type='1' ")
	ElvisBlacklist findBlacklist(String ipAddres);

}
