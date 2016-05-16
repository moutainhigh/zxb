package com.wangkuo.zxb.mms.dto.params;

import java.io.Serializable;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-26
 */
public class QueryUserParam extends PageParam implements Serializable {

    private String realName;

    private Boolean isAdmin;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean admin) {
        isAdmin = admin;
    }
}
