package com.swjtu.WJKeServers.web.controller;

import com.swjtu.WJKeServers.service.IPropertyService;
import com.swjtu.WJKeServers.util.JsonResult;
import com.swjtu.WJKeServers.util.enums.StatusCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("property")
@ResponseBody
public class PropertyController {
    @Resource
    private IPropertyService propertyService;

    @RequestMapping(value="/enjoy", method = RequestMethod.GET)
    public JsonResult queryEnjoy(String address) throws  Exception{
        System.out.println("获取喜好地址房源：" + address);
        return JsonResult.build(StatusCode.SUCCESS, propertyService.addPhoto(propertyService.queryEnjoy(address)));
    }

    @RequestMapping(value="/renting", method = RequestMethod.GET)
    public JsonResult queryRenting(String address) throws  Exception{
        System.out.println("获取出租地址房源：" + address);
        return JsonResult.build(StatusCode.SUCCESS, propertyService.addPhoto(propertyService.queryRenting(address)));
    }

    @RequestMapping(value="/purchase", method = RequestMethod.GET)
    public JsonResult queryPurchase(String address) throws  Exception{
        System.out.println("获取出售地址房源：" + address);
        return JsonResult.build(StatusCode.SUCCESS, propertyService.addPhoto(propertyService.queryPurchase(address)));
    }
}
