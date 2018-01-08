package com.swjtu.WJKeServers.mapper;

import com.swjtu.WJKeServers.entityCustom.PropertyCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PropertyMapperCustom {
    List<PropertyCustom> queryEnjoy(@Param(value = "address") String address);
    List<PropertyCustom> queryRenting(@Param(value = "address") String address);
    List<PropertyCustom> queryPurchase(@Param(value = "address") String address);
}
