package com.wangkuo.zxb.mms.dto.params;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2016/5/10 0010.
 */
public class CustomerChainStatisticParam implements Serializable {

    private Date date;

    private String sysAccount;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSysAccount() {
        return sysAccount;
    }

    public void setSysAccount(String sysAccount) {
        this.sysAccount = sysAccount;
    }
}
