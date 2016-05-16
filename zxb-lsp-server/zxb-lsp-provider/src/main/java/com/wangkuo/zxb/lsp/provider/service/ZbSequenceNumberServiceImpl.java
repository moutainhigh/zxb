package com.wangkuo.zxb.lsp.provider.service;

import com.wangkuo.zxb.lsp.api.service.IZbSequenceNumberService;
import com.wangkuo.zxb.lsp.provider.db.dao.TZbSequenceNumberDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSequenceNumberGenerateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/3/30.
 */
@Service
public class ZbSequenceNumberServiceImpl implements IZbSequenceNumberService {

    @Autowired
    TZbSequenceNumberDao sequenceNumberDao;
    @Override
    public String createSequenceNumber(Integer bodyType, Long bodyId, String codeType) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bodyType", bodyType);
        map.put("bodyId", bodyId);
        map.put("codeType", codeType);
        map.put("num", 1);
        map.put("nowTime",new Date());
        TSequenceNumberGenerateResult result = sequenceNumberDao.createSequenceNumber(map);
        return result.getMaxSequenceNumber();
    }
}
