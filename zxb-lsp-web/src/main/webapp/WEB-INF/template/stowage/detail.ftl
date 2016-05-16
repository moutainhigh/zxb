[#-- @ftlvariable name="stowage" type="com.wangkuo.zxb.lsp.api.dto.output.StowageOutput" --]
[#-- @ftlvariable name="stowageBillList" type="java.util.List<com.wangkuo.zxb.lsp.api.dto.output.WaybillOutput>" --]
[#escape x as x?html]
    [#include "../_layout.ftl"]
    [#include "../_layout/_pagination.ftl"]
    [#assign page_title="配载详情"/]
    [#assign page_keyword="配载详情"/]
    [#assign page_desc="配载详情"/]
    [#macro section_footjs]

    [/#macro]

    [#macro section_headcss]

    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/peizai.css">

    [/#macro]
    [@mainLayout]
    <div class="juzhong" style="background:#FFF">
        <table width="943" height="30" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#ebf3f9"
               class="dh" style="margin:23px auto 0 auto">
            <tbody>
            <tr>
                <td width="18" height="34">&nbsp;</td>
                <td width="685"><span style="font-size:17px"><strong>基本信息</strong></span></td>
            </tr>
            </tbody>
        </table>
        <table width="943" height="10" border="0" align="center" cellpadding="0" cellspacing="0" class="tb"
               style="margin:11px auto 0 auto;font-size:14px">
            <tbody>
            <tr>
                <td width="23" align="left">&nbsp;</td>
                <td width="87" align="left"> 配载日期：</td>
                <td width="294" align="left">${((stowage.stowageTime)!.now)?string("yyyy-MM-dd")}</td>
                <td width="92" height="34" align="left">始发服务商：</td>
                <td width="447" align="left">${(CURR_USER.nickName)!}</td>
            </tr>
            </tbody>
        </table>
        <table width="943" height="10" border="0" align="center" cellpadding="0" cellspacing="0" class="tb"
               style="margin:0px auto 0 auto;font-size:14px">
            <tbody>
            <tr>
                <td width="23" align="left">&nbsp;</td>
                <td width="87" align="left"> 发往集散：</td>
                <td width="294" align="left">${stowage.allocCenterName!}</td>
                <td width="92" height="34" align="left">集散地址：</td>
                <td width="447" align="left">${stowage.allocCenterAddress!}</td>
            </tr>
            </tbody>
        </table>
        <table width="943" height="10" border="0" align="center" cellpadding="0" cellspacing="0" class="tb"
               style="margin:0px auto 0 auto;font-size:14px">
            <tbody>
            <tr>
                <td width="23" align="left">&nbsp;</td>
                <td width="87" align="left">集散联系：</td>
                <td width="294" align="left">${stowage.allocCenterLinkName!}</td>
                <td width="92" height="34" align="left">联系方式：</td>
                <td width="447" align="left">${stowage.allocCenterLinkPhone!}</td>
            </tr>
            </tbody>
        </table>
        <table width="943" height="30" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#ebf3f9"
               class="dh" style="margin:23px auto 0 auto">
            <tbody>
            <tr>
                <td width="18" height="34">&nbsp;</td>
                <td width="685"><strong><span style="font-size: 17px">车辆信息</span></strong></td>
            </tr>
            </tbody>
        </table>
        <table width="943" height="10" border="0" align="center" cellpadding="0" cellspacing="0" class="tb"
               style="margin:11px auto 0 auto;font-size:14px">
            <tbody>
            <tr>
                <td width="23" align="left">&nbsp;</td>
                <td width="87" align="left"> 车牌号：</td>
                <td width="294" align="left">${stowage.plateNumber!}</td>
                <td width="92" height="34" align="left"> 司机：</td>
                <td width="447" align="left">${stowage.driverName!}</td>
            </tr>
            </tbody>
        </table>
        <table width="943" height="10" border="0" align="center" cellpadding="0" cellspacing="0" class="tb"
               style="margin:0px auto 0 auto;font-size:14px">
            <tbody>
            <tr>
                <td width="23" align="left">&nbsp;</td>
                <td width="87" align="left"> 司机电话：</td>
                <td width="294" align="left">${stowage.driverPhone!}</td>
                <td width="92" height="34" align="left">车型：</td>
                <td width="447" align="left">${stowage.truckModel!}</td>
            </tr>
            </tbody>
        </table>
        <table width="943" height="10" border="0" align="center" cellpadding="0" cellspacing="0" class="tb"
               style="margin:0px auto 0 auto;font-size:14px">
            <tbody>
            <tr>
                <td width="23" align="left">&nbsp;</td>
                <td width="87" align="left">车身长：</td>
                <td width="294" align="left">${stowage.truckLength!}</td>
                <td width="92" height="34" align="left">&nbsp;</td>
                <td width="447" align="left">&nbsp;</td>
            </tr>
            </tbody>
        </table>
        <table width="943" height="30" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#ebf3f9"
               class="dh" style="margin:23px auto 0 auto">
            <tbody>
            <tr>
                <td width="18" height="34">&nbsp;</td>
                <td width="685"><span style="font-size:17px"><strong>运单信息</strong></span></td>
            </tr>
            </tbody>
        </table>
        <table width="943" height="10" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="f7f7f9"
               class="tb" style="margin:11px auto 0 auto;font-size:14px">
            <tbody>
            <tr>
                <td width="23" align="left">&nbsp;</td>
                <td width="85" align="left"><span style="font-size:14px">开单日期</span></td>
                <td width="120" align="left"><span style="font-size:14px">运单号</span></td>
                <td width="124" height="34" align="left"><span style="font-size:14px">货物名称</span></td>
                <td width="71" align="left"><span style="font-size:14px">件数</span></td>
                <td width="93" align="left"><span style="font-size:14px">总重量</span></td>
                <td width="93" align="left"><span style="font-size:14px">总体积</span></td>
                <td width="85" align="left"><span style="font-size:14px">发货方</span></td>
                <td width="76" align="left"><span style="font-size:14px">收货方</span></td>
                <td width="150" align="left"><span style="font-size:14px">收货地址</span></td>
            </tr>
            </tbody>
        </table>


        [#list stowageBillList as waybill]
            <table width="943" height="10" border="0" align="center" cellpadding="0" cellspacing="0" class="tb"
                   style="margin:11px auto 0 auto;font-size:14px">
                <tbody>
                <tr>
                    <td width="23" align="left">&nbsp;</td>
                    <td width="85" align="left">${(waybill.operationTime?string("yyyy-MM-dd"))!}</td>
                    <td width="120" align="left"><span style="font-size:14px">${waybill.systemSn!}</span></td>
                    <td width="124" height="34" align="left"><span style="font-size:14px">${waybill.goodName!}</span>
                    </td>
                    <td width="71" align="left"><span style="font-size:14px">${waybill.num!}件</span></td>
                    <td width="93" align="left"><span style="font-size:14px">${waybill.offerWeight!}公斤</span></td>
                    <td width="93" align="left"><span style="font-size:14px">${waybill.offerVolume!}立方</span></td>
                    <td width="85" align="left"><span style="font-size:14px">${waybill.shipperCustomerName!}</span></td>
                    <td width="76" align="left"><span style="font-size:14px">${waybill.receiveLinkName!}</span></td>
                    <td width="150" align="left"><span
                            style="font-size: 14px">${formatAddress(waybill.receiveProvinceName!,waybill.receiveCityName!,waybill.receiveCountryName!)!}</span>
                    </td>
                </tr>
                </tbody>
            </table>
        [/#list]


        <table style="font-size:14px;margin:39px auto 0 auto;" width="943" height="10" border="0" align="center"
               cellpadding="0" cellspacing="0" class="tb">
            <tbody>
            <tr>
                <td width="329" align="left">&nbsp;</td>
                <td width="139" align="left">
[#--
                    <div class="s-cx" id="btnSaveStowage">保存</div>
--]
                </td>
                <td width="288" align="left">&nbsp;</td>

                <td width="187" height="34" align="left">
                    <div class="s-hb" onclick="javascript:history.back();">返回</div>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
    [/@mainLayout]
[/#escape]