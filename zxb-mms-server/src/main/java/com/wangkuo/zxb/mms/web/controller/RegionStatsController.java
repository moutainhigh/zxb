package com.wangkuo.zxb.mms.web.controller;

import com.wangkuo.zxb.mms.constant.PermissionCodes;
import com.wangkuo.zxb.mms.dto.PagedList;
import com.wangkuo.zxb.mms.dto.params.QueryRegionStatsParam;
import com.wangkuo.zxb.mms.server.db.po.TUser;
import com.wangkuo.zxb.mms.server.service.IRegionStatsService;
import com.wangkuo.zxb.mms.web.bind.annotation.CurrentUser;
import com.wangkuo.zxb.mms.web.secure.Permission;
import com.wangkuo.zxb.mms.web.viewmodel.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 区域营销统计
 *
 * @author 林守锦
 * @version 1.0
 * @date 2016-05-05
 */
@Permission(PermissionCodes.REGION_STATS)
@Controller
@RequestMapping("/region_stats")
public class RegionStatsController {

    @Autowired
    private IRegionStatsService regionStatsService;

    /**
     * 列表
     *
     * @return
     */
    @RequestMapping("/list")
    public String list() {
        return "/regionStats/list";
    }

    /**
     * 列表数据
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/data")
    public PagedList data(QueryRegionStatsParam param, @CurrentUser TUser user) {
        return regionStatsService.list(param, user);
    }

    @ResponseBody
    @RequestMapping("/create_all")
    public JsonResponse createAll() {
        regionStatsService.createAllRegionStats();
        return new JsonResponse(0, "营销区域统计生成成功");
    }
}
