package com.wangkuo.zxb.lsp.web.payment;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.framework.mapper.JsonMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 支付工具类
 *
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-13
 */
public abstract class PaymentUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(PaymentUtils.class);

    private static final JsonMapper JSON_MAPPER = JsonMapper.getInstance();

    /**
     * 异步通知成功标记
     */
    public static final String NOTIFY_SUCCESS_FLAG = "SUCCESS";

    /**
     * 交易成功标记
     */
    public static final String TRADE_SUCCESS_FLAG = "SUCCESS";

    private PaymentUtils() {
    }

    /**
     * 创建支付
     *
     * @param gatewayUrl 支付网关地址
     * @param request    支付请求
     * @return
     */
    public static PaymentResponse createPayment(final String gatewayUrl, final String appSecret, final PaymentRequest request) {
        Assert.notNull(gatewayUrl);
        Assert.notNull(request);

        Map<String, String> paramsMap = new HashMap<>();
        paramsMap.put("appKey",request.getAppKey());
        paramsMap.put("channel",request.getChannel());
        paramsMap.put("outTradeNo",request.getOutTradeNo());
        paramsMap.put("totalFee", request.getTotalFee().floatValue()+"");
        paramsMap.put("subject",request.getSubject());
        paramsMap.put("body",request.getBody());
        paramsMap.put("bankCode",request.getBankCode());
        paramsMap.put("notifyUrl",request.getNotifyUrl());
        paramsMap.put("returnUrl",request.getReturnUrl());
        paramsMap.put("sign",request.getSign());
        paramsMap.put("signType",request.getSignType());

        String sign = SignUtils.createSign(paramsMap, appSecret, request.getSignType());
        paramsMap.put("sign", sign);

        String postResponse = post(gatewayUrl, paramsMap, "utf-8");
        if (StringUtils.isEmpty(postResponse)) {
            return null;
        }
        PaymentResponse response = JSON_MAPPER.fromJson(postResponse, PaymentResponse.class);
        return response;
    }

    /**
     * 验证通知
     *
     * @param params
     * @return
     */
    public static boolean verifyNotify(Map<String, String> params, String appSecret, String signType) {
        String localSign = SignUtils.createSign(params, appSecret, signType);
        String serverSign = params.get("sign");
        return localSign.equals(serverSign);
    }

    /**
     * 发送支付请求
     *
     * @param url
     * @param paramsMap
     * @param encoding
     * @return
     */
    private static String post(String url, Map<String, String> paramsMap, String encoding) {
        CloseableHttpClient client = HttpClients.createDefault();

        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(5000).setConnectionRequestTimeout(1000)
                .setSocketTimeout(5000).build();

        String responseText = "";
        CloseableHttpResponse response = null;
        try {
            HttpPost method = new HttpPost(url);
            method.setConfig(requestConfig);
            if (paramsMap != null) {
                List<NameValuePair> paramList = new ArrayList<>();
                for (Map.Entry<String, String> param : paramsMap.entrySet()) {
                    NameValuePair pair = new BasicNameValuePair(param.getKey(), param.getValue());
                    paramList.add(pair);
                }
                method.setEntity(new UrlEncodedFormEntity(paramList, encoding));
            }
            response = client.execute(method);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                responseText = EntityUtils.toString(entity);
            }
        } catch (Exception e) {
            LOGGER.error("发送支付请求异常", e);
        } finally {
            try {
                response.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return responseText;
    }

    /**
     * 支付请求
     */
    public static class PaymentRequest implements Serializable {
        private static final String URL_PATTERN = "^((http|https)://)(([a-zA-Z0-9\\._-]+\\.[a-zA-Z]{2,6})|([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}))(:[0-9]{1,4})*(/[a-zA-Z0-9%_/\\.\\-]*)?$";

        @NotEmpty
        private String appKey;

        @NotEmpty
        private String channel;

        @NotEmpty
        @Length(max = 60)
        private String outTradeNo;

        @NotNull
        @Min(1)
        private BigDecimal totalFee;

        @NotEmpty
        @Length(max = 200)
        private String subject;

        @Length(max = 1000)
        private String body;

        @Length(max = 20)
        private String bankCode;

        @NotEmpty
        @Length(max = 200)
        @Pattern(regexp = URL_PATTERN, message = "URL地址不符合条件")
        private String notifyUrl;

        @NotEmpty
        @Length(max = 200)
        @Pattern(regexp = URL_PATTERN, message = "URL地址不符合条件")
        private String returnUrl;

        @NotEmpty
        private String sign;

        @NotEmpty
        private String signType = "MD5";

        /**
         * Getter for property 'appKey'.
         *
         * @return Value for property 'appKey'.
         */
        public String getAppKey() {
            return appKey;
        }

        /**
         * Setter for property 'appKey'.
         *
         * @param appKey Value to set for property 'appKey'.
         */
        public void setAppKey(String appKey) {
            this.appKey = appKey;
        }

        /**
         * Getter for property 'channel'.
         *
         * @return Value for property 'channel'.
         */
        public String getChannel() {
            return channel;
        }

        /**
         * Setter for property 'channel'.
         *
         * @param channel Value to set for property 'channel'.
         */
        public void setChannel(String channel) {
            this.channel = channel;
        }

        /**
         * Getter for property 'outTradeNo'.
         *
         * @return Value for property 'outTradeNo'.
         */
        public String getOutTradeNo() {
            return outTradeNo;
        }

        /**
         * Setter for property 'outTradeNo'.
         *
         * @param outTradeNo Value to set for property 'outTradeNo'.
         */
        public void setOutTradeNo(String outTradeNo) {
            this.outTradeNo = outTradeNo;
        }

        /**
         * Getter for property 'totalFee'.
         *
         * @return Value for property 'totalFee'.
         */
        public BigDecimal getTotalFee() {
            return totalFee;
        }

        /**
         * Setter for property 'totalFee'.
         *
         * @param totalFee Value to set for property 'totalFee'.
         */
        public void setTotalFee(BigDecimal totalFee) {
            this.totalFee = totalFee;
        }

        /**
         * Getter for property 'subject'.
         *
         * @return Value for property 'subject'.
         */
        public String getSubject() {
            return subject;
        }

        /**
         * Setter for property 'subject'.
         *
         * @param subject Value to set for property 'subject'.
         */
        public void setSubject(String subject) {
            this.subject = subject;
        }

        /**
         * Getter for property 'body'.
         *
         * @return Value for property 'body'.
         */
        public String getBody() {
            return body;
        }

        /**
         * Setter for property 'body'.
         *
         * @param body Value to set for property 'body'.
         */
        public void setBody(String body) {
            this.body = body;
        }

        /**
         * Getter for property 'bankCode'.
         *
         * @return Value for property 'bankCode'.
         */
        public String getBankCode() {
            return bankCode;
        }

        /**
         * Setter for property 'bankCode'.
         *
         * @param bankCode Value to set for property 'bankCode'.
         */
        public void setBankCode(String bankCode) {
            this.bankCode = bankCode;
        }

        /**
         * Getter for property 'notifyUrl'.
         *
         * @return Value for property 'notifyUrl'.
         */
        public String getNotifyUrl() {
            return notifyUrl;
        }

        /**
         * Setter for property 'notifyUrl'.
         *
         * @param notifyUrl Value to set for property 'notifyUrl'.
         */
        public void setNotifyUrl(String notifyUrl) {
            this.notifyUrl = notifyUrl;
        }

        /**
         * Getter for property 'returnUrl'.
         *
         * @return Value for property 'returnUrl'.
         */
        public String getReturnUrl() {
            return returnUrl;
        }

        /**
         * Setter for property 'returnUrl'.
         *
         * @param returnUrl Value to set for property 'returnUrl'.
         */
        public void setReturnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
        }

        /**
         * Getter for property 'sign'.
         *
         * @return Value for property 'sign'.
         */
        public String getSign() {
            return sign;
        }

        /**
         * Setter for property 'sign'.
         *
         * @param sign Value to set for property 'sign'.
         */
        public void setSign(String sign) {
            this.sign = sign;
        }

        /**
         * Getter for property 'signType'.
         *
         * @return Value for property 'signType'.
         */
        public String getSignType() {
            return signType;
        }

        /**
         * Setter for property 'signType'.
         *
         * @param signType Value to set for property 'signType'.
         */
        public void setSignType(String signType) {
            this.signType = signType;
        }
    }


    /**
     * 支付请求结果
     */
    public static class PaymentResponse implements Serializable {

        public static final int RESULT_CODE_OK = 0;
        public static final String RESULT_MSG_OK = "OK";


        public static final int RESULT_CODE_APP_INVALID = 1;
        public static final String RESULT_MSG_APP_INVALID = "APP_INVALID";

        public static final int RESULT_CODE_SIGN_INVALID = 2;
        public static final String RESULT_MSG_SIGN_INVALID = "SIGN_INVALID";


        public static final int RESULT_CODE_CHANNEL_INVALID = 3;
        public static final String RESULT_MSG_CHANNEL_INVALID = "CHANNEL_INVALID";


        public static final int RESULT_CODE_MISS_PARAM = 4;
        public static final String RESULT_MSG_MISS_PARAM = "MISS_PARAM";


        public static final int RESULT_CODE_PARAM_INVALID = 5;
        public static final String RESULT_MSG_PARAM_INVALID = "PARAM_INVALID";

        public static final int RESULT_CODE_CHANNEL_ERROR = 6;
        public static final String RESULT_MSG_CHANNEL_ERROR = "CHANNEL_ERROR";


        public static final int RESULT_CODE_OUT_TRADE_NO_USED = 7;
        public static final String RESULT_MSG_OUT_TRADE_NO_USED = "OUT_TRADE_NO_USED";


        public static final int RESULT_CODE_SERVER_ERROR = 500;
        public static final String RESULT_MSG_SERVER_ERROR = "SERVER_ERROR";


        private int code;

        private String msg;

        private Object data;

        private String errMsg;

        /**
         * Getter for property 'code'.
         *
         * @return Value for property 'code'.
         */
        public int getCode() {
            return code;
        }

        /**
         * Setter for property 'code'.
         *
         * @param code Value to set for property 'code'.
         */
        public void setCode(int code) {
            this.code = code;
        }

        /**
         * Getter for property 'msg'.
         *
         * @return Value for property 'msg'.
         */
        public String getMsg() {
            return msg;
        }

        /**
         * Setter for property 'msg'.
         *
         * @param msg Value to set for property 'msg'.
         */
        public void setMsg(String msg) {
            this.msg = msg;
        }

        /**
         * Getter for property 'data'.
         *
         * @return Value for property 'data'.
         */
        public Object getData() {
            return data;
        }

        /**
         * Setter for property 'data'.
         *
         * @param data Value to set for property 'data'.
         */
        public void setData(Object data) {
            this.data = data;
        }

        /**
         * Getter for property 'errMsg'.
         *
         * @return Value for property 'errMsg'.
         */
        public String getErrMsg() {
            return errMsg;
        }

        /**
         * Setter for property 'errMsg'.
         *
         * @param errMsg Value to set for property 'errMsg'.
         */
        public void setErrMsg(String errMsg) {
            this.errMsg = errMsg;
        }
    }
}
