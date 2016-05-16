package com.wangkuo.zxb.mms.server.service;

import com.wangkuo.zxb.mms.dto.PagedList;
import com.wangkuo.zxb.mms.dto.output.MerchantReportOutput;
import com.wangkuo.zxb.mms.dto.params.QueryMerchantReportParam;

/**
 * Created by mark on 16/5/7.
 */
public interface IMerchantReportService {
    /**
     * 汇总
     * @param param
     * @return
     */
    PagedList<MerchantReportOutput> report(QueryMerchantReportParam param);
}
