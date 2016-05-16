package com.wangkuo.zxb.lsp.api.service;

import com.wangkuo.zxb.lsp.api.dto.input.LspReceiveSendOffInput;
import com.wangkuo.zxb.lsp.api.dto.input.QueryLspReceiveInput;
import com.wangkuo.zxb.lsp.api.dto.output.LspReceiveOutput;
import com.wangkuo.zxb.lsp.api.dto.output.PagedList;

/**
 * 服务商回单寄出
 * Created by sanshao on 16-4-5.
 */
public interface ILspReceiveService {

    /**
     * 服务商回单寄出列表
     * @param output
     * @return
     */
    PagedList<LspReceiveOutput> listLspReceive(QueryLspReceiveInput output);

    /**
     * 回单寄出操作
     * @param input
     * @return
     */
    int sendOffReceive(LspReceiveSendOffInput input);
}
