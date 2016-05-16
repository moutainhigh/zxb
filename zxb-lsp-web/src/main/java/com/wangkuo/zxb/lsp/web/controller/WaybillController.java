package com.wangkuo.zxb.lsp.web.controller;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.zxb.lsp.api.dto.input.*;
import com.wangkuo.zxb.lsp.api.dto.output.*;
import com.wangkuo.zxb.lsp.api.service.*;
import com.wangkuo.zxb.lsp.web.bind.annotation.CurrentUser;
import com.wangkuo.zxb.lsp.web.common.AjaxResponse;
import com.wangkuo.zxb.lsp.web.common.Common;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by chaizf on 2016/3/30.
 */

@Controller
@RequestMapping("/waybill")
public class WaybillController {
    @Autowired
    IWaybillService waybillService;
    @Autowired
    private ISbGoodCategoryService categoryService;
    @Autowired
    IAllocCentreService allocCentreService;
    @Autowired
    ILspReceiverShipperInfoService lspReceiverShipperInfoService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(@CurrentUser Long userId, WaybillInput waybillInput, SbWaybillGoodInput goodInput, ModelMap model,HttpSession session,String action,Long shipperId,Long receiverId) {
        if(action!=null && action.equals("return")){

            //返回修改，需要到session取数据
            WaybillInput waybillSession = (WaybillInput)session.getAttribute(Common.WAYBILL_SESSION);
            if(null == waybillSession){
                return "/waybill/order";
            }
            SbWaybillGoodInput goodSession = (SbWaybillGoodInput)session.getAttribute(Common.GOOD_SESSION);
            FbAllotWaybillInput allot =(FbAllotWaybillInput)session.getAttribute(Common.ALLOT_SESSION);
            SbWaybillInvoiceInput invoice = (SbWaybillInvoiceInput)session.getAttribute(Common.INVOICE_SESSION);
            model.addAttribute("waybill", waybillSession);
            model.addAttribute("good", goodSession);
            model.addAttribute("allot", allot);
            model.addAttribute("invoice", invoice);
        }else{
            //清除session
            session.removeAttribute(Common.WAYBILL_SESSION);//运单
            session.removeAttribute(Common.GOOD_SESSION);//货物
            session.removeAttribute(Common.CONF_SESSION);//运单配置
            session.removeAttribute(Common.ALLOT_SESSION);//分理单
            session.removeAttribute(Common.INVOICE_SESSION);//发票
            LspReceiverShipperInfoOutput shipperOutput = null;
            if(null!=shipperId) {
                shipperOutput = lspReceiverShipperInfoService.findOneRecord(shipperId);
            }
            if(null!=shipperOutput){

                waybillInput.setShipperProvinceId(shipperOutput.getProvinceId());
                waybillInput.setShipperProvinceName(shipperOutput.getProvinceName());
                waybillInput.setShipperCityId(shipperOutput.getCityId());
                waybillInput.setShipperCityName(shipperOutput.getCityName());
                waybillInput.setShipperCountryId(shipperOutput.getCountryId());
                waybillInput.setShipperCountryName(shipperOutput.getCountryName());
                waybillInput.setShipperAddress(shipperOutput.getDetailedAddress());
                waybillInput.setShipperLinkName(shipperOutput.getLinkName());
                waybillInput.setShipperCustomerName(shipperOutput.getCompanyName());

                if(shipperOutput.getMobile()!=null){
                    waybillInput.setShipperLinkMobile(shipperOutput.getMobile());
                }
                if(shipperOutput.getTelphone()!=null){
                    waybillInput.setShipperLinkPhone(shipperOutput.getTelphone());
                }

            }

            if(null != receiverId){
                shipperOutput = lspReceiverShipperInfoService.findOneRecord(receiverId);
            }
            if(null!=shipperOutput){

                waybillInput.setReceiveProvinceId(shipperOutput.getProvinceId());
                waybillInput.setReceiveProvinceName(shipperOutput.getProvinceName());
                waybillInput.setReceiveCityId(shipperOutput.getCityId());
                waybillInput.setReceiveCityName(shipperOutput.getCityName());
                waybillInput.setReceiveCountryId(shipperOutput.getCountryId());
                waybillInput.setReceiveCountryName(shipperOutput.getCountryName());
                waybillInput.setReceiveAddress(shipperOutput.getDetailedAddress());
                waybillInput.setReceiveLinkName(shipperOutput.getLinkName());
                waybillInput.setReceiveName(shipperOutput.getCompanyName());

                if(shipperOutput.getMobile()!=null){
                    waybillInput.setReceiveLinkMobile(shipperOutput.getMobile());
                }
                if(shipperOutput.getTelphone()!=null){
                    waybillInput.setReceiveLinkPhone(shipperOutput.getTelphone());
                }

            }
            model.addAttribute("waybill", waybillInput);
            model.addAttribute("good", goodInput);
        }
        //查询品类
        List<SbGoodCategoryOutput> categoryList  = categoryService.findCategoryByLspId(userId);
        model.addAttribute("categoryList",categoryList);
        return "/waybill/order";
    }

