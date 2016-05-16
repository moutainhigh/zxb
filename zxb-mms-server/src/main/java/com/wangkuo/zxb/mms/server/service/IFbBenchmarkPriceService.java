package com.wangkuo.zxb.mms.server.service;

import com.wangkuo.zxb.mms.dto.output.BenchmarkPricePagedList;
import com.wangkuo.zxb.mms.dto.params.QueryBenchmarkPriceParam;
import com.wangkuo.zxb.mms.server.db.po.TFbBenchmarkPrice;

/**
 * Created by mark on 16/5/6.
 */
public interface IFbBenchmarkPriceService {
    /**
     * 查询基准价
     * @param param
     * @return
     */
    BenchmarkPricePagedList getBenchmarkPriceList(QueryBenchmarkPriceParam param);
}