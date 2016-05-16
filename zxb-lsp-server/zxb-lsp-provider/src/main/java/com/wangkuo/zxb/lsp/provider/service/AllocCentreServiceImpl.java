package com.wangkuo.zxb.lsp.provider.service;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.zxb.lsp.api.dto.output.AllocCentreOutput;
import com.wangkuo.zxb.lsp.api.service.IAllocCentreService;
import com.wangkuo.zxb.lsp.provider.db.dao.TZbAllocCentreDao;
import com.wangkuo.zxb.lsp.provider.db.dao.TlspUserDao;
import com.wangkuo.zxb.lsp.provider.db.po.TZbAllocCentre;
import com.wangkuo.zxb.lsp.provider.db.po.TZbAllocCentreCriteria;
import com.wangkuo.zxb.lsp.provider.db.po.TlspUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-09
 */
@Service
public class AllocCentreServiceImpl implements IAllocCentreService {

    @Autowired
    private TZbAllocCentreDao allocCentreDao;

    @Autowired
    private TlspUserDao lspUserDao;

    @Override
    public List<AllocCentreOutput> findAll() {

        TZbAllocCentreCriteria criteria = new TZbAllocCentreCriteria();
        List<TZbAllocCentre> tZbAllocCentres = allocCentreDao.selectByExample(criteria);
        return BeanMapper.mapList(tZbAllocCentres, AllocCentreOutput.class);
    }

    @Override
    public List<AllocCentreOutput> findAllocCentreByLspId(Long lspId) {
        List<TZbAllocCentre> allocCentres = allocCentreDao.queryAllocCentreByLspId(lspId);
        return BeanMapper.mapList(allocCentres, AllocCentreOutput.class);
    }

    @Override
    public List<AllocCentreOutput> findAllocCentreByLspIdWithDefault(Long lspId) {
        TlspUser user = lspUserDao.selectByPrimaryKey(lspId);

        if (null != user.getVerifyStatus() && 2 == user.getVerifyStatus()) {
            return findAllocCentreByLspId(lspId);
        } else {
            return findAll();
        }
    }
}
