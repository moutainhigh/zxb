package com.wangkuo.zxb.mms.dto.output;

import com.wangkuo.zxb.mms.dto.PagedList;

/**
 * Created by mark on 16/5/6.
 */
public class BenchmarkPricePagedList extends PagedList<BenchmarkPriceOutput> {
    private int maxHeavyColumns;
    private int maxLightColumns;
    private int maxHeavyLightColumns;

    public int getMaxHeavyColumns() {
        return maxHeavyColumns;
    }

    public void setMaxHeavyColumns(int maxHeavyColumns) {
        this.maxHeavyColumns = maxHeavyColumns;
    }

    public int getMaxLightColumns() {
        return maxLightColumns;
    }

    public void setMaxLightColumns(int maxLightColumns) {
        this.maxLightColumns = maxLightColumns;
    }

    public int getMaxHeavyLightColumns() {
        return maxHeavyLightColumns;
    }

    public void setMaxHeavyLightColumns(int maxHeavyLightColumns) {
        this.maxHeavyLightColumns = maxHeavyLightColumns;
    }
}
