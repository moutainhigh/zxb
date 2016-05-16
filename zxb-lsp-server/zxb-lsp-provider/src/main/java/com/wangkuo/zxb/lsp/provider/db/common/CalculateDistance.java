package com.wangkuo.zxb.lsp.provider.db.common;

import com.wangkuo.zxb.lsp.provider.service.Setting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by chaizf on 2016/4/7.
 */
@Component
public class CalculateDistance {
    @Autowired
    Setting setting;

    public String getDistance(String startGps, String endsGps){
        String url = "http://api.map.baidu.com/direction/v1/routematrix?output=xml&origins="
                + startGps + "&destinations=" + endsGps + "&ak="+setting.getMapKey();
        String str = null;
        try {
            str = getMapUrl(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String dis = getDistanceParameter(str, "text");
        if (dis.contains("公里")) {
            dis = dis.replace("公里", "");
        }
        if (dis.contains("米")) {
            dis = dis.replace("米", "");
            if (dis != null && !dis.equals("")) {
                Float meterDis = Float.parseFloat(dis);
                dis = String.valueOf(meterDis / 1000);
            } else {
                dis = "0";
            }
        }
        return dis;
    }

    //通过地址解析经纬度
    //如果解析不了，则返回null,
    //如果解析的了,则经纬度，已逗号 隔开。ex:10.22234,22.4444
    public String getGps(String address) {
        //解析经纬度
        String geocoderUrl = "http://api.map.baidu.com/geocoder/v2/?callback=renderOption&output=xml&address="
                + address+"&ak="+setting.getMapKey();
        try {
            geocoderUrl = getMapUrl(geocoderUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String lat = getGPSParameter(geocoderUrl, "lat");//纬度
        String lng = getGPSParameter(geocoderUrl, "lng");//经度
        if (lat == null || lat.trim() == "" || lng == null || lng.trim() == "") {
            return null;
        }
        return lat + "," + lng;
    }

    private String getMapUrl(String path) throws Exception {
        HttpURLConnection httpConn = null;

        BufferedReader in = null;
        try {
            URL url = new URL(path);
            httpConn = (HttpURLConnection) url.openConnection();
            //读取响应
            if (httpConn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                StringBuffer content = new StringBuffer();
                String tempStr = "";
                in = new BufferedReader(new InputStreamReader(httpConn.getInputStream(), "utf-8"));
                while ((tempStr = in.readLine()) != null) {
                    content.append(tempStr);
                }

                return content.toString();
            } else {
                throw new Exception("请求出现了问题!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            in.close();
            httpConn.disconnect();
        }
        return null;
    }

    private String getDistanceParameter(String data, String para) {
        String result = "";
        StringBuffer reStr = new StringBuffer();
        reStr.append("<distance>\\s*<");
        reStr.append(para);
        reStr.append(">");

        reStr.append("(.*?)");
        reStr.append("</");
        reStr.append(para);
        reStr.append(">");
        Pattern pattern = Pattern.compile(reStr.toString());
        Matcher matcher = pattern.matcher(data);
        if (matcher.find()) {
            result = matcher.group(1);
        }

        return result;
    }

    private String getGPSParameter(String data, String para) {
        String result = "";
        StringBuffer reStr = new StringBuffer();
        reStr.append("<");
        reStr.append(para);
        reStr.append(">");
        reStr.append("(.*?)");
        reStr.append("</");
        reStr.append(para);
        reStr.append(">");
        Pattern pattern = Pattern.compile(reStr.toString());
        Matcher matcher = pattern.matcher(data);
        if (matcher.find()) {
            result = matcher.group(1);
        }

        return result;
    }
}
