package com.wangkuo.zxb.smart.show.controller;

import com.wangkuo.zxb.smart.show.dto.output.*;
import com.wangkuo.zxb.smart.show.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 朋朋
 * @version 1.0
 * @date 2016-04-15
 */
@Controller
@RequestMapping("/smart")
public class ShowController {

    @Autowired
    private ShowService showService;

    /**
     * 展示页面
     *
     * @return
     */
    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo(ModelMap model) {
        return "/demo";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(ModelMap model) {
        return "/test";
    }

    /**
     * 展示页面
     *
     * @return
     */
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String show(ModelMap model) {
        BaseDataOutput baseDataOutput = showService.getBaseData();
        model.addAttribute("baseData", baseDataOutput);
        return "/show";
    }

    /**
     * 基础信息（交易额）
     *
     * @return
     */
    @RequestMapping(value = "/baseData", method = RequestMethod.GET)
    @ResponseBody
    public BaseDataOutput baseData(ModelMap model) {
        BaseDataOutput baseDataOutput = showService.getBaseData();
        return baseDataOutput;
    }

    /**
     * 目的区域排行（交易额）
     *
     * @return
     */
    @RequestMapping(value = "/destinationArea", method = RequestMethod.GET)
    @ResponseBody
    public List<AreaFeeOutput> destinationArea(ModelMap model) {
        List<AreaFeeOutput> areaFeeOutputs = showService.getDestinationArea();
        return areaFeeOutputs;
    }

    /**
     * 发货区域排行（交易额）
     *
     * @return
     */
    @RequestMapping(value = "/deliveryArea", method = RequestMethod.GET)
    @ResponseBody
    public List<AreaFeeOutput> deliveryArea(ModelMap model) {
        List<AreaFeeOutput> areaFeeOutputs = showService.getDeliveryArea();
        return areaFeeOutputs;
    }

    /**
     * 专线排行（交易额）
     *
     * @return
     */
    @RequestMapping(value = "/lineSuppliers", method = RequestMethod.GET)
    @ResponseBody
    public List<AreaFeeOutput> lineSuppliers() {
        List<AreaFeeOutput> areaFeeOutputs = showService.getLineSuppliers();
        return areaFeeOutputs;
    }

    /**
     * 货物品类分布
     *
     * @return
     */
    @RequestMapping(value = "/goodCategory", method = RequestMethod.GET)
    @ResponseBody
    public List<GoodCategoryOutput> goodCategory(ModelMap model) {
        return showService.getGoodCategory();
    }

    /**
     * 地图信息查询
     *
     * @return
     */
    @RequestMapping(value = "/deliveryMap", method = RequestMethod.GET)
    @ResponseBody
    public Map deliveryMap() {
        Map deliveryMapOutput = showService.getDeliveryMap();
        List<AreaFeeOutput> areaFeeOutputs = showService.getAllDestinationArea();
        deliveryMapOutput.put("areaFeeOutputs",areaFeeOutputs);
        return deliveryMapOutput;
    }

    @ResponseBody
    @RequestMapping(value = "/getItude", method = RequestMethod.GET)
    public List<CityJwdeOutput> getItude(){
        List<CityJwdeOutput> list = showService.getItudeOutput();
        return list;
    }
}
