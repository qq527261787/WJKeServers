package com.swjtu.WJKeServers.service.impl;

import com.swjtu.WJKeServers.entityCustom.PropertyCustom;
import com.swjtu.WJKeServers.mapper.PropertyMapperCustom;
import com.swjtu.WJKeServers.mapper.PropertyphotoMapperCustom;
import com.swjtu.WJKeServers.service.IPropertyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PropertyServiceImpl implements IPropertyService {

    @Resource
    private PropertyphotoMapperCustom propertyphotoMapperCustom;

    @Resource
    private PropertyMapperCustom propertyMapperCustom;

    public List<PropertyCustom> queryEnjoy(String address) throws Exception {
        if(address == null){
            return null;
        }
        else{
            return propertyMapperCustom.queryEnjoy(address);
        }
    }

    public List<PropertyCustom> queryRenting(String address) throws Exception {
        if(address == null){
            return null;
        }
        else{
            return propertyMapperCustom.queryRenting(address);
        }
    }

    public List<PropertyCustom> queryPurchase(String address) throws Exception {
        if(address == null){
            return null;
        }
        else{
            return propertyMapperCustom.queryPurchase(address);
        }
    }

    public List<PropertyCustom> addPhoto(List<PropertyCustom> propertyCustom) throws Exception {
        if(propertyCustom == null){
            return null;
        }
        else{
            for (PropertyCustom obj : propertyCustom) {
                obj.setPropertyPhoto(propertyphotoMapperCustom.queryPhoto(obj.getPropertyid()));
            }
            return propertyCustom;
        }
    }
}
