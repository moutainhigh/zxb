package com.wangkuo.zxb.mms.dto.output;

import java.io.Serializable;

/**
 * Created by john on 2016/5/6.
 */
public class RegionOutPut implements Serializable {
    //集散中心
    private String allocCentre;
    //集散中心id
    private Long allocCentreId;
    //区域名称
    private String regionName;
    private Long regionId;
    //外客户管理人
    private String outerCurrUser;
    //内客户管理人
    private String innerCurrUser;

    public String getAllocCentre() {
        return allocCentre;
    }

    public void setAllocCentre(String allocCentre) {
        this.allocCentre = allocCentre;
    }

    public Long getAllocCentreId() {
        return allocCentreId;
    }

    public void setAllocCentreId(Long allocCentreId) {
        this.allocCentreId = allocCentreId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getOuterCurrUser() {
        return outerCurrUser;
    }

    public void setOuterCurrUser(String outerCurrUser) {
        this.outerCurrUser = outerCurrUser;
    }

    public String getInnerCurrUser() {
        return innerCurrUser;
    }

    public void setInnerCurrUser(String innerCurrUser) {
        this.innerCurrUser = innerCurrUser;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }
}
