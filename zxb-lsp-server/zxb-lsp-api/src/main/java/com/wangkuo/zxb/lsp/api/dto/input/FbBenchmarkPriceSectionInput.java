package com.wangkuo.zxb.lsp.api.dto.input;

import java.io.Serializable;

/**
 * @author wjh
 * @version 1.0
 * @date 2016-04-16
 */
public class FbBenchmarkPriceSectionInput implements Serializable {
    private Long allocCenterId;
    private Integer endCountryId;
    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getAllocCenterId() {
        return allocCenterId;
    }

    public void setAllocCenterId(Long allocCenterId) {
        this.allocCenterId = allocCenterId;
    }

    public Integer getEndCountryId() {
        return endCountryId;
    }

    public void setEndCountryId(Integer endCountryId) {
        this.endCountryId = endCountryId;
    }
}
