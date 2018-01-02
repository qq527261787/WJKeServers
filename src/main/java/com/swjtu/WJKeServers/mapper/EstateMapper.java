package com.swjtu.WJKeServers.mapper;

import com.swjtu.WJKeServers.entity.Estate;
import com.swjtu.WJKeServers.entity.EstateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EstateMapper {
    int countByExample(EstateExample example);

    int deleteByExample(EstateExample example);

    int deleteByPrimaryKey(String estateid);

    int insert(Estate record);

    int insertSelective(Estate record);

    List<Estate> selectByExample(EstateExample example);

    Estate selectByPrimaryKey(String estateid);

    int updateByExampleSelective(@Param("record") Estate record, @Param("example") EstateExample example);

    int updateByExample(@Param("record") Estate record, @Param("example") EstateExample example);

    int updateByPrimaryKeySelective(Estate record);

    int updateByPrimaryKey(Estate record);
}