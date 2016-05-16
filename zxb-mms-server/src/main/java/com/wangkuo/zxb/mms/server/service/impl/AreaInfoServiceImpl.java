package com.wangkuo.zxb.mms.server.service.impl;

import com.wangkuo.zxb.mms.server.db.dao.TAreaInfoDao;
import com.wangkuo.zxb.mms.server.db.po.TAreaInfo;
import com.wangkuo.zxb.mms.server.db.po.TAreaInfoExample;
import com.wangkuo.zxb.mms.server.service.IAreaInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mark on 16/5/6.
 */
@Service
public class AreaInfoServiceImpl implements IAreaInfoService {

    @Autowired
    private TAreaInfoDao areaInfoDao;
    @Override
    public List<TAreaInfo> getChildrenByParentId(Long parentId) {
        TAreaInfoExample example = new TAreaInfoExample();
        example.createCriteria().andParentAreaIdEqualTo(parentId);
        return areaInfoDao.selectByExample(example);
    }
}