    @ResponseBody
    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public AjaxResponse submitWaybill(@Validated WaybillInput waybill, Errors waybillErrors,
                        @Validated SbWaybillGoodInput good, Errors goodErrors, HttpSession session) {
        String shipperLinkMobile = waybill.getShipperLinkMobile();
        String shipperLinkPhone =waybill.getShipperLinkPhone();
        String receiveLinkMobile = waybill.getReceiveLinkMobile();
        String receiveLinkPhone = waybill.getReceiveLinkPhone();

        AjaxResponse ajaxResponse = new AjaxResponse();

        if(waybillErrors.hasErrors() || goodErrors.hasErrors() || (null==shipperLinkMobile && null==shipperLinkPhone)
                || (null==receiveLinkMobile && null==receiveLinkPhone)){
            List<ObjectError> aa =  waybillErrors.getAllErrors();
            /*for(ObjectError b: aa){
                b.getObjectName();
            }*/
            return AjaxResponse.paramInvalid();
        }
        WaybillInput waybillSession = (WaybillInput)session.getAttribute(Common.WAYBILL_SESSION);
        SbWaybillGoodInput goodSession = (SbWaybillGoodInput)session.getAttribute(Common.GOOD_SESSION);
        if(waybillSession != null){
            session.removeAttribute(Common.WAYBILL_SESSION);
        }
        if(goodSession != null){
            session.removeAttribute(Common.GOOD_SESSION);
        }
        //提交运单信息，放session，在确认交易时使用
        session.setAttribute(Common.WAYBILL_SESSION, waybill);
        session.setAttribute(Common.GOOD_SESSION, good);

        ajaxResponse.setStatus(1);
        return ajaxResponse;
    }

