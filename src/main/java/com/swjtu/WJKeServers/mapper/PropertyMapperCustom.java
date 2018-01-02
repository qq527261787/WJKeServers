package com.swjtu.WJKeServers.mapper;

import com.swjtu.WJKeServers.entity.Property;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PropertyMapperCustom {
    List<Property> queryEnjoy(@Param(value = "address") String address);
}
