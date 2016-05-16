package com.wangkuo.zxb.mms.server.service;

import com.wangkuo.zxb.mms.dto.PagedList;
import com.wangkuo.zxb.mms.dto.output.AllotCenterChartOutput;
import com.wangkuo.zxb.mms.dto.output.AllotCenterOutput;
import com.wangkuo.zxb.mms.dto.params.QueryAllotCenterParam;
import com.wangkuo.zxb.mms.server.db.po.TAllocCentre;

import java.util.List;

/**
 * @author 王俊华
 * @version 1.0
 * @date 2016-05-05
 */
public interface IAllotCenterService {

    /**
     * 查询列表数据（分页）
     *
     * @param param
     * @return
     */
    PagedList<AllotCenterOutput> findListByParams(QueryAllotCenterParam param);

    List<AllotCenterChartOutput> findChartData(QueryAllotCenterParam param);

    List<TAllocCentre> findAllCenters();

}
