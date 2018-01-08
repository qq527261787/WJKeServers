package com.swjtu.WJKeServers.service;

import com.swjtu.WJKeServers.entityCustom.PropertyCustom;

import java.util.List;

public interface IPropertyService {
    /**
     * 查询获取喜好房源
     * @param address 城市
     * @return
     * @throws Exception
     */
    public List<PropertyCustom> queryEnjoy(String address) throws Exception;

    /**
     * 查询获取出租房源
     * @param address 城市
     * @return
     * @throws Exception
     */
    public List<PropertyCustom> queryRenting(String address) throws Exception;

    /**
     * 查询获取出售房源
     * @param address 城市
     * @return
     * @throws Exception
     */
    public List<PropertyCustom> queryPurchase(String address) throws Exception;

    /**
     * 查询为房源添加照片
     * @param propertyCustom 房源列表
     * @return
     * @throws Exception
     */
    public List<PropertyCustom> addPhoto(List<PropertyCustom> propertyCustom) throws Exception;
}
