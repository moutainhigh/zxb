package com.wangkuo.zxb.lsp.web.payment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 支付配置
 *
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-14
 */
@Component
public class PaymentSetting implements Serializable {

    @Value("#{global['payment.gateway-url']}")
    private String gatewayUrl;

    @Value("#{global['payment.app-key']}")
    private String appKey;

    @Value("#{global['payment.app-secret']}")
    private String appSecret;

    /**
     * Getter for property 'gatewayUrl'.
     *
     * @return Value for property 'gatewayUrl'.
     */
    public String getGatewayUrl() {
        return gatewayUrl;
    }

    /**
     * Setter for property 'gatewayUrl'.
     *
     * @param gatewayUrl Value to set for property 'gatewayUrl'.
     */
    public void setGatewayUrl(String gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
    }

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
     * Getter for property 'appSecret'.
     *
     * @return Value for property 'appSecret'.
     */
    public String getAppSecret() {
        return appSecret;
    }

    /**
     * Setter for property 'appSecret'.
     *
     * @param appSecret Value to set for property 'appSecret'.
     */
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }
}
