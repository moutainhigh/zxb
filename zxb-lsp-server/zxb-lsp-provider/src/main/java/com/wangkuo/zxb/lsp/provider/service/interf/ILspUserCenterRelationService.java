package com.wangkuo.zxb.lsp.provider.service.interf;

import com.wangkuo.zxb.lsp.api.dto.input.LspUserCenterRelationInput;
import com.wangkuo.zxb.lsp.api.dto.output.LspUserCenterRelationOutput;

import java.util.List;

/**
 * Created by mark on 16/3/31.
 */
public interface ILspUserCenterRelationService {

    /**
     * 加载集散关系
     * @param id
     * @return
     */
    List<LspUserCenterRelationOutput> loadCenterRelationByProviderId(Long id);

    /**
     * 更新集散关系
     * @param relationInputs
     * @param providerId
     * @return
     */
    int insertRelations(List<LspUserCenterRelationInput> relationInputs, Long providerId);
}
