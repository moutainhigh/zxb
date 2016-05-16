package com.wangkuo.zxb.lsp.api.service;

import com.wangkuo.zxb.lsp.api.dto.input.LspBalanceDetailInput;
import com.wangkuo.zxb.lsp.api.dto.input.QueryWaybillFeeBalanceWithBenchmarkInput;
import com.wangkuo.zxb.lsp.api.dto.input.WaybillFeeBalanceWithBenchmarkInput;
import com.wangkuo.zxb.lsp.api.dto.output.LspBalanceDetailOutput;
import com.wangkuo.zxb.lsp.api.dto.output.PagedList;
import com.wangkuo.zxb.lsp.api.dto.output.WaybillFeeBalanceWithBenchmarkOutput;

import java.math.BigDecimal;

/**
 * 服务商财务（运营系统）
 * Created by sanshao on 16-4-6.
 */
public interface IWaybillFeeBalanceWithBenchmarkService {

    /**
     * 向服务商收付款列表查询
     * @param input
     * @return
     */
    PagedList<WaybillFeeBalanceWithBenchmarkOutput> selectCollectionToLspList(QueryWaybillFeeBalanceWithBenchmarkInput input);


    /**
     * 新建对账结算记录
     * @param input
     * @return
     */
    int add(WaybillFeeBalanceWithBenchmarkInput input);

    /**
     * 新建对账结算详情
     * @param input
     * @return
     */
    int addLspBalanceDetail(LspBalanceDetailInput input);

    /**
     * 根据对账结算来查询费用详情
     * @param benchmarkId
     * @return
     */
    LspBalanceDetailOutput findByBenchmarkId(Long benchmarkId);

    /**
     * 获取收款总费用
     * @param input
     * @return
     */
    BigDecimal getCollectionSumAllFee(QueryWaybillFeeBalanceWithBenchmarkInput input);
}
