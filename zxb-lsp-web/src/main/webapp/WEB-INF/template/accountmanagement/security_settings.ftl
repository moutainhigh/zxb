[#escape x as x?html]
    [#include "../_layout.ftl"]
    [#assign page_title="基本信息"/]
    [#assign page_keyword="基本信息"/]
    [#assign page_desc="基本信息"/]
[#--js--]
    [#macro section_headjs]
    <script type="text/javascript" src="${JS_PATH}/accountmanagement/base.js"></script>
    [/#macro]
    [#macro section_footjs]
    <script type="text/javascript">
        $(document).ready(function () {
        });
    </script>
    [/#macro]

[#--css--]
    [#macro section_css]
    [/#macro]
    [#macro section_headcss]
    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/in-gggg.css">
    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/gl-xx1.css">
    [/#macro]

[#--填充页面--]
    [@mainLayout]
    <div class="ybk">
    [#--bottom--]
        <div class="ybk-1">
            <div class="anquan">
                <div id="base-info" class="aq-a">基本信息</div>
                <div id="security-settings" class="jb-x">安全设置</div>
            </div>
            <div class="aq-1">
                <div class="aq-11">您可以通过绑定的手机号码或注册的用户账号进行登录。</div>
                <div class="aq-22"><span class="sp">登录账户：</span> <span class="sp-s">${CURR_USER.nickName!}</span> &nbsp;&nbsp;&nbsp;
                    <span class="sp">上次登录时间：</span> [#if CURR_USER.lastLoginDate??]${CURR_USER.lastLoginDate?string("yyyy-MM-dd")}[#else]
                        首次登录[/#if]
                </div>
            </div>
            <div class="x-1"></div>
        </div>

    [#--content--]
        <div class="boot" style="margin-left:20px;">
            <div class="f1">登录密码：
                <span class="s-x">******</span>
            	<span class="s-x"><a href="../lspUser/updatepwd?type=baseinfo">修改</a>
                </span>
            </div>
        </div>
    </div>
    [/@mainLayout]
[/#escape]