package com.wangkuo.zxb.lsp.provider.service;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.framework.persistence.PageableImpl;
import com.wangkuo.zxb.lsp.api.dto.input.LspBalanceDetailInput;
import com.wangkuo.zxb.lsp.api.dto.input.QueryWaybillFeeBalanceWithBenchmarkInput;
import com.wangkuo.zxb.lsp.api.dto.input.WaybillFeeBalanceWithBenchmarkInput;
import com.wangkuo.zxb.lsp.api.dto.output.LspBalanceDetailOutput;
import com.wangkuo.zxb.lsp.api.dto.output.PagedList;
import com.wangkuo.zxb.lsp.api.dto.output.WaybillFeeBalanceWithBenchmarkOutput;
import com.wangkuo.zxb.lsp.api.service.IWaybillFeeBalanceWithBenchmarkService;
import com.wangkuo.zxb.lsp.provider.db.dao.TSbWaybillFeeBalanceWithBenchmarkDao;
import com.wangkuo.zxb.lsp.provider.db.dao.TZbLspBalanceDetailDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillFeeBalanceWithBenchmark;
import com.wangkuo.zxb.lsp.provider.db.po.TZbLspBalanceDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by sanshao on 16-4-7.
 */
@Service
public class WaybillFeeBalanceWithBenchmarkServiceImpl implements IWaybillFeeBalanceWithBenchmarkService{

    @Autowired
    TSbWaybillFeeBalanceWithBenchmarkDao waybillFeeBalanceWithBenchmarkDao;

    @Autowired
    TZbLspBalanceDetailDao lspBalanceDetailDao;

    @Override
    public PagedList<WaybillFeeBalanceWithBenchmarkOutput> selectCollectionToLspList(QueryWaybillFeeBalanceWithBenchmarkInput input) {
        PageableImpl pageable = BeanMapper.map(input, PageableImpl.class);
        List<WaybillFeeBalanceWithBenchmarkOutput> outputs = waybillFeeBalanceWithBenchmarkDao.selectCollectionToLspList(input,pageable);
        return new PagedList<>(input, pageable.getCount(), BeanMapper.mapList(outputs, WaybillFeeBalanceWithBenchmarkOutput.class));
    }

    @Override
    public int add(WaybillFeeBalanceWithBenchmarkInput input) {
        TSbWaybillFeeBalanceWithBenchmark benchmark = BeanMapper.map(input,TSbWaybillFeeBalanceWithBenchmark.class);
        return waybillFeeBalanceWithBenchmarkDao.insertSelective(benchmark);
    }

    @Override
    public int addLspBalanceDetail(LspBalanceDetailInput input) {
        TZbLspBalanceDetail detail = BeanMapper.map(input,TZbLspBalanceDetail.class);
        return lspBalanceDetailDao.insertSelective(detail);
    }

    @Override
    public LspBalanceDetailOutput findByBenchmarkId(Long benchmarkId) {
        TZbLspBalanceDetail detail = lspBalanceDetailDao.findByBenchmarkId(benchmarkId);
        LspBalanceDetailOutput output = new LspBalanceDetailOutput();
        if(detail != null){
            output = BeanMapper.map(detail,LspBalanceDetailOutput.class);
        }
        return output;
    }

    @Override
    public BigDecimal getCollectionSumAllFee(QueryWaybillFeeBalanceWithBenchmarkInput input) {
        return waybillFeeBalanceWithBenchmarkDao.getCollectionSumAllFee(input);
    }

}
