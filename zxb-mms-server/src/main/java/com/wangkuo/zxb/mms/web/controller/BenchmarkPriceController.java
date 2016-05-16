package com.wangkuo.zxb.mms.web.controller;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.zxb.mms.dto.output.BenchmarkPriceExcel;
import com.wangkuo.zxb.mms.dto.output.BenchmarkPriceOutput;
import com.wangkuo.zxb.mms.dto.output.BenchmarkPricePagedList;
import com.wangkuo.zxb.mms.dto.params.QueryBenchmarkPriceParam;
import com.wangkuo.zxb.mms.server.service.IFbBenchmarkPriceService;
import com.wangkuo.zxb.mms.util.ExportExcel;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by mark on 16/5/7.
 */
@Controller
@RequestMapping("/benchmark/price")
public class BenchmarkPriceController {

    @Autowired
    private IFbBenchmarkPriceService benchmarkPriceService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String listView(){
        return "/benchmarkPrice/list";
    }

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    @ResponseBody
    public BenchmarkPricePagedList getData(QueryBenchmarkPriceParam param){
        return benchmarkPriceService.getBenchmarkPriceList(param);
    }

    @RequestMapping(value = "/excel", method = RequestMethod.GET)
    @ResponseBody
    public String excel(QueryBenchmarkPriceParam param, HttpServletRequest request) throws NoSuchFieldException {
        param.setPageSize(9999999);
        BenchmarkPricePagedList pagedList = benchmarkPriceService.getBenchmarkPriceList(param);

        List<BenchmarkPriceExcel> excelList = new LinkedList<>();
        for (BenchmarkPriceOutput output : pagedList.getRows()) {
            BenchmarkPriceExcel excel = BeanMapper.map(output,BenchmarkPriceExcel.class);

            Map<String, String> mapHeavy = output.getSections1();
            excel.setSectionHeavy1(mapHeavy.get("section1"));
            excel.setSectionHeavy2(mapHeavy.get("section2"));
            excel.setSectionHeavy3(mapHeavy.get("section3"));
            excel.setSectionHeavy4(mapHeavy.get("section4"));
            excel.setSectionHeavy5(mapHeavy.get("section5"));
            excel.setSectionHeavy6(mapHeavy.get("section6"));
            excel.setSectionHeavy7(mapHeavy.get("section7"));
            excel.setSectionHeavy8(mapHeavy.get("section8"));
            excel.setSectionHeavy9(mapHeavy.get("section9"));

            Map<String, String> mapLight = output.getSections2();
            excel.setSectionLight1(mapLight.get("section1"));
            excel.setSectionLight2(mapLight.get("section2"));
            excel.setSectionLight3(mapLight.get("section3"));
            excel.setSectionLight4(mapLight.get("section4"));
            excel.setSectionLight5(mapLight.get("section5"));
            excel.setSectionLight6(mapLight.get("section6"));
            excel.setSectionLight7(mapLight.get("section7"));
            excel.setSectionLight8(mapLight.get("section8"));
            excel.setSectionLight9(mapLight.get("section9"));

            Map<String, String> mapHeavyLight = output.getSections3();
            excel.setSectionHeavyLight1(mapHeavyLight.get("section1"));
            excel.setSectionHeavyLight2(mapHeavyLight.get("section2"));
            excel.setSectionHeavyLight3(mapHeavyLight.get("section3"));
            excel.setSectionHeavyLight4(mapHeavyLight.get("section4"));
            excel.setSectionHeavyLight5(mapHeavyLight.get("section5"));
            excel.setSectionHeavyLight6(mapHeavyLight.get("section6"));
            excel.setSectionHeavyLight7(mapHeavyLight.get("section7"));
            excel.setSectionHeavyLight8(mapHeavyLight.get("section8"));
            excel.setSectionHeavyLight9(mapHeavyLight.get("section9"));

            excelList.add(excel);
        }

        XSSFWorkbook ex = ExportExcel.generateXlsxWorkbook(BenchmarkPriceExcel.class, excelList);
        return  ExportExcel.saveExcel(UUID.randomUUID().toString(), ex, request);
    }
}
