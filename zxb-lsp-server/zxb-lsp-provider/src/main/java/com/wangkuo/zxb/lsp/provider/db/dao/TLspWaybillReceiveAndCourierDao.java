package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TLspWaybillReceiveAndCourier;
import com.wangkuo.zxb.lsp.provider.db.po.TLspWaybillReceiveAndCourierCriteria;
import java.util.List;

@MyBatisDao
public interface TLspWaybillReceiveAndCourierDao extends GenericDao<TLspWaybillReceiveAndCourier, Long, TLspWaybillReceiveAndCourierCriteria> {
}