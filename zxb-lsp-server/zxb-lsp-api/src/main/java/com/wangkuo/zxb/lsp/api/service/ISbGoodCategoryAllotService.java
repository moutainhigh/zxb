package com.wangkuo.zxb.lsp.api.service;

import com.wangkuo.zxb.lsp.api.dto.input.SbGoodCategoryAllotInput;

/**
 * @author 王俊华
 * @version 1.0
 * @date 2016-03-30
 */
public interface ISbGoodCategoryAllotService {
    /**
     * 根据id修改记录
     *
     * @param input
     * @return
     */
    int updateOneById(SbGoodCategoryAllotInput input);
}