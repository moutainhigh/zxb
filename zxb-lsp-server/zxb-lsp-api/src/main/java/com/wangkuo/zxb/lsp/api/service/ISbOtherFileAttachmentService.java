package com.wangkuo.zxb.lsp.api.service;

import com.wangkuo.zxb.lsp.api.dto.input.SbGoodCategoryInput;
import com.wangkuo.zxb.lsp.api.dto.input.SbOtherFileAttachmentInput;
import com.wangkuo.zxb.lsp.api.dto.output.SbOtherFileAttachmentOutput;

import java.util.List;

/**
 * @author wjh
 * @version 1.0
 * @date 2016-04-06
 */
public interface ISbOtherFileAttachmentService {
    /**
     * 新增记录
     *
     * @param input
     * @return
     */
    int addRecord(SbGoodCategoryInput input);

    List<SbOtherFileAttachmentOutput> findBybusiId(Long id);
}