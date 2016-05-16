package com.wangkuo.zxb.mms.dto.params;

import java.io.Serializable;

/**
 * Created by cuihe on 16/5/10.
 */
public class SavePermissionParam implements Serializable {

    private Long userId;
    private String permissions;
    private String permissionRegion;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public String getPermissionRegion() {
        return permissionRegion;
    }

    public void setPermissionRegion(String permissionRegion) {
        this.permissionRegion = permissionRegion;
    }
}
