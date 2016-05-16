package com.wangkuo.zxb.lsp.api.dto.input;

import java.io.Serializable;
import java.util.List;

/**
 * Created by sanshao on 16-4-6.
 */
public class LspReceiveSendOffInput implements Serializable {

    private LspReceiveSendOffBaseMsgInput receiveSendOffBaseMsgInput;

    private List<LspReceiveSendOffWaybillMsgInput> lspReceiveSendOffWaybillMsgInputs;

    public LspReceiveSendOffBaseMsgInput getReceiveSendOffBaseMsgInput() {
        return receiveSendOffBaseMsgInput;
    }

    public void setReceiveSendOffBaseMsgInput(LspReceiveSendOffBaseMsgInput receiveSendOffBaseMsgInput) {
        this.receiveSendOffBaseMsgInput = receiveSendOffBaseMsgInput;
    }

    public List<LspReceiveSendOffWaybillMsgInput> getLspReceiveSendOffWaybillMsgInputs() {
        return lspReceiveSendOffWaybillMsgInputs;
    }

    public void setLspReceiveSendOffWaybillMsgInputs(List<LspReceiveSendOffWaybillMsgInput> lspReceiveSendOffWaybillMsgInputs) {
        this.lspReceiveSendOffWaybillMsgInputs = lspReceiveSendOffWaybillMsgInputs;
    }
}
