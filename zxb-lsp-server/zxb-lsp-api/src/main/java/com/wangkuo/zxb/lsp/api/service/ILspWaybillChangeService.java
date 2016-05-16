package com.wangkuo.zxb.lsp.api.service;

import com.wangkuo.zxb.lsp.api.dto.input.LspWaybillChangeVerifyInput;
import com.wangkuo.zxb.lsp.api.dto.input.QueryLspWaybillChangeInput;
import com.wangkuo.zxb.lsp.api.dto.output.LspWaybillChangeDetailOutput;
import com.wangkuo.zxb.lsp.api.dto.output.LspWaybillChangeOutput;
import com.wangkuo.zxb.lsp.api.dto.output.PagedList;

import java.util.List;

/**
 * 服务商运单变更
 * Created by sanshao on 16-4-9.
 */
public interface ILspWaybillChangeService {

    PagedList<LspWaybillChangeOutput> selectListByCondition(QueryLspWaybillChangeInput input);

    List<LspWaybillChangeDetailOutput> selectChangeDetailByIdAndStatus(Long waybillId,Long lspChangeId,Integer isChange);

    List<LspWaybillChangeOutput> selectListByWaybillIdAndStatus(Long waybillId,Integer status);

    int verify(LspWaybillChangeVerifyInput input);

    LspWaybillChangeOutput findById(Long id);
}
