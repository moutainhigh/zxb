
/**
 * Created by wangjh on 2016/3/30.
 */


$(function() {


    var loginIndex;
    var $loginFrm = $("#loginForm");

    var $loginBtn = $("#loginBtn");

    function doLogin(){
        return $loginFrm.submit();
    }

    $(document).bind('keyup', function(e) {
        var theEvent = e || window.event;
        var code = theEvent.keyCode || theEvent.which || theEvent.charCode;
        if (code == "13") {
            doLogin();
        }
    });

    $loginFrm.validate({
        rules:{
            nickName :{required:true},
            password:{required:true}
        },
        messages:{
            nickName:{required:"请输入用户名"},
            password:{required:"请输入密码"}
        },

        showErrors:function(errorMap,errorList) {

            if(errorList && errorList.length > 0){
                loginIndex = layer.tips(errorList[0].message, '#'+errorList[0].element.id,{tips:[2, '#ef5b00']});
            }else{
                layer.close(loginIndex);
            }
        },
        focusInvalid:true,
        submitHandler:function(){
            $.ajax({
                url: "../lspUser/login",
                type: "POST",
                data: $loginFrm.serialize(),
                beforeSend: function() {
                    $loginBtn.html("正在登录...");
                    $loginBtn.unbind("click");

                },
                error: function () {
                    $loginBtn.html("登&nbsp;&nbsp;录");
                    $loginBtn.prop("disabled", false);
                },
                success: function (data) {
                    if(data){//
                        $loginBtn.html("登录成功");
                        if($("#returnUrl").val()){
                            location.href = $("#returnUrl").val();
                        }else{
                            location.href = "../lspUser/index";
                        }
                    }else{
                        //$loginMsgTxt.html("用户名或密码错误");
                        layer.msg("用户名或密码错误");
                        //$loginMsg.show();
                        $loginBtn.html("立即登录");
                        $loginBtn.click(function(){
                            doLogin();
                            return false;
                        });
                    }
                },
                complete:function(){

                }
            });
        }
    });

    $loginBtn.click(function(){
        doLogin();
        return false;
    });

});