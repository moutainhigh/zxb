

$(function() {

    var $resetPwdForm = $("#resetPwdForm");
    var $submitBtn = $("#submitBtn");
    var $errorMsg = $("#errorMsg");

    var icon = "<img src='../img/error-icon.png'> ";
    function doSubmit(){
        return $resetPwdForm.submit();
    }


  $resetPwdForm.validate({
        rules:{
            password :{
                required:true,
                minlength: 6,
                maxlength:16
            },
            confirm_password:{
                required:true,
                minlength: 6,
                maxlength:16,
                equalTo: "#password"
            }
        },
        messages:{
            password:{
                required:icon+"请输入密码",
                minlength: icon + "密码必须6个字符以上",
                maxlength: icon + "密码必须16个字符以下"
                },
            confirm_password:
            {
                required:icon+"请输入确认密码",
                minlength: icon + "密码必须6个字符以上",
                maxlength: icon + "密码必须16个字符以下",
                equalTo:"两次密码输入不一致"}
        },
        focusInvalid:true,
        submitHandler:function(){

            $.ajax({
                url: "../lspUser/resetpwd",
                type: "POST",
                data: $resetPwdForm.serialize(),
                beforeSend: function() {
                    $submitBtn.html("请稍后...");
                    $submitBtn.unbind("click");

                },
                error: function () {
                    $submitBtn.html("确定");
                },
                success: function (data) {
                    console.log(data);
                    if(data){//
                        $submitBtn.html("修改成功");
                        location.href = "../index";
                    }else{
                        $errorMsg.text("修改失败");
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
