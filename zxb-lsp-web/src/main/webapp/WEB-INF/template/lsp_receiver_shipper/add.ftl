
[#include "../_layout/_js.ftl"/]
<link rel="stylesheet" type="text/css" href="${CSS_PATH}/in-gggg.css">
<link type="text/css" rel="stylesheet" href="${CSS_PATH}/gl-fahuoren.css">

<link type="text/css" rel="stylesheet" href="${JS_PATH}/layer/skin/layer.css">
<link type="text/css" rel="stylesheet" href="${JS_PATH}/layer/skin/layer.ext.css">

<script type="text/javascript" src="${JS_PATH}/common/validate.expand.js"></script>
<script type="text/javascript" src="${JS_PATH}/lspreceivershipper/add.js"></script>


    <div class="d1"> <span class="s-q">新增[#if pageInput.type??][#if pageInput.type==0]发货人[/#if][#if pageInput.type==1]收货人[/#if][/#if]</span></div>
<form id="signupForm">
    <input id="type" type="hidden" name="type" value="${pageInput.type!0}" />
    <input  type="hidden" name="id" value="${pageInput.id!}" />
    <div class="d2">
        <span style="float:left;">*联系人：<input class="w" id="linkName" name="linkName"  value="${pageInput.linkName!}"/></span>
        <span class="l-bz">公司名称：<input class="w" id="companyName" name="companyName" value="${pageInput.companyName!}"/></span>

        	<span class="l-z1">
            	*发货地址：<select id="provinceId"  name="provinceId" class="s">
                <option value="" selected>请选择</option>
            [#list provinces as data]
                <option value="${data.id}" [#if pageInput.provinceId??][#if data.id==pageInput.provinceId]selected[/#if][/#if]>${data.areaName}</option>
            [/#list]
            </select>
                <select id="cityId"  name="cityId" class="s">
                    <option value="" selected>请选择</option>
                [#if citys??]
                    [#list citys as city]
                        <option value="${city.id}" [#if pageInput.cityId??][#if city.id==pageInput.cityId]selected[/#if][/#if]>${city.areaName}</option>
                    [/#list]
                [/#if]
                </select>
                <select id="countryId"  name="countryId" class="s">
                    <option value="" selected>请选择</option>
                [#if countrys??]
                    [#list countrys as country]
                        <option value="${country.id}" [#if pageInput.countryId??][#if country.id==pageInput.countryId]selected[/#if][/#if]>${country.areaName}</option>
                    [/#list]
                [/#if]
                </select>

                <input id="provinceName" type="hidden" name="provinceName" value="${pageInput.provinceName!}"/>
                <input id="cityName" type="hidden" name="cityName" value="${pageInput.cityName!}"/>
                <input id="countryName" type="hidden" name="countryName" value="${pageInput.countryName!}"/>

            </span>


        <span class="l-z2">*详细地址：<input class="w" id="detailedAddress" name="detailedAddress" value="${pageInput.detailedAddress!}"></span>
        <span class="l-z3">*手机号码：<input class="w" id="mobile" name="mobile" phone  value="${pageInput.mobile!}"/></span>
        <span class="l-z4">固定号码：<input class="w" name="telphone"  value="${pageInput.telphone!}"/></span>

    </div>



    <div class="d6">
        <div class="d-bc" id="saveBtn">保存</div>
        <div class="d-bc1" id="closeBtn">关闭</div>
    </div>

</form>


[#--<div class="wbk">
    <div class="wbk-1">

        <div class="dl">新增[#if pageInput.type??][#if pageInput.type==0]发货人[/#if][#if pageInput.type==1]收货人[/#if][/#if]</div>
<form id="signupForm">
        <div class="ank">
            <input id="type" type="hidden" name="type" value="${pageInput.type!0}" />
            <input  type="hidden" name="id" value="${pageInput.id!}" />

            <div>
                <input id="linkName" type="text" name="linkName" placeholder="联系人" value="${pageInput.linkName!}">
            </div>

            <div>
                <input  type="text" id="companyName" name="companyName" placeholder="公司名称" value="${pageInput.companyName!}">
            </div>

            <div class="xl-cd">
                <select id="provinceId"  name="provinceId" style="width:115px; height:40px; color:#8b8b8b;border:none; border:solid 1px #e8e8e8;">
                    <option value="" selected>请选择</option>
                    [#list provinces as data]
                        <option value="${data.id}" [#if pageInput.provinceId??][#if data.id==pageInput.provinceId]selected[/#if][/#if]>${data.areaName}</option>
                    [/#list]
                </select>
                <select id="cityId"  name="cityId" style="width:115px; height:40px; color:#8b8b8b;border:none; border:solid 1px #e8e8e8;">
                    <option value="" selected>请选择</option>
                    [#if citys??]
                    [#list citys as city]
                        <option value="${city.id}" [#if pageInput.cityId??][#if city.id==pageInput.cityId]selected[/#if][/#if]>${city.areaName}</option>
                    [/#list]
                    [/#if]
                </select>
                <select id="countryId"  name="countryId" style="width:115px; height:40px; color:#8b8b8b;border:none; border:solid 1px #e8e8e8;">
                    <option value="" selected>请选择</option>
                    [#if countrys??]
                    [#list countrys as country]
                        <option value="${country.id}" [#if pageInput.countryId??][#if country.id==pageInput.countryId]selected[/#if][/#if]>${country.areaName}</option>
                    [/#list]
                    [/#if]
                </select>

                <input id="provinceName" type="hidden" name="provinceName" value="${pageInput.provinceName!}"/>
                <input id="cityName" type="hidden" name="cityName" value="${pageInput.cityName!}"/>
                <input id="countryName" type="hidden" name="countryName" value="${pageInput.countryName!}"/>
            </div>
            <div>
                <input  type="text" id="detailedAddress" name="detailedAddress" value="${pageInput.detailedAddress!}" placeholder="详细地址">
            </div>
            <div>
                <input  type="text" id="mobile" name="mobile" phone placeholder="您的手机号" value="${pageInput.mobile!}">
            </div>

            <div>
                <input  name="telphone" placeholder="您的座机号（选填）" value="${pageInput.telphone!}">
            </div>





            <a href="#" style="text-decoration:none;"><input id="saveBtn" class="dl1" type="button" value="保存"/></a>



        </div>
</form>
    </div>

</div>--]


</body>
</html>
