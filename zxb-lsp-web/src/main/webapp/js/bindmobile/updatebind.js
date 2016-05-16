

$(function() {
    /**隐藏手机号中间5位*/
    var tmp = $("#bindedMobile").text();
    tmp = tmp.replace(/(.{3}).*(.{3})/,"$1***$2");
    console.log(tmp);
    $("#bindedMobile").text(tmp);

    var $updateBindForm = $("#updateBindForm");
    var $submitBtn = $("#submitBtn");
    var $errorMsg = $("#errorMsg");
    var icon = "<img src='../img/error-icon.png'> ";
    function doSubmit(){
        return $updateBindForm.submit();
    }


    $updateBindForm.validate({
        rules:{
            bindMobile :{
                required:true,
                mobile:true
            }
        },
        messages:{
            bindMobile:{required:icon+"请输入手机号码",mobile:"请输入正确的手机号码"}
        },
        focusInvalid:true,
        submitHandler:function(){
            $.ajax({
                url: "../bindmobile/judgebind",
                type: "POST",
                data: $updateBindForm.serialize(),
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
                        $submitBtn.html("绑定成功");

                        var expiresDate= new Date();
                        expiresDate.setTime(expiresDate.getTime() + (30 * 60 * 1000));
                        $.cookie("bindValided","true",{ expires: expiresDate });
                        location.href = "../bindmobile/bind";
                    }else{
                        $errorMsg.text("手机号码错误");
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
