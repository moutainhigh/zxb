package com.wangkuo.zxb.mms.server.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.PageableImpl;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.mms.dto.output.OuterCustomerOutput;
import com.wangkuo.zxb.mms.dto.params.QueryOuterCustomerParam;
import com.wangkuo.zxb.mms.server.db.po.TOuterCustomer;
import com.wangkuo.zxb.mms.server.db.po.TOuterCustomerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface TOuterCustomerDao extends GenericDao<TOuterCustomer, Long, TOuterCustomerExample> {
    List<OuterCustomerOutput> queryListByParams(@Param("query")QueryOuterCustomerParam Param,
                                                @Param("page")PageableImpl pageable,
                                                @Param("currUsers")List<String> currUsers);

    OuterCustomerOutput statisticByParams(@Param("query")QueryOuterCustomerParam Param,
                                          @Param("currUsers")List<String> currUsers);

    List<OuterCustomerOutput> queryRecordByOuter(String name);

}