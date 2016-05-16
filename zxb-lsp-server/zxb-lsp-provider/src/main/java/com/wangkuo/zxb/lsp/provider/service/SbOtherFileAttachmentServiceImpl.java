package com.wangkuo.zxb.lsp.provider.service;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.zxb.lsp.api.dto.input.SbGoodCategoryInput;
import com.wangkuo.zxb.lsp.api.dto.output.SbOtherFileAttachmentOutput;
import com.wangkuo.zxb.lsp.api.service.ISbOtherFileAttachmentService;
import com.wangkuo.zxb.lsp.provider.db.dao.TSbOtherFileAttachmentDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbOtherFileAttachment;
import com.wangkuo.zxb.lsp.provider.db.po.TSbOtherFileAttachmentCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wjh
 * @version 1.0
 * @date 2016-04-06
 */
@Service
public class SbOtherFileAttachmentServiceImpl implements ISbOtherFileAttachmentService {

    @Autowired
    private TSbOtherFileAttachmentDao attachmentDao;

    @Override
    public int addRecord(SbGoodCategoryInput input) {
        TSbOtherFileAttachment attachment = BeanMapper.map(input, TSbOtherFileAttachment.class);
        return attachmentDao.insertSelective(attachment);
    }

    /**
     * 查找品类附件图片
     * @param id
     * @return
     */
    @Override
    public List<SbOtherFileAttachmentOutput> findBybusiId(Long id) {
        TSbOtherFileAttachmentCriteria criteria = new TSbOtherFileAttachmentCriteria();
        criteria.createCriteria().andBusiIdEqualTo(id).andBusiTypeEqualTo(37);
        List<TSbOtherFileAttachment> list = attachmentDao.selectByExample(criteria);
        SbOtherFileAttachmentOutput output = new SbOtherFileAttachmentOutput();
        List<SbOtherFileAttachmentOutput> outputList = new ArrayList<>();
        for (TSbOtherFileAttachment attachment : list) {
            output = BeanMapper.map(attachment, SbOtherFileAttachmentOutput.class);
            outputList.add(output);
        }
        return outputList;
    }
}
