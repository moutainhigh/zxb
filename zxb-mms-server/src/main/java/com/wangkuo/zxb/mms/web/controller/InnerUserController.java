package com.wangkuo.zxb.mms.web.controller;

import com.wangkuo.zxb.mms.dto.PagedList;
import com.wangkuo.zxb.mms.dto.params.AddInnerUserParam;
import com.wangkuo.zxb.mms.dto.params.QueryInnerUserParam;
import com.wangkuo.zxb.mms.server.db.po.*;
import com.wangkuo.zxb.mms.server.service.IAllocCentreService;
import com.wangkuo.zxb.mms.server.service.IAreaInfoService;
import com.wangkuo.zxb.mms.server.service.IInnerUserService;
import com.wangkuo.zxb.mms.server.service.IRegionService;
import com.wangkuo.zxb.mms.web.bind.annotation.CurrentUser;
import com.wangkuo.zxb.mms.web.viewmodel.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Administrator on 2016/5/6 0006.
 */
@Controller
@RequestMapping("/inneruser")
public class InnerUserController {
    @Autowired
    private IInnerUserService innerUserService;
    @Autowired
    private IAllocCentreService allocCentreService;
    @Autowired
    private IRegionService regionService;
    @Autowired
    private IAreaInfoService areaInfoService;

    /**
     * 列表
     *
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(ModelMap model,@CurrentUser Long userId) {
        //查询所有的集散
        List<TAllocCentre> tAllocCentres = allocCentreService.findListByUserAndPermissionCode(userId, "INNER_CUSTOMER");
        model.addAttribute("allocCentres", tAllocCentres);
//        //查询所有区域
//        List<TRegion> regions = regionService.findAll();
//        model.addAttribute("regions",regions);
        //查询所有省
        List<TAreaInfo> provices = areaInfoService.getChildrenByParentId(0l);
        model.addAttribute("provices",provices);

        return "/innerUser/list";
    }

    @ResponseBody
    @RequestMapping(value = "/getdata")
    public PagedList listData(QueryInnerUserParam param){
        return innerUserService.selectListByParam(param);
    }

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public JsonResponse add(@Valid AddInnerUserParam param, Errors errors, @CurrentUser TUser operator) {
        if (errors.hasErrors()) {
            return new JsonResponse(400);
        }
        int i = 0;
        if(null == param.getId()){
            i = innerUserService.add(param, operator);
        }else {
            i = innerUserService.edit(param, operator);
        }
        return new JsonResponse(i);
    }

    @ResponseBody
    @RequestMapping(value = "/edit",method = RequestMethod.GET)
    public TInnerCustomer ShowEdit(Long id){
        return innerUserService.editView(id);
    }

    @ResponseBody
    @RequestMapping(value = "/migratory", method = RequestMethod.POST)
    public JsonResponse migratory(@RequestParam(value = "ids[]")Long[] ids, Long acceptId, String acceptName){
        int i = innerUserService.modifyCurrUser(ids,acceptId,acceptName);
        return new JsonResponse(i);
    }

}
