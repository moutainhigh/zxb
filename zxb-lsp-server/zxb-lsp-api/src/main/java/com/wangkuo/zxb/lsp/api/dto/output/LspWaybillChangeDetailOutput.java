package com.wangkuo.zxb.lsp.api.dto.output;

import java.io.Serializable;

public class LspWaybillChangeDetailOutput implements Serializable {
    private Long id;

    private Long waybillId;

    private Long lspChangeId;

    private Integer isChange;

    private String changeName;

    private String beforeChangeValue;

    private String afterChangeValue;

    private String beforeChangeValueDesc;

    private String afterChangeValueDesc;

    private String changeProperty;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Long waybillId) {
        this.waybillId = waybillId;
    }

    public Long getLspChangeId() {
        return lspChangeId;
    }

    public void setLspChangeId(Long lspChangeId) {
        this.lspChangeId = lspChangeId;
    }

    public Integer getIsChange() {
        return isChange;
    }

    public void setIsChange(Integer isChange) {
        this.isChange = isChange;
    }

    public String getChangeName() {
        return changeName;
    }

    public void setChangeName(String changeName) {
        this.changeName = changeName == null ? null : changeName.trim();
    }

    public String getBeforeChangeValue() {
        return beforeChangeValue;
    }

    public void setBeforeChangeValue(String beforeChangeValue) {
        this.beforeChangeValue = beforeChangeValue == null ? null : beforeChangeValue.trim();
    }

    public String getAfterChangeValue() {
        return afterChangeValue;
    }

    public void setAfterChangeValue(String afterChangeValue) {
        this.afterChangeValue = afterChangeValue == null ? null : afterChangeValue.trim();
    }

    public String getBeforeChangeValueDesc() {
        return beforeChangeValueDesc;
    }

    public void setBeforeChangeValueDesc(String beforeChangeValueDesc) {
        this.beforeChangeValueDesc = beforeChangeValueDesc == null ? null : beforeChangeValueDesc.trim();
    }

    public String getAfterChangeValueDesc() {
        return afterChangeValueDesc;
    }

    public void setAfterChangeValueDesc(String afterChangeValueDesc) {
        this.afterChangeValueDesc = afterChangeValueDesc == null ? null : afterChangeValueDesc.trim();
    }

    public String getChangeProperty() {
        return changeProperty;
    }

    public void setChangeProperty(String changeProperty) {
        this.changeProperty = changeProperty == null ? null : changeProperty.trim();
    }
}