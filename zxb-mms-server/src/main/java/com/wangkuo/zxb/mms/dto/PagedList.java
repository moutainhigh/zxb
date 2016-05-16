package com.wangkuo.zxb.mms.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-26
 */
public class PagedList<T extends Serializable> implements Serializable {

    private int total;

    private List<T> rows;


    public PagedList() {

    }

    public PagedList(int total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }


    /**
     * Getter for property 'total'.
     *
     * @return Value for property 'total'.
     */
    public int getTotal() {
        return total;
    }

    /**
     * Setter for property 'total'.
     *
     * @param total Value to set for property 'total'.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Getter for property 'rows'.
     *
     * @return Value for property 'rows'.
     */
    public List<T> getRows() {
        return rows;
    }

    /**
     * Setter for property 'rows'.
     *
     * @param rows Value to set for property 'rows'.
     */
    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
