package com.wangkuo.zxb.lsp.provider.service.interf;

import com.wangkuo.zxb.lsp.api.dto.input.LspUserAttachmentInput;
import com.wangkuo.zxb.lsp.api.dto.output.LspUserAttachmentOutput;

import java.util.List;

/**
 * Created by mark on 16/3/31.
 */
public interface ILspUserAttachmentService {

    /**
     * 查找附件
     * @param providerId 服务商ID
     * @return
     */
    List<LspUserAttachmentOutput> imageList(Long providerId);

    /**
     * 上传附件
     * @param input
     * @return
     */
    int addLspUserImage(LspUserAttachmentInput input);

    /**
     * 删除附件
     * @param imageId
     * @return
     */
    int deleteImage(Long imageId);

    /**
     * 查找文件
     * @param providerId 服务商ID
     * @return
     */
    List<LspUserAttachmentOutput> fileList(Long providerId);

    /**
     * 删除附件
     * @param ids
     * @return
     */
    int deleteFiles(Long[] ids);
}
