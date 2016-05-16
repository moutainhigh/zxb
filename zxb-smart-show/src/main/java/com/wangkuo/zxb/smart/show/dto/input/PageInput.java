package com.wangkuo.zxb.smart.show.dto.input;

import java.io.Serializable;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-03-27
 */
public class PageInput implements Serializable {

    private int pageNumber = 1;


    private int pageSize = 10;

    /**
     * Getter for property 'pageNumber'.
     *
     * @return Value for property 'pageNumber'.
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Setter for property 'pageNumber'.
     *
     * @param pageNumber Value to set for property 'pageNumber'.
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * Getter for property 'pageSize'.
     *
     * @return Value for property 'pageSize'.
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Setter for property 'pageSize'.
     *
     * @param pageSize Value to set for property 'pageSize'.
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }


}
