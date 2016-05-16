package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillReceiveTrack;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillReceiveTrackCriteria;
import java.util.List;

@MyBatisDao
public interface TSbWaybillReceiveTrackDao extends GenericDao<TSbWaybillReceiveTrack, Long, TSbWaybillReceiveTrackCriteria> {
}