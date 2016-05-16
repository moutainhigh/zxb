package com.wangkuo.zxb.lsp.web.controller;

import com.wangkuo.zxb.lsp.api.dto.input.SbAreaInfoInput;
import com.wangkuo.zxb.lsp.api.dto.output.SbAreaInfoOutput;
import com.wangkuo.zxb.lsp.api.service.ISbAreaInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author wjh
 * @version 1.0
 * @date 2016-03-27
 */
@Controller
@RequestMapping("/sbarea")
public class SbAreaInfoController {

    @Autowired
    private ISbAreaInfoService sbAreaInfoService;

    @ResponseBody
    @RequestMapping(value = "city", method = RequestMethod.GET)
    public List<SbAreaInfoOutput> findAllCity(Long id) {
        return sbAreaInfoService.selectAllProvince(id);
    }


}
