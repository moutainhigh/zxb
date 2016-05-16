package com.wangkuo.zxb.lsp.provider.service;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.zxb.lsp.api.dto.input.LspUserCarInput;
import com.wangkuo.zxb.lsp.api.dto.output.LspUserCarOutput;
import com.wangkuo.zxb.lsp.provider.service.interf.ILspUserCarService;
import com.wangkuo.zxb.lsp.provider.db.dao.TlspUserCarDao;
import com.wangkuo.zxb.lsp.provider.db.po.TlspUserCar;
import com.wangkuo.zxb.lsp.provider.db.po.TlspUserCarCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mark on 16/3/30.
 */
@Service
public class LspUserCarServiceImpl implements ILspUserCarService {

    @Autowired
    private TlspUserCarDao carDao;

    @Override
    public List<LspUserCarOutput> findCarsByUserId(Long id) {
        TlspUserCarCriteria example = new TlspUserCarCriteria();
        example.createCriteria().andLspUserIdEqualTo(id);
        return BeanMapper.mapList(carDao.selectByExample(example),LspUserCarOutput.class);
    }

    @Override
    public int deleteProviderCarById(Long id) {
        return carDao.deleteByPrimaryKey(id);
    }

    @Override
    public int createProviderCar(LspUserCarInput input) {
        TlspUserCar record = BeanMapper.map(input, TlspUserCar.class);
        return carDao.insertSelective(record);
    }


}
