package com.wangkuo.zxb.lsp.web.controller;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.framework.utils.DateUtils;
import com.wangkuo.zxb.lsp.api.dto.input.AddStowageInput;
import com.wangkuo.zxb.lsp.api.dto.input.EditStowageInput;
import com.wangkuo.zxb.lsp.api.dto.input.QueryNoStowageBillInput;
import com.wangkuo.zxb.lsp.api.dto.input.QueryStowageListInput;
import com.wangkuo.zxb.lsp.api.dto.output.*;
import com.wangkuo.zxb.lsp.api.service.*;
import com.wangkuo.zxb.lsp.web.bind.annotation.CurrentUser;
import com.wangkuo.zxb.lsp.web.common.AjaxResponse;
import com.wangkuo.zxb.lsp.web.exception.ResourceNotFoundException;
import com.wangkuo.zxb.lsp.web.frommodel.SaveStowageFrom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * Created by chaizf on 2016/3/31.
 */
@Controller
@RequestMapping("/stowage")
public class StowageController {
    @Autowired
    private IStowageService stowageService;

    @Autowired
    private IWaybillService waybillService;

    @Autowired
    private IAllocCentreService allocCentreService;

    @Autowired
    private ILspUserService lspUserService;

    @Autowired
    private IDicService dicService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(@CurrentUser Long userId, QueryStowageListInput input, @RequestParam(defaultValue = "1") Integer pageNo, ModelMap model) {

        input.setLspId(userId);
        if (null != input.getBeginTime()) {
            input.setBeginTime(DateUtils.getDayBeginTime(input.getBeginTime()));
        }

        if (null != input.getEndTime()) {
            input.setEndTime(DateUtils.getDayLastTime(input.getEndTime()));
        }

        pageNo = pageNo == null ? 1 : pageNo;
        input.setPageNumber(pageNo);//当前页
        input.setPageSize(10);//每页记录数
        PagedList<StowageOutput> pagedList = stowageService.getStowagePagedList(input);
        model.addAttribute("pagedList", pagedList);

        List<LspUserCenterRelationOutput> relationOutputs = lspUserService.loadCenterRelationByProviderId(userId);

        //TODO:这个方法需要移除到AJAX
        model.addAttribute("relationOutputs", relationOutputs);
        model.addAttribute("input", input);
        return "/stowage/list";
    }


    /**
     * 获取未配载的运单
     *
     * @param input
     * @param userId
     * @return
     * @author 林守锦
     */
    @ResponseBody
    @RequestMapping(value = "/noStowageBill", method = RequestMethod.POST)
    public List<WaybillOutput> findNoStowageBill(QueryNoStowageBillInput input, @CurrentUser Long userId) {

        if (null != input.getStartTime()) {
            input.setStartTime(DateUtils.getDayBeginTime(input.getStartTime()));
        }

        if (null != input.getEndTime()) {
            input.setEndTime(DateUtils.getDayLastTime(input.getEndTime()));
        }

        input.setLspId(userId);
        return waybillService.selectNoStowageBillList(input);
    }


    /**
     * 获取配载单下的运单
     *
     * @param id 配载单id
     * @return
     * @author 林守锦
     */
    @ResponseBody
    @RequestMapping(value = "/stowageBill", method = RequestMethod.POST)
    public List<WaybillOutput> findStowageBill(Long id) {
        return waybillService.selectStowageBillList(id);
    }

    /**
     * 配载编辑页面
     *
     * @param id    配载单id
     * @param user
     * @param model
     * @return
     * @author 林守锦
     */
    @RequestMapping(value = {"/add", "/edit/{id}"}, method = RequestMethod.GET)
    public String edit(@PathVariable Long id, @CurrentUser LspUserOutput user, Model model) {

        StowageOutput stowage;
        if (null == id || 0 == id) {

            stowage = new StowageOutput();

        } else {
            stowage = stowageService.findOneStowage(id);
            if (null == stowage || null == stowage.getLspId() || !stowage.getLspId().equals(user.getId())) {
                throw new ResourceNotFoundException();
            }
        }

        model.addAttribute("stowage", stowage);

        List<AllocCentreOutput> allocCentreList;
        if (user.isVerify()) {
            allocCentreList = allocCentreService.findAllocCentreByLspId(user.getId());

        } else {
            allocCentreList = allocCentreService.findAll();
        }

        model.addAttribute("allocCentreList", allocCentreList);

        List<DicDataOutput> truckLengthTypeList = dicService.findData("truck_length_type");
        model.addAttribute("truckLengthTypeList", truckLengthTypeList);

        return "/stowage/edit";
    }

    /**
     * 保存配载 (新增和保存)
     *
     * @param form
     * @param errors
     * @return
     * @author 林守锦
     */
    @ResponseBody
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public AjaxResponse save(@CurrentUser LspUserOutput user, @Valid SaveStowageFrom form, Errors errors) {
        if (errors.hasErrors()) {
            AjaxResponse.paramInvalid();
        }

        if (null == form.getId() || form.getId() <= 0) {
            AddStowageInput input = BeanMapper.map(form, AddStowageInput.class);

            //新增
            input.setStowageTime(new Date());
            input.setLspId(user.getId());
            stowageService.addStowage(input);
            return AjaxResponse.success();

        } else {
            EditStowageInput input = BeanMapper.map(form, EditStowageInput.class);
            int status = stowageService.updateStowage(input);
            return new AjaxResponse(status);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/depart/{id}", method = RequestMethod.POST)
    public AjaxResponse confirmDepart(@PathVariable("id") Long id, @CurrentUser Long userId) {
        //TODO:方法内容需修改
        if (id == null) {
            return new AjaxResponse(-2, "配载单不存在");
        }
        int i = stowageService.confirmDepart(id, userId);
        if (i == -2) {
            return new AjaxResponse(i, "配载单不存在");
        }
        if (i == -3) {
            return new AjaxResponse(i, "配载标签不存在");
        }
        if (i == -4) {
            return new AjaxResponse(i, "该状态不允许发车");
        }
        return new AjaxResponse(i, "发车成功");
    }

    /**
     * 配载单详情
     *
     * @param id     配载单id
     * @param userId
     * @param model
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String detail(@PathVariable Long id, @CurrentUser Long userId, Model model) {
        StowageOutput stowage = stowageService.findOneStowage(id);

        if (null == stowage || null == stowage.getLspId() || !stowage.getLspId().equals(userId)) {
            throw new ResourceNotFoundException();
        }

        //已配载运单
        List<WaybillOutput> stowageBill = waybillService.selectStowageBillList(id);
        model.addAttribute("stowageBillList", stowageBill);
        model.addAttribute("stowage", stowage);
        return "/stowage/detail";
    }
}
