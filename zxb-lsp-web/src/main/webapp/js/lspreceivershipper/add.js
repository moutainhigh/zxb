/**
 * Created by wangjh on 2016/4/5.
 */

$().ready(function() {
    var $type=$("#type");
    var $signupForm = $("#signupForm");
    var $saveBtn = $("#saveBtn");
    var $closeBtn = $("#closeBtn");

    var receiverAddIndex;
    function doSave(){
        return $signupForm.submit();
    }
    $signupForm.validate({
        rules: {
            linkName: {
                required: true
            },
            provinceId: {
                required: true
            },
            cityId: {
                required: true
            },
            countryId:{
                required: true
            },
            mobile:{
                required: true,
                mobile:true
            },
            detailedAddress: {
                required: true
            }
        },messages: {
            linkName: {
                required: "请输入联系人"
            },
            provinceId: "请选择省",
            cityId: "请选择市",
            countryId: "请选择区",
            mobile: {required:"请输入手机号码",mobile:"请输入正确的手机号码"},
            detailedAddress: "请输入详细地址"


        },

        showErrors:function(errorMap,errorList) {
            if (errorList && errorList.length > 0) {
                receiverAddIndex = layer.tips(errorList[0].message, '#' + errorList[0].element.id,{tips:[2, '#ef5b00']});
            } else {
                layer.close(receiverAddIndex);
            }
         },
        focusInvalid:true,
        submitHandler:function(){
            $.ajax({
                url: "../receicerShipper/add",
                type: "POST",
                data: $signupForm.serialize(),
                beforeSend: function() {
                    $saveBtn.html("请稍后...");
                    $saveBtn.unbind("cilck");
                },
                error: function () {
                    $saveBtn.html("保存");
                    $saveBtn.bind("click",function(){
                        doSave();
                        return false;
                    });
                },
                success: function (data) {
                    if(data){
                        window.parent.location.href = window.parent.document.getElementById("baseUrl").value;
                        var index = parent.layer.getFrameIndex(window.name); //获取窗口索引
                        parent.layer.close(index);
                        //location.href = zxb.SYS_PATH+"/receicerShipper/index?type="+$type.val();
                    }else{
                        layer.msg("新增失败");
                        $saveBtn.bind("click",function(){
                            doSave();
                            return false;
                        });
                    }
                },
                complete:function(){

                }
            });
        }
    });


    $saveBtn.click(function(){
        doSave();
        return false;
    });

    $closeBtn.on("click",function(){
        var index = parent.layer.getFrameIndex(window.name); //获取窗口索引
        parent.layer.close(index);
    });


    $("#provinceId").change(function(){
        $("#provinceName").val($(this).find("option:selected").text());
        //$("#countryName").val('');
        var provinceId = $(this).val();
        $.ajax({
            url:"../sbarea/city",
            type:"GET",
            data:{id:provinceId},
            success:function(data){
                var initHtml = "<option value='' selected>请选择</option>";
                $("#cityId").find("option").remove();
                $("#cityId").append(initHtml);
                $("#countryId").find("option").remove();
                $("#countryId").append(initHtml);
                $.each(data,function(n,value) {

                    var html = "<option value='"+value.id+"' >"+value.areaName+"</option>";
                    $("#cityId").append(html);
                });
                //$("#cityName").val($("#cityId").find("option:selected").text());
            }
        });
    });


    $("#cityId").change(function(){
        $("#cityName").val($(this).find("option:selected").text());
        var provinceId = $(this).val();
        $.ajax({
            url:"../sbarea/city",
            type:"GET",
            data:{id:provinceId},
            success:function(data){
                var initHtml = "<option value='' selected>请选择</option>";
                $("#countryId").find("option").remove();
                $("#countryId").append(initHtml);
                $.each(data,function(n,value) {

                    var html = "<option value='"+value.id+"' >"+value.areaName+"</option>";
                    $("#countryId").append(html);
                });
                //$("#countryName").val($("#countryId").find("option:selected").text());
            }
        });
    });

    $("#countryId").change(function(){
        $("#countryName").val($(this).find("option:selected").text());
    });
});