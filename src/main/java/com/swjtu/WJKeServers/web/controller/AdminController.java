package com.swjtu.WJKeServers.web.controller;

import com.google.gson.Gson;
import com.swjtu.WJKeServers.entity.Admin;
import com.swjtu.WJKeServers.service.IAdminService;
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

/**
 * Created by Administrator on 2017/10/18.
 */
@Controller
@RequestMapping("admin")
@ResponseBody
public class AdminController {

    @Resource
    private IAdminService adminService;

    @RequestMapping(value="/register", method = RequestMethod.POST)
    public JsonResult register(@RequestBody Admin admin) throws  Exception{
        System.out.println("注册信息：" + new Gson().toJson(admin));
        adminService.register(admin);
        return JsonResult.build(StatusCode.SUCCESS);
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public JsonResult login(@RequestBody Admin admin) throws  Exception{
        Admin admin1 = adminService.login(admin);
        JSONObject jsonObject = JSONObject.fromObject(admin1);
        jsonObject.remove("password");
        return JsonResult.build(StatusCode.SUCCESS,jsonObject);
    }

    /**
     * 添加管理员信息
     * @param admin
     * @return
     * @throws Exception
     */
    @RequestMapping(value="", method = RequestMethod.POST)
    public JsonResult addAdmin(@RequestBody Admin admin) throws Exception{
        adminService.addAdmin(admin);
        return JsonResult.build(StatusCode.SUCCESS);
    }

    /**批量删除管理员*/
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public JsonResult deleteDepartment(@RequestBody Map map) {
        List ids =  (List)map.get("ids");
        adminService.deleteAdmin(ids);
        return JsonResult.ok("");
    }

    /**
     * 分页查询管理员信息
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public JsonResult queryAdmins(Integer pageNum, Integer pageSize){
//        PageResult admins = adminService.getAdminForPage(pageNum, pageSize);
        return JsonResult.build(StatusCode.SUCCESS, adminService.test(1,10));
    }

    /**
     * 更新管理员信息
     * @param admin
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.PATCH)
    public JsonResult updateAdmin(@RequestBody Admin admin) throws Exception{
        adminService.updateAdmin(admin);
        return JsonResult.build(StatusCode.SUCCESS);
    }

    @RequestMapping(value = "/testlogin",method = RequestMethod.POST)
    public JsonResult testLogin( @RequestBody Admin admin) throws Exception{
       System.out.println("admin:"+admin.toString());
        adminService.register(admin);
        return JsonResult.build(StatusCode.SUCCESS);
    }

}
