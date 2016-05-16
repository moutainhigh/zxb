/**
 * Created by Administrator on 2016/3/30.
 */
$().ready(function() {


    //显示什么是标准件tips
    var standard_des = "1、	纸箱包装标准件：单件重量不超过30公斤，单件体积不超过0.3方，单件长宽尺寸均不得超过0.8米<br>"
                      +"2、	桶装包装标准件：单件重量不超过40公斤，单件体积不超过0.3方，单件长宽高尺寸不得超过0.5米<br>"
                      +"3、	木箱包装标准件：单件重量不超过50公斤，单件体积不超过0.5方，单件长宽高尺寸均不得超过1米<br>"
                      +"4、	编织袋包装标准件：单件重量不超过40公斤，单件体积不超过0.3方，单件长宽高尺寸不超过0.8米，货物可叠放2米";
    var standard_index;
    $("#standard_tips").mouseover(function(){
        standard_index = layer.tips(standard_des, "#standard_tips",{
            tips: [1, '#3595CC'],
            time: 5000,
            area: ['650px', '130px']
        });
    });
    $("#standard_tips").mouseout(function(){
        layer.close(standard_index);
    });
    //显示运输说明
    var memo_des="用户在填写货物信息时，需按照以下要求填写：<br>"
        +"1、	用户应严格遵守国家有关公路运输的法规、法律，禁止运输易燃、易爆、有毒、有腐蚀性、放射性等危险及违禁物品<br>"
        +"2、	针对于重量在小于500公斤及大于3吨的货物，专线物流服务平台将保留不得提供服务的权利<br>"
        +"3、	货物最大单件长度不得大于4米<br>"
        +"4、	货物最大单件宽带不得大于1.8米<br>"
        +"5、	货物最大单件高度不得大于2米";
    var memo_index;
    $("#memo_tips").mouseover(function(){
        memo_index = layer.tips(memo_des, "#memo_tips",{
            tips: [1, '#3595CC'],
            time: 5000,
            area: ['480px', '180px']
        });
    });
    $("#memo_tips").mouseout(function(){
        layer.close(memo_index);
    });

    var $orderForm = $("#orderForm");
    var $orderBtn = $(".ti-jiao");
    $orderBtn.click(function(){
        $orderForm.submit();
        return false;
    });
    $("#orderForm").validate({
        ignore: "",
        groups: {
            shipper_phone: "shipperLinkMobile shipperLinkPhone",   //shipper_phone定义的组名
            receive_phone: "receiveLinkMobile receiveLinkPhone"
        },
        rules: {
            goodCategoryId:{required: true},
            goodName: {required: true},//isChar:true
            pack:{required: true},
            num: {required: true, good_num:true,good_num_length:true},
            offerWeight: {required: true, gre0Number:true,good_weightvolume_length:true},
            offerVolume: {required: true, gre0Number:true,good_weightvolume_length:true},
            isStandard: {required: true},
            loadUnloadType:{required: true},
            shipperLinkName:{required: true},
            //shipperCustomerName:{required: true},
            shipperProvinceId:{required: true},
            shipperCityId:{required: true},
            shipperCountryId:{required: true},
            shipperAddress:{required: true},
            shipperLinkMobile:{
                required: {
                    depends:function(){ //二选一
                        return ($('#shipperLinkPhone').val()=="");
                    }
                },
                isMobile:true
            },
            shipperLinkPhone:{
                required: {
                    depends: function(){ //二选一
                        return ($('#shipperLinkMobile').val()=="");
                    }
                },
                isTelphone:true
            },
            receiveLinkName:{required: true},
            //receiveName:{required: true},
            receiveProvinceId:{required: true},
            receiveCityId:{required: true},
            receiveCountryId:{required: true},
            receiveAddress:{required: true},
            receiveLinkMobile:{
                required: {
                    depends:function(){ //二选一
                        return ($('#receiveLinkPhone').val()=="");
                    }
                },
                isMobile:true
            },
            receiveLinkPhone:{
                required: {
                    depends: function(){ //二选一
                        return ($('#receiveLinkMobile').val()=="");
                    }
                },
                isTelphone:true
            },
            agreement:{required:true}
        },messages: {
            goodCategoryId:{required: "请选择货物品类"},
            goodName: {required: "请输入货物名称"},
            pack: {required: "请选择货物包装"},
            num: {required: "请输入货物件数",good_num:"货物件数必须为大于0整数",good_num_length:"货物件数长度为1～8"},
            offerWeight: {required: "请输入货物总重量",gre0Number:"货物重量必须为大于0数字,且小数位只允许2位",good_weightvolume_length:"货物重量长度为1～6"},
            offerVolume:{required: "请输入货物总体积",gre0Number:"货物体积必须为大于0数字,且小数位只允许2位",good_weightvolume_length:"货物体积长度为1～6"},
            isStandard: {required: "请选择货物是否标准件"},
            loadUnloadType:{required: "请选择货物装卸方式"},
            shipperLinkName:{required: "请输入发货方联系人"},
            //shipperCustomerName:{required: "请输入发货方公司名称"},
            shipperProvinceId:{required: "请选择发货方所在省份"},
            shipperCityId:{required: "请选择发货方所在市"},
            shipperCountryId:{required: "请选择发货方所在区县"},
            shipperAddress:{required: "请输入发货方详细地址"},
            shipperLinkMobile: {required: "请输入发货方手机号码",isMobile: "手机号码格式不对"},
            shipperLinkPhone:{required: "请输入发货方固定电话",isTelphone: "座机号码格式不对"},
            receiveLinkName:{required: "请输入收货方联系人"},
            //receiveName:{required: "请输入收货方公司名称"},
            receiveProvinceId:{required: "请选择收货方所在省份"},
            receiveCityId:{required: "请选择收货方所在市"},
            receiveCountryId:{required: "请选择收货方所在区县"},
            receiveAddress:{required: "请输入收货方详细地址"},
            receiveLinkMobile:{required: "请输入收货方手机号码",isMobile: "手机号码格式不对"},
            receiveLinkPhone:{required: "请输入收货方固定电话",isTelphone: "座机号码格式不对"},
            positiveInteger:{required: "货物件数只能是正整数"},
            agreement:{required: "请选择同意运输协议"}
        },
        showErrors:function(errorMap,errorList) {
            if(errorList && errorList.length > 0) {
                if (errorList[0].element.name=="shipperLinkMobile") {
                    layer.tips(errorList[0].message, "#shipperLinkPhone");
                } else if(errorList[0].element.name=="receiveLinkMobile") {
                    layer.tips(errorList[0].message, "#receiveLinkPhone");
                }else{
                        layer.tips(errorList[0].message, "#" + errorList[0].element.name);
                }
            }else{

            }
        },
        focusInvalid:true,
        submitHandler:function(){
            $.ajax({
                url: "../waybill/submit",
                type: "POST",
                data: $orderForm.serialize(),
                success: function (data) {
                    if(data.status==1){
                        location.href = "../waybill/conf";
                    }
                    if(data.status==400){
                        layer.msg(data.msg);
                    }
                }
            });
        }
    });

    //----------------------
    $("#shipperLinkName").autocomplete({
        source: function( request, response ) {
            var term = request.term;
            /*if ( term in cache ) {
                response($.map(cache[term], function( item ) {
                    return {
                        lable:item.knowledge_id,
                        value:item.name
                    }
                }));
                return;
            }*/
            $.ajax({
                url: "../receicerShipper/queryreceivershipperinfobylspid",
                dataType: "json",
                data:{
                    userName: encodeURI(term),
                    type:0
                },
                success: function( data ) {
                    //cache[ term ] = data;
                    response($.map( data, function( item ) {
                        return {
                            value:item.linkName,
                            label:item.linkName+"     "+item.mobile,
                            companyName:item.companyName,
                            mobile:item.mobile,
                            telphone:item.telphone,
                            provinceId:item.provinceId,
                            provinceName:item.provinceName,
                            cityId:item.cityId,
                            cityName:item.cityName,
                            countryId:item.countryId,
                            countryName:item.countryName,
                            detailedAddress:item.detailedAddress
                        }
                    }));
                }
            });
        },
        minLength: 1,
        select: function( event, ui ) {
            $("#shipperCustomerName").val(ui.item.companyName);
            $("input[name='shipperProvinceName']").val(ui.item.provinceName);
            $("input[name='shipperCityName']").val(ui.item.cityName);
            $("input[name='shipperCountryName']").val(ui.item.countryName);

            $("select[name='shipperProvinceId']").val(ui.item.provinceId).trigger("change");



           var cityIntervalId = window.setInterval(function(){
               $("select[name='shipperCityId']").val(ui.item.cityId).trigger("change");

               if($("select[name='shipperCityId']").val()){
                   window.clearInterval(cityIntervalId);
               }
            },200);

            var countryIntervalId = window.setInterval(function(){
               $("select[name='shipperCountryId']").val(ui.item.countryId).trigger("change");
               if($("select[name='shipperCountryId']").val()){
                   window.clearInterval(countryIntervalId);
               }
            },200);

            $("#shipperAddress").val(ui.item.detailedAddress);
            $("#shipperLinkMobile").val(ui.item.mobile);
            $("#shipperLinkPhone").val(ui.item.telphone);
        }
    });

    $("#receiveLinkName").autocomplete({
        source: function( request, response ) {
            var term = request.term;
            /*if ( term in cache ) {
             response($.map(cache[term], function( item ) {
             return {
             lable:item.knowledge_id,
             value:item.name
             }
             }));
             return;
             }*/
            $.ajax({
                url: "../receicerShipper/queryreceivershipperinfobylspid",
                dataType: "json",
                data:{
                    userName: encodeURI(term),
                    type:1
                },
                success: function( data ) {
                    //cache[ term ] = data;
                    response($.map( data, function( item ) {
                        return {
                            value:item.linkName,
                            label:item.linkName+"     "+item.mobile,
                            companyName:item.companyName,
                            mobile:item.mobile,
                            telphone:item.telphone,
                            provinceId:item.provinceId,
                            provinceName:item.provinceName,
                            cityId:item.cityId,
                            cityName:item.cityName,
                            countryId:item.countryId,
                            countryName:item.countryName,
                            detailedAddress:item.detailedAddress
                        }
                    }));
                }
            });
        },
        minLength: 1,
        select: function( event, ui ) {
            $("#receiveName").val(ui.item.companyName);
            $("input[name='receiveProvinceName']").val(ui.item.provinceName);
            $("input[name='receiveCityName']").val(ui.item.cityName);
            $("input[name='receiveCountryName']").val(ui.item.countryName);


           /* $("select[name='receiveProvinceId']").find("option[value="+ui.item.provinceId+"]").attr("selected",true);
            $("select[name='receiveCityId']").val(ui.item.cityId);
            $("select[name='receiveCountryId']").val(ui.item.countryId);*/

            $("select[name='receiveProvinceId']").val(ui.item.provinceId).trigger("change");

            var receiveCityIntervalId = window.setInterval(function(){
                $("select[name='receiveCityId']").val(ui.item.cityId).trigger("change");
                if($("select[name='receiveCityId']").val()){
                    window.clearInterval(receiveCityIntervalId);
                }
            },20);

            var receiveCountryIntervalId = window.setInterval(function(){
                $("select[name='receiveCountryId']").val(ui.item.countryId).trigger("change");
                if($("select[name='receiveCountryId']").val()){
                    window.clearInterval(receiveCountryIntervalId);
                }
            },20);

            $("#receiveAddress").val(ui.item.detailedAddress);
            $("#receiveLinkMobile").val(ui.item.mobile);
            $("#receiveLinkPhone").val(ui.item.telphone);
        }
    });

});