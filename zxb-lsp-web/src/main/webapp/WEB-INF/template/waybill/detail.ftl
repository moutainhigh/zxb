[#escape x as x?html]
    [#include "../_layout.ftl"]
    [#include "../_layout/_css.ftl"]
    [#assign page_title="查看详情"/]
    [#assign page_keyword="查看详情"/]
    [#assign page_desc="查看详情"/]
    [#macro section_footjs]
        <script type="text/javascript" src="${JS_PATH}/waybill/detail.js"></script>
    [/#macro]

    [#macro section_css]
        <link rel="stylesheet" type="text/css" href="${CSS_PATH}/pinlei-sq.css">
    [/#macro]

    [@mainLayout]

    [#--<div id="checkout1">--]
        <div class="checkout-steps">
            <div><img src="${IMG_PATH}/huo.png" style="margin-left: 35px; margin-top: 20;"></div>
            <div class="step-title5" style="margin-left: 35px;"><strong>当前运单信息</strong></div>
            <div class="step-content">
                <div id="div" class="sbox-wrap">
                    <form>
                        <div class="item fahuo"  >
                            <table>
                                <tr>
                                    <td>运单号：${(waybillOutput.systemSn)!}</td>
                                </tr>
                                [#if waybillTrackOutputs??]
                                    [#list waybillTrackOutputs as item]
                                        <tr>
                                            <td class="redsmall">${item.createTime?string("yyyy-MM-dd")}　  ${item.memo}</td>
                                        </tr>
                                    [/#list]
                                [/#if]
                            </table>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="checkout-steps">
            <div class="step-title3x"><strong>货物信息</strong></div>
            <div class="step-content">
                <div id="div" class="sbox-wrap">
                    <form>
                        <div class="item fahuo2"  >
                            <table width="1107">
                                <tr>
                                    <td width="90">货物名称：</td>
                                    <td width="1005">${(waybillGoodOutput.goodName)!}</td>
                                </tr>
                                <tr>
                                    <td width="90">包装：</td>
                                    <td>
                                        ${(waybillGoodOutput.pack)!}
                                    </td>
                                </tr>
                                <tr>
                                    <td width="90">总件数：</td>
                                    <td>${(waybillGoodOutput.num)!}件</td>
                                </tr>
                                <tr>
                                    <td width="90">总重量：</td>
                                    <td>${(waybillGoodOutput.offerWeight)!}公斤</td>
                                </tr>
                                <td>总体积：</td>
                                <td>${(waybillGoodOutput.offerVolume)!}立方米</td>
                                </tr>
                                <tr>
                                    <td>是否标准件：</td>
                                    <td>
                                        [#if waybillOutput.isStandard??]
                                        [#if waybillOutput.isStandard==0]否
                                        [#elseif waybillOutput.isStandard==1]是
                                        [/#if]
                                        [#else] 否
                                        [/#if]
                                    </td>
                                </tr>
                                <tr>
                                    <td>装卸方式 ：</td>
                                    <td>
                                        [#if waybillOutput.loadUnloadType??]
                                        [#if waybillOutput.loadUnloadType==0]人工搬运
                                        [#elseif waybillOutput.loadUnloadType==1]吊车作业
                                        [#elseif waybillOutput.loadUnloadType==2]叉车作业
                                        [#else]${waybillOutput.loadUnloadType}
                                        [/#if]
                                    [/#if]</td>
                                </tr>
                                <tr>
                                    <td>堆放要求：</td>
                                    <td>
                                        [#if waybillOutput.stackRequire??]
                                            [#list waybillOutput.stackRequire?split("|") as stack]
                                                [#if stack=="1"]不能混装
                                                [#elseif stack=="2"]不能挤压
                                                [#elseif stack=="3"]不能侧放
                                                [#elseif stack=="4"]不能倒置
                                                [#elseif stack=="5"]不能分拆
                                                [#elseif stack=="6"]不能堆叠
                                                [/#if]
                                            [/#list]
                                        [/#if]
                                    </td>
                                </tr>
                                <td>注意事项：</td>
                                <td>${waybillGoodOutput.goodMomo!}</td>
                                </tr>
                            </table>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="checkout-steps">
            <div class="step-title3x"><strong>发货方信息</strong></div>
            <div class="step-content">
                <div id="div" class="sbox-wrap">
                    <form>
                        <div class="item fahuo2"  >
                            <table>
                                <tr>
                                    <td width="90">发货人：</td>
                                    <td>${waybillOutput.shipperLinkName!}</td>
                                </tr>
                                <tr>
                                    <td width="90"><span class="label">公司名称</span>：</td>
                                    <td>${waybillOutput.shipperCustomerName!}</td>
                                </tr>
                                <tr>
                                    <td width="90"><span class="label">装货地</span>：</td>
                                    <td>${waybillOutput.shipperProvinceName!} ${waybillOutput.shipperCityName!} ${waybillOutput.shipperCountryName!} ${waybillOutput.shipperAddress!}</td>
                                </tr>
                                <tr>
                                    <td width="90">联系方式：</td>
                                    <td>${waybillOutput.shipperLinkMobile!}</td>
                                </tr>
                            </table>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="checkout-steps">
            <div class="step-title3x"><strong>收货方信息</strong></div>
            <div class="step-content">
                <div id="div" class="sbox-wrap">
                    <form>
                        <div class="item fahuo2"  >
                            <table>
                                <tr>
                                    <td width="90">收货人：</td>
                                    <td>${waybillOutput.receiveLinkName!}</td>
                                </tr>
                                <tr>
                                    <td width="90"><span class="label">公司名称</span>：</td>
                                    <td>${waybillOutput.receiveName!}</td>
                                </tr>
                                <tr>
                                    <td width="90"><span class="label">卸货地</span>：</td>
                                    <td>${waybillOutput.receiveProvinceName!} ${waybillOutput.receiveCityName!} ${waybillOutput.receiveCountryName!} ${waybillOutput.receiveAddress!}</td>
                                </tr>
                                <tr>
                                    <td width="90">联系方式：</td>
                                    <td>${waybillOutput.receiveLinkMobile!}</td>
                                </tr>
                            </table>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="checkout-steps">
            <div class="step-title3x"><strong>送货方式</strong></div>
            <div class="step-content">
                <div id="div" class="sbox-wrap">
                    <form>
                        <div class="item fahuo2"  >
                            <table width="821">
                                <tr>
                                    <td width="664">
                                        [#if waybillOutput.connectType??]
                                            [#if waybillOutput.connectType==0]到站自提
                                            [#elseif waybillOutput.connectType==1]送货上门
                                            [#else]${waybillOutput.otherConnectType}
                                            [/#if]
                                        [/#if]
                                    </td>
                                </tr>
                            </table>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="checkout-steps">
            <div class="step-title3x"><strong>增值服务</strong></div>
            <div class="step-content">
                <div id="div" class="sbox-wrap">
                    <form>
                        <div class="item fahuo2"  >
                            <table>
                                [#if depotOutput??]
                                    [#if waybillOutput.isNeedEnterDepot?? &&waybillOutput.isNeedEnterDepot == 1]
                                            <tr>
                                                <td width="90">需要进仓：</td>
                                                <td width="809">
                                                    [#if depotOutput.type??]
                                                    [#if depotOutput.type==1]电商仓
                                                    [#elseif depotOutput.type==2]外贸仓
                                                    [/#if]
                                                    [/#if]
                                                    [#if allotWaybillOutput.enterFee?? && allotWaybillOutput.enterFee!=0]
                                                    （${allotWaybillOutput.enterFee!"0"}元）
                                                    [/#if]
                                                </td>
                                            </tr>
                                    [/#if]
                                [/#if]

                                [#if waybillOutput.isUpstairsIncre?? && waybillOutput.isUpstairsIncre==1]
                                        <tr>
                                            <td>需要上楼：</td>
                                            <td>
                                                [#if waybillOutput.isElevator??]
                                                    [#if waybillOutput.isElevator==1] 有电梯${waybillOutput.floorNum!}层
                                                    [#else] 无电梯
                                                    [/#if]
                                                [/#if]
                                                [#if allotWaybillOutput.upstairsFee?? && allotWaybillOutput.upstairsFee!=0]
                                                （${allotWaybillOutput.upstairsFee!"0"}元）
                                                [/#if]
                                            </td>
                                        </tr>
                                [/#if]
                                [#if waybillOutput.isUnloadIncre?? && waybillOutput.isUnloadIncre==1]
                                        <tr>
                                            <td>需要卸货：</td>
                                            [#if allotWaybillOutput.unloadFee?? && allotWaybillOutput.unloadFee!=0]
                                                <td>${allotWaybillOutput.unloadFee!"0"}元</td>
                                            [/#if]
                                        </tr>
                                [/#if]
                                [#if waybillOutput.isReceiveSendsms?? &&waybillOutput.isReceiveSendsms==1]
                                    <tr>
                                        <td>短信通知：</td>
                                        <td>免费</td>
                                    </tr>
                                [/#if]
                                [#if waybillOutput.isNeedReceipt?? && waybillOutput.isNeedReceipt==1]
                                    <tr>
                                        <td>签回单：</td>
                                        [#if allotWaybillOutput.signedReceiveFee?? && allotWaybillOutput.signedReceiveFee!=0]
                                            <td>现付${allotWaybillOutput.signedReceiveFee!"0"}元</td>
                                        [/#if]

                                    </tr>
                                [/#if]
                                [#if waybillReceiveOutput??]
                                    [#if waybillOutput.isNeedReceipt?? && waybillOutput.isNeedReceipt==1]
                                        <tr>
                                            <td>回单位置：</td>
                                            <td>
                                                [#if waybillReceiveOutput.receivePosition??]
                                                    [#if waybillReceiveOutput.receivePosition==1]网点
                                                    [#elseif waybillReceiveOutput.receivePosition==2]集散
                                                    [#elseif waybillReceiveOutput.receivePosition==3]供应商
                                                    [#elseif waybillReceiveOutput.receivePosition==4]客户
                                                    [#else]${waybillReceiveOutput.receivePosition}
                                                    [/#if]
                                                [/#if]
                                            </td>
                                        </tr>
                                    [/#if]
                                [/#if]
                                [#if waybillOutput.isExpress??]
                                    [#if waybillOutput.isExpress==1]
                                        <tr>
                                            <td>其它说明：</td>
                                            <td>加急</td>
                                        </tr>
                                    [/#if]
                                [/#if]
                            </table>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="checkout-steps">
            <div class="step-title3x"><strong>费用明细</strong></div>
            <div class="step-content">
                <div id="div" class="sbox-wrap">
                    <form>
                        <div class="item fahuo2"  >
                            [#if waybillOutput.status??]
                                [#if waybillOutput.status==0]
                                <table width="1107">
                                    <tr> <td>正在报价</td> </tr>
                                </table>
                                [#else]
                                    <table width="1107">
                                        [#if waybillFeeOutput.freightFee?? && waybillFeeOutput.freightFee!=0]
                                            <tr>
                                                <td width="1077">${waybillOutput.createTime?string("yyyy-MM-dd")!} 　 运费${waybillFeeOutput.freightFee!"0"} 元</td>
                                            </tr>
                                        [/#if]
                                        [#if allotWaybillOutput.sendGoodFee?? && allotWaybillOutput.sendGoodFee!=0]
                                            <tr>
                                                <td>${waybillOutput.createTime?string("yyyy-MM-dd")!} 　 送货费${allotWaybillOutput.sendGoodFee!"0"}元 </td>
                                            </tr>
                                        [/#if]
                                        [#if waybillFeeOutput.premiumFee?? && waybillFeeOutput.premiumFee != 0]
                                            <tr>
                                                <td>${waybillOutput.createTime?string("yyyy-MM-dd")!} 　 保费${waybillFeeOutput.premiumFee!"0"}元 </td>
                                            </tr>
                                        [/#if]
                                        [#if waybillOutput.isOpenTicket?? && waybillOutput.isOpenTicket == 1]
                                            [#if waybillFeeOutput.invoiceFee??&&waybillFeeOutput.invoiceFee!=0]
                                                <tr>
                                                    <td>${waybillOutput.createTime?string("yyyy-MM-dd")!} 　 开票费${waybillFeeOutput.invoiceFee!"0"}元 </td>
                                                </tr>
                                            [/#if]
                                        [/#if]
                                        [#if waybillOutput.isNeedEnterDepot?? &&waybillOutput.isNeedEnterDepot == 1]
                                            [#if allotWaybillOutput.enterFee??&&allotWaybillOutput.enterFee!=0]
                                                <tr>
                                                    <td>${waybillOutput.createTime?string("yyyy-MM-dd")!} 　 进仓费${allotWaybillOutput.enterFee!"0"}元 </td>
                                                </tr>
                                            [/#if]
                                        [/#if]
                                        [#if waybillOutput.isUpstairsIncre?? && waybillOutput.isUpstairsIncre==1]
                                            [#if allotWaybillOutput.upstairsFee??&&allotWaybillOutput.upstairsFee!=0]
                                                <tr>
                                                    <td>${waybillOutput.createTime?string("yyyy-MM-dd")!} 　 上楼费${allotWaybillOutput.upstairsFee!"0"}元 </td>
                                                </tr>
                                            [/#if]
                                        [/#if]
                                        [#if waybillOutput.isUnloadIncre?? && waybillOutput.isUnloadIncre==1]
                                            [#if allotWaybillOutput.unloadFee??&&allotWaybillOutput.unloadFee!=0]
                                                <tr>
                                                    <td>${waybillOutput.createTime?string("yyyy-MM-dd")!} 　 卸货费${allotWaybillOutput.unloadFee!"0"}元 </td>
                                                </tr>
                                            [/#if]
                                        [/#if]
                                        [#if waybillOutput.isNeedReceipt?? && waybillOutput.isNeedReceipt==1]
                                            [#if allotWaybillOutput.signedReceiveFee??&&allotWaybillOutput.signedReceiveFee!=0]
                                                <tr>
                                                    <td>${waybillOutput.createTime?string("yyyy-MM-dd")!} 　 签回单${allotWaybillOutput.signedReceiveFee!"0"}元 </td>
                                                </tr>
                                            [/#if]
                                        [/#if]
                                        [#if allotWaybillOutput.expressFee??&&allotWaybillOutput.expressFee!=0]
                                            <tr>
                                                <td>${waybillOutput.createTime?string("yyyy-MM-dd")!} 　 加急费${allotWaybillOutput.expressFee!"0"}元 </td>
                                            </tr>
                                        [/#if]

                                        [#if balanceDetailOutputs??]
                                            [#if balanceDetailOutputs?size != 0]
                                                [#list balanceDetailOutputs as item]
                                                    [#if item.fee??&&item.fee!=0]
                                                        <tr>
                                                            <td>${item.createDate?string("yyyy-MM-dd")!}  　${item.feeType!""}  ${item.fee!"0"}元(${item.payType!""}) </td>
                                                        </tr>
                                                    [/#if]
                                                [/#list]
                                            [/#if]
                                        [/#if]
                                    </table>
                                [/#if]
                                [#--[#if waybillOutput.status!=0]--]
                                    [#----]
                                [#--[/#if]--]
                            [/#if]
                        </div>
                    </form>
                </div>
            </div>
        </div>

        [#if stowageOutput??]
        <div class="checkout-steps">
            <div class="step-title3x"><strong>配载信息</strong></div>
            <div class="step-content">
                <div id="div" class="sbox-wrap">
                    <form>
                        <div class="item fahuo2"  >

                            <table width="1107">
                                [#--<tr>--]
                                    [#--<td width="90">预计发车：</td>--]
                                    [#--<td width="1005">2016-3.11-17：40</td>--]
                                [#--</tr>--]
                                <tr>
                                    <td width="90">配载车辆：</td>
                                    <td>${stowageOutput.plateNumber!}</td>
                                </tr>
                                <tr>
                                    <td width="90">车型：</td>
                                    <td>${stowageOutput.truckModel!}</td>
                                </tr>
                                <tr>
                                    <td width="90">车身长：</td>
                                    <td>${stowageOutput.truckLength!}米</td>
                                </tr>
                                <td>司机：</td>
                                <td>${stowageOutput.driverName!}</td>
                                </tr>
                                <tr>
                                    <td>联系方式：</td>
                                    <td>${stowageOutput.driverPhone!}</td>
                                </tr>
                                <tr>
                                    <td>送往集散 ：</td>
                                    <td>${stowageOutput.allocCenterName!}</td>
                                </tr>
                            </table>

                        </div>
                    </form>
                </div>
            </div>
        [#--</div>--]
        [/#if]
    </div>

    [/@mainLayout]
[/#escape]