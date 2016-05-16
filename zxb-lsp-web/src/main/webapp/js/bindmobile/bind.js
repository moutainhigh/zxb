

$(function() {
    var binded = $("#binded").val();
    var valided = $.cookie("bindValided");

    if(binded && !valided){
        location.href="../bindmobile/updatebind"
        return;
    }
    $.cookie('bindValided', null);


    var $bindForm = $("#bindForm");
    var $submitBtn = $("#submitBtn");
    var $errorMsg = $("#errorMsg");
    var $getCodeBtn = $("#getCodeBtn");
    var icon = "<img src='../img/error-icon.png'> ";
    function doSubmit(){
        return $bindForm.submit();
    }


   var $Validate = $bindForm.validate({
        rules:{
            bindMobile :{
                required:true,
                mobile:true,
                remote: {
                    url: "../bindmobile/isbind",
                    type: "POST",
                    dataTypes: "json",
                    data: {
                        bindMobile: function () {
                            return $("input[name='bindMobile']").val();
                        }
                    }
                }
            },
            code:{required:true}
        },
        messages:{
            bindMobile:{
                required:icon+"请输入手机号码",
                mobile:"请输入正确的手机号码",
                remote:"手机号码已绑定"},
            code:{required:icon+"请输入验证码"}
        },
        focusInvalid:true,
        submitHandler:function(){
            $.ajax({
                url: "../bindmobile/bind",
                type: "POST",
                data: $bindForm.serialize(),
                beforeSend: function() {
                $submitBtn.html("请稍后...");
                $submitBtn.unbind("click");

                },
                error: function () {
                $submitBtn.html("确定");
                },
                success: function (data) {
                    console.log(data);
                    if(data.id>0){//
                        $submitBtn.html("绑定成功");
                        location.href = "../index";
                    }else{
                        console.log("msg: "+data.msg);
                        $errorMsg.text(data.msg);
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



    /**判断手机号码输入是否正确，只有正确才能点击“获取验证码”按钮*/
    $("#bindMobile").keyup(function(){
        var flag = $Validate.element($("#bindMobile"));
        //console.log(flag);
        if (flag) {
            $getCodeBtn.attr("disabled", false);
        } else {
            $getCodeBtn.attr("disabled", true);
        }
    });



    $submitBtn.click(function(){
        doSubmit();
        return false;
    });
    var seconds;
    var intervalId;
    $getCodeBtn.click(function(){
        seconds = 30;
        $(this).val("等待"+seconds+"秒...");
        $getCodeBtn.attr("disabled",true);

        intervalId = window.setInterval(function(){
            seconds --;
            $getCodeBtn.val("等待"+seconds+"秒...");
            if(seconds == 0){
                clearInterval(intervalId);
                $getCodeBtn.attr("disabled",false);
                $getCodeBtn.val("再次获取");
            }

        },1000);
        //记录该次点击获取验证码按钮时填写的手机号码
        $("#getCodeMobile").val($("#bindMobile").val());
    });




});
