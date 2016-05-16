[#escape x as x?html]
    [#include "../_layout.ftl"]
    [#assign page_title="手机绑定"/]
    [#assign page_keyword="手机绑定"/]
    [#assign page_desc="手机绑定"/]
    [#macro section_headjs]
    <script type="text/javascript" src="${JS_PATH}/bindmobile/bind.js"></script>
    [/#macro]
    [#macro section_footjs]
    <script type="text/javascript" >

       /* $(function(){
            var intervalId;
            intervalId =window.setInterval(function(){
                var time =parseInt($("#showTime").text());
                time --;
                $("#showTime").text(time)
                if(time == 0){
                    clearInterval(intervalId);
                    location.href="../index";
                }

            },1000);
        });*/
    </script>
    [/#macro]

    [#macro section_css]
    <style type="text/css">

        .wbk-2{
            width: 200px;
            height: 400px;
            position: absolute;
            top: 50%;
            left:50%;
            margin-left: -100px;
            margin-top: -200px;
            text-align: center;
        }
        .wbk-2 input {
            width: 200px;
            border: none;
            border: solid 1px #e8e8e8;
            margin: 7px 0;
            line-height: 30px;
            height: 30px;
        }
        .error{color: red;font-size: 14px;}
        table {
            text-align: left;
        }
    </style>
    [/#macro]

    [#macro section_headcss]
    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/dl.css">
    [/#macro]
 [@mainLayout]
 <body>
 <div class="wbk-p">
     <div class="wbk-2">

         <div class="">

             <div class="">
                 绑定手机
             </div>
             <div style="height:20px;" id="errorMsg" class="error"></div>

            <form id="bindForm" >
                <input id="sysCode" name="sysCode" value="1111" type="hidden"/>
                <input id="getCodeMobile" name="getCodeMobile" type="hidden"/>
                <input id="binded" value="${CURR_USER.bindMobile!}" type="hidden"/>
                <table cellpadding="0" cellspacing="0" style="margin: 0 auto;width: 600px;">
                    <tr>
                        <td  width="150px">
                            <input id="bindMobile" name="bindMobile" placeholder="请输入手机号"/>
                        </td>
                    </tr>
                    <tr>
                        <td width="150px"> <input id="code" name="code" placeholder="请输入验证码" style="width: 100px;"/><input id="getCodeBtn" disabled style="width: 95px;" type="button" value="获取验证码"/></td>
                    </tr>
                    <tr>
                        <td  width="150px">
                            <input id="submitBtn" type="button" value="确定"/>
                        </td>
                    </tr>
                </table>
            </form>
             </div>

     </div>
 </div>
</body>
</html>
     [/@mainLayout]
[/#escape]