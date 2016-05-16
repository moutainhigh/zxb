package com.wangkuo.zxb.mms.web.controller;

import com.wangkuo.zxb.mms.dto.PagedList;
import com.wangkuo.zxb.mms.dto.output.RegionOutPut;
import com.wangkuo.zxb.mms.dto.output.UserOutPut;
import com.wangkuo.zxb.mms.dto.params.PageParam;
import com.wangkuo.zxb.mms.dto.params.RegionParam;
import com.wangkuo.zxb.mms.server.db.po.TAllocCentre;
import com.wangkuo.zxb.mms.server.db.po.TAreaInfo;
import com.wangkuo.zxb.mms.server.db.po.TRegion;
import com.wangkuo.zxb.mms.server.db.po.TUser;
import com.wangkuo.zxb.mms.server.service.IAllocCentreService;
import com.wangkuo.zxb.mms.server.service.IAreaInfoService;
import com.wangkuo.zxb.mms.server.service.IRegionService;
import com.wangkuo.zxb.mms.web.bind.annotation.CurrentUser;
import com.wangkuo.zxb.mms.web.viewmodel.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 系统设置   ------>     区域管理
 * <p/>
 * 异常码
 * 1000：未保存数据
 * 1001：该集散的区域名已存在
 *
 * @author 柳朋朋
 * @version 1.0
 * @date 2016/5/5.
 */
@Controller
@RequestMapping("/region")
public class RegionController {
    @Autowired
    private IRegionService regionService;
    @Autowired
    private IAllocCentreService allocCentreService;
    @Autowired
    private IAreaInfoService areaInfoService;

    /**
     * 区域管理主页
     *
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(ModelMap model) {
        List<TAreaInfo> provices = areaInfoService.getChildrenByParentId(0l);
        model.addAttribute("provices", provices);
        //查询所有的集散
        List<TAllocCentre> allocCentres = allocCentreService.findAll();
        model.addAttribute("allocCentres", allocCentres);
        return "/settings/list";
    }

    /**
     * 区域数据查询
     *
     * @return
     */
    @RequestMapping(value = "/data")
    @ResponseBody
    public PagedList<RegionOutPut> listData(PageParam param) {
        return regionService.findList(param);
    }

    /**
     * 区域新增
     *
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse add(RegionParam param, @CurrentUser TUser operator) {
        //判断区域是否已经存在
        if (regionService.existRegion(param)) {
            return new JsonResponse(1001);
        }
        int count = regionService.addRegion(param, operator);
        return new JsonResponse(count > 0 ? 0 : 1000);
    }

    /**
     * 区域注销
     *
     * @return
     */
    @RequestMapping(value = "/transfer", method = RequestMethod.POST)
    @ResponseBody
    public Boolean transfer(RegionParam param, @CurrentUser TUser operator) {
        int count = regionService.transferRegion(param, operator);
        return count > 0;
    }

    /**
     * 根据集散中心id 查询所有的营销区域
     *
     * @return
     */
    @RequestMapping(value = "/regions", method = RequestMethod.GET)
    @ResponseBody
    public List<TRegion> findByAllocCentreId(RegionParam param) {
        //如果选择的集散是一样的  进行区域剔除(用于区域注销使用)
        if (param.getAllocCentreId() == param.getOriginalAllocCentreId()) {
            return regionService.findByAllocCentreId(param.getAllocCentreId(), param.getOriginalRegionId());
        }
        return regionService.findByAllocCentreId(param.getAllocCentreId());
    }

    /**
     * 根据区域id 查找外客户接受人
     *
     * @return
     */
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public List<UserOutPut> findUserByAndRegionId(Long regionId) {
        return regionService.findUserByAndRegionId(regionId);
    }


}
