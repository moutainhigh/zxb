package com.wangkuo.zxb.mms.server.service;

import com.wangkuo.zxb.mms.dto.PagedList;
import com.wangkuo.zxb.mms.dto.output.InnerUserOutput;
import com.wangkuo.zxb.mms.dto.params.AddInnerUserParam;
import com.wangkuo.zxb.mms.dto.params.QueryInnerUserParam;
import com.wangkuo.zxb.mms.server.db.po.TInnerCustomer;
import com.wangkuo.zxb.mms.server.db.po.TUser;

/**
 * Created by Administrator on 2016/5/6 0006.
 */
public interface IInnerUserService {

    PagedList<InnerUserOutput> selectListByParam(QueryInnerUserParam param);

    int add(AddInnerUserParam param,TUser operator);

    int edit(AddInnerUserParam param,TUser operator);

    TInnerCustomer editView(Long id);

    int modifyCurrUser(Long[] ids,Long acceptId, String acceptName);
}
