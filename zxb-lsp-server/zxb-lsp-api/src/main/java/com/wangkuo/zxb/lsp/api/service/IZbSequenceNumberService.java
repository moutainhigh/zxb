package com.wangkuo.zxb.lsp.api.service;

/**
 * Created by chaizf on 2016/3/30.
 */
public interface IZbSequenceNumberService {

    /**
     * 创建序列号
     * @param bodyType
     * @param bodyId
     * @param codeType
     * @return
     */
    public String createSequenceNumber(Integer bodyType,Long bodyId,String codeType);
}
