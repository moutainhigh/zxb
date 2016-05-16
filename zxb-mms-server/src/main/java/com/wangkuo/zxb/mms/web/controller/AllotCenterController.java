package com.wangkuo.zxb.mms.web.controller;

import com.wangkuo.zxb.mms.dto.output.SuggestOutput;
import com.wangkuo.zxb.mms.dto.PagedList;
import com.wangkuo.zxb.mms.dto.output.AllotCenterChartOutput;
import com.wangkuo.zxb.mms.dto.output.AllotCenterOutput;
import com.wangkuo.zxb.mms.dto.params.QueryAllotCenterParam;
import com.wangkuo.zxb.mms.server.db.po.TAllocCentre;
import com.wangkuo.zxb.mms.server.db.po.TAreaInfo;
import com.wangkuo.zxb.mms.server.service.IAllotCenterService;
import com.wangkuo.zxb.mms.server.service.IAreaInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * 用户管理
 *
 * @author 王俊华
 * @version 1.0
 * @date 2016-05-05
 */
@Controller
@RequestMapping("/allotCenter")
public class AllotCenterController {

    @Autowired
    private IAllotCenterService allocCentreService;

    @Autowired
    private IAreaInfoService areaInfoService;


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String list(ModelMap model) {
        List<TAllocCentre> allots = allocCentreService.findAllCenters();
        model.addAttribute("allots",allots);

        List<TAreaInfo> provices = areaInfoService.getChildrenByParentId(0l);
        model.addAttribute("provices",provices);
        return "allot/list";
    }

    @RequestMapping(value = "/chart", method = RequestMethod.GET)
    public String chart(ModelMap model) {
        List<TAllocCentre> allots = allocCentreService.findAllCenters();
        model.addAttribute("allots",allots);

        List<TAreaInfo> provices = areaInfoService.getChildrenByParentId(0l);
        model.addAttribute("provices",provices);

        //默认北京市
        List<TAreaInfo> citys = areaInfoService.getChildrenByParentId(1l);
        model.addAttribute("citys",citys);
        return "allot/chart";
    }

    /**
     * 获取数据
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public PagedList<AllotCenterOutput> getData(QueryAllotCenterParam param, ModelMap model) {
        PagedList<AllotCenterOutput> list = allocCentreService.findListByParams(param);
        return list;
    }


    /**
     * 获取趋势图数据
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/chartData", method = RequestMethod.GET)
    public List<AllotCenterChartOutput> chartData(QueryAllotCenterParam param, ModelMap model) {
        List<AllotCenterChartOutput> list = allocCentreService.findChartData(param);
        return list;
    }


    @ResponseBody
    @RequestMapping(value = "/getAllots", method = RequestMethod.GET)
    public List<TAllocCentre> getAllots(){
        return allocCentreService.findAllCenters();
    }



    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<TAllocCentre> list(){
        return allocCentreService.findAllCenters();
    }

    @RequestMapping(value = "/listSuggest", method = RequestMethod.GET)
    @ResponseBody
    public SuggestOutput<TAllocCentre> listSuggest(){
        SuggestOutput<TAllocCentre> output = new SuggestOutput<>();
        output.setValue(allocCentreService.findAllCenters());
        return output;
    }

}
