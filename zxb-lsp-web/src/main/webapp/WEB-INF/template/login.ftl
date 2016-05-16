
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="renderer" content="webkit"><title>登录</title>
    <meta name="keywords" content=""/>
    <meta name="description" content=""/>
    <script type="text/javascript" src="${JS_PATH}/jquery-1.12.3.min.js"></script>
    <script type="text/javascript" src="${JS_PATH}/jquery.JPlaceholder.js"></script>
    <script type="text/javascript" src="${JS_PATH}/jquery.validate.min.js"></script>
    <script type="text/javascript" src="${JS_PATH}/layer/layer.js"></script>
    <script type="text/javascript" src="${JS_PATH}/lspuser/login.js"></script>


    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/dl.css">
    <link type="text/css" rel="stylesheet" href="${JS_PATH}/layer/skin/layer.css">
    <link type="text/css" rel="stylesheet" href="${JS_PATH}/layer/skin/layer.ext.css">
</head>
<body>
    <div class="wbk-p">
        <div class="wbk-2">
            <div class="nbk-1">
                <img src="${IMG_PATH}/logo.png">
            </div>
            <input type="hidden" id="returnUrl" value="${returnUrl!}" />
            <div class="dl">服务商登录</div>

            <div class="ank">
            <form id="loginForm">

                <div class="an">
                    <input class="text-input" id="nickName" name="nickName" placeholder="  请输入用户名">
                </div>

                <div>
                    <input type="password" id="password" name="password" placeholder="  请输入密码">
                </div>

                <div  class="dl1"><a id="loginBtn" style="height: 100%;width: 100%;display: inline-block;" href="#" >立即登录</a></div>
            </form>
                <div class="fhf-dl">如果你是服务商请在这里登录</div>

                <div class="dlfs-1">
                   <a href="../lspUser/register">——————&nbsp;&nbsp;服务商免费注册&nbsp;&nbsp;——————</a>
                </div>
                <br>
                <div class="wz1">
                   <#-- <span><a href="#">关于专线宝&nbsp;|</a></span>
                    <span><a href="#">我们的服务&nbsp;|</a></span>
                    <span><a href="#">服务条款&nbsp;|</a></span>
                    <span><a href="#">法律声明&nbsp;|</a></span>
                    <span><a href="#">帮助中心&nbsp;|</a></span>
                    <span><a href="#">手机专线宝&nbsp;|</a></span>
                    <span><a href="#">联系我们</a></span>
                    <p>
                        <span>2015专线宝 版权所有 增值电信业务经营许可证：浙B2-20140196</span>-->
                </div>
            </div>
        </div>
    </div>
</body>
</html>
