[#escape x as x?html]
    [#include "../_layout.ftl"]
    [#assign page_title="修改绑定手机"/]
    [#assign page_keyword="修改绑定手机"/]
    [#assign page_desc="修改绑定手机"/]
    [#macro section_headjs]
    <script type="text/javascript" src="${JS_PATH}/bindmobile/updatebind.js"></script>
    [/#macro]
    [#macro section_footjs]
    <script type="text/javascript" >
        $(document).ready(function(){

        });

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
                 修改绑定手机
             </div>
             <div style="height:20px;" id="errorMsg" class="error"></div>

            <form id="updateBindForm" >
                <table cellpadding="0" cellspacing="0" style="margin: 0 auto;width: 600px;">
                    <tr>
                        <td width="150px"> 您当前绑定的手机：<span id="bindedMobile">${CURR_USER.bindMobile!}</span></td>
                    </tr>
                    <tr>
                        <td  width="150px">
                            <input id="bindMobile" name="bindMobile" placeholder="请输入当前绑定的手机号码"/>
                        </td>
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