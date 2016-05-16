package com.wangkuo.zxb.lsp.web.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;

/**
 * 验证码
 *
 * @author 王俊华
 * @version 1.0
 * @date 2016-03-31
 */
@Controller
@RequestMapping("/")
public class CaptchaController {

    @Autowired
    private com.octo.captcha.service.CaptchaService imageCaptchaService;


    @RequestMapping("/captcha")
    public void handleRequest(String captchaId, HttpServletRequest request, HttpServletResponse response) throws Exception {

        if (StringUtils.isEmpty(captchaId)) {
            captchaId = request.getSession().getId();
        }

        response.setDateHeader("Expires", 0);
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        response.setHeader("Pragma", "no-cache");
        response.setContentType("image/jpeg");

        BufferedImage bi = (BufferedImage)imageCaptchaService.getChallengeForID(captchaId);
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(bi, "jpg", out);
        try {
            out.flush();
        } finally {
            IOUtils.closeQuietly(out);
        }
    }
}

