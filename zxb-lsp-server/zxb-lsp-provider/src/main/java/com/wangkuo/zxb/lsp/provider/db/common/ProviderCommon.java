package com.wangkuo.zxb.lsp.provider.db.common;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2016/3/31.
 */
public class ProviderCommon {
    public static String LSP = "服务商";

    //回单轨迹(服务商交付集散)
    public static Integer LSP_TO_ALLOC = 11;
    //回单位置
    public static Integer ALLOC = 2;
    //回单时效
    public static Integer RECEIVE_AGING = 10;
    //运单来源(服务商)
    public static Integer WAYBILL_SOURCE_LSP = 2;
    //确认交易
    public static String WAYBILL_CONFIRMATION="运单成交";
    //改单费
    public static final BigDecimal CHANGE_FEE = new BigDecimal(20);

}
