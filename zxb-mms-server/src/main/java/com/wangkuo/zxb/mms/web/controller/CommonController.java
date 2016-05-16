package com.wangkuo.zxb.mms.web.controller;

import com.google.common.collect.Lists;
import com.wangkuo.zxb.mms.server.db.po.TAllocCentre;
import com.wangkuo.zxb.mms.server.db.po.TRegion;
import com.wangkuo.zxb.mms.server.service.IAllocCentreService;
import com.wangkuo.zxb.mms.server.service.IRegionService;
import com.wangkuo.zxb.mms.web.bind.annotation.CurrentUser;
import com.wangkuo.zxb.mms.web.viewmodel.SelectItem;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-05-07
 */
@Controller
@RequestMapping("/common")
public class CommonController {

    @Autowired
    private IAllocCentreService allocCentreService;

    @Autowired
    private IRegionService regionService;

    @ResponseBody
    @RequestMapping("/allocItems")
    public List<SelectItem> allocCentreItems(String permissionCode, @CurrentUser Long userId) {

        List<TAllocCentre> tAllocCentres = allocCentreService.findListByUserAndPermissionCode(userId, permissionCode);
        List<SelectItem> selectItems = Lists.newArrayList();
        for (TAllocCentre tAllocCentre : tAllocCentres) {
            SelectItem item = new SelectItem();
            item.setText(tAllocCentre.getName());
            item.setValue(tAllocCentre.getId());
            selectItems.add(item);
        }

        return selectItems;
    }


    @ResponseBody
    @RequestMapping("/regionItems")
    public List<SelectItem> regionItems(Long allocId, String permissionCode, @CurrentUser Long userId) {
        List<SelectItem> selectItems = Lists.newArrayList();

        if (null != allocId && StringUtils.isNotEmpty(permissionCode)) {
            List<TRegion> regions = regionService.findByUserAndPermissionAndAllocCentre(userId, permissionCode, allocId);
            for (TRegion region : regions) {
                SelectItem item = new SelectItem();
                item.setText(region.getName());
                item.setValue(region.getId());
                selectItems.add(item);
            }
        }

        return selectItems;
    }

    @RequestMapping("/noPermission")
    public String noPermission() {
        return "/common/noPermission";
    }

    @RequestMapping("/ie")
    public String ie() {
        return "/common/ie";
    }
}
