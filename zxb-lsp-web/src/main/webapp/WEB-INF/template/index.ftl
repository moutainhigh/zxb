[#escape x as x?html]
    [#include "_layout.ftl"]
    [#assign page_title="首页"/]
    [#assign page_keyword="首页"/]
    [#assign page_desc="首页"/]
    [#macro section_footjs]

    [/#macro]
    [#macro section_css]
    [/#macro]
    [#macro section_headcss]
    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/wofahuode.css">
    [/#macro]
    [@mainLayout]
        <div class="ybk-1">
            <div class="ruzhu">

                <ul>
                    <li>
                        <span class="n2" style="word-break: keep-all;">欢迎来到专线宝，${CURR_USER.companyName!}</span>
                        <span class="s2">
                            [#if CURR_USER.verifyStatus??]

                                [#if CURR_USER.verifyStatus==0]
                                <a href="settledread">申请入驻>></a>
                                [/#if]
                                [#if CURR_USER.verifyStatus==1]
                                <a>我正在等待申请审核</a>
                                [/#if]
                                [#if CURR_USER.verifyStatus==2]
                                <a>已入驻服务商</a>
                                [/#if]
                                [#if CURR_USER.verifyStatus==3]
                                    我的申请已被驳回&nbsp;<a href="settledread">再次申请入驻</a>
                                [/#if]
                            [#else]<a href="settledread">申请入驻>></a>
                            [/#if]
                        </span>
                    </li>
                    <li class="n3">
                        <span class="n2">我的登录名：${CURR_USER.nickName!} </span>
                        <span class="n22">上次登录：[#if CURR_USER.lastLoginDate??]${CURR_USER.lastLoginDate?string("yyyy-MM-dd")}[#else]首次登录[/#if]</span>
                        <span class="s2"><a href="../lspUser/updatepwd?type=index">修改密码>></a></span>
                    </li>
                    <li class="n3">
                        <span class="n2">我的注册手机: ${CURR_USER.mobile!}</span>
                        [#--<span class="s2"><a href="#">绑定手机>></a></span>--]
                    </li>
                </ul>
            </div>

            <div class="x-1"></div>
            <!--     为他发货      -->

                <div class="ruzhu">

                    <ul>
                        <li>
                            <span class="n2" style="clear: left;width: 41%">我的已有品类</span>
                            <span class="s3" style="width: 59%">我的已有发货人：</span>
                        </li>
                        <table cellpadding="0" cellspacing="0" width="100%" style="height: 75px;font-size: 12px;">
                            <tr>
                                <td width="41%" style="padding: 0;">
                                    <table>
                                        <tbody>
                                        <tr>
                                            [#if categorys??]
                                                [#if categorys[0]??]
                                                    [#list categorys as category]
                                                        <td style="padding: 20px 2px;word-break: break-all;">${category.name!}</td>
                                                    [/#list]
                                                [#else]
                                                    <td colspan="3" style="padding: 20px 0px;">还没有品类</td>
                                                [/#if]
                                            [/#if]
                                        </tr>
                                        <tr>
                                            <td colspan="3">
                                                [#if CURR_USER.verifyStatus??]
                                                    [#if CURR_USER.verifyStatus==2]
                                                        <a href="../category/index">品类申请>></a>
                                                    [/#if]
                                                [/#if]

                                            </td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </td>
                                <td width="59%">
                                    <table style="width: 100%;">
                                        <tbody>
                                        [#assign  shipperCount=0]
                                            [#if shippers??]
                                                [#if shippers[0]??]
                                                    [#list shippers as shipper]
                                                    <tr>
                                                        <td >${shipper.companyName!}</td>
                                                        <td style="padding: 5px 40px;">${shipper.linkName!}</td>

                                                            [#if CURR_USER.verifyStatus??]
                                                                [#if CURR_USER.verifyStatus==3]
                                                                [#if shipperCount==0]
                                                                    [#assign  shipperCount=1]
                                                                <td  rowspan="[#if CURR_USER.verifyStatus??][#if lspUserCommon.verifyStatus==3]${shippers?size}[/#if][/#if]" style="word-break:break-all;">
                                                                    我的申请入驻未通过，暂时无法发货&nbsp;<a href="#">再次申请入驻</a>
                                                                </td>
                                                                [/#if]
                                                                [#else]
                                                                    <td style="text-align: right;"><a href="../waybill/add?shipperId=${shipper.id}">为他发货>></a></td>
                                                                [/#if]
                                                            [#else]
                                                            <td style="text-align: right;"><a href="../waybill/add?shipperId=${shipper.id}">为他发货>></a></td>
                                                            [/#if]
                                                    </tr>
                                                    [/#list]
                                                [#else]
                                                <td colspan="3" style="padding: 20px 0;">还没有发货人</td>
                                                [/#if]
                                            [/#if]
                                        </tbody>
                                    </table>
                                </td>
                            </tr>
                        </table>
                        <div class="x-1"></div>
            </div>

           [#-- <div class="yue">
                <div class="e">钱包余额：
                    <span class="jc">200</span>
                    <span class="y">元</span>
                </div>
                <div class="cz">
                    <div class="cz1">充值</div>
                    <div class="mx"><a href="#">明细>></a></div>
                </div>

            </div>--]

        </div>
        <!--bottom-->
        <div class="boot">
            <div class="tb-jl">
                <span class="jl-1">最近下单记录</span>
                [#--<span class="f">|</span>
                <span class="jl-2">最近接单记录</span>--]
                <span class="f">|</span>
                <span class="jl-3" onClick="javascript:location.href = '../waybill/list';">查看所有记录</span>
            </div>

            <div class="bg">
                <ul>
                    [#if waybills??]
                        [#list waybills as waybill]
                            <li><span class="b1">${waybill.operationTime?string("yyyy-MM-dd")}</span>
                                <span class="b2">  ${waybill.operationTime?string("HH:mm")}</span>
                                <span class="b3" style="width: 400px;">目的地：${waybill.receiveProvinceName!}${waybill.receiveCityName!}${waybill.receiveCountryName!}${waybill.receiveAddress!} </span>
                                <span class="b4">${waybill.goodName!}</span>
                                <span class="b5">
                                    [#if waybill.status??]
                                        [#if waybill.status==0]未确认交易
                                        [#elseif waybill.status==5]已确认交易
                                        [#elseif waybill.status==10]安排提货
                                        [#elseif waybill.status==15]货已到站
                                        [#elseif waybill.status==20]已配载
                                        [#elseif waybill.status==25]已发车
                                        [#elseif waybill.status==30]已落货
                                        [#elseif waybill.status==35]运输中
                                        [#elseif waybill.status==40]待签收
                                        [#elseif waybill.status==45]已签收
                                        [#elseif waybill.status==50]已关闭
                                        [#elseif waybill.status==55]返修中
                                        [#elseif waybill.status==60]签收异常
                                        [/#if]
                                    [/#if]
                                </span>
                            </li>
                        [/#list]
                    [/#if]
                </ul>
            </div>
        </div>
    [/@mainLayout]
[/#escape]