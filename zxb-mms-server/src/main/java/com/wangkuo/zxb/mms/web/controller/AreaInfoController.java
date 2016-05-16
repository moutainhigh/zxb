package com.wangkuo.zxb.mms.web.controller;

import com.wangkuo.zxb.mms.dto.output.SuggestOutput;
import com.wangkuo.zxb.mms.server.db.po.TAreaInfo;
import com.wangkuo.zxb.mms.server.service.IAreaInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by mark on 16/5/6.
 */
@Controller
@RequestMapping("/area")
public class AreaInfoController {

    @Autowired
    private IAreaInfoService areaInfoService;

    @RequestMapping(value = "/child",method = RequestMethod.GET)
    @ResponseBody
    public SuggestOutput<TAreaInfo> getChildrenByParentId(Long parentId){
        SuggestOutput<TAreaInfo> output = new SuggestOutput<>();
        output.setValue(areaInfoService.getChildrenByParentId(parentId));
        return output;
    }

    @ResponseBody
    @RequestMapping(value = "/citys")
    public List<TAreaInfo> getCitys(Long parentId){
        return areaInfoService.getChildrenByParentId(parentId);
    }

    @ResponseBody
    @RequestMapping(value = "/countrys")
    public List<TAreaInfo> getCountrys(Long parentId){
        return areaInfoService.getChildrenByParentId(parentId);
    }
}
