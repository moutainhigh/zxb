package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.api.dto.output.ZbLspBalanceDetailOutput;
import com.wangkuo.zxb.lsp.provider.db.po.TZbLspBalanceDetail;
import com.wangkuo.zxb.lsp.provider.db.po.TZbLspBalanceDetailCriteria;
import java.util.List;

@MyBatisDao
public interface TZbLspBalanceDetailDao extends GenericDao<TZbLspBalanceDetail, Long, TZbLspBalanceDetailCriteria> {

    TZbLspBalanceDetail findByBenchmarkId(Long benchmarkId);

    List<ZbLspBalanceDetailOutput> selectLspBalanceDetailListByWaybillId(Long waybillId);
}