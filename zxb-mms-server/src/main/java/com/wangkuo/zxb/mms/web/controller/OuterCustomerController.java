package com.wangkuo.zxb.mms.web.controller;

import com.wangkuo.zxb.mms.dto.PagedList;
import com.wangkuo.zxb.mms.dto.output.OuterCustomerOutput;
import com.wangkuo.zxb.mms.dto.output.UserOutPut;
import com.wangkuo.zxb.mms.dto.params.QueryOuterCustomerParam;
import com.wangkuo.zxb.mms.server.db.po.TAllocCentre;
import com.wangkuo.zxb.mms.server.db.po.TAreaInfo;
import com.wangkuo.zxb.mms.server.db.po.TOuterCustomer;
import com.wangkuo.zxb.mms.server.db.po.TUser;
import com.wangkuo.zxb.mms.server.service.*;
import com.wangkuo.zxb.mms.web.bind.annotation.CurrentUser;
import com.wangkuo.zxb.mms.web.viewmodel.JsonResponse;
import org.apache.commons.collections.CollectionUtils;
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
 * Created by chaizf on 2016/5/5.
 */

@Controller
@RequestMapping("/outer")
public class OuterCustomerController {

    @Autowired
    private IOuterCustomerService outerCustomerService;
    @Autowired
    private IAllocCentreService allocCentreService;
    @Autowired
    private IRegionService regionService;
    @Autowired
    private IAreaInfoService areaInfoService;
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list( @CurrentUser TUser user,ModelMap model) {
        //查询所有的集散
        List<TAllocCentre> allocCentres =  allocCentreService.findAll();
        model.addAttribute("allocCentres",allocCentres);
        //查询所有区域
//        List<TRegion> regions = regionService.findAll();
//        model.addAttribute("regions",regions);
        //查询所有省
        List<TAreaInfo> provices = areaInfoService.getChildrenByParentId(0l);
        model.addAttribute("provices",provices);
        //统计值（发货票数、发货金额）

        //TODO 区域接受人
        List<UserOutPut> users = userService.findListByregionId(user.getId());
        model.addAttribute("users",users);
        return "/outerCustomer/list";
    }

    @ResponseBody
    @RequestMapping(value = "/edit",method = RequestMethod.GET)
    public TOuterCustomer ShowEdit(Long id){
        return outerCustomerService.findCustomerById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/data")
    public PagedList listData(@CurrentUser TUser user,QueryOuterCustomerParam param,ModelMap model) {
        OuterCustomerOutput outerCustomers = outerCustomerService.statisticByParams(user.getId(),param);
        //model.addAttribute("outerCustomers",outerCustomers);
        PagedList<OuterCustomerOutput> response =  outerCustomerService.findListByParams(user.getId(),param);
        if(CollectionUtils.isNotEmpty(response.getRows())){
            response.getRows().get(0).setWaybillSum(outerCustomers.getWaybillSum());
            response.getRows().get(0).setAmountSum(outerCustomers.getAmountSum());
        }
        return response;
    }

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public JsonResponse add(@Valid TOuterCustomer param, Errors errors, @CurrentUser TUser user) {
        if (errors.hasErrors()) {
            return new JsonResponse(400);
        }
        if(null == param.getId()){
            outerCustomerService.addOuterCustomer(param, user);
        }else{
            outerCustomerService.updateOuterCustomer(param, user);
        }
        return new JsonResponse(0);
    }

    @ResponseBody
    @RequestMapping(value = "/migratory", method = RequestMethod.POST)
    public JsonResponse migratory(@RequestParam(value = "ids[]")Long[] ids,Long acceptId, String acceptName){
        outerCustomerService.modifyCurrUser(ids,acceptId,acceptName);
        return new JsonResponse(0);
    }

    @ResponseBody
    @RequestMapping(value = "/isCustomerNameExist",method = RequestMethod.GET)
    public boolean isCustomerNameExist(TOuterCustomer outerCustomer){
        boolean flag = false;
        List<TOuterCustomer> customers = outerCustomerService.findByCustomerName(outerCustomer.getCustomerName());
        if(null == outerCustomer.getId()){//新增时
            flag = customers.size() == 0;
        }else{//编辑时
            if(customers.size() == 1 && customers.get(0).getId() == outerCustomer.getId()){
                flag = true;
            }else{
                flag = false;
            }
        }

        return flag;
    }

    @ResponseBody
    @RequestMapping(value = "/isSysAccountNotExist",method = RequestMethod.GET)
    public boolean isSysAccountNotExist(String sysAccount){
        boolean flag = outerCustomerService.findBySysAccount(sysAccount).size() != 0;
        return  flag;
    }
}
