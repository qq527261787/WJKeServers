package com.swjtu.WJKeServers.mapper;

import com.swjtu.WJKeServers.entity.Propertyphoto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PropertyphotoMapperCustom {
    List<Propertyphoto> queryPhoto(@Param(value = "propertyid") String propertyid);
}
