package com.wangkuo.zxb.mms.server.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.Pageable;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.mms.dto.output.InnerUserOutput;
import com.wangkuo.zxb.mms.dto.params.QueryInnerUserParam;
import com.wangkuo.zxb.mms.server.db.po.TInnerCustomer;
import com.wangkuo.zxb.mms.server.db.po.TInnerCustomerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface TInnerCustomerDao extends GenericDao<TInnerCustomer, Long, TInnerCustomerExample> {

    List<InnerUserOutput> selectListByParam(@Param("input") QueryInnerUserParam param, @Param("page") Pageable pageable);

    List<TInnerCustomer> selectBySysAccount(String sysAccount);

    List<TInnerCustomer> selectByCustomerName(String customerName);
}