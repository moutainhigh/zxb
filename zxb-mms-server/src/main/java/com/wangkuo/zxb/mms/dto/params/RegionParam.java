package com.wangkuo.zxb.mms.dto.params;

import java.io.Serializable;

/**
 * @author 柳朋朋
 * @version 1.0
 * @date 2016/5/5.
 */
public class RegionParam implements Serializable {
    //新增区域
    private Long allocCentreId;
    private Long provinceId;
    private Long cityId;
    private Long countryId;

    //原营销区域
    private Long originalAllocCentreId;
    private Long originalRegionId;

    //转入营销区域
    private Long transferAllocCentreId;

    public Long getAllocCentreId() {
        return allocCentreId;
    }

    public void setAllocCentreId(Long allocCentreId) {
        this.allocCentreId = allocCentreId;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public Long getOriginalAllocCentreId() {
        return originalAllocCentreId;
    }

    public void setOriginalAllocCentreId(Long originalAllocCentreId) {
        this.originalAllocCentreId = originalAllocCentreId;
    }

    public Long getOriginalRegionId() {
        return originalRegionId;
    }

    public void setOriginalRegionId(Long originalRegionId) {
        this.originalRegionId = originalRegionId;
    }


    public Long getTransferAllocCentreId() {
        return transferAllocCentreId;
    }

    public void setTransferAllocCentreId(Long transferAllocCentreId) {
        this.transferAllocCentreId = transferAllocCentreId;
    }
}
