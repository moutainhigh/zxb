package com.wangkuo.zxb.lsp.provider.service;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.zxb.lsp.api.dto.input.LspUserAttachmentInput;
import com.wangkuo.zxb.lsp.api.dto.output.LspUserAttachmentOutput;
import com.wangkuo.zxb.lsp.provider.db.dao.TSbOtherFileAttachmentDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbOtherFileAttachment;
import com.wangkuo.zxb.lsp.provider.db.po.TSbOtherFileAttachmentCriteria;
import com.wangkuo.zxb.lsp.provider.service.interf.ILspUserAttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mark on 16/3/31.
 */
@Service
public class LspUserAttachmentServiceImpl implements ILspUserAttachmentService {

    @Autowired
    private TSbOtherFileAttachmentDao attachmentDao;
    @Override
    public List<LspUserAttachmentOutput> imageList(Long providerId) {
        TSbOtherFileAttachmentCriteria example = new TSbOtherFileAttachmentCriteria();
        example.createCriteria().andBusiTypeGreaterThanOrEqualTo(30).andBusiTypeLessThanOrEqualTo(35)
        .andBusiIdEqualTo(providerId);
        return BeanMapper.mapList(attachmentDao.selectByExample(example), LspUserAttachmentOutput.class);
    }

    @Override
    public int addLspUserImage(LspUserAttachmentInput input) {
        return attachmentDao.insertSelective(BeanMapper.map(input, TSbOtherFileAttachment.class));
    }

    @Override
    public int deleteImage(Long imageId) {
        return attachmentDao.deleteByPrimaryKey(imageId);
    }

    @Override
    public List<LspUserAttachmentOutput> fileList(Long providerId) {
        TSbOtherFileAttachmentCriteria example = new TSbOtherFileAttachmentCriteria();
        example.createCriteria().andBusiTypeEqualTo(36).andBusiIdEqualTo(providerId);
        return BeanMapper.mapList(attachmentDao.selectByExample(example), LspUserAttachmentOutput.class);
    }

    @Override
    public int deleteFiles(Long[] ids) {
        for(Long id : ids){
            if(deleteImage(id)!=1) return 0;
        }
        return 1;
    }
}
