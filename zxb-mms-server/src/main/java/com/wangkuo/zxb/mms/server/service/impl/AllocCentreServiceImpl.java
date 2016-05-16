package com.wangkuo.zxb.mms.server.service.impl;

import com.wangkuo.zxb.mms.server.db.dao.TAllocCentreDao;
import com.wangkuo.zxb.mms.server.db.po.TAllocCentre;
import com.wangkuo.zxb.mms.server.db.po.TAllocCentreExample;
import com.wangkuo.zxb.mms.server.service.IAllocCentreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 柳朋朋
 * @version 1.0
 * @date 2016-05-06
 */
@Service
public class AllocCentreServiceImpl implements IAllocCentreService {
    @Autowired
    private TAllocCentreDao allocCentreDao;

    /**
     * 查询所有的集散中心数据
     *
     * @return
     */
    @Override
    public List<TAllocCentre> findAll() {
        TAllocCentreExample example = new TAllocCentreExample();
        return allocCentreDao.selectByExample(example);
    }

    @Override
    public List<TAllocCentre> findListByUserAndPermissionCode(Long userId, String permissionCode) {
        return allocCentreDao.selectListByUserAndPermissionCode(userId, permissionCode);
    }


}
