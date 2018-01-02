package com.swjtu.WJKeServers.mapper;

import com.swjtu.WJKeServers.entity.District;
import com.swjtu.WJKeServers.entity.DistrictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DistrictMapper {
    int countByExample(DistrictExample example);

    int deleteByExample(DistrictExample example);

    int insert(District record);

    int insertSelective(District record);

    List<District> selectByExample(DistrictExample example);

    int updateByExampleSelective(@Param("record") District record, @Param("example") DistrictExample example);

    int updateByExample(@Param("record") District record, @Param("example") DistrictExample example);
}