package com.wangkuo.zxb.lsp.api.service;

import com.wangkuo.zxb.lsp.api.dto.output.LspWalletBalanceLogOutput;

/**
 * @author 王俊华
 * @version 1.0
 * @date 2016-04-06
 */
public interface ILspWalletBalanceLogService {

    /**
     * 根据服务商id查找最近记录
     * @param userId
     * @return
     */
    LspWalletBalanceLogOutput findLastOneByLspUserId(Long userId);

}