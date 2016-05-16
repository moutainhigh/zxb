package com.wangkuo.zxb.lsp.api.service;


import com.wangkuo.zxb.lsp.api.dto.input.SbAreaInfoInput;
import com.wangkuo.zxb.lsp.api.dto.output.SbAreaInfoOutput;

import java.util.List;

/**
 * @author wjh
 * @version 1.0
 * @date 2016-03-29
 */
public interface ISbAreaInfoService {
    /**
     * 根据parentAreaId 查找省，市，区
     * @param ParentAreaId
     * @return
     */
   List<SbAreaInfoOutput> selectAllProvince(Long ParentAreaId);
}