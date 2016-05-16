
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="renderer" content="webkit"><title>注册</title>
    <meta name="keywords" content=""/>
    <meta name="description" content=""/>
    <script type="text/javascript" src="${JS_PATH}/jquery-1.12.3.min.js"></script>
    <script type="text/javascript" src="${JS_PATH}/jquery.JPlaceholder.js"></script>
    <script type="text/javascript" src="${JS_PATH}/jquery.validate.min.js"></script>
    <script type="text/javascript" src="${JS_PATH}/common/validate.expand.js"></script>
    <script type="text/javascript" src="${JS_PATH}/layer/layer.js"></script>
    <script type="text/javascript" src="${JS_PATH}/lspuser/register.js"></script>
    <script type="text/javascript" src="${JS_PATH}/common/address_select.js"></script>

    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/dl.css">
    <link type="text/css" rel="stylesheet" href="${JS_PATH}/layer/skin/layer.css">
    <link type="text/css" rel="stylesheet" href="${JS_PATH}/layer/skin/layer.ext.css">
    <style>
        .strong_pwd{
            background-color: #ef5b00;
        }
    </style>
</head>
<body>
<div class="wbk">
    <div class="wbk-1">
        <div class="nbk">
            <img src="${IMG_PATH}/logo.png">
        </div>

        <div class="dl">服务商注册</div>
    <form id="signupForm">
        <div class="ank">


            <div class="an">
                <input class="text-input" name="nickName" id="nickName" placeholder="你喜欢的用户名" >
            </div>

            <div>
                <input  id="password" type="password" name="password"  placeholder="请设置密码">
            </div>

            <div class="aq">
                <span class="r4">安全程度：</span>
                <span id="pwd_r1" class="r1">弱</span>
                <span id="pwd_r2" class="r1">中</span>
                <span id="pwd_r3" class="r1">强</span>
            </div>

            <div>
                <input type="password" id="confirm_password" name="confirm_password"  placeholder="确认密码">
            </div>

            <div>
                <input  type="text" id="companyName" name="companyName" placeholder="您的公司名">
            </div>

            <div>
                <input  type="text" id="realUserName" name="realUserName" placeholder="您的名字">
            </div>

            <div>
                <input  type="text" name="mobile" id="mobile" phone placeholder="您的手机号">
            </div>

            <div>
                <input  id="telphone" name="telphone" placeholder="您的座机号（选填）">
            </div>

            <div class="xl-cd">
                <div class="address_select" >
                    <select id="provinceId"  name="provinceId" style="width:115px; height:40px; color:#8b8b8b;border:none; border:solid 1px #e8e8e8;"><option value="">请选择</option></select>
                    <select id="cityId" name="cityId" style="width:115px; height:40px; color:#8b8b8b;border:none; border:solid 1px #e8e8e8;"><option value="">请选择</option></select>
                    <select id="countryId"  name="countryId" style="width:115px; height:40px; color:#8b8b8b;border:none; border:solid 1px #e8e8e8;"><option value="">请选择</option></select>

                    <input name="provinceName"   type="hidden"/>
                    <input name="cityName"  type="hidden"/>
                    <input name="countryName" type="hidden"/>
                </div>
            </div>

            <div>
                <input  type="text" id="detailedAddress" name="detailedAddress" placeholder="详细地址">
            </div>

            <div class="yzm">
                <input class="cc" id="captcha" name="captcha" placeholder="验证码" style="width:200px; height:40px;">
                <input type="hidden" id="captchaId" name="captchaId" value="${captchaId!}"/>
                <span class="yzm-tp">
                    <a href="javascript:void(0)"><img id="capCodeImg" src="../captcha"></a>
                    <a href="javascript:void(0)" id="changeCode" style="font-size:12px;">看不清？</a>
                </span>
            </div>

            <div class="sheng-min">
                <input id="agree" name="agree" type="checkbox" class="srkuangs" value="" style="width:12px; height:12px;">同意 <a target="_blank" href="../about/service">专线宝服务条款</a>

            </div>

            <a href="#" style="text-decoration:none;">[#--<div class="dl1">立即注册</div>--]<input id="registerBtn" class="dl1" type="button" value="立即注册"/></a>

            <div class="wz1">
               [#-- <span>关于专线宝&nbsp;|</span>
                <span>我们的服务&nbsp;|</span>
                <span>服务条款&nbsp;|</span>
                <span>法律声明&nbsp;|</span>
                <span>帮助中心&nbsp;|</span>
                <span>手机专线宝&nbsp;|</span>
                <span>联系我们</span>
                <p>
                    <span>2015专线宝 版权所有 增值电信业务经营许可证：浙B2-20140196</span>--]

            </div>

        </div>
    </form>
    </div>
</div>
</body>
</html>
