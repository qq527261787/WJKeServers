package com.swjtu.WJKeServers.service;

import com.swjtu.WJKeServers.entity.Property;
import com.swjtu.WJKeServers.util.PageResult;

import java.util.List;

public interface IPropertyService {
    /**
     * 查询获取喜好房源
     * @param address 城市
     * @return
     * @throws Exception
     */
    public List<Property> queryEnjoy(String address) throws Exception;
}
