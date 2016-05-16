package com.wangkuo.zxb.lsp.api.dto.output;

import com.wangkuo.zxb.lsp.api.dto.input.PageInput;

import java.io.Serializable;
import java.util.List;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-03-27
 */
public class PagedList<T extends Serializable> implements Serializable {

    private int pageNumber;

    private int pageSize;

    private int count;

    private List<T> content;

    public PagedList() {

    }

    public PagedList(PageInput pageInput, int count, List<T> content) {
        this.pageNumber = pageInput.getPageNumber();
        this.pageSize = pageInput.getPageSize();
        this.count = count;
        this.content = content;
    }


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

    /**
     * Getter for property 'count'.
     *
     * @return Value for property 'count'.
     */
    public int getCount() {
        return count;
    }

    /**
     * Setter for property 'count'.
     *
     * @param count Value to set for property 'count'.
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Getter for property 'content'.
     *
     * @return Value for property 'content'.
     */
    public List<T> getContent() {
        return content;
    }

    /**
     * Setter for property 'content'.
     *
     * @param content Value to set for property 'content'.
     */
    public void setContent(List<T> content) {
        this.content = content;
    }


    public int getTotalPage() {
        return pageSize == 0 ? 1 : (int) Math.ceil((double) count / (double) pageSize);
    }
}
