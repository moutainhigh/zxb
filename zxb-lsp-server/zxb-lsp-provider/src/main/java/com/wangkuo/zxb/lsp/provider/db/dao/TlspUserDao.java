package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TlspUser;
import com.wangkuo.zxb.lsp.provider.db.po.TlspUserCriteria;
import java.util.List;

@MyBatisDao
public interface TlspUserDao extends GenericDao<TlspUser, Long, TlspUserCriteria> {
}