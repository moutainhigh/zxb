package com.wangkuo.zxb.lsp.api.service;

import com.wangkuo.zxb.lsp.api.dto.output.DicDataOutput;

import java.util.List;

/**
 * 字典表服务
 *
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-15
 */
public interface IDicService {


    /**
     * 获取字典数据
     *
     * @param type 名称
     * @return
     */
    List<DicDataOutput> findData(String type);
}
