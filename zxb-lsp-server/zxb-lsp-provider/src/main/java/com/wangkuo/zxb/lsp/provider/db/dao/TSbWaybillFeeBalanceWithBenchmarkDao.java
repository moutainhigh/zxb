package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.PageableImpl;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.api.dto.input.QueryWaybillFeeBalanceWithBenchmarkInput;
import com.wangkuo.zxb.lsp.api.dto.output.WaybillFeeBalanceWithBenchmarkOutput;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillFeeBalanceWithBenchmark;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillFeeBalanceWithBenchmarkCriteria;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

@MyBatisDao
public interface TSbWaybillFeeBalanceWithBenchmarkDao extends GenericDao<TSbWaybillFeeBalanceWithBenchmark, Long, TSbWaybillFeeBalanceWithBenchmarkCriteria> {

    List<WaybillFeeBalanceWithBenchmarkOutput> selectCollectionToLspList(@Param("input") QueryWaybillFeeBalanceWithBenchmarkInput input,@Param("page") PageableImpl pageable);

    BigDecimal getCollectionSumAllFee(QueryWaybillFeeBalanceWithBenchmarkInput input);

    /**
     * 获取服务商未支付费用
     *
     * @param waybillId
     * @return
     */
    int countLspUnPay(Long waybillId);
}