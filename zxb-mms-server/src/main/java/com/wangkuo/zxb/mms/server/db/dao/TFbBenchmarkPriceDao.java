package com.wangkuo.zxb.mms.server.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.mms.server.db.po.TFbBenchmarkPrice;
import com.wangkuo.zxb.mms.server.db.po.TFbBenchmarkPriceExample;
import java.util.List;

@MyBatisDao
public interface TFbBenchmarkPriceDao extends GenericDao<TFbBenchmarkPrice, Long, TFbBenchmarkPriceExample> {
}