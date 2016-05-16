package com.wangkuo.zxb.mms.web.controller;

import com.wangkuo.zxb.mms.dto.PagedList;
import com.wangkuo.zxb.mms.dto.output.UserPermissionOutput;
import com.wangkuo.zxb.mms.dto.params.AddUserParam;
import com.wangkuo.zxb.mms.dto.params.QueryUserParam;
import com.wangkuo.zxb.mms.dto.params.SavePermissionParam;
import com.wangkuo.zxb.mms.server.db.po.TAllocCentre;
import com.wangkuo.zxb.mms.server.db.po.TUser;
import com.wangkuo.zxb.mms.server.db.po.TUserPermission;
import com.wangkuo.zxb.mms.server.db.po.TUserRegion;
import com.wangkuo.zxb.mms.server.service.IAllocCentreService;
import com.wangkuo.zxb.mms.server.service.IUserService;
import com.wangkuo.zxb.mms.web.bind.annotation.CurrentUser;
import com.wangkuo.zxb.mms.web.viewmodel.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.Assert;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 用户管理
 *
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-26
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;
    @Autowired
    private IAllocCentreService allocCentreService;
    /**
     * 列表
     *
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(ModelMap model) {
        //查询所有的集散
        List<TAllocCentre> allocCentres = allocCentreService.findAll();
        model.addAttribute("allocCentres", allocCentres);

        return "/user/list";
    }

    @ResponseBody
    @RequestMapping(value = "/data")
    public PagedList listData(QueryUserParam param) {
        return userService.findListByParams(param);
    }


    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public JsonResponse add(@Valid AddUserParam param, Errors errors, @CurrentUser TUser operator) {
        if (errors.hasErrors()) {
            return new JsonResponse(400);
        }
        int re = userService.addUser(param, operator);
        return new JsonResponse(re);
    }
    @ResponseBody
    @RequestMapping(value = "/reset_pwd/{id}", method = RequestMethod.POST)
    public JsonResponse resetPwd( @PathVariable Long id, @CurrentUser TUser operator) {

        int r= userService.resetPassword(id);
        return new JsonResponse(r);
    }

    @ResponseBody
    @RequestMapping(value = "/remove/{id}", method = RequestMethod.POST)
    public JsonResponse remove( @PathVariable Long id, @CurrentUser TUser operator) {
        int r= userService.removeUser(id);
        return new JsonResponse(r);
    }


    @ResponseBody
    @RequestMapping(value = "/viewPermission/{userId}", method = RequestMethod.POST)
    public JsonResponse viewPermission( @PathVariable Long userId) {
        List<UserPermissionOutput> lst=userService.viewUserPermission(userId);

        JsonResponse res=new JsonResponse(1);
        res.setData(lst);
        return res;
    }

    @ResponseBody
    @RequestMapping(value = "/savepermission", method = RequestMethod.GET)
    public JsonResponse sacePermission( SavePermissionParam param,@CurrentUser TUser operator) {

        HashMap<Long,List<TUserRegion>> map=new HashMap<>();
        String[] permissions=param.getPermissions().split(",");
        for(String s :permissions)
        {
            if(s==null ||s.length()<=0) continue;
            map.put(Long.parseLong(s),null);
        }
        String[] permissionRegions=param.getPermissionRegion().split(",");
        for(String s :permissionRegions)
        {
            if(s==null ||s.length()<=0) continue;
            String[] details=s.split("_");
            if(details.length==3)
            {
                List<TUserRegion>lst=map.get(Long.parseLong(details[0]));
                if(lst!=null)
                {
                    TUserRegion userRegion=new TUserRegion();
                    userRegion.setPermissionId(Long.parseLong(details[0]));
                    userRegion.setRegionId(Long.parseLong(details[2]));
                    userRegion.setUserId(param.getUserId());
                    lst.add(userRegion);
                }else
                {
                    lst=new LinkedList<>();
                    TUserRegion userRegion=new TUserRegion();
                    userRegion.setPermissionId(Long.parseLong(details[0]));
                    userRegion.setRegionId(Long.parseLong(details[2]));
                    userRegion.setUserId(param.getUserId());
                    lst.add(userRegion);
                    map.put(Long.parseLong(details[0]),lst);
                }
            }
        }
        return new JsonResponse(userService.savePermision(param.getUserId(),map));
    }

}
