package com.wangkuo.zxb.mms.server.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.mms.dto.output.CustomerChainStatisticOutput;
import com.wangkuo.zxb.mms.dto.params.CustomerChainStatisticParam;
import com.wangkuo.zxb.mms.server.db.po.TCustomerChainStatistic;
import com.wangkuo.zxb.mms.server.db.po.TCustomerChainStatisticExample;

import java.util.Date;
import java.util.List;

@MyBatisDao
public interface TCustomerChainStatisticDao extends GenericDao<TCustomerChainStatistic, Long, TCustomerChainStatisticExample> {

    CustomerChainStatisticOutput selectByTime(CustomerChainStatisticParam param);

}