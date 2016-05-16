/**
 * Created by chaizf on 2016/4/11.
 */

$().ready(function() {

    var $submitBtn = $("#submit_btn");
    $submitBtn.click(function(){
        $("#orderConfForm").submit();
        return false;
    });

    $("#orderConfForm").validate({
        ignore: "",
        rules: {
            allocCenterId: {required: true},
            companyName: {required: "#isOpenTicket:checked"},
            consigneeName: {required: "#isOpenTicket:checked"},
            consigneeProvinceId: {required: "#isOpenTicket:checked"},
            consigneeCityId: {required: "#isOpenTicket:checked"},
            consigneeCountyId: {required: "#isOpenTicket:checked"},
            consigneeAddress: {required: "#isOpenTicket:checked"},
            consigneeMobile: {required: "#isOpenTicket:checked", isPhone:true}
        },
        messages: {
            allocCenterId: {required: "请选择集散中心"},
            companyName: {required: "请输入发票抬头"},
            consigneeName: {required: "请输入发票收件人"},
            consigneeProvinceId: {required: "请选择发票收件人所在省"},
            consigneeCityId: {required: "请选择发票收件人所在市"},
            consigneeCountyId: {required: "请选择发票收件人所在区县"},
            consigneeAddress: {required: "请输入发票收件详细地址"},
            consigneeMobile: {required: "请选择发票收件人联系方式", isPhone:"请输入正确的联系方式格式,手机或座机"},
            isElevator:{required: "请选择是否有电梯"}
        },
        showErrors:function(errorMap,errorList) {
            if(errorList && errorList.length > 0) {
                layer.tips(errorList[0].message, "#" + errorList[0].element.name);
            }
        },
        focusInvalid:true,
        submitHandler:function() {
            if($("#balanceTypeWithZb").val()=="" || ($("#xf-div").css("display")=="none"
                && $("#df-div").css("display")=="none" && $("#no-freightfee-tip-div").css("display")=="none"
                && $("#no-sendfee-tip-div").css("display")=="none" )){
                layer.tips("请选择支付方式,计算费用", "#submit_btn",{
                        tips: 4
                    }
                );
                return;
            }
            $.ajax({
                url: "../waybill/add",
                type: "POST",
                data: $("#orderConfForm").serialize(),
                success: function (val) {
                    if(val.status==1) {
                        if (val.data.feeStatus==1) {//1:算出费用，需要支付
                            location.href = "../payment/"+val.data.id+"/"+val.data.benchmarkId;
                        }else{//-1，-3:算不出费用，不用支付;0两种情况：1：到付金额=现付金额；2：给服务商返差价
                            location.href = "../waybill/success/"+val.data.id+"/"+val.data.systemSn+"/"+val.data.feeStatus;
                        }
                    }else{
                        if(val.data){
                            location.href = "../"+val.data;
                        }
                        //layer.msg(val.msg);
                    }
                }
            });
        }
    });
    //-----------------------------
    //集散中心
    $("#allocCenterId").change(function() {
        $("#allocCenterName").val($(this).find("option:selected").text());
        if($("#allocCenterId").val()!=""){
            //需要计算费用
            if($("#balanceTypeWithZb").val()=='1'){//到付
                //修改集散，费用重新计算
                dfAjax();
            }
            if($("#balanceTypeWithZb").val()=='0'){//现付
                //修改集散，费用重新计算
                xfAjax();
            }
        }
    });
    //送货上门
    $("#sendHome").click(function(){
        if($("#sendHome").attr("class").indexOf("selected")<0){
            //$("#otherConnectType").removeAttr("checked")
            $("#selfHand").removeClass("selected");
            $("#sendHome").addClass("selected");
            $("#connectType").val(1);//送货上门
        }else{
            $("#sendHome").removeClass("selected");
            $("#connectType").val('');
        }
    });
    //到站自提
    $("#selfHand").click(function(){
        if($("#selfHand").attr("class").indexOf("selected")<0){
            //$("#otherConnectType").removeAttr("checked")
            $("#sendHome").removeClass("selected");
            $("#selfHand").addClass("selected");
            $("#connectType").val(0);//到站自提
        }else{
            $("#selfHand").removeClass("selected");
            $("#connectType").val('');
        }
    });
    //等通知放货
    $("#otherConnectTypeCb").change(function() {
        var $otherConnectTypeCb = $("#otherConnectTypeCb");
        if ($otherConnectTypeCb.is(":checked")) {
            //$("#sendHome").removeClass("selected");
            //$("#selfHand").removeClass("selected");
            //$("#connectType").val(10);//等通知放货
            $("#otherConnectType").val("等通知放货");
        }else{
            $("#otherConnectType").val("");
        }
    });
    //进仓
    $("#needEnterDepot").click(function() {
        if($("#selectDeptorType").css("display")=="block"){
            //原始进仓费
            var ysenterFee = $("#enterFee").val()==""?0:$("#enterFee").val();
            $("#depotType").rules("remove");
            $("#needEnterDepot").removeClass("selected");
            $("#isNeedEnterDepot").val("");
            $("#selectDeptorType").css("display","none");
            $("#enterFee").val('');
            $("#enterFee_span").text('(0元)');
            $("#depotType").val('').trigger("change");
            $("#xf_enter_fee").html("0元");
            $("#df_enter_fee").html("0元");
            cleanEnterFee(ysenterFee);

        }else{
            if($("#balanceTypeWithZb").val()==1) {//到付
                layer.tips("需要进仓不能选择到付", "#needEnterDepot");
                return;
            }
            $("#depotType").rules("add",{required: true,messages: { required: "请选择仓库类型"}});
            $("#needEnterDepot").addClass("selected");
            $("#isNeedEnterDepot").val(1);
            $("#selectDeptorType").css("display","block");
        }
    });
    //清空进仓费
    var cleanEnterFee = function(ysenterFee){
        $("#enterFee").val('');
        $("#enterFee_span").text('(0元)');
        $("#xf_enter_fee").html("0元");
        $("#df_enter_fee").html("0元");
        //总费用
        var allFee = $("#allFee").val()==""?0:$("#allFee").val();
        allFee = allFee - parseFloat(ysenterFee);
        if($("#balanceTypeWithZb").val()==1 && $("#feeStatus").val()==1){//到付
            $("#df_fee_aggravate").html(allFee + "元");
            $("#allFee").val(allFee);
            var dfAddValuesFee = $("#df_addvalues_fee").html()==""?0:$("#df_addvalues_fee").html();
            dfAddValuesFee = parseFloat(dfAddValuesFee) - parseFloat(ysenterFee);
            $("#df_addvalues_fee").html(dfAddValuesFee + "元");
            //发票费修改
            invoiceFee1ByFeeChange();
        }
        if($("#balanceTypeWithZb").val()==0 && $("#feeStatus").val()==1){//现付
            $("#xf_fee_aggravate").html(allFee + "元");
            $("#allFee").val(allFee);
            var xfAddValuesFee = $("#xf_addvalues_fee").html()==""?0:$("#xf_addvalues_fee").html();
            var xfAddValuesFee = parseFloat(xfAddValuesFee) - parseFloat(ysenterFee);
            $("#xf_addvalues_fee").html(xfAddValuesFee + "元");
            //发票费修改
            invoiceFee0ByFeeChange();
        }
    }
    //计算进仓费
    $("#depotType").change(function() {
        if($("#depotType").val()!=""){
            //原始进仓费
            var ysenterFee = $("#enterFee").val()==""?0:$("#enterFee").val();
            //原始增值费合计
            var ysxfAddValuesFee = $("#xf_addvalues_fee").html()==""?0:$("#xf_addvalues_fee").html();
            var ysdfAddValuesFee = $("#df_addvalues_fee").html()==""?0:$("#df_addvalues_fee").html();
            //原始总费用
            var ysAllFee = $("#allFee").val()==""?0:$("#allFee").val();
            if($("#depotType").val()){
                $.ajax({
                    url: "../waybill/enterFee",
                    type: "POST",
                    data: {
                        hBalanceTypeWithZb: 0,//付款类型默认现付
                        hIsNeedEnterDepot:$("#isNeedEnterDepot").val(),
                        hDepotType:$("#depotType").val(),
                        hVolume:$("#hVolume").val()
                    },
                    success: function (data) {
                        $("#enterFee").val(data);
                        $("#enterFee_span").html("("+data+"元)");
                        $("#xf_enter_fee").html(data+"元");
                        $("#df_enter_fee").html(data+"元");
                        //----------------
                        //减掉原始进仓费，总金额
                        var sAllFee = parseFloat(ysAllFee)-parseFloat(ysenterFee);
                        var enterFee = $("#enterFee").val()==""?0:$("#enterFee").val();
                        var allFee = sAllFee+parseFloat(enterFee);
                        if($("#balanceTypeWithZb").val()==1 && $("#feeStatus").val()==1){//到付

                            $("#df_fee_aggravate").html(allFee + "元");
                            $("#allFee").val(allFee);
                            var sdfAddValuesFee = parseFloat(ysdfAddValuesFee)-parseFloat(ysenterFee);
                            var dfAddValuesFee = sdfAddValuesFee + parseFloat(enterFee);
                            $("#df_addvalues_fee").html(dfAddValuesFee + "元");
                            //发票费修改
                            invoiceFee1ByFeeChange();
                        }
                        if($("#balanceTypeWithZb").val()==0 && $("#feeStatus").val()==1){//现付
                            $("#xf_fee_aggravate").html(allFee + "元");
                            $("#allFee").val(allFee);
                            var sxfAddValuesFee = parseFloat(ysxfAddValuesFee)-parseFloat(ysenterFee);
                            var xfAddValuesFee = sxfAddValuesFee + parseFloat(enterFee);
                            $("#xf_addvalues_fee").html(xfAddValuesFee + "元");
                            //发票费修改
                            invoiceFee0ByFeeChange();
                        }
                    }
                });
            }
        }else{
            //进仓费
            var enterFee = $("#enterFee").val()==""?0:$("#enterFee").val();
            cleanEnterFee(enterFee);
        }
    });

    //上楼
    $("#needUpstairs").click(function() {
        //原始上楼费
        var upstairsFee = $("#upstairsFee").val()==""?0:$("#upstairsFee").val();
        if($("#selectElevator").css("display")=="block"){
            $("#isElevator").rules("remove");
            $("#needUpstairs").removeClass("selected");
            $("#isUpstairsIncre").val("");
            $("#selectElevator").css("display","none");
            $("#upstairsFee").val('');
            $("#upstairsFee_span").text('(0元)');
            $("#isElevator").val('').trigger("change");
            $("#floorNum").val('');
            $("#xf_upstairs_fee").html("0元");
            $("#df_upstairs_fee").html("0元");
            //--------------------
            cleanUpstairsFee(upstairsFee);
        }else{
            $("#isElevator").rules("add",{required: true,messages: { required: "请选择是否有电梯"}});
            $("#needUpstairs").addClass("selected");
            $("#isUpstairsIncre").val(1);
            $("#selectElevator").css("display","block");
        }
    });
    //按电梯，计算上楼费
    $("#isElevator").change(function() {
        if($("#isElevator").val()!="") {
            //原始上楼费
            var ysupstairsFee = $("#upstairsFee").val() == "" ? 0 : $("#upstairsFee").val();
            //原始总费用
            var ysAllFee = $("#allFee").val() == "" ? 0 : $("#allFee").val();
            if ($("#isElevator").val()) {
                $.ajax({
                    url: "../waybill/upstairsFee",
                    type: "POST",
                    data: {
                        hIsUpstairsIncre: $("#isUpstairsIncre").val(),
                        hIsStandard: $("#hIsStandard").val(),
                        hFloorNum: $("#floorNum").val(),
                        hIsElevator: $("#isElevator").val(),
                        hVolume: $("#hVolume").val(),
                        hWeight: $("#hWeight").val()
                    },
                    success: function (data) {
                        $("#upstairsFee").val(data);
                        $("#upstairsFee_span").html("(" + data + "元)");
                        $("#xf_upstairs_fee").html(data + "元");
                        $("#df_upstairs_fee").html(data + "元");
                        //--------------------
                        modifyUpstairsFee(ysAllFee,ysupstairsFee);
                    }
                });
            }
        }else{
            //上楼费
            var upstairsFee = $("#upstairsFee").val()==""?0:$("#upstairsFee").val();
            $("#floorNum").val("");
            cleanUpstairsFee(upstairsFee);
        }
    });
    //修改上楼费
    var modifyUpstairsFee = function(ysAllFee,ysupstairsFee){
        var sAllFee = parseFloat(ysAllFee)-parseFloat(ysupstairsFee);
        var upstairsFee = $("#upstairsFee").val()==""?0:$("#upstairsFee").val();
        var allFee = sAllFee+parseFloat(upstairsFee);
        if($("#balanceTypeWithZb").val()==1 && $("#feeStatus").val()==1){//到付
            var ysdfAddValuesFee = $("#df_addvalues_fee").html() == "" ? 0 : $("#df_addvalues_fee").html();
            $("#df_fee_aggravate").html(allFee + "元");
            $("#allFee").val(allFee);
            var sdfAddValuesFee = parseFloat(ysdfAddValuesFee)-parseFloat(ysupstairsFee);
            var dfAddValuesFee = sdfAddValuesFee + parseFloat(upstairsFee);
            $("#df_addvalues_fee").html(dfAddValuesFee + "元");
            //-----------------
            //应收差价
            calculateDfSpread();
            //发票
            invoiceFee1ByFeeChange();
        }
        if($("#balanceTypeWithZb").val()==0 && $("#feeStatus").val()==1){//现付
            var ysxfAddValuesFee = $("#xf_addvalues_fee").html() == "" ? 0 : $("#xf_addvalues_fee").html();
            $("#xf_fee_aggravate").html(allFee + "元");
            $("#allFee").val(allFee);
            var sxfAddValuesFee = parseFloat(ysxfAddValuesFee)-parseFloat(ysupstairsFee);
            var xfAddValuesFee = sxfAddValuesFee + parseFloat(upstairsFee);
            $("#xf_addvalues_fee").html(xfAddValuesFee + "元");
            //------------------
            invoiceFee0ByFeeChange();
        }
    }
    //清理上楼费
    var cleanUpstairsFee = function(ysupstairsFee){
        $("#upstairsFee").val('');
        $("#upstairsFee_span").text('(0元)');
        $("#xf_upstairs_fee").html("0元");
        $("#df_upstairs_fee").html("0元");
        //总费用
        var allFee = $("#allFee").val()==""?0:$("#allFee").val();
        allFee = allFee - parseFloat(ysupstairsFee);
        if($("#balanceTypeWithZb").val()==1 && $("#feeStatus").val()==1){//到付
            $("#df_fee_aggravate").html(allFee + "元");
            $("#allFee").val(allFee);
            var dfAddValuesFee = $("#df_addvalues_fee").html()==""?0:$("#df_addvalues_fee").html();
            dfAddValuesFee = parseFloat(dfAddValuesFee) - parseFloat(ysupstairsFee);
            $("#df_addvalues_fee").html(dfAddValuesFee + "元");
            //---------------
            //应收差价
            calculateDfSpread();
            //发票
            invoiceFee1ByFeeChange();
        }
        if($("#balanceTypeWithZb").val()==0 && $("#feeStatus").val()==1){//现付
            $("#xf_fee_aggravate").html(allFee + "元");
            $("#allFee").val(allFee);
            var xfAddValuesFee = $("#xf_addvalues_fee").html()==""?0:$("#xf_addvalues_fee").html();
            xfAddValuesFee = parseFloat(xfAddValuesFee) - parseFloat(ysupstairsFee);
            $("#xf_addvalues_fee").html(xfAddValuesFee + "元");
            //--------------
            //发票费修改
            invoiceFee0ByFeeChange();
        }
    }

    //按电梯楼层，计算上楼费,校验楼层
    $("#floorNum").keyup(function() {
        var val = $("#floorNum").val();
        if($("#isElevator").val()!=""){
            if(val.length>0){
                if(!(/^[\d]+$/.test(val) && val.length<3)){
                    $("#floorNum").val("");
                    $("#floorNum").focus();
                    layer.tips("楼层数只能整数，且最多2位", "#floorNum");
                    return;
                }
            }
        }else{
            $("#floorNum").val("");
            $("#isElevator").focus();
            layer.tips("请选择电梯", "#floorNum");
            return;
        }
        //没电梯时，有楼层需要计算，有电梯和楼层没关系
        if($("#isElevator").val()==0){
            //计算费用
            $.ajax({
                url: "../waybill/upstairsFee",
                type: "POST",
                data: {
                    hIsUpstairsIncre: $("#isUpstairsIncre").val(),
                    hIsStandard: $("#hIsStandard").val(),
                    hFloorNum: $("#floorNum").val(),
                    hIsElevator: $("#isElevator").val(),
                    hVolume: $("#hVolume").val(),
                    hWeight: $("#hWeight").val()
                },
                success: function (data) {
                    //原始上楼费
                    var ysupstairsFee = $("#upstairsFee").val() == "" ? 0 : $("#upstairsFee").val();
                    //原始总费用
                    var ysAllFee = $("#allFee").val() == "" ? 0 : $("#allFee").val();
                    $("#upstairsFee").val(data);
                    $("#upstairsFee_span").html("(" + data + "元)");
                    $("#xf_upstairs_fee").html(data + "元");
                    $("#df_upstairs_fee").html(data + "元");
                    //--------------------
                    modifyUpstairsFee(ysAllFee,ysupstairsFee);
                }
            });
        }
    });

    //卸货费
    $("#needUnload").click(function() {
        if($("#isUnloadIncre").attr("value")==1){
            var unloadFee = $("#unloadFee").val()==""?0:$("#unloadFee").val();
            $("#needUnload").removeClass("selected");
            $("#isUnloadIncre").val("");
            $("#unloadFee").val('');
            $("#unloadFee_span").text('(0元)');
            $("#unloadFee_span").css("display","none");
            $("#xf_unload_fee").html("0元");
            $("#df_unload_fee").html("0元");
            var allFee = $("#allFee").val()==""?0:$("#allFee").val();
            allFee =  parseFloat(allFee)-parseFloat(unloadFee);
            if($("#balanceTypeWithZb").val()==1 && $("#feeStatus").val()==1){//到付
                var dfAddValuesFee = $("#df_addvalues_fee").html()==""?0:$("#df_addvalues_fee").html();
                $("#df_fee_aggravate").html(allFee + "元");
                $("#allFee").val(allFee);
                dfAddValuesFee = parseFloat(dfAddValuesFee)-parseFloat(unloadFee);
                $("#df_addvalues_fee").html(dfAddValuesFee + "元");
                //应收差价
                calculateDfSpread();
                //发票费修改
                invoiceFee1ByFeeChange();
            }
            if($("#balanceTypeWithZb").val()==0 && $("#feeStatus").val()==1){//现付
                var xfAddValuesFee = $("#xf_addvalues_fee").html()==""?0:$("#xf_addvalues_fee").html();
                $("#xf_fee_aggravate").html(allFee + "元");
                $("#allFee").val(allFee);
                xfAddValuesFee = parseFloat(xfAddValuesFee)-parseFloat(unloadFee);
                $("#xf_addvalues_fee").html(xfAddValuesFee + "元");
                //发票费修改
                invoiceFee0ByFeeChange();
            }
        }else{
            //原始卸货费
            var ysunloadFee = $("#unloadFee").val()==""?0:$("#unloadFee").val();
            //原始增值费合计
            var ysxfAddValuesFee = $("#xf_addvalues_fee").html()==""?0:$("#xf_addvalues_fee").html();
            var ysdfAddValuesFee = $("#df_addvalues_fee").html()==""?0:$("#df_addvalues_fee").html();
            //原始总费用
            var ysAllFee = $("#allFee").val()==""?0:$("#allFee").val();
            $("#unloadFee_span").css("display","block");
            $("#needUnload").addClass("selected");
            $("#isUnloadIncre").val(1);
            //计算卸货费
            $.ajax({
                url: "../waybill/unloadFee",
                type: "POST",
                data: {
                    hIsUnloadIncre: $("#isUnloadIncre").val(),
                    hVolume:$("#hVolume").val(),
                    hWeight:$("#hWeight").val()
                },
                success: function (data) {
                    $("#unloadFee").val(data);
                    $("#unloadFee_span").html("("+data+"元)");
                    $("#xf_unload_fee").html(data+"元");
                    $("#df_unload_fee").html(data+"元");
                    //-------------------
                    var sAllFee = parseFloat(ysAllFee)-parseFloat(ysunloadFee);
                    var unloadFee = $("#unloadFee").val()==""?0:$("#unloadFee").val();
                    var allFee = sAllFee+parseFloat(unloadFee);
                    if($("#balanceTypeWithZb").val()==1 && $("#feeStatus").val()==1){//到付
                        $("#df_fee_aggravate").html(allFee + "元");
                        $("#allFee").val(allFee);
                        var sdfAddValuesFee = parseFloat(ysdfAddValuesFee)-parseFloat(ysunloadFee);
                        var dfAddValuesFee = sdfAddValuesFee + parseFloat(unloadFee);
                        $("#df_addvalues_fee").html(dfAddValuesFee + "元");
                        //应收差价
                        calculateDfSpread();
                        //发票费修改
                        invoiceFee1ByFeeChange();
                    }
                    if($("#balanceTypeWithZb").val()==0 && $("#feeStatus").val()==1){//现付
                        $("#xf_fee_aggravate").html(allFee + "元");
                        $("#allFee").val(allFee);
                        var sxfAddValuesFee = parseFloat(ysxfAddValuesFee)-parseFloat(ysunloadFee);
                        var xfAddValuesFee = sxfAddValuesFee + parseFloat(unloadFee);
                        $("#xf_addvalues_fee").html(xfAddValuesFee + "元");
                        //发票费修改
                        invoiceFee0ByFeeChange();
                    }
                }
            });
        }
    });

    //短信通知
    $("#needReceiveSendSms").click(function() {
        if($("#isReceiveSendSms").attr("value")==1){
            $("#needReceiveSendSms").removeClass("selected");
            $("#isReceiveSendSms").val("");
        }else{
            $("#needReceiveSendSms").addClass("selected");
            $("#isReceiveSendSms").val(1);

        }
    });

    //签回单
    $("#needReceipt").click(function() {
        if($("#isNeedReceipt").attr("value")==1){
            //签回单费
            var signedReceiveFee = $("#signedReceiveFee").val()==""?0:$("#signedReceiveFee").val();
            $("#needReceipt").removeClass("selected");
            $("#isNeedReceipt").val("");
            $("#signedReceiveFee").val("");
            $("#isNeedReceipt_span").css("display","none");
            $("#xf_signedreceive_fee").html("0元");
            $("#df_signedreceive_fee").html("0元");
            //总费用
            var allFee = $("#allFee").val()==""?0:$("#allFee").val();
            allFee =  parseFloat(allFee)-parseFloat(signedReceiveFee);
            if($("#balanceTypeWithZb").val()==1 && $("#feeStatus").val()==1){//到付
                //var dfaccruedfee = $("#df_accrued_fee").html()==""?0:$("#df_accrued_fee").html();
                var dfAddValuesFee = $("#df_addvalues_fee").html()==""?0:$("#df_addvalues_fee").html();
                $("#df_fee_aggravate").html(allFee + "元");
                $("#allFee").val(allFee);
                dfAddValuesFee = parseFloat(dfAddValuesFee)-parseFloat(signedReceiveFee);
                //dfaccruedfee = parseFloat(dfaccruedfee)-parseFloat(signedReceiveFee);
                $("#df_addvalues_fee").html(dfAddValuesFee + "元");
                //$("#df_accrued_fee").html(dfaccruedfee + "元");
                //$("#xfyfFeeWithZb").val(dfaccruedfee);
                //应收差价
                calculateDfSpread();
                //发票费修改
                invoiceFee1ByFeeChange();
            }
            if($("#balanceTypeWithZb").val()==0 && $("#feeStatus").val()==1){//现付
                var xfAddValuesFee = $("#xf_addvalues_fee").html()==""?0:$("#xf_addvalues_fee").html();
                $("#xf_fee_aggravate").html(allFee + "元");
                $("#allFee").val(allFee);
                xfAddValuesFee = parseFloat(xfAddValuesFee)-parseFloat(signedReceiveFee);
                $("#xf_addvalues_fee").html(xfAddValuesFee + "元");
                //发票费修改
                invoiceFee0ByFeeChange();
            }
        }else{
            //原始签回单费
            var yssignedReceiveFee = $("#signedReceiveFee").val()==""?0:$("#signedReceiveFee").val();
            //原始增值费合计
            var ysxfAddValuesFee = $("#xf_addvalues_fee").html()==""?0:$("#xf_addvalues_fee").html();
            var ysdfAddValuesFee = $("#df_addvalues_fee").html()==""?0:$("#df_addvalues_fee").html();
            //原始总费用
            var ysAllFee = $("#allFee").val()==""?0:$("#allFee").val();
            $("#isNeedReceipt_span").css("display","block");
            $("#needReceipt").addClass("selected");
            $("#isNeedReceipt").val(1);
            $("#signedReceiveFee").val(10);
            $("#xf_signedreceive_fee").html("10元");
            $("#df_signedreceive_fee").html("10元");
            $("#isNeedReceipt_span").text("(10元/票)");
            //----------------
            //减掉原始签回单费，总金额
            var sAllFee = parseFloat(ysAllFee)-parseFloat(yssignedReceiveFee);
            var signedReceiveFee = $("#signedReceiveFee").val()==""?0:$("#signedReceiveFee").val();
            var allFee = sAllFee+parseFloat(signedReceiveFee);
            if($("#balanceTypeWithZb").val()==1 && $("#feeStatus").val()==1){//到付
                //var ysdfaccruedfee = $("#df_accrued_fee").html()==""?0:$("#df_accrued_fee").html();
                $("#df_fee_aggravate").html(allFee + "元");
                $("#allFee").val(allFee);
                var sdfAddValuesFee = parseFloat(ysdfAddValuesFee)-parseFloat(yssignedReceiveFee);
                var dfAddValuesFee = sdfAddValuesFee + parseFloat(signedReceiveFee);
                //var sdfaccruedfee = parseFloat(ysdfaccruedfee)-parseFloat(yssignedReceiveFee);
                //var dfaccruedfee = sdfaccruedfee + parseFloat(signedReceiveFee);
                $("#df_addvalues_fee").html(dfAddValuesFee + "元");
                //$("#df_accrued_fee").html(dfaccruedfee + "元");
                //$("#xfyfFeeWithZb").val(dfaccruedfee);
                //应收差价
                calculateDfSpread();
                //发票费修改
                invoiceFee1ByFeeChange();
            }
            if($("#balanceTypeWithZb").val()==0 && $("#feeStatus").val()==1){//现付
                $("#xf_fee_aggravate").html(allFee + "元");
                $("#allFee").val(allFee);
                var sxfAddValuesFee = parseFloat(ysxfAddValuesFee)-parseFloat(yssignedReceiveFee);
                var xfAddValuesFee = sxfAddValuesFee + parseFloat(signedReceiveFee);
                $("#xf_addvalues_fee").html(xfAddValuesFee + "元");
                //发票费修改
                invoiceFee0ByFeeChange();
            }
        }
    });

    //加急
    $("#needExpress").click(function() {
        if($("#isExpress").attr("value")==1){
            $("#needExpress").removeClass("selected");
            $("#isExpress").val("");
            $("#needExpress_span").css("display","none");
            $("#xf_Express_fee").text("0元");
            $("#df_Express_fee").text("0元");
        }else{
            $("#needExpress_span").css("display","block");
            $("#needExpress_span").text("(费用另议)");
            $("#needExpress").addClass("selected");
            $("#isExpress").val(1);
            $("#xf_Express_fee").text("费用另议");
            $("#df_Express_fee").text("费用另议");
        }
    });
    //保费计算
    $("#insuredFee").keyup(function() {
        //最初保费，计算使用
        var ysPremiumFee = $("#premiumFee").val()==""?0:$("#premiumFee").val();
        var ysAllFee = $("#allFee").val()==""?0:$("#allFee").val();
        var premiumFee = 2;
        var insuredFee = $("#insuredFee").val();
        if(insuredFee=="" || insuredFee==0){
            $("#insuredFee").attr("value","");
            $("#premiumFee").val("");
            $("#premiumFeeSpan").html(0);
            $("#xf_premium_fee").parent().css('display','none');
            $("#df_premium_fee").parent().css('display','none');
            $("#xf_premium_fee").html("0元");
            $("#df_premium_fee").html("0元");
        }else{
            if(insuredFee.length>0){
                if(!(/^[\d]+$/.test(insuredFee) && insuredFee.length<9 && insuredFee>0)){
                    $("#insuredFee").val("");
                    $("#insuredFee").focus();
                    layer.tips("货物价值只能位大于0整数，最多8位", "#insuredFee");
                    return;
                }
            }
            if(insuredFee>4000){
                premiumFee = parseFloat($("#insuredFee").val()) * 5 / 10000;
                //四舍五入，取整
                premiumFee = Math.round(premiumFee);
            }else if($("#insuredFee").val()==0){
                premiumFee = 0;
            }
            $("#premiumFeeSpan").html(premiumFee);
            $("#premiumFee").val(premiumFee);
            $("#xf_premium_fee").parent().css('display','block');
            $("#df_premium_fee").parent().css('display','block');
            $("#xf_premium_fee").html(premiumFee+"元");
            $("#df_premium_fee").html(premiumFee+"元");
        }
        //减掉原始保费，总金额
        var sAllFee = parseFloat(ysAllFee)-parseFloat(ysPremiumFee);
        var invoiceFee = $("#invoiceFee").val()==""?0:$("#invoiceFee").val();
        var signedReceiveFee=$("#signedReceiveFee").val()==""?0:$("#signedReceiveFee").val();
        var premiumFee = $("#premiumFee").val()==""?0:$("#premiumFee").val();
        //var xffee = parseFloat(invoiceFee) + parseFloat(signedReceiveFee) + parseFloat(premiumFee);
        var allFee = sAllFee+parseFloat(premiumFee);
        if($("#balanceTypeWithZb").val()==1 && $("#feeStatus").val()==1){//到付
            //现付费用
            //var ysdfaccruedfee = $("#df_accrued_fee").html()==""?0:$("#df_accrued_fee").html();
            //var sdfaccruedfee = parseFloat(ysdfaccruedfee)-parseFloat(ysPremiumFee);
            //var dfaccruedfee = sdfaccruedfee + parseFloat(premiumFee);
            //$("#df_accrued_fee").html( dfaccruedfee+ "元");
            //$("#xfyfFeeWithZb").val(dfaccruedfee);//现付费用
            $("#df_fee_aggravate").html(allFee + "元");
            $("#allFee").val(allFee);
            //应收差价
            calculateDfSpread();
            //发票费修改
            invoiceFee1ByFeeChange();
        }
        if($("#balanceTypeWithZb").val()==0 && $("#feeStatus").val()==1){//现付
            $("#xf_fee_aggravate").html(allFee + "元");
            $("#allFee").val(allFee);
            //应收差价
            calculateDfSpread();
            //发票费修改
            invoiceFee0ByFeeChange();
        }
    });

    //到付时，别的费用变动，开票费修改
    var invoiceFee1ByFeeChange =  function(){
        if($("#isOpenTicket").is(':checked')){
            var dffreightFee = parseFloat($("#df_freight_fee").html());
            var dfaddvaluesFee = parseFloat($("#df_addvalues_fee").html());
            var dfsendGoodFee = parseFloat($("#df_send_fee").html());
            var dfpremiumFee = parseFloat($("#df_premium_fee").html());
            //除开票费的合计
            var exInvoiceSum = dffreightFee + dfaddvaluesFee + dfsendGoodFee + dfpremiumFee;
            var ticketFee = Math.round(exInvoiceSum * 0.11);
            $("#invoiceFee").val(ticketFee);
            $("#df_invoice_fee").html(ticketFee + "元");
            var dffeeaggravate = exInvoiceSum + ticketFee;
            $("#df_fee_aggravate").html(dffeeaggravate + "元");
            $("#allFee").val(dffeeaggravate);
            //var signedReceiveFee = $("#signedReceiveFee").val()==""?0:$("#signedReceiveFee").val();
            //var xffee = dfpremiumFee + ticketFee + parseFloat(signedReceiveFee);
            //$("#df_accrued_fee").html(xffee + "元");//现付费用
            //$("#xfyfFeeWithZb").val(xffee);
        }
    }

    //现付时，别的费用变动，开票费修改
    var invoiceFee0ByFeeChange =  function(){
        if($("#isOpenTicket").is(':checked')){
            var xffreightFee = parseFloat($("#xf_freight_fee").html());
            var xfaddvaluesFee = parseFloat($("#xf_addvalues_fee").html());
            var xfsendGoodFee = parseFloat($("#xf_send_fee").html());
            var xfpremiumFee = parseFloat($("#xf_premium_fee").html());
            //除开票费的合计
            var exInvoiceSum = xffreightFee + xfaddvaluesFee + xfsendGoodFee + xfpremiumFee;
            var ticketFee = Math.round(exInvoiceSum * 0.11);
            $("#invoiceFee").val(ticketFee);
            $("#xf_invoice_fee").html(ticketFee + "元");
            var xffeeaggravate = exInvoiceSum + ticketFee;
            $("#xf_fee_aggravate").html(xffeeaggravate + "元");
            $("#allFee").val(xffeeaggravate);
        }
    }

    //资费说明
    $(".s-sm").click(function(){
        window.open("../waybill/feenote");
    });

    //是否开票
    $("#isOpenTicket").click(function(){
        if($("#balanceTypeWithZb").val()!="") {
            var ticketFee = $("#invoiceFee").val()==""?0:$("#invoiceFee").val();
            if (!$(this).is(':checked')) {//取消选中
                //清空发票信息
                cleanInvoiceInfo();
                if($("#balanceTypeWithZb").val()==0 && $("#feeStatus").val()==1) {//现付
                    var xffeeaggravate = parseFloat($("#xf_fee_aggravate").html()) - ticketFee
                    $("#xf_fee_aggravate").html(xffeeaggravate + "元");
                    $("#allFee").val(xffeeaggravate);
                    $("#xf_invoice_fee").html("0元");

                }
                if($("#balanceTypeWithZb").val()==1 && $("#feeStatus").val()==1) {//到付
                    var dffeeaggravate = parseFloat($("#df_fee_aggravate").html()) - ticketFee;
                    $("#df_fee_aggravate").html(dffeeaggravate + "元");
                    $("#allFee").val(dffeeaggravate);
                    $("#df_invoice_fee").html("0元");
                    //var xffee = parseFloat($("#df_accrued_fee").html()) - ticketFee;
                    //$("#df_accrued_fee").html(xffee + "元");
                    //$("#xfyfFeeWithZb").val(xffee);
                }
            } else {//选中
                if($("#balanceTypeWithZb").val()==1) {//到付
                    $("#isOpenTicket").attr('checked',false);
                    layer.tips("需要发票不能选择到付", "#isOpenTicket");
                    return;
                }
                /*if($("#balanceTypeWithZb").val()==1 && $("#feeStatus").val()==1){//到付
                    var sdfaccruedfee = parseFloat($("#df_accrued_fee").html())-ticketFee;
                    var dffreightFee = parseFloat($("#df_freight_fee").html());
                    var dfaddvaluesFee = parseFloat($("#df_addvalues_fee").html());
                    var dfsendGoodFee = parseFloat($("#df_send_fee").html());
                    var dfpremiumFee = parseFloat($("#df_premium_fee").html());
                    var ticketFee = Math.round((dffreightFee + dfaddvaluesFee + dfsendGoodFee + dfpremiumFee) * 0.11);
                    $("#df_invoice_fee").html(ticketFee + "元");
                    var dffeeaggravate = parseFloat($("#df_fee_aggravate").html()) + ticketFee;
                    $("#df_fee_aggravate").html(dffeeaggravate + "元");
                    $("#allFee").val(dffeeaggravate);
                    $("#df_accrued_fee").html((sdfaccruedfee + ticketFee) + "元");
                    $("#xfyfFeeWithZb").val(sdfaccruedfee + ticketFee);
                    $("#invoiceFee").val(ticketFee);
                }*/
                if($("#balanceTypeWithZb").val()==0 && $("#feeStatus").val()==1){//现付
                    var xffreightFee = parseFloat($("#xf_freight_fee").html());
                    var xfaddvaluesFee = parseFloat($("#xf_addvalues_fee").html());
                    var xfsendGoodFee = parseFloat($("#xf_send_fee").html());
                    var xfpremiumFee = parseFloat($("#xf_premium_fee").html());
                    var ticketFee = Math.round((xffreightFee + xfaddvaluesFee + xfsendGoodFee + xfpremiumFee) * 0.11);
                    $("#xf_invoice_fee").html(ticketFee + "元");
                    var xffeeaggravate = parseFloat($("#xf_fee_aggravate").html()) + ticketFee;
                    $("#xf_fee_aggravate").html(xffeeaggravate + "元");
                    $("#allFee").val(xffeeaggravate);
                    $("#invoiceFee").val(ticketFee);
                }

            }
        }else{
            if (!$(this).is(':checked')) {//取消选中
                //清空发票信息
                cleanInvoiceInfo();
            }
        }
    });

    //清空发票信息
    var cleanInvoiceInfo = function(){
        $("#invoiceFee").val("");
        $("#companyName").val("");
        $("#consigneeName").val("");
        $("#consigneeProvinceId").val("");
        $("#consigneeCityId").val("");
        $("#consigneeCountyId").val("");
        $("#consigneeProvince").val("");
        $("#consigneeCity").val("");
        $("#consigneeCounty").val("");
        $("#consigneeAddress").val("");
        $("#consigneeMobile").val("");
    }
    //应收差价（应收差价=收货人到付费用-运费-上楼费-卸货费-送货费）
    $("#dfyfFeeWithZb").keyup(function() {
        var dfFee = $("#dfyfFeeWithZb").val()==""?0:$("#dfyfFeeWithZb").val();
        if(dfFee.length>0){
            if(!(/^\d+(\.\d{0,2})?$/.test(dfFee) && dfFee.length<12 && dfFee>0)){
                $("#dfyfFeeWithZb").val("");
                $("#dfyfFeeWithZb").focus();
                layer.tips("到付费用只能大于0，且小数位只能2位，最多11位", "#dfyfFeeWithZb");
                return;
            }
        }
        if($("#feeStatus").val()==1){//有报价时，到付费用才有效联动
            var zfee = parseFloat($("#allFee").val());
            //var premiumFee = $("#premiumFee").val()==""?0:$("#premiumFee").val();
            //var signedReceiveFee = $("#signedReceiveFee").val()==""?0:$("#signedReceiveFee").val();
            //var invoiceFee = $("#invoiceFee").val()==""?0:$("#invoiceFee").val();
            //var xffee = parseFloat(premiumFee)+parseFloat(signedReceiveFee)+parseFloat(invoiceFee);
            if(dfFee<zfee){
                $("#spread_span").html("应付费用：");
                $("#fydytips").css("display","none");
                $("#fybztips").css("display","inline-block");
                //var accruedFee = zfee-dfFee;
                //$("#xfyfFeeWithZb").val(accruedFee);
                //$("#df_accrued_fee").html(accruedFee+"元");
                //$("#xftips").css("display","block");
            }else{
                $("#spread_span").html("应收差价：");
                $("#fybztips").css("display","none");
                if(dfFee == zfee){
                    $("#fydytips").css("display","inline-block");
                }
                //$("#xfyfFeeWithZb").val(xffee);
                //$("#df_accrued_fee").html(xffee+"元");
            }
            //var freightFee = $("#freightFee").val()==""?0:$("#freightFee").val();
            //var upstairsFee = $("#upstairsFee").val()==""?0:$("#upstairsFee").val();
            //var unloadFee = $("#unloadFee").val()==""?0:$("#unloadFee").val();
            //var sendGoodFee = $("#sendGoodFee").val()==""?0:$("#sendGoodFee").val();
            //$("#df_spread").html((parseFloat(dfFee) - parseFloat(freightFee) - parseFloat(upstairsFee) - parseFloat(unloadFee) -parseFloat(sendGoodFee)) + "元");
            $("#df_spread").html(Math.abs(zfee-dfFee)+"元");
        }
    });

    //计算应收差价
    var calculateDfSpread = function(){
        $("#xftips").css("display","none");
        var dfyfFeeWithZb = $("#dfyfFeeWithZb").val()==""?0:$("#dfyfFeeWithZb").val();
        var zfee = parseFloat($("#allFee").val());
        //var premiumFee = $("#premiumFee").val()==""?0:$("#premiumFee").val();
        //var signedReceiveFee = $("#signedReceiveFee").val()==""?0:$("#signedReceiveFee").val();
        //var invoiceFee = $("#invoiceFee").val()==""?0:$("#invoiceFee").val();
        //var xffee = parseFloat(premiumFee)+parseFloat(signedReceiveFee)+parseFloat(invoiceFee);
        if(dfyfFeeWithZb<zfee){
            $("#spread_span").html("应付费用");
            $("#fydytips").css("display","none");
            $("#fybztips").css("display","block");
            //var accruedFee = zfee-dfyfFeeWithZb;
            //$("#xfyfFeeWithZb").val(accruedFee);
            //$("#df_accrued_fee").html(accruedFee+"元");
            //$("#xftips").css("display","block");
        }else{
            $("#spread_span").html("应收差价");
            $("#fybztips").css("display","none");
            if(dfyfFeeWithZb == zfee){
                $("#fydytips").css("display","block");
            }
            //$("#xfyfFeeWithZb").val(xffee);
            //$("#df_accrued_fee").html(xffee+"元");
        }
        //------------------
        //var freightFee = $("#freightFee").val()==""?0:$("#freightFee").val();
        //var upstairsFee = $("#upstairsFee").val()==""?0:$("#upstairsFee").val();
        //var unloadFee = $("#unloadFee").val()==""?0:$("#unloadFee").val();
        //var sendGoodFee = $("#sendGoodFee").val()==""?0:$("#sendGoodFee").val();
        //$("#df_spread").html((parseFloat(dfyfFeeWithZb) - parseFloat(freightFee) - parseFloat(upstairsFee) - parseFloat(unloadFee) -parseFloat(sendGoodFee)) + "元");
        $("#df_spread").html(Math.abs(zfee-dfyfFeeWithZb)+"元");
    }
    //计算费用，加载图标(用于计算完成关闭)
    var loadIndex = "";
    //现付
    $("#payStyleXf").click(function() {
        if($("#allocCenterId").val()==""){
            layer.tips("计算费用前请选择集散中心", "#selectPayStyle");
            return;
        }
        //计算运费、送货费、开票费、增值费、应付总额
        /*var index1 = layer.open({
            type: 1,
            time:2000,
            title: false,
            closeBtn: 0,
            shadeClose: true,
            skin: '',
            content: ''
        });*/
        loadIndex = layer.load(0, {
            shade: [0.1,'#fff'], //0.1透明度的白色背景
            time:100
        });
        if($("#isNeedEnterDepot").val()==1 && $("#depotType").val()==""){
            layer.tips("请选择仓库类型", "#depotType");
            return;
        }
        if($("#isUpstairsIncre").val()==1 && $("#isElevator").val()==""){
            layer.tips("请选择是否有电梯", "#isElevator");
            return;
        }
        $("#payStyleDf").css("background","white");
        $("#dfyfFeeWithZb").rules("remove");
        $("#balanceTypeWithZb").val(0);//现付
        //计算运费、送货费、开票费、增值费、应付总额
        xfAjax();
        $("#payStyleXf").css("background","orangered");
    });

    //到付
    $("#payStyleDf").click(function() {
        if($("#allocCenterId").val()==""){
            layer.tips("计算费用前请选择集散中心", "#selectPayStyle");
            return;
        }
        if ($("#isOpenTicket").is(':checked')) {//到付不允许开票
            layer.tips("需要发票不能选择到付", "#selectPayStyle");
            return;
        }
        if ($("#isNeedEnterDepot").attr("value") == 1) {//到付不允许进仓
            layer.tips("需要进仓不能选择到付", "#selectPayStyle");
            return;
        }
        if($("#isUpstairsIncre").val()==1 && $("#isElevator").val()==""){
            layer.tips("请选择是否有电梯", "#isElevator");
            return;
        }
       /* var index1 = layer.open({
            type: 1,
            time:2000,
            title: false,
            closeBtn: 0,
            shadeClose: true,
            skin: '',
            content: ''
        });*/
        loadIndex = layer.load(0, {
            shade: [0.1,'#fff'], //0.1透明度的白色背景
            time:100
        });
        $("#payStyleXf").css("background","white");
        $("#balanceTypeWithZb").val('1');//1到付
        //计算运费、送货费、开票费、增值费、应付总额
        dfAjax();
        $("#payStyleDf").css("background","orangered");
        //点击到付后,到付费用增加校验必须有值
        $("#dfyfFeeWithZb").rules("add",{required:true,messages:{ required:"请输入到付费用,且只能大于0,小数位只能2位,最多11位"}});
    });

    //现付计算费用提交
    var xfAjax = function(){
        //清除到付中的，现付金额和到付金额
        //$("#xfyfFeeWithZb").val("");
        $("#dfyfFeeWithZb").val("");
        var isOpenTicket="";
        if($("#isOpenTicket").is(':checked')){
            isOpenTicket = $("#isOpenTicket").val();
        }
        $.ajax({
            url: "../waybill/calculatefee",
            type: "POST",
            data: {
                //hPremiumFee:$("#premiumFee").val(),
                hInsuredFee:$("#insuredFee").val(),
                hIsNeedReceipt:$("#isNeedReceipt").val(),
                hIsOpenTicket:isOpenTicket,
                hBalanceTypeWithZb: 0,//0现付
                hIsNeedEnterDepot:$("#isNeedEnterDepot").val(),
                hDepotType:$("#depotType").val(),
                hIsUpstairsIncre: $("#isUpstairsIncre").val(),
                hIsStandard:$("#hIsStandard").val(),
                hFloorNum:$("#floorNum").val(),
                hIsElevator:$("#isElevator").val(),
                hIsUnloadIncre: $("#isUnloadIncre").val(),
                hNum:$("#hNum").val(),
                hVolume:$("#hVolume").val(),
                hWeight:$("#hWeight").val(),
                hConnectType:$("#connectType").val(),
                hReceiveCountryId:$("#connectType").val(),
                hIsExpress:$("#isExpress").val(),
                hAllocCenterId:$("#allocCenterId").val(),
                hReceiveProvinceId:$("#hReceiveProvinceId").val(),
                hReceiveCityId:$("#hReceiveCityId").val(),
                hReceiveCountryId:$("#hReceiveCountryId").val(),
                hReceiveProvinceName:$("#hReceiveProvinceName").val(),
                hReceiveCityName:$("#hReceiveCityName").val(),
                hReceiveCountryName:$("#hReceiveCountryName").val(),
                hReceiveAddress:$("#hReceiveAddress").val(),
                hCategoryId:$("#hCategoryId").val(),
                hPack:$("#hPack").val()
            },
            success: function (data) {
                if(data.status==-3) {//-3运费计算不出,
                    /*$("#premiumFee").val("");
                    $("#enterFee").val("");
                    $("#upstairsFee").val("");
                    $("#unloadFee").val("");
                    $("#signedReceiveFee").val("");*/
                    $("#xf-no-freightfee-tip-div").css("display", "block");
                    $("#xf-no-sendfee-tip-div").css("display", "none");
                    $("#xf-div").css("display","none");
                    $("#df-div").css("display","none");
                    $("#feeStatus").val("-3");//用于后台过滤费用操作，不执行
                }else if(data.status==-1){//-1送货费计算不出
                    /*$("#premiumFee").val("");
                    $("#enterFee").val("");
                    $("#upstairsFee").val("");
                    $("#unloadFee").val("");
                    $("#signedReceiveFee").val("");*/
                    $("#xf-no-sendfee-tip-div").css("display", "block");
                    $("#xf-no-freightfee-tip-div").css("display", "none");
                    $("#xf-div").css("display","none");
                    $("#df-div").css("display","none");
                    $("#feeStatus").val("-1");//用于后台过滤费用操作，不执行
                }else {
                    $("#premiumFee").val(data.premiumFee==0?"":data.premiumFee);
                    $("#freightFee").val(data.mainLineFee);
                    $("#sendGoodFee").val(data.sendGoodFee);
                    $("#invoiceFee").val(data.openTicketFee==0?"":data.openTicketFee);
                    $("#enterFee").val(data.enterDepotFee==0?"":data.enterDepotFee);
                    $("#upstairsFee").val(data.upstairsFee==0?"":data.upstairsFee);
                    $("#unloadFee").val(data.unloadFee==0?"":data.unloadFee);
                    $("#signedReceiveFee").val(data.receiptFee==0?"":data.receiptFee);
                    $("#feeStatus").val("1");//用于后台过滤费用操作，执行
                    $("#allFee").val(data.feeAggravate);//应付总额
                    //--------------
                    $("#xf_freight_fee").html(data.mainLineFee + "元");
                    $("#xf_send_fee").html(data.sendGoodFee + "元");
                    $("#xf_premium_fee").html(data.premiumFee+ "元")
                    $("#xf_invoice_fee").html(data.openTicketFee + "元");
                    $("#xf_enter_fee").html(data.enterDepotFee + "元");
                    $("#xf_upstairs_fee").html(data.upstairsFee + "元");
                    $("#xf_unload_fee").html(data.unloadFee + "元");
                    $("#xf_signedreceive_fee").html(data.receiptFee + "元");
                    if($("#isExpress").attr("value")==1){
                        $("#xf_Express_fee").html("费用另议");
                    }
                    //---------------
                    $("#xf_addvalues_fee").html(data.addvaluesFee + "元");
                    $("#xf_fee_aggravate").html(data.feeAggravate + "元");
                    //----------------
                    $("#xf-no-freightfee-tip-div").css("display", "none");
                    $("#xf-no-sendfee-tip-div").css("display", "none");
                    $("#df-div").css("display","none");
                    $("#xf-div").css("display","block");
                }
                //关闭加载效果
                layer.close(loadIndex);
                //layer.close(index1);
            }
        });
    }
    //到付计算费用提交
    var dfAjax = function(){
        var isOpenTicket="";
        if($("#isOpenTicket").is(':checked')){
            isOpenTicket = $("#isOpenTicket").val();
        }
        $.ajax({
            url: "../waybill/calculatefee",
            type: "POST",
            data: {
                //hPremiumFee: $("#premiumFee").val(),
                hInsuredFee:$("#insuredFee").val(),
                hIsNeedReceipt: $("#isNeedReceipt").val(),
                hIsOpenTicket: isOpenTicket,
                hBalanceTypeWithZb: 1,//1到付
                hIsNeedEnterDepot: $("#isNeedEnterDepot").val(),
                hDepotType: $("#depotType").val(),
                hIsUpstairsIncre: $("#isUpstairsIncre").val(),
                hIsStandard: $("#hIsStandard").val(),
                hFloorNum: $("#floorNum").val(),
                hIsElevator: $("#isElevator").val(),
                hIsUnloadIncre: $("#isUnloadIncre").val(),
                hNum:$("#hNum").val(),
                hVolume: $("#hVolume").val(),
                hWeight: $("#hWeight").val(),
                hConnectType: $("#connectType").val(),
                hReceiveCountryId: $("#connectType").val(),
                hIsExpress: $("#isExpress").val(),
                hAllocCenterId: $("#allocCenterId").val(),
                hReceiveProvinceId: $("#hReceiveProvinceId").val(),
                hReceiveCityId: $("#hReceiveCityId").val(),
                hReceiveCountryId: $("#hReceiveCountryId").val(),
                hReceiveProvinceName: $("#hReceiveProvinceName").val(),
                hReceiveCityName: $("#hReceiveCityName").val(),
                hReceiveCountryName: $("#hReceiveCountryName").val(),
                hReceiveAddress: $("#hReceiveAddress").val(),
                hCategoryId: $("#hCategoryId").val(),
                hPack: $("#hPack").val()
            },
            success: function (data) {
                if(data.status==-3) {//-3运费计算不出,
                    /*$("#premiumFee").val("");
                    $("#enterFee").val("");
                    $("#upstairsFee").val("");
                    $("#unloadFee").val("");
                    $("#signedReceiveFee").val("");*/
                    $("#df-div").css("display", "block");
                    $("#dfval-tip-div").css("display", "block");
                    $("#no-freightfee-tip-div").css("display", "block");
                    $("#xf-no-freightfee-tip-div").css("display", "none");
                    $("#xf-no-sendfee-tip-div").css("display", "none");
                    $("#no-sendfee-tip-div").css("display", "none");
                    $("#xf-div").css("display", "none");
                    $("#dfresult-tip-div").css("display", "none");
                    $("#feeStatus").val("-3");//用于后台过滤费用操作，不执行
                }else if(data.status==-1){//-1送货费计算不出
                    /*$("#premiumFee").val("");
                    $("#enterFee").val("");
                    $("#upstairsFee").val("");
                    $("#unloadFee").val("");
                    $("#signedReceiveFee").val("");*/
                    $("#df-div").css("display", "block");
                    $("#dfval-tip-div").css("display", "block");
                    $("#no-sendfee-tip-div").css("display", "block");
                    $("#xf-no-freightfee-tip-div").css("display", "none");
                    $("#xf-no-sendfee-tip-div").css("display", "none");
                    $("#no-freightfee-tip-div").css("display", "none");
                    $("#xf-div").css("display", "none");
                    $("#dfresult-tip-div").css("display", "none");
                    $("#feeStatus").val("-1");//用于后台过滤费用操作，不执行
                }else {
                    $("#premiumFee").val(data.premiumFee==0?"":data.premiumFee);
                    $("#freightFee").val(data.mainLineFee);
                    $("#sendGoodFee").val(data.sendGoodFee);
                    $("#invoiceFee").val(data.openTicketFee==0?"":data.openTicketFee);
                    $("#enterFee").val(data.enterDepotFee==0?"":data.enterDepotFee);
                    $("#upstairsFee").val(data.upstairsFee==0?"":data.upstairsFee);
                    $("#unloadFee").val(data.unloadFee==0?"":data.unloadFee);
                    $("#signedReceiveFee").val(data.receiptFee==0?"":data.receiptFee);
                    $("#feeStatus").val("1");//用于后台过滤费用操作
                    $("#allFee").val(data.feeAggravate);//费用总计
                    //--------------
                    $("#df_freight_fee").html(data.mainLineFee + "元");
                    $("#df_send_fee").html(data.sendGoodFee + "元");
                    $("#df_premium_fee").html(data.premiumFee+ "元")
                    $("#df_invoice_fee").html(data.openTicketFee + "元");
                    $("#df_enter_fee").html(data.enterDepotFee + "元");
                    $("#df_upstairs_fee").html(data.upstairsFee + "元");
                    $("#df_unload_fee").html(data.unloadFee + "元");
                    $("#df_signedreceive_fee").html(data.receiptFee + "元");
                    if($("#isExpress").attr("value")==1){
                        $("#df_Express_fee").html("费用另议");
                    }
                    //---------------
                    $("#df_addvalues_fee").html(data.addvaluesFee + "元");
                    $("#df_fee_aggravate").html(data.feeAggravate + "元");
                    var dfyfFeeWithZb = $("#dfyfFeeWithZb").val()==""?0:$("#dfyfFeeWithZb").val();
                    $("#df_spread").html(Math.abs(data.feeAggravate-dfyfFeeWithZb) + "元");
                    //var premiumFee = $("#premiumFee").val()==""?0:$("#premiumFee").val();
                    //$("#df_accrued_fee").html((data.receiptFee + data.openTicketFee + parseFloat(premiumFee)) + "元");
                    //$("#xfyfFeeWithZb").val((data.receiptFee + data.openTicketFee + parseFloat(premiumFee)));//现付费用
                    //----------------
                    $("#xf-no-freightfee-tip-div").css("display", "none");
                    $("#xf-no-sendfee-tip-div").css("display", "none");
                    $("#no-freightfee-tip-div").css("display", "none");
                    $("#no-sendfee-tip-div").css("display", "none");
                    $("#xf-div").css("display", "none");
                    $("#df-div").css("display", "block");
                    $("#dfval-tip-div").css("display", "block");
                    $("#dfresult-tip-div").css("display", "block");
                }
                layer.close(loadIndex);
                //layer.close(index1);
            }
        });
    }
    //返回修改
    $("#return_btn").click(function(){
            $.ajax({
                url: "../waybill/edit",
                type: "POST",
                data: $("#orderConfForm").serialize(),
                success: function (data) {
                    location.href = "../waybill/add?action=return";
                }
            });
        });
});
