package com.wangkuo.zxb.lsp.provider.service;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.zxb.lsp.api.dto.output.DicDataOutput;
import com.wangkuo.zxb.lsp.api.service.IDicService;
import com.wangkuo.zxb.lsp.provider.db.dao.TDicDataDao;
import com.wangkuo.zxb.lsp.provider.db.dao.TDicTypeDao;
import com.wangkuo.zxb.lsp.provider.db.po.TDicData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 字典服务
 *
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-15
 */
@Service
public class DicServiceImpl implements IDicService {

    @Autowired
    private TDicDataDao dicDataDao;

    @Autowired
    private TDicTypeDao dicTypeDao;

    @Override
    public List<DicDataOutput> findData(String type) {
        List<TDicData> datas = dicDataDao.selectByDicType(type);
        return BeanMapper.mapList(datas, DicDataOutput.class);
    }
}
