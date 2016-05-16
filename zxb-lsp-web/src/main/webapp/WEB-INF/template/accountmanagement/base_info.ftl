[#escape x as x?html]
    [#include "../_layout.ftl"]
    [#assign page_title="修改密码"/]
    [#assign page_keyword="修改密码"/]
    [#assign page_desc="修改密码"/]
[#--js--]
    [#macro section_headjs]
    <script type="text/javascript" src="${JS_PATH}/common/validate.expand.js"></script>
    <script type="text/javascript" src="${JS_PATH}/accountmanagement/base.js"></script>
    <script type="text/javascript" src="${JS_PATH}/common/address_select.js"></script>
    <script type="text/javascript">
        $().ready(function () {
            if ('${CURR_USER.provinceId!}' != '') {
                $("input[name='provinceName']").val('${(CURR_USER.provinceName)!}');
                $("input[name='cityName']").val('${(CURR_USER.cityName)!}');
                $("input[name='countryName']").val('${(CURR_USER.countryName)!}');
                var proviceIntervalId = window.setInterval(function () {
                    $("select[name='provinceId']").val('${(CURR_USER.provinceId)!}').trigger("change");
                    if ($("select[name='provinceId']").val()) {
                        window.clearInterval(proviceIntervalId);
                    }
                }, 20);
                var cityIntervalId = window.setInterval(function () {
                    $("select[name='cityId']").val('${(CURR_USER.cityId)!}').trigger("change");
                    if ($("select[name='cityId']").val()) {
                        window.clearInterval(cityIntervalId);
                    }
                }, 20);
                var countryIntervalId = window.setInterval(function () {
                    $("select[name='countryId']").val('${(CURR_USER.countryId)!}').trigger("change");
                    if ($("select[name='countryId']").val()) {
                        window.clearInterval(countryIntervalId);
                    }
                }, 20);
            }
        });
    </script>
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
    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/gl-xx1.css">
    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/in-gggg.css">
    <link rel="stylesheet" type="text/css" href="${CSS_PATH}/xinxi-sr.css">
    [/#macro]

[#--主页面--]
    [@mainLayout]
    <div class="ybk-1">
        <div class="anquan">
            <div id="base-info" class="jb-x">基本信息</div>
            <div id="security-settings" class="aq-a">安全设置</div>
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
    <!--form-->
    <form id="saveBaseInfo">
        <div class="boot">
            <div class="f1"><i class="s-p1">*</i>公 司 名：<input class="i-t" id="companyName" name="companyName" type=""
                                                              value="${CURR_USER.companyName!}"></div>
            <div class="f1"><i class="s-p1">*</i>联 系 人：<input class="i-t" id="realUserName" name="realUserName" type=""
                                                              value="${CURR_USER.realUserName!}"></div>
            <div class="f1">固定电话 ：<input class="i-t" id="telphone" name="telphone" type="" value="${CURR_USER.telphone!}">
            </div>
            <div class="f1">
                <span class="s1"><i class="s-p1">*</i>地址：</span>
                <span>
                    <div class="address_select" style="display: inline-block;">
                        <select id="provinceId" name="provinceId"
                                style="width:80px; height:30px;border:none; color:#8b8b8b;border:none; border:solid 1px #e8e8e8;">
                            <option value="">请选择</option>
                        </select>
                        <select id="cityId" name="cityId"
                                style="width:80px; height:30px;border:none; color:#8b8b8b;border:none; border:solid 1px #e8e8e8;">
                            <option value="">请选择</option>
                        </select>
                        <select d="countryId" name="countryId"
                                style="width:80px; height:30px;border:none; color:#8b8b8b;border:none; border:solid 1px #e8e8e8;">
                            <option value="">请选择</option>
                        </select>
                        <input name="provinceName" type="hidden"/>
                        <input name="cityName" type="hidden"/>
                        <input name="countryName" type="hidden"/>
                    </div>
                    <input class="i-t" style="margin-left: 10px; width: 250px;" id="detailedAddress" name = "detailedAddress" placeholder="请输入详细地址"
                           value="${CURR_USER.detailedAddress!}"/>

                </span>
            </div>
            <div class="f7"><a href="#"><img id="save" src="${IMG_PATH}/b-c.png"></a></div>
        </div>
    </form>
    [/@mainLayout]
[/#escape]