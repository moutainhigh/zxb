package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TDicData;
import com.wangkuo.zxb.lsp.provider.db.po.TDicDataCriteria;

import java.util.List;

@MyBatisDao
public interface TDicDataDao extends GenericDao<TDicData, Long, TDicDataCriteria> {

    /**
     * 获取字典数据
     * @param type
     * @return
     */
    List<TDicData> selectByDicType(String type);
}