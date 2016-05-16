package com.wangkuo.zxb.mms.server.service.impl;

import com.wangkuo.framework.persistence.PageableImpl;
import com.wangkuo.zxb.mms.dto.PagedList;
import com.wangkuo.zxb.mms.dto.output.MerchantReportOutput;
import com.wangkuo.zxb.mms.dto.params.QueryMerchantReportParam;
import com.wangkuo.zxb.mms.server.db.dao.IMerchantReportDao;
import com.wangkuo.zxb.mms.server.service.IMerchantReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mark on 16/5/7.
 */
@Service
public class MerchantReportServiceImpl implements IMerchantReportService {

    @Autowired
    private IMerchantReportDao merchantReportDao;

    @Override
    public PagedList<MerchantReportOutput> report(QueryMerchantReportParam param) {
        PageableImpl pageable = new PageableImpl();
        pageable.setPageNumber(param.getPageNumber());
        pageable.setPageSize(param.getPageSize());
        List<MerchantReportOutput> list = merchantReportDao.report(param,pageable);
        return new PagedList<>(pageable.getCount(),list);
    }
}
