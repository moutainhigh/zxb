package com.wangkuo.zxb.mms.web.controller;

import com.wangkuo.zxb.mms.dto.PagedList;
import com.wangkuo.zxb.mms.dto.output.MerchantReportOutput;
import com.wangkuo.zxb.mms.dto.params.QueryMerchantReportParam;
import com.wangkuo.zxb.mms.server.service.IMerchantReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by mark on 16/5/7.
 */
@Controller
@RequestMapping("/merchant/report")
public class MerchantReportController {

    @Autowired
    private IMerchantReportService reportService;

    @RequestMapping(method = RequestMethod.GET)
    public String report(){
        return "/merchant/report";
    }

    @RequestMapping(value = "/data",method = RequestMethod.GET)
    @ResponseBody
    public PagedList<MerchantReportOutput> getReport(QueryMerchantReportParam param){
        return reportService.report(param);
    }
}
