package com.wangkuo.zxb.lsp.provider.service;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.zxb.lsp.api.dto.output.SbAreaInfoOutput;
import com.wangkuo.zxb.lsp.api.service.ISbAreaInfoService;
import com.wangkuo.zxb.lsp.provider.db.dao.TSbAreaInfoDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbAreaInfo;
import com.wangkuo.zxb.lsp.provider.db.po.TSbAreaInfoCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-03-27
 */
@Service
public class SbAreaInfoServiceImpl implements ISbAreaInfoService {

    @Autowired
    private TSbAreaInfoDao sbAreaInfoDao;

    /**
     * 根据parentAreaId 查找省，市，区
     * @param ParentAreaId
     * @return
     */
    @Override
    public List<SbAreaInfoOutput> selectAllProvince(Long ParentAreaId) {
        TSbAreaInfoCriteria criteria = new TSbAreaInfoCriteria();
        List<SbAreaInfoOutput> list= new ArrayList<SbAreaInfoOutput>();
        if(ParentAreaId!=null){
            criteria.createCriteria().andParentAreaIdEqualTo(ParentAreaId);
            List<TSbAreaInfo>  Arealist = sbAreaInfoDao.selectByExample(criteria);
            if(Arealist!=null) {
                list = BeanMapper.mapList(Arealist, SbAreaInfoOutput.class);
            }
        }
        return list;
    }
}
