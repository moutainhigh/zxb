package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillDepot;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillDepotCriteria;
import java.util.List;

@MyBatisDao
public interface TSbWaybillDepotDao extends GenericDao<TSbWaybillDepot, Long, TSbWaybillDepotCriteria> {
}