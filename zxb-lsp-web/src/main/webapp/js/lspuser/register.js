/**
 * Created by wangjh on 2016/3/29.
 */

/**
 * 判断密码强度
 * @param password
 * @returns {number}
 * @constructor
 */
function AnalyzePasswordSecurityLevel(password) {
    var securityLevelFlag = 0;
    if (password.length < 6) {
        return 0;
    }
    else {
        if (/[a-z]/.test(password)){
            securityLevelFlag++;    //lowercase
        }
        if (/[A-Z]/.test(password)){
            securityLevelFlag++;    //uppercase
        }
        if(/[0-9]/.test(password)){
            securityLevelFlag++;    //digital
        }
        if(containSpecialChar(password)){
            securityLevelFlag++;    //specialcase
        }
        return securityLevelFlag;
    }
}

function containSpecialChar(str)
{
    var containSpecial = RegExp(/[(\ )(\~)(\!)(\@)(\#)(\$)(\%)(\^)(\&)(\*)(\()(\))(\-)(\_)(\+)(\=)(\[)(\])(\{)(\})(\|)(\\)(\;)(\:)(\')(\")(\,)(\.)(\/)(\<)(\>)(\?)(\)]+/);
    return (containSpecial.test(str));
}


$().ready(function() {
    $("#changeCode").click(function(){
        reloadCode();

    });

    $(document).bind('keyup', function(e) {
        var theEvent = e || window.event;
        var code = theEvent.keyCode || theEvent.which || theEvent.charCode;
        if (code == "13") {
            doRegister();
        }
    });

    function reloadCode(){
        $("#capCodeImg").attr("src","../captcha?captchaId="+$("#captchaId").val()+"&t=" + new Date().getTime());
    }


    var icon = "";
    var $signupForm = $("#signupForm");
    var $registerBtn = $("#registerBtn");
    var $loginMsgTxt = $("#loginMsgTxt");
    var $loginMsg = $("#loginMsg");
    var registerIndex;
    function doRegister(){
        return $signupForm.submit();
    }
    $signupForm.validate({
        rules: {
            nickName: {
                required: true,
                alnum:true,
                minlength: 2,
                maxlength:16,
                remote: {
                    url: "../lspUser/isuserexist",
                    type: "POST",
                    dataTypes: "json",
                    data: {
                        nickName: function () {
                            return $("input[name='nickName']").val();
                        }
                    }
                },
            },
            password: {
                required: true,
                alpwd:true,
                minlength: 6,
                maxlength:16,
            },
            confirm_password: {
                required: true,
                alpwd:true,
                minlength: 6,
                maxlength:16,
                equalTo: "#password",
            },
            companyName:{
                enIsCharOrNum:true,
                required:true,
                minlength: 1,
                maxlength:30
            },
            realUserName:{
                CharOrNum:true,
                required: true,
                minlength: 1,
                maxlength:10,
            },
            mobile:{
                isMobile:true,
                required: true
            },
            telphone:{
                good_num:true
            },
            provinceId:{
                required: true
            },
            cityId:{
                required: true
            },
            countryId:{
                required: true
            },
            detailedAddress:{
                minlength: 1,
                maxlength:50,
                enIsCharOrNum:true,
                required: true
            },
            captcha:{
                required: true,
                /*remote: {
                    url: "../lspUser/isCaptchIdRight",
                    type: "POST",
                    dataTypes: "json",
                    data: {
                        captchaId: function () {
                            return $("input[name='captchaId']").val();
                        },
                        captcha:function(){
                            return $("input[name='captcha']").val();
                        }
                    }
                },*/
            },
            agree: "required"
        },messages: {
            nickName: {
                required: icon + "请输入您的用户名",
                alnum:"可输入英文字母和数字、不可输入空格",
                remote: "用户名已存在",
                minlength:"用户名必须2个字符以上",
                maxlength:"用户名必须16个字符以下"
            },
            password: {
                alpwd:"只能包括英文字母,数字和特殊字符",
                required: icon + "请输入您的密码",
                minlength: icon + "密码必须6个字符以上",
                maxlength: icon + "密码必须16个字符以下"
            },
            confirm_password: {
                alpwd:"只能包括英文字母,数字和特殊字符",
                required: icon + "请再次输入密码",
                minlength: icon + "密码必须6个字符以上",
                maxlength: icon + "密码必须16个字符以下",
                equalTo: icon + "两次输入的密码不一致"
            },
            companyName: {
                enIsCharOrNum:"可输入汉字、英文字母和数字，不可输入空格",
                required:icon + "请输入您的公司名称",
                minlength:"公司名至少输入1个字符",
                maxlength:"公司名最多输入30个字符"
            },
            realUserName: {
                CharOrNum:"请输入汉字或字母，不可输入空格",
                required:icon + "请输入您的姓名",
                minlength: "姓名必须1个字符以上",
                maxlength:"姓名必须10个字符以内"
            },
            mobile: {
                isMobile:"请输入正确的手机号码",
                required: icon + "请输入您的手机"
            },
            telphone:{
                good_num:"只能输入数字，且不能输入空格"
            },
            provinceId: icon + "请选择省",
            cityId: icon + "请选择市",
            countryId: icon + "请选择区",
            detailedAddress: {
                required:icon +"请输入具体地址",
                minlength: "地址最少输入1个字符",
                maxlength:"地址最多输入50个字符",
                enIsCharOrNum:"可输入汉字、英文字母和数字，不可输入空格",
            },
            captcha: {
                required:icon + "请输入验证码"

            },
            agree: {
                required: icon + "必须同意协议后才能注册",
                element: '#agree-error'
            }
        },

        showErrors:function(errorMap,errorList) {

            if(errorList && errorList.length > 0){
                registerIndex = layer.tips(errorList[0].message, '#'+errorList[0].element.id,{tips:[2, '#ef5b00']});
                console.log(errorList[0].message);
            }else{
                layer.close(registerIndex);
            }
        },
        focusInvalid:true,
        submitHandler:function(){
            $.ajax({
                url: "../lspUser/adduser",
                type: "POST",
                data: $signupForm.serialize(),
                beforeSend: function() {
                    $registerBtn.html("请稍后...");
                    //$registerBtn.prop("disabled", true);
                    $registerBtn.unbind("click");
                },
                error: function () {
                    $registerBtn.html("立即注册");
                    $registerBtn.bind("click",function(){
                        doRegister();
                        return false;
                    });
                   // $registerBtn.prop("disabled", false);
                },
                success: function (data) {

                    if(data.status>0){//注册成功
                        location.href = "../lspUser/registerSuccess";
                    }else{//注册失败
                        layer.msg(data.msg);
                        $loginMsg.show();
                        $registerBtn.html("立即注册");
                        $registerBtn.bind("click",function(){
                            doRegister();
                            return false;
                        });
                        reloadCode();
                    }
                },
                complete:function(){

                }
            });
        }
    });


    $registerBtn.click(function(){
        doRegister();
        return false;
    });

    $("input[name='password']").keyup(function(){
        var level = AnalyzePasswordSecurityLevel($(this).val());
        if(level==1){//低
            $(".aq span").removeClass("strong_pwd");
            $("#pwd_r1").addClass("r1 strong_pwd");
        }else if(level==2){//中
            $(".aq span").removeClass("strong_pwd");
            $("#pwd_r2").addClass("r1 strong_pwd");
        }else if(level >=3){//高
            $(".aq span").removeClass("strong_pwd");
            $("#pwd_r3").addClass("r1 strong_pwd");
        }else{
            $(".aq span").removeClass("strong_pwd");
        }
    });



    /*$("#provinceId").change(function(){
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
                    console.log(value.id);
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
                    console.log(value.id);
                    var html = "<option value='"+value.id+"' >"+value.areaName+"</option>";
                    $("#countryId").append(html);
                });
                //$("#countryName").val($("#countryId").find("option:selected").text());
            }
        });
    });

    $("#countryId").change(function(){
        $("#countryName").val($(this).find("option:selected").text());
    });*/
});