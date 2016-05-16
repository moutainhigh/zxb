package com.wangkuo.zxb.lsp.web.payment;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.*;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-07
 */
public class SignUtils {

    /**
     * 签名的参数名称
     */
    private static final String SIGN_PARENTHESES_NAME = "sign";
    private static final String SIGN_TYPE_PARENTHESES_NAME = "signType";


    private SignUtils() {

    }


    /**
     * 验证签名
     *
     * @param params the params
     * @param key    the key
     * @return boolean
     */
    public static boolean verify(Map<String, String> params, String key, String signType, String sign) {
        String serverSign = createSign(params, key, signType);
        return serverSign.equals(sign);
    }

    /**
     * Create sign.
     *
     * @param params the params
     * @param key    the key
     * @return the string
     */
    public static String createSign(Map<String, String> params, String key, String signType) {
        Map<String, String> newParams = paraFilter(params);
        return DigestUtils.md5Hex(createLinkString(newParams) + key);
    }

    /**
     * 把数组所有元素排序，并按照“参数=参数值”的模式用“&”字符拼接成字符串
     *
     * @param params 需要排序并参与字符拼接的参数组
     * @return 拼接后字符串 string
     */
    public static String createLinkString(Map<String, String> params) {
        List<String> keys = new ArrayList<>(params.keySet());
        Collections.sort(keys);

        StringBuilder prestr = new StringBuilder();

        int size = keys.size();

        for (int i = 0; i < size; i++) {
            String key = keys.get(i);
            String value = params.get(key);

            prestr.append(key);
            prestr.append("=");
            prestr.append(value);
            if (i != size - 1) {//拼接时，不包括最后一个&字符
                prestr.append("&");
            }
        }

        return prestr.toString();
    }

    /**
     * 除去数组中的空值和签名参数
     *
     * @param sArray 签名参数组
     * @return 去掉空值与签名参数后的新签名参数组 map
     */
    public static Map<String, String> paraFilter(Map<String, String> sArray) {

        Map<String, String> result = new HashMap<>();

        if (sArray == null || sArray.isEmpty()) {
            return result;
        }

        for (Map.Entry<String, String> entry : sArray.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (null == value || value.isEmpty() ||
                    SIGN_PARENTHESES_NAME.equals(key) || SIGN_TYPE_PARENTHESES_NAME.equalsIgnoreCase(key)) {
                continue;
            }

            result.put(key, value);
        }

        return result;
    }
}