    @RequestMapping(value = "/conf", method = RequestMethod.GET)
    public String addConf(@CurrentUser Long userId, ModelMap model,HttpSession session) {
        WaybillInput waybillSession = (WaybillInput)session.getAttribute(Common.WAYBILL_SESSION);
        SbWaybillGoodInput goodSession = (SbWaybillGoodInput)session.getAttribute(Common.GOOD_SESSION);
        FbAllotWaybillInput allotSession =(FbAllotWaybillInput)session.getAttribute(Common.ALLOT_SESSION);
        SbWaybillInvoiceInput invoiceSession = (SbWaybillInvoiceInput)session.getAttribute(Common.INVOICE_SESSION);
        OrderConfInput confSession = (OrderConfInput)session.getAttribute(Common.CONF_SESSION);
        if(null==allotSession){
            allotSession = new FbAllotWaybillInput();
        }
        if(null==invoiceSession){
            invoiceSession = new SbWaybillInvoiceInput();
        }
        if(null==confSession){
            confSession = new OrderConfInput();
        }
        model.addAttribute("waybill", waybillSession);
        model.addAttribute("good", goodSession);
        model.addAttribute("allot", allotSession);
        model.addAttribute("invoice", invoiceSession);
        model.addAttribute("orderConf", confSession);
        //集散信息
        List<AllocCentreOutput> allocCentres = allocCentreService.findAllocCentreByLspId(userId);
        if(allocCentres.size()==0){
            allocCentres = allocCentreService.findAll();
        }
        model.addAttribute("allocCentres", allocCentres);
        return "/waybill/orderConf";
    }

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public AjaxResponse add(@CurrentUser LspUserOutput user, OrderConfInput conf, SbWaybillGoodInput good,
                            SbWaybillFeeInput fee,FbAllotWaybillInput allot, SbWaybillInvoiceInput invoice, HttpSession session) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        if(null == conf.getAllocCenterId() && null == conf.getAllocCenterName()){
            return AjaxResponse.failed("集散中心为空");
        }
        //1 进仓,1 到付
        if(null != conf.getIsNeedEnterDepot() && conf.getBalanceTypeWithZb() == 1){
            return AjaxResponse.failed("到付不允许进仓");
        }
        if(null == conf.getBalanceTypeWithZb()){
            return AjaxResponse.failed("费用未计算");
        }
        //获取提交运单时，存在session的运单信息
        WaybillInput waybill = (WaybillInput)session.getAttribute(Common.WAYBILL_SESSION);
        if(null == waybill){
            ajaxResponse.setData("waybill/add");
            ajaxResponse.setStatus(-1);
            return ajaxResponse;
        }
        SbWaybillGoodInput goodSession = (SbWaybillGoodInput)session.getAttribute(Common.GOOD_SESSION);
        BeanMapper.copy(conf,waybill);
        if(null !=waybill.getIsUpstairsIncre() && waybill.getIsStandard() == 0){
            return AjaxResponse.failed("非标准件不允许上楼");
        }
        //获取登陆人信息
        BeanMapper.copy(user, waybill.getUser());
        BeanMapper.copy(goodSession, good);
        WaybillInput input = waybillService.addWaybill(waybill, good, fee, allot, invoice);
        ajaxResponse.setData(input);
        ajaxResponse.setStatus(1);
        //运单提交成功，清除session
        session.removeAttribute(Common.WAYBILL_SESSION);//运单
        session.removeAttribute(Common.GOOD_SESSION);//货物
        session.removeAttribute(Common.CONF_SESSION);//运单配置
        session.removeAttribute(Common.ALLOT_SESSION);//分理单
        session.removeAttribute(Common.INVOICE_SESSION);//发票
        return ajaxResponse;
    }

    @RequestMapping(value = "/success/{waybillId}/{systemSn}/{feeStatus}", method = RequestMethod.GET)
    public String waybillSuccess(@CurrentUser LspUserOutput user, @PathVariable Long waybillId,@PathVariable String systemSn, @PathVariable String feeStatus, ModelMap model) {
        model.addAttribute("mobile",user.getMobile());
        model.addAttribute("waybillId",waybillId);
        model.addAttribute("systemSn",systemSn);
        model.addAttribute("feeStatus",feeStatus);
        return "/waybill/orderSuccess";
    }

    @ResponseBody
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public AjaxResponse edit(OrderConfInput conf,FbAllotWaybillInput allot,SbWaybillInvoiceInput invoice,HttpSession session) {
        AjaxResponse ajaxResponse = new AjaxResponse();

        //返回运单信息，放session
        session.setAttribute(Common.CONF_SESSION, conf);//运单配置
        session.setAttribute(Common.ALLOT_SESSION, allot);//分理单
        session.setAttribute(Common.INVOICE_SESSION, invoice);//发票
        return ajaxResponse;
    }

    @RequestMapping(value = "/pay", method = RequestMethod.POST)
    public String confirmPay(StowageInput stowageInput, Model model, HttpSession session){

        return "/waybill/paySuccess";
    }

    @ResponseBody
    @RequestMapping(value = "/{id}/waybill", method = RequestMethod.GET)
    public WaybillOutput view(@PathVariable long id) {
        WaybillOutput waybillOutput = waybillService.getOneWaybill(id);
        return waybillOutput;
    }


    @RequestMapping(value = "/indexWaybill", method = RequestMethod.GET)
    public String indexWayubill(@CurrentUser Long userId, ModelMap model, Integer pageNo, WaybillInput input, HttpSession session) {
        pageNo = pageNo == null ? 1 : pageNo;
        input.setLspId(userId);
        input.setPageNumber(pageNo);
        input.setPageSize(1);
        PagedList pagedList = waybillService.getPagedList(input,"operation_time desc");
        int count = pagedList.getCount();
        int pageSize = pagedList.getPageSize();

        model.addAttribute("totalRow", count);
        model.addAttribute("totalPage", (int) Math.ceil((double) count / pageSize));
        model.addAttribute("pageSize", pageSize);
        model.addAttribute("pageNo", pageNo);
        model.addAttribute("waybills", pagedList.getContent());
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/calculatefee", method = RequestMethod.POST)
    public CalculateFeeOutput calculateFee(CalculateFeeInput input,ModelMap model){
        CalculateFeeOutput feeOutput = waybillService.waybillBalanceFee(input);
        model.addAttribute("variousFee",feeOutput);
        return feeOutput;
    }

    @ResponseBody
    @RequestMapping(value = "/enterFee", method = RequestMethod.POST)
    public BigDecimal calculateEnterDepotFee(CalculateFeeInput input) {
        BigDecimal enterFee = waybillService.calculateEnterDepotFee(input);
        return enterFee;
    }

    @ResponseBody
    @RequestMapping(value = "/upstairsFee", method = RequestMethod.POST)
    public BigDecimal calculateUpstairsFee(CalculateFeeInput input) {
        BigDecimal upstairsFee = waybillService.calculateUpstairsFee(input);
        return upstairsFee;
    }

    @ResponseBody
    @RequestMapping(value = "/unloadFee", method = RequestMethod.POST)
    public BigDecimal calculateUnloadFee(CalculateFeeInput input) {
        BigDecimal unloadFee = waybillService.calculateUnloadFee(input);
        return unloadFee;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(@CurrentUser Long userId, QueryWaybillConditionInput input, @RequestParam(defaultValue = "1") Integer pageNo, ModelMap model) {

        input.setLspId(userId);
        pageNo = pageNo == null ? 1 : pageNo;
        input.setPageNumber(pageNo);//当前页
        input.setPageSize(10);//每页记录数
        PagedList<WaybillAndFeeOutput> pagedList = waybillService.queryWaybillPagedList(input);

        model.addAttribute("pagedList", pagedList);
        model.addAttribute("input", input);
        return "/waybill/list";
    }

    /**
     * 运单详情
     * @param id
     * @param userId
     * @param model
     * @return
     */
    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
    public String detail(@PathVariable Long id, @CurrentUser Long userId, Model model) {
        //运单的基本信息
        WaybillOutput waybillOutput = waybillService.getOneWaybill(id);
        //客户运单轨迹
        List<WaybillCustomerTrackOutput> waybillTrackOutputs = waybillService.selectWaybillCustomerTrackOutputByWaybillId(id);
//        List<WaybillTrackOutput> waybillTrackOutputs = waybillService.selectListByWaybillId(id);
        //货物信息
        WaybillGoodOutput waybillGoodOutput = waybillService.selectGoodByWaybillId(id);
        //费用信息
        WaybillFeeOutput waybillFeeOutput = waybillService.selectFeeByWaybillId(id);
        //配载信息
        StowageOutput stowageOutput = waybillService.selectStowageByWaybillId(id);
        //仓库信息
        WaybillDepotOutput depotOutput = waybillService.selectDepotByWaybillId(id);
        //分理信息
        FbAllotWaybillOutput allotWaybillOutput = waybillService.selectAllotWaybillByWaybillId(id);
        //回单信息
        WaybillReceiveOutput waybillReceiveOutput = waybillService.selectWaybillReceiveByWaybillId(id);
        //赔付费用信息
        List<LspWaybillBalanceDetailOutput> balanceDetailOutputs = waybillService.selectBalanceDetailByWaybillId(id);

        model.addAttribute("waybillOutput", waybillOutput);
        model.addAttribute("waybillTrackOutputs", waybillTrackOutputs);
        model.addAttribute("waybillGoodOutput", waybillGoodOutput);
        model.addAttribute("waybillFeeOutput", waybillFeeOutput);
        model.addAttribute("stowageOutput", stowageOutput);
        model.addAttribute("depotOutput", depotOutput);
        model.addAttribute("allotWaybillOutput", allotWaybillOutput);
        model.addAttribute("waybillReceiveOutput", waybillReceiveOutput);
        model.addAttribute("balanceDetailOutputs", balanceDetailOutputs);

        return "/waybill/detail";
    }

    /**
     * 关闭运单
     * @param id
     * @param userId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/close", method = RequestMethod.POST)
    public AjaxResponse close(Long id, @CurrentUser Long userId) {

        if (id == null) {
            return new AjaxResponse(0, "运单不存在");
        }

        int i = waybillService.close(id, userId);

        if (i == 0) {
            return new AjaxResponse(0, "运单不存在");
        }

        if (i == -1) {
            return new AjaxResponse(i, "运单不允许关闭,请联系客服.");
        }

        return new AjaxResponse(i, "关闭成功");

    }

    @RequestMapping(value = "/feenote", method = RequestMethod.GET)
    public String feeNote() {
        return "/common/feeNote";
    }
}
