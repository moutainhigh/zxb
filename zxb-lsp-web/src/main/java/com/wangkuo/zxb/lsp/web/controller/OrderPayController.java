package com.wangkuo.zxb.lsp.web.controller;

import com.wangkuo.zxb.lsp.api.dto.input.CreatePaymentInput;
import com.wangkuo.zxb.lsp.api.dto.input.PayMentParam;
import com.wangkuo.zxb.lsp.api.dto.output.LspUserOutput;
import com.wangkuo.zxb.lsp.api.dto.output.OrderOutput;
import com.wangkuo.zxb.lsp.api.dto.output.OrderPaySuccessOutput;
import com.wangkuo.zxb.lsp.api.dto.output.PaymentInformationOutput;
import com.wangkuo.zxb.lsp.api.service.IOrderPayService;
import com.wangkuo.zxb.lsp.web.bind.annotation.CurrentUser;
import com.wangkuo.zxb.lsp.web.payment.PaymentSetting;
import com.wangkuo.zxb.lsp.web.payment.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by mark on 16/4/13.
 */
@Controller
@RequestMapping("/payment")
public class OrderPayController {

    @Autowired
    private IOrderPayService orderPayService;
    @Autowired
    private PaymentSetting setting;

    @Value("#{global['site-url']}")
    private String contextPath;
    @Value("#{global['payment.ALI_WEB']}")
    private String ALI_WEB;
    @Value("#{global['payment.ALI_BANK']}")
    private String ALI_BANK;

    @RequestMapping(value = "/{id}/{bId}")
    public String createOrder(@PathVariable Long id, @PathVariable Long bId, Model model,@CurrentUser LspUserOutput user) {
        CreatePaymentInput input = new CreatePaymentInput();
        input.setWaybillId(id);
        input.setBenchmarkId(bId);
        input.setBookerId(user.getId());
        input.setBookerName(user.getCompanyName());
        input.setCreateTime(new Date());
        PaymentInformationOutput output = orderPayService.createOrderInformation(input);
        model.addAttribute("info",output);
        if (output==null||output.getStatus()<0) return "/payment/order_create_fail";
        return "/payment/payment";
    }

    @RequestMapping(value = "/pay/{id}", method = RequestMethod.POST)
    public String payPage(@PathVariable Long id, String bankType, Model model){
        OrderOutput order = orderPayService.findOrder(id);

        PaymentUtils.PaymentRequest request = new PaymentUtils.PaymentRequest();
        request.setAppKey(setting.getAppKey());
        request.setChannel(bankType==null?ALI_WEB:ALI_BANK);
        request.setOutTradeNo(id+"");
        request.setTotalFee(order.getPayFee());
        request.setSubject("订单"+order.getPaySn());
        request.setBody("");
        request.setBankCode(bankType);
        request.setNotifyUrl(contextPath+"/payment/notify/"+id);
        request.setReturnUrl(contextPath+"/payment/return/"+id);

        PaymentUtils.PaymentResponse response = PaymentUtils.createPayment(setting.getGatewayUrl(),setting.getAppSecret(), request);
        if (response!=null && response.getCode() == PaymentUtils.PaymentResponse.RESULT_CODE_OK) {
            HashMap<String,String> map = (HashMap<String,String>) response.getData();
            model.addAttribute("html", map.get("html"));
        }
        return "/payment/pay_page";
    }

    @RequestMapping(value = "/return/{id}")
    public String returnS(@PathVariable Long id,String tradeNo,HttpServletRequest request,Model model) {
        Assert.notNull(id);
        boolean n = PaymentUtils.verifyNotify(parseParam(request),setting.getAppSecret(),"MD5");
        PayMentParam payMentParam=new PayMentParam();
        payMentParam.setPaymentNo(tradeNo);
        Integer r = orderPayService.paySuccess(id,payMentParam);
        if(n&&r==1){
            model.addAttribute("result", true);
//            return "redirect:/success/"+id;
        } else {
            model.addAttribute("result", false);
        }
        return "/payment/payResult";
    }

    @RequestMapping(value = "/notify/{id}",produces = "text/html")
    @ResponseBody
    public String notifyS(@PathVariable Long id,String tradeNo,HttpServletRequest request){
        Assert.notNull(id);
        boolean n = PaymentUtils.verifyNotify(parseParam(request),setting.getAppSecret(),"MD5");
        PayMentParam payMentParam=new PayMentParam();
        payMentParam.setPaymentNo(tradeNo);
        Integer r= orderPayService.paySuccess(id, payMentParam);
        if(!n&&(r==null ||!r.equals(1)))
        {
            return "error";
        }
        return PaymentUtils.NOTIFY_SUCCESS_FLAG;
    }

    @RequestMapping(value = "/payed/{id}", method = RequestMethod.GET)
    @ResponseBody
    public boolean ifPaySuccess(@PathVariable Long id){
        OrderOutput order = orderPayService.findOrder(id);
        return order.getPayStatus() == 1;
    }

    @RequestMapping(value = "/success/{id}")
    public String success(@PathVariable Long id, Model model) {
        OrderPaySuccessOutput order = orderPayService.findOrderAndWaybillId(id);
        model.addAttribute("order", order);
        return "/payment/paySuccess";
    }


    protected static Map<String,String> parseParam(HttpServletRequest request){
        //获取支付宝POST过来反馈信息
        Map<String,String> params = new HashMap<>();
        Map<String,String[]> requsetParams = request.getParameterMap();
        for (String name : requsetParams.keySet()) {
            String[] values = requsetParams.get(name);
            String valueStr = "";
            for (int i=0;i<values.length;i++){
                valueStr=(i==values.length-1)?valueStr+values[i]:valueStr+values[i]+",";
            }
            // 乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
            //valueStr = new String(valueStr.getBytes("ISO-8859-1"), "UTF-8"); 
            params.put(name,valueStr);
        }
        return params;
    }
}
