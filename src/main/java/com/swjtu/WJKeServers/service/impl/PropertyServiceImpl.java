package com.swjtu.WJKeServers.service.impl;

import com.swjtu.WJKeServers.entity.Property;
import com.swjtu.WJKeServers.entity.PropertyExample;
import com.swjtu.WJKeServers.mapper.PropertyMapper;
import com.swjtu.WJKeServers.mapper.PropertyMapperCustom;
import com.swjtu.WJKeServers.service.IPropertyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PropertyServiceImpl implements IPropertyService {
    @Resource
    private PropertyMapper propertyMapper;
    @Resource
    private PropertyMapperCustom propertyMapperCustom;

    public List<Property> queryEnjoy(String address) throws Exception {
        if(address == null){
            return null;
        }
        else{
            return propertyMapperCustom.queryEnjoy(address);
        }
    }
}
