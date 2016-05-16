package com.wangkuo.zxb.mms.dto.params;

import java.io.Serializable;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-27
 */
public class AddUserParam implements Serializable {

    private String account;

    private String realName;

    private String mobile;

    private String password;

    private Boolean isAdmin;

    /**
     * Getter for property 'account'.
     *
     * @return Value for property 'account'.
     */
    public String getAccount() {
        return account;
    }

    /**
     * Setter for property 'account'.
     *
     * @param account Value to set for property 'account'.
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * Getter for property 'realName'.
     *
     * @return Value for property 'realName'.
     */
    public String getRealName() {
        return realName;
    }

    /**
     * Setter for property 'realName'.
     *
     * @param realName Value to set for property 'realName'.
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * Getter for property 'mobile'.
     *
     * @return Value for property 'mobile'.
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Setter for property 'mobile'.
     *
     * @param mobile Value to set for property 'mobile'.
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * Getter for property 'password'.
     *
     * @return Value for property 'password'.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter for property 'password'.
     *
     * @param password Value to set for property 'password'.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter for property 'admin'.
     *
     * @return Value for property 'admin'.
     */
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    /**
     * Setter for property 'admin'.
     *
     * @param admin Value to set for property 'admin'.
     */
    public void setIsAdmin(Boolean admin) {
        isAdmin = admin;
    }
}
