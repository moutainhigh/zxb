[#include "../_layout.ftl"]
[#escape x as x?html]

    [#assign page_title="我要发货"/]
    [#assign page_desc="我要发货"/]
    [#macro section_footjs]
    <script type="text/javascript" src="${JS_PATH}/common/validate.expand.js"></script>
    <script type="text/javascript" src="${JS_PATH}/waybill/orderConf.js"></script>
    <script type="text/javascript" src="${JS_PATH}/common/address_select.js"></script>
    <script type="text/javascript">
        $().ready(function(){

            if('${orderConf.consigneeProvince!}'!='') {
                $("input[name='consigneeProvince']").val('${orderConf.consigneeProvince!}');
                $("input[name='consigneeCity']").val('${orderConf.consigneeCity!}');
                $("input[name='consigneeCounty']").val('${orderConf.consigneeCounty!}');

                var proviceIntervalId = window.setInterval(function () {
                    $("select[name='consigneeProvinceId']").val('${orderConf.consigneeProvinceId!}').trigger("change");
                    if ($("select[name='consigneeProvinceId']").val()) {
                        window.clearInterval(proviceIntervalId);
                    }
                }, 20);
                var cityIntervalId = window.setInterval(function () {
                    $("select[name='consigneeCityId']").val('${orderConf.consigneeCityId!}').trigger("change");
                    if ($("select[name='consigneeCityId']").val()) {
                        window.clearInterval(cityIntervalId);
                    }
                }, 20);

                var countryIntervalId = window.setInterval(function () {
                    $("select[name='consigneeCountyId']").val('${orderConf.consigneeCountyId!}').trigger("change");
                    if ($("select[name='consigneeCountyId']").val()) {
                        window.clearInterval(countryIntervalId);
                    }
                }, 20);
            }

            //-------------------------------
            //返回修改（发货第2页：返回修改按钮）
            //当发货首页的货物属性有变更，同时增值服务中的费用有选中的，在货物属性有变更时，需要更新增值服务
            //进仓费
            if('${(orderConf.isNeedEnterDepot)!}'==1){
                $.ajax({
                    url: "../waybill/enterFee",
                    type: "POST",
                    data: {
                        hBalanceTypeWithZb: 0,//付款类型默认现付
                        hIsNeedEnterDepot:${(orderConf.isNeedEnterDepot)!0},
                        hDepotType:${(orderConf.depotType)!0},
                        hVolume:${(good.offerVolume)!}
                    },
                    success: function (data) {
                        $("#enterFee").val(data);
                        $("#enterFee_span").html("("+data+"元)");
                        $("#xf_enter_fee").html(data+"元");
                        $("#df_enter_fee").html(data+"元");

                    }
                });
            }
            //上楼费(标准件才需要计算上楼费)
            if('${(waybill.isStandard)!}'==1){
                if('${(orderConf.isUpstairsIncre)!}'==1) {
                    $.ajax({
                        url: "../waybill/upstairsFee",
                        type: "POST",
                        data: {
                            hIsUpstairsIncre: ${(orderConf.isUpstairsIncre)!0},
                            hIsStandard: ${(waybill.isStandard)!},
                            hFloorNum: ${orderConf.floorNum!0},
                            hIsElevator: ${(orderConf.isElevator)!0},
                            hVolume: ${(good.offerVolume)!},
                            hWeight: ${(good.offerWeight)!}
                        },
                        success: function (data) {
                            $("#upstairsFee").val(data);
                            $("#upstairsFee_span").html("(" + data + "元)");
                            $("#xf_upstairs_fee").html(data + "元");
                            $("#df_upstairs_fee").html(data + "元");
                        }
                    });
                }
            }else{//非标准件，上楼费应为空
                $("#upstairsFee").val("");
                $("#upstairsFee_span").html("(0元)");
                $("#xf_upstairs_fee").html("0元");
                $("#df_upstairs_fee").html("0元");
            }

            //卸货费
            if('${(orderConf.isUnloadIncre)!}'==1) {
                $.ajax({
                    url: "../waybill/unloadFee",
                    type: "POST",
                    data: {
                        hIsUnloadIncre: ${(orderConf.isUnloadIncre)!0},
                        hVolume: ${(good.offerVolume)!},
                        hWeight: ${(good.offerWeight)!}
                    },
                    success: function (data) {
                        $("#unloadFee").val(data);
                        $("#unloadFee_span").html("(" + data + "元)");
                        $("#xf_unload_fee").html(data + "元");
                        $("#df_unload_fee").html(data + "元");
                    }
                });
            }
        });
    </script>

    [/#macro]

    [#macro section_css]
    <link rel="stylesheet" type="text/css" href="${CSS_PATH}/in-gggg.css">
    <link rel="stylesheet" type="text/css" href="${CSS_PATH}/woyaofahuo-xianfu.css">
    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/layer.css">

    [/#macro]
    [@mainLayout]
    <form id="orderConfForm" >
        <div class="ybk">
            <div class="tx-xx">填写并核对发货信息</div>
            <div class="xx"></div>
            <div class="tx-jis">
                <div class="tx-jis1">集散中心</div>
                <div class="tx-jis2">
                    <input type="hidden" id="allocCenterName" name="allocCenterName" value="${(orderConf.allocCenterName)!}">
                       <div class="sele" style="clear: both;    margin-left: 20px;">
                            <span class="s-p1" style="color: #F90;">*
                            <select class="v" id="allocCenterId" name="allocCenterId">
                                <option value="">请选择</option>
                                [#list allocCentres as allocCentre]
                                    <option value="${allocCentre.id}" [#if orderConf.allocCenterId??][#if allocCentre.id==orderConf.allocCenterId]selected[/#if][/#if]>${allocCentre.name}</option>
                                [/#list]
                            </select>
                           </span>
                        </div>
                </div>
                <div class="xx2"></div>
            </div>

            <div class="tx-songh">
                <div class="tx-songh1">送货方式</div>
                <input type="hidden" id="connectType" name="connectType" value="${orderConf.connectType!1}">
                <div class="tx-songh2">
                    <div class="s-sh [#if orderConf.connectType??][#if orderConf.connectType==1]selected[/#if][#else]selected[/#if] " id="sendHome">送货上门</div>
                    <div class="s-daoz [#if orderConf.connectType??][#if orderConf.connectType==0]selected[/#if][/#if]" id="selfHand">到站自提</div>
                    <div class="s-fangh">
                        <input type="hidden" id="otherConnectType" name="otherConnectType" value="${orderConf.otherConnectType!}">
                        <input class="i-d " type="checkbox" id="otherConnectTypeCb" name="otherConnectTypeCb" [#if orderConf.otherConnectType??][#if orderConf.otherConnectType=='等通知放货']checked[/#if][/#if] value="1"/>
                        等通知放货
                    </div>
                </div>

                <div class="sm-fahuo">
                    <div class="sm-fh">什么是等通知放货？</div>
                    <div class="sm-fh1">
                        &nbsp;&nbsp;如果发货方的货款在发货时尚未结清，专线物流服务平台将等待您的通知安排送货或请收货方上门提货，否则专线物流服务平台将不予放货给收货方。
                    </div>
                </div>



                <div class="xx2"></div>
                <div class="d-fap">
                    <div class="d-fap1">
                        发票信息
                        <span class="s-kaip">（开票费必须现付）</span>
                    </div>

                    <div class="bd-fap">
                        <div class="bd-fap1">
                            <div><input type="checkbox" class="" id = "isOpenTicket" [#if orderConf.isOpenTicket??][#if orderConf.isOpenTicket==1]checked[/#if][/#if] name="isOpenTicket" value="1"/>发票</div>
                            <div class="fp1">
                                <div class="fp-tt">发票抬头:</div>
                                <div class="fp-tt1">
                                    <input class="i-t" name="companyName" id="companyName" value="${orderConf.companyName!}"/ >
                                </div>
                            </div>

                            <div class="fp2">
                                <div class="fp-tt">收件人:</div>
                                <div class="fp-tt1">
                                    <input class="i-t" id="consigneeName" name="consigneeName" value="${orderConf.consigneeName!}"/ >
                                </div>
                            </div>

                            <div class="fp3">
                                <div class="d-tck address_select">
                                    收件地址：
                                    <select class="cc" id="consigneeProvinceId" name="consigneeProvinceId" style="width: 100px;height: 28px;border:none; color:#8b8b8b;border:none; border: solid 1px #CCCCCC;">
                                        <option value="">请选择</option>
                                    </select>

                                    <select class="cc" id="consigneeCityId" name="consigneeCityId" style="width:100px; height:28px;border:none; color:#8b8b8b;border:none; border: solid 1px #CCCCCC;">
                                        <option value="">请选择</option>
                                    </select>


                                    <select class="cc" id="consigneeCountyId" name="consigneeCountyId" style="width:100px; height:28px;border:none; color:#8b8b8b;border:none; border: solid 1px #CCCCCC;">
                                        <option value="">请选择</option>
                                    </select>
                                    <input type="hidden" name="consigneeProvince">
                                    <input type="hidden" name="consigneeCity">
                                    <input type="hidden" name="consigneeCounty">
                                </div>
                            </div>

                            <div class="fp4">
                                <div class="fp-tt">详细地址:</div>
                                <div class="fp-tt1">
                                    <input class="q-q1" id="consigneeAddress" name="consigneeAddress" value="${orderConf.consigneeAddress!}"/ >
                                </div>
                            </div>

                            <div class="fp5">
                                <div class="fp-tt">联系方式:</div>
                                <div class="fp-tt1">
                                    <input class="i-t" id="consigneeMobile" name="consigneeMobile" value="${orderConf.consigneeMobile!}"/ >
                                </div>
                            </div>

                        </div>

                    </div>

                </div>

                <div class="xx2"></div>

                <div class="d-zenz">
                    <div class="d-zenz1">
                        增值服务
                        <a href="javascript:void(0);" style="TEXT-DECORATION:none;"><span class="s-sm" >资费说明</span></a>
                    </div>

                    <div class="dj">
                        <ul>

                            <li class="l-x1 [#if orderConf.isNeedEnterDepot??][#if orderConf.isNeedEnterDepot==1]selected[/#if][/#if]" id="needEnterDepot" style="font-weight:normal; font-size:12px;  color:#000;"><span>需要进仓</span></li>
                            <li class="l-x2" id="selectDeptorType" style="display: [#if orderConf.isNeedEnterDepot??][#if orderConf.isNeedEnterDepot==1]block[#else ]none[/#if][#else]none[/#if]">
                                <span class="er" id="enterFee_span">(${(orderConf.enterFee)!0}元)</span>
                                <input type="hidden" id="isNeedEnterDepot" name="isNeedEnterDepot" value="${orderConf.isNeedEnterDepot!}">
                                <input type="hidden" id="enterFee" name="enterFee" value="${orderConf.enterFee!}">
                                <select class="e" id="depotType" name="depotType">
                                    <option value="" >请选择</option>
                                    <option value="1" [#if orderConf.depotType??][#if orderConf.depotType==1]selected[/#if][/#if]>电商仓</option>
                                    <option value="2" [#if orderConf.depotType??][#if orderConf.depotType==2]selected[/#if][/#if]>外贸仓</option>
                                </select>
                            </li>
                            <div style="[#if waybill.isStandard??][#if waybill.isStandard==1]display: block[#else]display: none [/#if][/#if]">
                            <li class="l-x3 [#if orderConf.isUpstairsIncre??][#if orderConf.isUpstairsIncre==1 && waybill.isStandard==1]selected[/#if][/#if] " id="needUpstairs" style="font-weight:normal;font-size:12px;  color:#000;">上楼费</li>
                            <li class="l-x4" id="selectElevator" style="display: [#if orderConf.isUpstairsIncre??][#if orderConf.isUpstairsIncre==1 && waybill.isStandard==1]block[#else ]none[/#if][#else]none[/#if]">
                                <span class="er" id="upstairsFee_span">([#if waybill.isStandard==1]${(orderConf.upstairsFee)!}[#else]0[/#if]元)</span>
                                <input type="hidden" id="isUpstairsIncre" name="isUpstairsIncre" value="[#if waybill.isStandard==1]${orderConf.isUpstairsIncre!}[/#if]">
                                <input type="hidden" id="upstairsFee" name="upstairsFee" value="[#if waybill.isStandard==1]${orderConf.upstairsFee!}[/#if]">
                                <select class="e" id="isElevator" name="isElevator">
                                    <option value="" >请选择</option>
                                    <option value="1" [#if orderConf.isElevator??][#if orderConf.isElevator==1 && waybill.isStandard==1]selected[/#if][/#if]>有电梯</option>
                                    <option value="0" [#if orderConf.isElevator??][#if orderConf.isElevator==0 && waybill.isStandard==1]selected[/#if][/#if]>无电梯</option>
                                </select>
                            <span>
                            <input class="i-w" type="" id="floorNum" name="floorNum" value="[#if waybill.isStandard==1]${orderConf.floorNum!}[/#if]">
                            <span class="er1">层</span>
                            </span>
                            </li>
                            </div>
                        </ul>


                        <ul style="clear:both; float:left;">

                            <li class="l-x1 [#if orderConf.isUnloadIncre??][#if orderConf.isUnloadIncre==1]selected[/#if][/#if]" id="needUnload" style="font-weight:normal; font-size:12px;  color:#000;">卸货费</li>
                            <li class="l-x2">
                                <input type="hidden" id="isUnloadIncre" name="isUnloadIncre" value="${orderConf.isUnloadIncre!}">
                                <input type="hidden" id="unloadFee" name="unloadFee" value="${orderConf.unloadFee!}">
                                <span class="er" style="display: [#if orderConf.isUnloadIncre??][#if orderConf.isUnloadIncre==1]block[#else]none[/#if][#else]none[/#if];" id="unloadFee_span">(${(orderConf.unloadFee)!0})元</span>
                            </li>

                            <li class="l-x1 [#if orderConf.isReceiveSendSms??][#if orderConf.isReceiveSendSms==1]selected[/#if][#else]selected[/#if]" id="needReceiveSendSms" style="font-weight:normal; font-size:12px;  color:#000;">短信通知</li>
                            <li class="l-x2">
                                <input type="hidden" id="isReceiveSendSms" name="isReceiveSendSms" value="${orderConf.isReceiveSendSms!1}">
                                <span class="er1">免费</span>
                            </li>

                            <li class="l-x1 [#if orderConf.isNeedReceipt??][#if orderConf.isNeedReceipt==1]selected[/#if][/#if]" id="needReceipt" style="font-weight:normal; font-size:12px;  color:#000;">签回单</li>
                            <li class="l-x2">
                                <input type="hidden" id="isNeedReceipt" name="isNeedReceipt" value="${orderConf.isNeedReceipt!}">
                                <input type="hidden" id="signedReceiveFee" name="signedReceiveFee" value="${orderConf.signedReceiveFee!}">
                                <span id="isNeedReceipt_span" style="display: [#if orderConf.isNeedReceipt??][#if orderConf.isNeedReceipt==1]block[#else]none[/#if][#else]none[/#if];" class="er">(10元/票)</span>
                            </li>


                            <li class="l-x1 [#if orderConf.isExpress??][#if orderConf.isExpress==1]selected[/#if][/#if]" id="needExpress" style="font-weight:normal; font-size:12px;  color:#000;">加急</li>
                            <li class="l-x2">
                                <input type="hidden" id="isExpress" name="isExpress" value="${orderConf.isExpress!}">
                                <input type="hidden" id="expressFee" name="expressFee" value="${orderConf.expressFee!}">
                                <span id="needExpress_span" style="display: [#if orderConf.isExpress??][#if orderConf.isExpress==1]block[#else]none[/#if][#else]none[/#if];;" class="er">(费用另议)</span>
                            </li>

                        </ul>

                    </div>
                </div>

                <div class="xx2"></div>

                <div class="d-bx">
                    <div class="d-bx1">保险费用
                        <span class="s-bf">（保费必须现付）</span>
                    </div>

                    <div class="s-bf1">
                	<span class="s-jz">
                    	货物价值：
                        <input class="i-t" id="insuredFee" name="insuredFee" value="${orderConf.insuredFee!4000}"/>
                        元 <span>X</span> <input type="hidden" id="premiumFee" name="premiumFee" value="${orderConf.premiumFee!2}">
                        费率0.5‰=您共需要支付保费：<span class="s-l" id="premiumFeeSpan">${orderConf.premiumFee!2}</span>元
                    </span>

                    </div>
                </div>

                <div class="xx2"></div>

                <div class="d-yf">
                    <div class="d-yf1">运费支付方式</div>
                    <div class="d-zf" id="selectPayStyle">
                        <span class="s-xf" id="payStyleXf">现付（线上支付）</span>
                        <span class="s-df" id="payStyleDf">到付</span>
                        <input type="hidden" id="balanceTypeWithZb" name="balanceTypeWithZb" value="">
                    </div>

                    <!-- 现付 -->
                    <div class="d-yf2" id="xf-div" style="display:none;">
                        <ul>
                            <li>运费：<span id="xf_freight_fee" >0元</span></li>
                            <li>送货费：<span id="xf_send_fee" >0元</span></li>
                            <li>保费：<span id="xf_premium_fee" >2元</span></li>
                            <li>开票费：<span id="xf_invoice_fee" >0元</span></li>

                            <li>增值费：<span id="xf_addvalues_fee" >0元</span>
                                （进仓费：<span id="xf_enter_fee" >0元</span>、
                                 上楼费：<span id="xf_upstairs_fee" >0元</span>、
                                 卸货费：<span id="xf_unload_fee" >0元</span>、
                                 签回单：<span id="xf_signedreceive_fee" >0元</span>、
                                 加急：<span id="xf_Express_fee" >0元</span>）
                            </li>
                            <li><span style="display: inline-block;overflow: hidden;">应付费用：</span><span class="s-l" style="overflow: hidden;" id="xf_fee_aggravate">0元</span></li>
                            <input type="hidden" id="allFee" name="allFee" >
                            <input type="hidden" id="freightFee" name="freightFee" >
                            <input type="hidden" id="sendGoodFee" name="sendGoodFee">
                            <input type="hidden" id="invoiceFee" name="invoiceFee" >
                            <input type="hidden" id="feeStatus" name="feeStatus" >
                        </ul>
                    </div>
                    <!--费用无法算出（基准价或品类价没有） tips-->
                    <div class="d-yf2" id="xf-no-freightfee-tip-div" style="display: none">
                        <ul>
                            <li><font size="2px" color="#ff4500">因您的收货地区暂无报价，请确认交易，专线宝客服会及时与您联系！</font></li>
                        </ul>
                    </div>
                    <!--费用无法算出（送货距离超出50公里） tips-->
                    <div class="d-yf2" id="xf-no-sendfee-tip-div" style="display: none">
                        <ul>
                            <li><font size="2px" color="#ff4500">因您的送货距离较远暂无报价，请确认交易，专线宝客服会及时与您联系！</font></li>
                        </ul>
                    </div>
                    <!--结束-->

                    <!--到付-->
                    <div class="d-yf2-2" id="df-div" style=" display: none;">
                        <div class="span-dh" id="dfval-tip-div" style="float: left; margin-left: 32px;font-size: 12px;margin-top: 10px;color: #4f4f4f;">
                            <span class="s-p1" style="color: #F90;">*</span>收货人到付费用：<input class="i-t" id="dfyfFeeWithZb" name="dfyfFeeWithZb" value=""/> 元
                            <!--费用无法算出（基准价或品类价没有） tips-->
                        </div>
                        <!--费用无法算出（基准价或品类价没有） tips-->
                        <div class="d-yf2" id="no-freightfee-tip-div" style="display: none">
                            <ul style="margin-left: -20px;">
                                <li><font size="2px" color="#ff4500">因您的收货地区暂无报价，请确认交易，专线宝客服会及时与您联系！</font></li>
                            </ul>
                        </div>
                        <!--费用无法算出（送货距离超出50公里） tips-->
                        <div class="d-yf2" id="no-sendfee-tip-div" style="display: none">
                            <ul style="margin-left: -20px;">
                                <li><font size="2px" color="#ff4500">因您的送货距离较远暂无报价，请确认交易，专线宝客服会及时与您联系！</font></li>
                            </ul>
                        </div>

                        <div class="div-ul" id="dfresult-tip-div" style="clear: both;display: block;">
                                <ul>
                                <li>运费：<span id="df_freight_fee" >0元</span></li>
                                <li>送货费：<span id="df_send_fee" >0元</span></li>
                                <li>保费：<span id="df_premium_fee" >2元</span></li>
                                <li>开票费：<span id="df_invoice_fee" >0元</span></li>

                                <li>增值费：<span id="df_addvalues_fee" >0元</span>
                                    （进仓费：<span id="df_enter_fee" >0元</span>、
                                    上楼费：<span id="df_upstairs_fee" >0元</span>、
                                    卸货费：<span id="df_unload_fee" >0元</span>、
                                    签回单：<span id="df_signedreceive_fee" >0元</span>、
                                    加急：<span id="df_Express_fee" >0元</span>）
                                </li>
                                <li>费用总计：<span id="df_fee_aggravate">0元</span></li>
                                <li><span id="spread_span" style="overflow: hidden;display: inline-block;" >应付费用：</span><span class="s-l" id="df_spread" style="overflow: hidden;"  >0元</span>
                                    <span id="fybztips" style="display: block; margin-top: 5px;display: inline-block;overflow: hidden;">（<font size="2px" color="#ff4500">因收货方到付费用不足，需支付当前费用</font>）</span>
                                    <span id="fydytips" style="display: none;overflow: hidden; margin-top: 5px;">（<font size="2px" color="#ff4500">此票专线宝会与收货方进行结算</font>）</span>
                                </li>
                                [#--<li>现付费用：<span class="s-l" id="df_accrued_fee">0元</span>&nbsp;
                                    <span id="xftips" style="display: none">（<font size="2px" color="#ff4500">因到付费用不足支付，需支付当前费用</font>）</span>
                                </li>
                                <input type="hidden" id="xfyfFeeWithZb" name="xfyfFeeWithZb">--]
                            </ul>
                        </div>
                    </div>

                    <!--结束-->



                    <div class="d-xx">
                        <div class="d-xx1">
                            <ul>
                                <li class="l-h1">货物名称</li>
                                <li class="l-h2">包装</li>
                                <li class="l-h3">件数</li>
                                <li class="l-h4">总重量</li>
                                <li class="l-h5">总体积</li>
                                <li class="l-h6">装卸方式</li>
                                <li class="l-h7">堆放要求</li>
                            </ul>
                        </div>

                        <div class="d-xx2">
                            <ul>
                                <li class="l-h11">${(good.goodName)!}</li>
                                <li class="l-h22">
                                [#if good.pack??]
                                    [#if good.pack=='0']无
                                    [#elseif good.pack=='1']纸箱
                                    [#elseif good.pack=='2']袋
                                    [#elseif good.pack=='3']桶
                                    [#elseif good.pack=='4']包
                                    [#elseif good.pack=='5']托
                                    [#elseif good.pack=='6']木架
                                    [#elseif good.pack=='7']纸
                                    [#else]${good.pack}
                                    [/#if]
                                [/#if]
                                </li>
                                <li class="l-h33">${(good.num)!}</li>
                                <li class="l-h44">${(good.offerWeight)!}</li>
                                <li class="l-h55">${(good.offerVolume)!}</li>
                                <li class="l-h66">[#if waybill.loadUnloadType??]
                                    [#if waybill.loadUnloadType==0]人工搬运
                                    [#elseif waybill.loadUnloadType==1]吊车作业
                                    [#elseif waybill.loadUnloadType==2]叉车作业
                                    [#else]${waybill.loadUnloadType}
                                    [/#if]
                                [/#if]
                                </li>
                                <li class="l-h77">
                                    [#if (waybill.stackRequire)??]
                                        [#list waybill.stackRequire?split(",") as stack]
                                            [#if stack=='1']不能混装[/#if]
                                            [#if stack=='2']不能挤压[/#if]
                                            [#if stack=='3']不能侧放[/#if]
                                            [#if stack=='4']不能倒置[/#if]
                                            [#if stack=='5']不能分拆[/#if]
                                            [#if stack=='6']不能堆叠[/#if]
                                        [/#list]
                                    [/#if]
                                </li>
                            </ul>
                        </div>


                        <div class="d-xx3">
                            <ul>
                                <li class="l-h111">姓名</li>
                                <li class="l-h222">联系方式</li>
                                <li class="l-h333">联系地址</li>
                                <li class="l-h444">收/发货方</li>
                            </ul>
                        </div>

                        <div class="d-xx4">
                            <ul>
                                <li class="l-h1111">${(waybill.shipperLinkName)!}</li>
                                <li class="l-h2222">[#if waybill.shipperLinkMobile==""]
                                                        ${(waybill.shipperLinkPhone)}
                                                    [#else]
                                                    ${(waybill.shipperLinkMobile)}
                                                    [/#if]
                                </li>
                                <li class="l-h3333">${(waybill.shipperProvinceName)!}${(waybill.shipperCityName)!}
                                                    ${(waybill.shipperCountryName)!}${(waybill.shipperAddress)!}
                                </li>
                                <li class="l-h4444">发货方</li>
                            </ul>
                        </div>
                        <div class="d-xx4">
                            <ul>
                                <li class="l-h1111">${(waybill.receiveLinkName)!}</li>
                                <li class="l-h2222">[#if waybill.receiveLinkMobile==""]
                                                    ${(waybill.receiveLinkPhone)}
                                                    [#else]
                                                    ${(waybill.receiveLinkMobile)}
                                                    [/#if]</li>
                                <li class="l-h3333">${(waybill.receiveProvinceName)!}${(waybill.receiveCityName)!}
                                                    ${(waybill.receiveCountryName)!}${(waybill.receiveAddress)!}
                                </li>
                                <li class="l-h4444">收货方</li>
                            </ul>
                        </div>
                    </div>
                </div>

                <div class="xx2"></div>

                <div class="d-jyk">
                    <div class="d-anniu">
                        <div class="d-q1" id="submit_btn">确认交易</div>
                        <div class="d-f1" id="return_btn">返回修改</div>
                    </div>

                </div>

            </div>
        </div>
        <input type="hidden" id="hPack" name="hPack" value="${(good.pack)!}">
        <input type="hidden" id="hNum" name="hNum" value="${(good.num)!}">
        <input type="hidden" id="hVolume" name="hVolume" value="${(good.offerVolume)!}">
        <input type="hidden" id="hWeight" name="hWeight" value="${(good.offerWeight)!}">
        <input type="hidden" id="hIsStandard" name="hIsStandard" value="${(waybill.isStandard)!}">
        <input type="hidden" id="hAllocCenterId" name="hAllocCenterId" value="${(orderConf.allocCenterId)!}">
        <input type="hidden" id="hReceiveProvinceId" name="hReceiveProvinceId" value="${(waybill.receiveProvinceId)!}">
        <input type="hidden" id="hReceiveCityId" name="hReceiveCityId" value="${(waybill.receiveCityId)!}">
        <input type="hidden" id="hReceiveCountryId" name="hReceiveCountryId" value="${(waybill.receiveCountryId)!}">
        <input type="hidden" id="hReceiveProvinceName" name="hReceiveProvinceName" value="${(waybill.receiveProvinceName)!}">
        <input type="hidden" id="hReceiveCityName" name="hReceiveCityName" value="${(waybill.receiveCityName)!}">
        <input type="hidden" id="hReceiveCountryName" name="hReceiveCountryName" value="${(waybill.receiveCountryName)!}">
        <input type="hidden" id="hReceiveAddress" name="hReceiveAddress" value="${(waybill.receiveAddress)!}">
        <input type="hidden" id="hCategoryId" name="hCategoryId" value="${(good.goodCategoryId)!}">
    </form>
    [/@mainLayout]
[/#escape]