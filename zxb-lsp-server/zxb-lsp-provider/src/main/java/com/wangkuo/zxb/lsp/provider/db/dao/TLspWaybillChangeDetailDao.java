package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TLspWaybillChangeDetail;
import com.wangkuo.zxb.lsp.provider.db.po.TLspWaybillChangeDetailCriteria;
import java.util.List;

@MyBatisDao
public interface TLspWaybillChangeDetailDao extends GenericDao<TLspWaybillChangeDetail, Long, TLspWaybillChangeDetailCriteria> {
}