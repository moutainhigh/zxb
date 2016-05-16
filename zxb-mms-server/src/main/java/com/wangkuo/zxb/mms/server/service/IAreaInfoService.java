package com.wangkuo.zxb.mms.server.service;

import com.wangkuo.zxb.mms.server.db.po.TAreaInfo;

import java.util.List;

/**
 * Created by mark on 16/5/6.
 */
public interface IAreaInfoService {
    /**
     * 获取省市区
     * @param parentId
     * @return
     */
    List<TAreaInfo> getChildrenByParentId(Long parentId);
}
