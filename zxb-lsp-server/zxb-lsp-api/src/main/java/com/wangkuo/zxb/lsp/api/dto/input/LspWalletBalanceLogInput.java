package com.wangkuo.zxb.lsp.api.dto.input;


import java.io.Serializable;
import java.util.Date;

/**
 * Created by wjh on 16/3/31.
 */
public class LspWalletBalanceLogInput extends PageInput implements Serializable {
    private Long id;

    private Long lspUserId;

    private Integer type;

    private Date createDate;

    private String memo;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLspUserId() {
        return lspUserId;
    }

    public void setLspUserId(Long lspUserId) {
        this.lspUserId = lspUserId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}
