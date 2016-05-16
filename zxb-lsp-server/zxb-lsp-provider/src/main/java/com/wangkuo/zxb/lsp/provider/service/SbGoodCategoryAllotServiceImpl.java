package com.wangkuo.zxb.lsp.provider.service;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.zxb.lsp.api.dto.input.SbGoodCategoryAllotInput;
import com.wangkuo.zxb.lsp.api.service.ISbGoodCategoryAllotService;
import com.wangkuo.zxb.lsp.provider.db.dao.TSbGoodCategoryAllotDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbGoodCategoryAllot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 王俊华
 * @version 1.0
 * @date 2016-03-30
 */
@Service
public class SbGoodCategoryAllotServiceImpl implements ISbGoodCategoryAllotService {

    @Autowired
    TSbGoodCategoryAllotDao sbGoodCategoryAllotDao;


    @Override
    public int updateOneById(SbGoodCategoryAllotInput input) {
        TSbGoodCategoryAllot allot = BeanMapper.map(input, TSbGoodCategoryAllot.class);
        return sbGoodCategoryAllotDao.updateByPrimaryKeySelective(allot);
    }
}
