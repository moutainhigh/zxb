package com.wangkuo.zxb.lsp.provider.service;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.zxb.lsp.api.dto.output.LspWalletBalanceLogOutput;
import com.wangkuo.zxb.lsp.api.service.ILspWalletBalanceLogService;
import com.wangkuo.zxb.lsp.provider.db.dao.TLspWalletBalanceLogDao;
import com.wangkuo.zxb.lsp.provider.db.po.TLspWalletBalanceLog;
import com.wangkuo.zxb.lsp.provider.db.po.TLspWalletBalanceLogCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王俊华
 * @version 1.0
 * @date 2016-04-06
 */
@Service
public class LspWalletBalanceLogServiceImpl implements ILspWalletBalanceLogService {

    @Autowired
    private TLspWalletBalanceLogDao lspWalletBalanceLogDao;


    @Override
    public LspWalletBalanceLogOutput findLastOneByLspUserId(Long userId) {
        LspWalletBalanceLogOutput output = new LspWalletBalanceLogOutput();
        TLspWalletBalanceLogCriteria criteria = new TLspWalletBalanceLogCriteria();
        criteria.createCriteria().andLspUserIdEqualTo(userId);
        criteria.setOrderByClause("create_date desc");
        List<TLspWalletBalanceLog> list = lspWalletBalanceLogDao.selectByExample(criteria);
        if(list.size()>0) {
            BeanMapper.copy(list.get(0), output);
        }
        return output;
    }
}
