package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbLocalWaybillAllot;
import com.wangkuo.zxb.lsp.provider.db.po.TSbLocalWaybillAllotCriteria;
import java.util.List;

@MyBatisDao
public interface TSbLocalWaybillAllotDao extends GenericDao<TSbLocalWaybillAllot, Long, TSbLocalWaybillAllotCriteria> {
}