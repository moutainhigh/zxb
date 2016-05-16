

$(function() {

    var $updatePwdForm = $("#updatePwdForm");
    var $submitBtn = $("#submitBtn");
    var $errorMsg = $("#errorMsg");
    var updatePwdIndex;
    var icon = "";
    function doSubmit(){
        return $updatePwdForm.submit();
    }
    //点击基本信息 跳转到基本信息页面
    $("#baseAccount").click(function(){
        location.href = "../account/personBase";
    });
    $updatePwdForm.validate({
        rules:{
            password :{
                alpwd:true,
                required:true,
                minlength: 6,
                maxlength:16
            },
            confirm_password:{
                alpwd:true,
                required:true,
                minlength: 6,
                maxlength:16,
                equalTo: "#password"
            },
            oldpassword:{
                alpwd:true,
                required:true,
                minlength: 6,
                maxlength:16
            }
        },
        messages:{
            password:{
                alpwd:"只能包括英文字母,数字和特殊字符",
                required:icon+"请输入新密码",
                minlength: icon + "密码必须6个字符以上",
                maxlength: icon + "密码必须16个字符以下"
                },
            confirm_password:{
                alpwd:"只能包括英文字母,数字和特殊字符",
                required:icon+"请输入确认密码",
                minlength: icon + "密码必须6个字符以上",
                maxlength: icon + "密码必须16个字符以下",
                equalTo:"两次密码输入不一致"},
            oldpassword:{
                alpwd:"只能包括英文字母,数字和特殊字符",
                required:icon+"请输入密码",
                minlength: icon + "密码必须6个字符以上",
                maxlength: icon + "密码必须16个字符以下",
                }
        },
        showErrors:function(errorMap,errorList) {
            if(errorList && errorList.length > 0){
                updatePwdIndex = layer.tips(errorList[0].message, '#'+errorList[0].element.id,{tips:[2, '#ef5b00']});
            }else{
                layer.close(updatePwdIndex);
            }
        },
        focusInvalid:true,
        submitHandler:function(){
            $.ajax({
                url: "../lspUser/updatepwd",
                type: "POST",
                data: $updatePwdForm.serialize(),
                beforeSend: function() {
                    $submitBtn.html("请稍后...");
                    $submitBtn.unbind("click");

                },
                error: function () {
                    $submitBtn.html("保存");
                },
                success: function (data) {
                    if(data.status>0){//
                        $submitBtn.html(data.msg);
                        layer.msg(data.msg);
                        setTimeout(function(){
                            if(data.data=="index"){
                                location.href = "../lspUser/index";
                            }else{
                                location.href = "../account/securitySettings";
                            }
                        },500);
                    }else{
                        layer.msg(data.msg);
                        //layer.tips(data.msg,"#oldpassword");
                        $submitBtn.html("保存");
                        $submitBtn.bind("click",function(){
                            doSubmit();
                            return false;
                        });
                    }
                },
                complete:function(){
                }
            });
        }
    });

    $submitBtn.click(function(){
        doSubmit();
        return false;
    });
});
