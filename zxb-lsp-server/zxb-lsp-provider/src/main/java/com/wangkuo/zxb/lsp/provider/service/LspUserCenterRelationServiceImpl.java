package com.wangkuo.zxb.lsp.provider.service;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.zxb.lsp.api.dto.input.LspUserCenterRelationInput;
import com.wangkuo.zxb.lsp.api.dto.output.LspUserCenterRelationOutput;
import com.wangkuo.zxb.lsp.provider.db.dao.TLspUserCenterRelationDao;
import com.wangkuo.zxb.lsp.provider.db.po.TLspUserCenterRelation;
import com.wangkuo.zxb.lsp.provider.db.po.TLspUserCenterRelationCriteria;
import com.wangkuo.zxb.lsp.provider.service.interf.ILspUserCenterRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mark on 16/3/31.
 */
@Service
public class LspUserCenterRelationServiceImpl implements ILspUserCenterRelationService {

    @Autowired
    private TLspUserCenterRelationDao relationDao;

    @Override
    public List<LspUserCenterRelationOutput> loadCenterRelationByProviderId(Long id) {
        TLspUserCenterRelationCriteria example = new TLspUserCenterRelationCriteria();
        example.createCriteria().andLspUserIdEqualTo(id);
        return BeanMapper.mapList(relationDao.selectByExample(example), LspUserCenterRelationOutput.class);
    }

    @Override
    public int insertRelations(List<LspUserCenterRelationInput> relationInputs, Long providerId) {
        //删除原有关系
        TLspUserCenterRelationCriteria example = new TLspUserCenterRelationCriteria();
        example.createCriteria().andLspUserIdEqualTo(providerId);
        relationDao.deleteByExample(example);

        //插入新关系
        for (LspUserCenterRelationInput input : relationInputs) {
            relationDao.insertSelective(BeanMapper.map(input, TLspUserCenterRelation.class));
        }
        return 0;
    }
}
