package com.wangkuo.zxb.lsp.api.dto.input;

import java.io.Serializable;

/**
 * Created by mark on 16/3/31.
 */
public class LspUserCenterRelationInput implements Serializable {
    private Long id;

    private Long lspUserId;

    private Long centerId;

    private String lspUserName;

    private String allocCenterName;

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

    public Long getCenterId() {
        return centerId;
    }

    public void setCenterId(Long centerId) {
        this.centerId = centerId;
    }

    public String getLspUserName() {
        return lspUserName;
    }

    public void setLspUserName(String lspUserName) {
        this.lspUserName = lspUserName == null ? null : lspUserName.trim();
    }

    public String getAllocCenterName() {
        return allocCenterName;
    }

    public void setAllocCenterName(String allocCenterName) {
        this.allocCenterName = allocCenterName == null ? null : allocCenterName.trim();
    }
}
