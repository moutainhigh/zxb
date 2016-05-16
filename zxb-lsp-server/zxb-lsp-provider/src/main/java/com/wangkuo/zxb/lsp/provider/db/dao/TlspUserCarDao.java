package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TlspUserCar;
import com.wangkuo.zxb.lsp.provider.db.po.TlspUserCarCriteria;
import java.util.List;

@MyBatisDao
public interface TlspUserCarDao extends GenericDao<TlspUserCar, Long, TlspUserCarCriteria> {
}