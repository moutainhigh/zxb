[#escape x as x?html]
    [#include "../_layout.ftl"]
    [#assign page_title="修改密码"/]
    [#assign page_keyword="修改密码"/]
    [#assign page_desc="修改密码"/]
    [#macro section_headjs]
    <script type="text/javascript" src="${JS_PATH}/common/validate.expand.js"></script>
    <script type="text/javascript" src="${JS_PATH}/updatepwd/update_pwd.js"></script>
    [/#macro]
    [#macro section_footjs]
    <script type="text/javascript" >
        $(document).ready(function(){

        });
    </script>
    [/#macro]

    [#macro section_css]

    [/#macro]

    [#macro section_headcss]
    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/gl-xx1.css">
    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/in-gggg.css">
    [/#macro]
 [@mainLayout]
 <div class="ybk-2">
     <div class="anquan">
         <div id="baseAccount" class="jb-x1">基本信息</div>
         <div class="aq-a1">安全设置</div>
     </div>

 </div>

 <form id="updatePwdForm" >

     <input name="nickName" value="${CURR_USER.nickName!}" type="hidden"/>
     <input name="type" value="${type!}" type="hidden"/>
     <div class="boot" style="margin-left:20px; margin-bottom: 327px;">
         <div class="d-yhm">用户名：${CURR_USER.nickName!}</div>
         <div class="ff1">原登录密码：<input class="i-t" id="oldpassword" name="oldpassword" type="password" placeholder="请输入原密码" >
             <div class="ff2" style="margin-left:-28px; margin-top:10px;">设置新登录密码：<input class="i-t" id="password" name="password" type="password" placeholder="请输入新的密码" ></div>
             <div class="d-cd">长度6-16个字符，支持英文字母、数字、符号</div>

             <div class="f4" style="margin-left:-28px;">确认新登录密码：<input class="i-t" id="confirm_password" name="confirm_password" type="password" placeholder="再次输入新密码" ></div>

             <div class="f7" id="submitBtn"  style="margin-left:-20px;">保存</div>
             <div class="f8" onclick="javascript:history.go(-1)">返回</div>
         </div>
     </div>
 </form>
     [/@mainLayout]
[/#escape]