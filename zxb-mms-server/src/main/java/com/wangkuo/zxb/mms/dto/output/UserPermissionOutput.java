package com.wangkuo.zxb.mms.dto.output;

import com.wangkuo.zxb.mms.server.db.po.TUserPermission;
import com.wangkuo.zxb.mms.server.db.po.TUserRegion;

import java.io.Serializable;
import java.util.List;

/**
 * Created by cuihe on 16/5/10.
 */
public class UserPermissionOutput implements Serializable {

    /**
     * 对应的权限
     */
    private Long permissionId;
    /**
     * 该权限对应的地区
     */
    private List<UserRegionOutput> listUserRegion;

    /**
     * 对应页面显示的区域名称
     */
    private String txtSelectedRegion;
    /**
     * 对应页面隐藏域的区域id组合
     */
    private String txtPermissionRegionValue;



    public String getTxtSelectedRegion() {
        if(listUserRegion==null) return "";
        String txt="";
        for(UserRegionOutput output:listUserRegion)
        {
            txt=txt+" "+output.getAllocCentre()+output.getRegionname();
        }
        return txt;
    }

    public String getTxtPermissionRegionValue() {
        if(listUserRegion==null) return "";
        String txt="";
        for(UserRegionOutput output:listUserRegion)
        {
            txt=txt+","+permissionId+"_"+output.getAllocCentreId()+"_"+output.getRegionId();
        }
        return txt;
    }



    public List<UserRegionOutput> getListUserRegion() {
        return listUserRegion;
    }

    public void setListUserRegion(List<UserRegionOutput> listUserRegion) {
        this.listUserRegion = listUserRegion;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }
}
