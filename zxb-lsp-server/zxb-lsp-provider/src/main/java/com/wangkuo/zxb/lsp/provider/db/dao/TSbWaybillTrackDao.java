package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillTrack;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillTrackCriteria;
import java.util.List;

@MyBatisDao
public interface TSbWaybillTrackDao extends GenericDao<TSbWaybillTrack, Long, TSbWaybillTrackCriteria> {
}