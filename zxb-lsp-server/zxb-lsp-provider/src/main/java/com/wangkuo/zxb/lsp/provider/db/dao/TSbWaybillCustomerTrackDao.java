package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillCustomerTrack;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillCustomerTrackCriteria;
import java.util.List;

@MyBatisDao
public interface TSbWaybillCustomerTrackDao extends GenericDao<TSbWaybillCustomerTrack, Long, TSbWaybillCustomerTrackCriteria> {
}