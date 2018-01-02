package com.swjtu.WJKeServers.mapper;

import com.swjtu.WJKeServers.entity.Propertyphoto;
import com.swjtu.WJKeServers.entity.PropertyphotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PropertyphotoMapper {
    int countByExample(PropertyphotoExample example);

    int deleteByExample(PropertyphotoExample example);

    int deleteByPrimaryKey(String photoid);

    int insert(Propertyphoto record);

    int insertSelective(Propertyphoto record);

    List<Propertyphoto> selectByExample(PropertyphotoExample example);

    Propertyphoto selectByPrimaryKey(String photoid);

    int updateByExampleSelective(@Param("record") Propertyphoto record, @Param("example") PropertyphotoExample example);

    int updateByExample(@Param("record") Propertyphoto record, @Param("example") PropertyphotoExample example);

    int updateByPrimaryKeySelective(Propertyphoto record);

    int updateByPrimaryKey(Propertyphoto record);
}