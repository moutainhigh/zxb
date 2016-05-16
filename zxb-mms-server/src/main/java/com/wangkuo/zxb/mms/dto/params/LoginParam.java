package com.wangkuo.zxb.mms.dto.params;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-27
 */
public class LoginParam implements Serializable {

    @NotEmpty
    private String account;

    @NotEmpty
    private String password;

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
}
