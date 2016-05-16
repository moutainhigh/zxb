package com.wangkuo.zxb.mms.server.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.mms.server.db.po.TFbBenchmarkPriceSection;
import com.wangkuo.zxb.mms.server.db.po.TFbBenchmarkPriceSectionExample;
import java.util.List;

@MyBatisDao
public interface TFbBenchmarkPriceSectionDao extends GenericDao<TFbBenchmarkPriceSection, Long, TFbBenchmarkPriceSectionExample> {
}