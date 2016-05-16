

$(function() {

    var $findPwdForm = $("#findPwdForm");
    var $submitBtn = $("#submitBtn");
    var $errorMsg = $("#errorMsg");
    var $getCodeBtn = $("#getCodeBtn");
    var icon = "<img src='../img/error-icon.png'> ";
    function doSubmit(){
        return $findPwdForm.submit();
    }

    /**隐藏手机号中间5位*/
    var tmp = $("#bindedMobile").val();
    tmp = tmp.replace(/(.{3}).*(.{3})/,"$1***$2");
    $("#bindedMobile option:selected").text("手机"+tmp);


   var $Validate = $findPwdForm.validate({
        rules:{
            bindMobile :{
                required:true,
                mobile:true,
            },
            code:{required:true}
        },
        messages:{
            bindMobile:{
                required:icon+"请输入手机号码",
                mobile:"请输入正确的手机号码"},
            code:{required:icon+"请输入验证码"}
        },
        focusInvalid:true,
        submitHandler:function(){
            if($("#code").val()==$("#sysCode").val()){
                var expiresDate= new Date();
                expiresDate.setTime(expiresDate.getTime() + (30 * 60 * 1000));
                $.cookie("valided","true",{ expires: expiresDate });
                location.href="../lspUser/resetpwd"
            }else{
                $("#errorMsg").text("验证码错误");
            }
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
