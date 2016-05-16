package com.wangkuo.zxb.mms.web.viewmodel;

import java.util.List;

/**
 * 菜单项目
 *
 * @author 林守锦
 * @version 1.0
 * @date 2016-05-11
 */
public class MenuItem {
    private String text;

    private String url;

    private List<MenuItem> childMenus;

    private Integer rank;

    /**
     * Getter for property 'text'.
     *
     * @return Value for property 'text'.
     */
    public String getText() {
        return text;
    }

    /**
     * Setter for property 'text'.
     *
     * @param text Value to set for property 'text'.
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Getter for property 'url'.
     *
     * @return Value for property 'url'.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Setter for property 'url'.
     *
     * @param url Value to set for property 'url'.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for property 'childMenus'.
     *
     * @return Value for property 'childMenus'.
     */
    public List<MenuItem> getChildMenus() {
        return childMenus;
    }

    /**
     * Setter for property 'childMenus'.
     *
     * @param childMenus Value to set for property 'childMenus'.
     */
    public void setChildMenus(List<MenuItem> childMenus) {
        this.childMenus = childMenus;
    }

    /**
     * Getter for property 'rank'.
     *
     * @return Value for property 'rank'.
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * Setter for property 'rank'.
     *
     * @param rank Value to set for property 'rank'.
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }
}
