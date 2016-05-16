package com.wangkuo.zxb.mms.web.controller;

import com.wangkuo.zxb.mms.server.db.po.TSysConf;
import com.wangkuo.zxb.mms.server.service.ISysConfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 系统设置   ------>     系统设置
 * <p/>
 * 异常码
 *
 * @author 柳朋朋
 * @version 1.0
 * @date 2016/5/7.
 */
@Controller
@RequestMapping("dict")
public class SysConfController {
    @Autowired
    private ISysConfService sysConfService;

    /**
     * 字典页面--->入口
     *
     * @return
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String dict(ModelMap model) {
        List<TSysConf> sysConfs = sysConfService.findAll();
        String initPassword = "";
        String initInner = "";
        String initOuter = "";
        for (TSysConf sysConf : sysConfs) {
            if ("password".equals(sysConf.getCode())) {//用户初始密码
                initPassword = sysConf.getValue();
            }
            if ("outerTime".equals(sysConf.getCode())) {//外客户服务有效期
                initOuter = sysConf.getValue();
            }
            if ("innerTime".equals(sysConf.getCode())) {//内客户服务有效期
                initInner = sysConf.getValue();
            }
        }
        model.addAttribute("initPassword", initPassword);
        model.addAttribute("initInner", initInner);
        model.addAttribute("initOuter", initOuter);
        return "/settings/index";
    }

    /**
     * 修改字典表信息
     *
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Boolean updateDict(TSysConf sysConf) {
        int count = sysConfService.update(sysConf);
        return count > 0;
    }

}
