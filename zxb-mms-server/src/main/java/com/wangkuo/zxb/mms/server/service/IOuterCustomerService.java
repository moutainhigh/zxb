package com.wangkuo.zxb.mms.server.service;

import com.wangkuo.zxb.mms.dto.PagedList;
import com.wangkuo.zxb.mms.dto.output.OuterCustomerOutput;
import com.wangkuo.zxb.mms.dto.params.QueryOuterCustomerParam;
import com.wangkuo.zxb.mms.server.db.po.TOuterCustomer;
import com.wangkuo.zxb.mms.server.db.po.TUser;

import java.util.List;

/**
 * Created by chaizf on 2016/5/5.
 */
public interface IOuterCustomerService {

    PagedList<OuterCustomerOutput> findListByParams(Long userId,QueryOuterCustomerParam param);

    OuterCustomerOutput statisticByParams(Long userId,QueryOuterCustomerParam param);

    TOuterCustomer findCustomerById(Long id);

    int addOuterCustomer(TOuterCustomer param, TUser operator);

    int modifyCurrUser(Long[] ids,Long acceptId, String acceptName);

    int updateOuterCustomer(TOuterCustomer param, TUser user);

    List<TOuterCustomer> findByCustomerName(String customerName);

    List<TOuterCustomer> findBySysAccount(String sysAccount);

}
