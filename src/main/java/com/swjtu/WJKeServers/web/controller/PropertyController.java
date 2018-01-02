package com.swjtu.WJKeServers.web.controller;

import com.google.gson.Gson;
import com.swjtu.WJKeServers.entity.Property;
import com.swjtu.WJKeServers.service.IPropertyService;
import com.swjtu.WJKeServers.util.JsonResult;
import com.swjtu.WJKeServers.util.enums.StatusCode;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("property")
@ResponseBody
public class PropertyController {
    @Resource
    private IPropertyService propertyService;

    @RequestMapping(value="/queryEnjoy", method = RequestMethod.GET)
    public JsonResult queryEnjoy(String address) throws  Exception{
        System.out.println("获取地址房源：" + address);
        return JsonResult.build(StatusCode.SUCCESS, propertyService.queryEnjoy(address));
    }
}
