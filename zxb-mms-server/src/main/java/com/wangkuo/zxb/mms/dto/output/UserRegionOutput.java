package com.wangkuo.zxb.mms.dto.output;

/**
 * Created by cuihe on 16/5/10.
 */
public class UserRegionOutput {

    private Long userId;

    private Long permissionId;

    private Long regionId;


    private String allocCentre;

    private Long allocCentreId;

    private String Regionname;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

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

    public String getRegionname() {
        return Regionname;
    }

    public void setRegionname(String regionname) {
        Regionname = regionname;
    }
}
