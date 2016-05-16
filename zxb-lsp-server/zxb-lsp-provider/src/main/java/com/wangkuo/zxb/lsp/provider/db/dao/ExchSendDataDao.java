package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.ExchSendData;
import com.wangkuo.zxb.lsp.provider.db.po.ExchSendDataCriteria;
import java.util.List;

@MyBatisDao
public interface ExchSendDataDao extends GenericDao<ExchSendData, Long, ExchSendDataCriteria> {
}