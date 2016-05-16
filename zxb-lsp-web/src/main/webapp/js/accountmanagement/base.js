/**
 * 账户管理-我的资料管理
 * @author 朋朋
 * @version 1.0
 * @date 2016-04-13
 */

$(function () {
    //点击基本信息 刷新页面
    $("#base-info").click(function(){
        location.href="../account/personBase";
    });

    //点击安全设置
    $("#security-settings").click(function(){
        location.href="../account/securitySettings";
    });



    var $saveBaseInfo = $("#saveBaseInfo");
    var baseIndex;

    $("#save").click(function(){
        doUpdate();
        return false;
    });

    function doUpdate(){
        return $saveBaseInfo.submit();
    }
    $saveBaseInfo.validate({
        rules: {
            provinceId: {required: true},
            cityId: {required: true},
            countryId: {required: true},
            detailedAddress:{required: true},
            companyName: {
                enIsCharOrNum:true,
                required:true,
                minlength: 1,
                maxlength:30},
            realUserName: { CharOrNum:true,
                required: true,
                minlength: 1,
                maxlength:10,
            },
            telphone:{
                good_num:true
            },
        },messages: {
            provinceId: {required: "请选择省"},
            cityId: {required: "请选择市"},
            countryId: {required: "请选择县/区"},
            detailedAddress:{required: "请输入详细地址"},
            companyName: {
                enIsCharOrNum:"可输入汉字、英文字母和数字，不可输入空格",
                required:"请输入您的公司名称",
                minlength:"公司名至少输入1个字符",
                maxlength:"公司名最多输入30个字符"},
            realUserName: {
                CharOrNum:"请输入汉字或字母，不可输入空格",
                required: "请输入您的姓名",
                minlength: "姓名必须1个字符以上",
                maxlength:"姓名必须10个字符以内"
            },telphone:{
                good_num:"只能输入数字，且不能输入空格"
            },
        },

        showErrors:function(errorMap,errorList) {

            if(errorList && errorList.length > 0){
                baseIndex = layer.tips(errorList[0].message, '#'+errorList[0].element.id,{tips:[2, '#ef5b00']});
            }else{
                layer.close(baseIndex);
            }
        },
        focusInvalid:true,
        submitHandler:function(){
            $.ajax({
                url: "../account/saveBaseInfo",
                type: "POST",
                data: $saveBaseInfo.serialize(),
                beforeSend: function() {
                    $("#save").html("请稍后...");
                },
                error: function () {
                    $("#save").html("保存");

                },
                success: function (data) {
                    if(data){
                        layer.msg("修改成功");
                    }else{
                        layer.msg("修改失败");
                    }
                },
                complete:function(){

                }
            });
        }
    });

});
