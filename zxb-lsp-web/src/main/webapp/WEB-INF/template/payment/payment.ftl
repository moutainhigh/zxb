[#include "../_layout.ftl"]
[#escape x as x?html]

    [#assign page_title="支付"/]
    [#assign page_desc="支付"/]

    [#macro section_headcss]
    <link rel="stylesheet" type="text/css" href="${CSS_PATH}/fh-zfb.css">
    <style>
        img.active{
            border-color: orange;
        }
    </style>
    [/#macro]
    [#macro section_footjs]
        <script>
            $(function () {
                $('.s-zf11').click(function () {
                    $(this).siblings().children(':first').css("color","black");
                    $('.d-zfb').show();
                    $('.yh').hide();
                    $(this).children(':first').css("color","red");
                    $('[name=bankType]').attr('checked',false);
                    $('[name=bankType]').each(function () {
                        $(this).next().children(':first').removeClass("active");
                    });
                });

                $('.s-zf22').click(function () {
                    $(this).siblings().children(':first').css("color","black");
                    $('.d-zfb').hide();
                    $('.yh').show();
                    $(this).children(':first').css("color","red");
                });

                $('.d-qr').click(function () {
                    $('form').submit();
                    var index = layer.open({
                        type: 1,
                        title: '是否支付成功',
                        closeBtn: 2,
                        shadeClose: false,
//                        skin: 'yourclass',
                        content: $('#confirm_pay')
                    });

                    $('.pay_succ').one('click',function () {
                        $.get("${SYS_PATH}/payment/payed/${info.orderId}", function (res) {
                            layer.close(index);
                            if(res==true){
                                window.location.href = "${SYS_PATH}/payment/success/${info.orderId}"
                            } else {
                                layer.msg('支付好像没有成功，如果已经扣款，请联系客服', {icon: 5});
                            }
                        });
                    });
                    $('.pay_fail').one('click',function () {
                        layer.close(index);
                    });
                });

                $('.d-qx').one('click',function () {
                    window.location.href = "${SYS_PATH}/waybill/list"
                });

                $('[name=bankType]').change(function () {
                    $('[name=bankType]').each(function () {
                        $(this).next().children(':first').removeClass("active");
                    });
                    $(this).next().children(':first').toggleClass("active");
                })
            });
        </script>
    [/#macro]
    [@mainLayout]
            <div class="d-yd">
                运单信息：
            </div>
            <div class="xx2">
            </div>
            <div class="d-yd1">
                <div class="d-yd11">
                    <ul>
                        <li class="l-y1" style="margin-left:-10px">运单号</li>
                        <li class="l-y2" style="margin-left:70px">货物名称/收货方</li>
                        <li>创建时间</li>
                        <li>运费/保费/开票费/增值费</li>
                        <li>在线支付总金额</li>
                    </ul>
                </div>
                <div class="d-yd2">
                    <ul>
                        <li class="p1">${info.systemSn!}</li>
                        <li class="p2">${info.goodName!}/${info.receiveName!}</li>
                        <li class="p3">${(info.operationTime?string("yyyy-MM-dd hh:mm:ss"))!}</li>
                        <li class="p4">${info.mainLineFee}元/${info.premiumFee}元/${info.invoiceFee}元/${info.vasFee}元</li>
                        <li class="p5"><span class="s-p6">${info.allFee}</span> 元</li>
                    </ul>
                </div>
            </div>
            <div class="xx2">
            </div>
            <div class="d-fk">
                付款方式：
            </div>
            <div class="xx2">
            </div>
            <div class="zf">
                <div class="zf1">
                    <span class="s-zf11"><a href="javascript:void(0)">支付宝支付</a></span>
                    <span class="s-zf22"><a href="javascript:void(0)">网银支付</a></span>
                </div>

                <form method="post" action="${SYS_PATH}/payment/pay/${info.orderId}" target="_blank">
                    <!--支付宝支付-->
                    <div class="d-zfb"><img src="${IMG_PATH}/tp-cfb.png"></div>


                    <!--结束-->
                    [#assign bankList=[
                    {"code":"ICBCB2C","logo":"zf1","isB2B":false},
                    {"code":"CCB","logo":"zf11","isB2B":false},
                    {"code":"ABC","logo":"zf111","isB2B":false},

                    {"code":"POSTGC","logo":"zf2","isB2B":false},
                    {"code":"COMM","logo":"zf22","isB2B":false},
                    {"code":"CMB","logo":"zf222","isB2B":false},

                    {"code":"BOCB2C","logo":"zf3","isB2B":false},
                    {"code":"CEBBANK","logo":"zf33","isB2B":false},
                    {"code":"CITIC","logo":"zf333","isB2B":false},

                    {"code":"SPDB","logo":"zf4","isB2B":false},
                    {"code":"CMBC","logo":"zf44","isB2B":false},
                    {"code":"CIB","logo":"zf444","isB2B":false},

                    {"code":"SPABANK","logo":"zf5","isB2B":false},
                    {"code":"GDB","logo":"zf55","zf55":false},
                    {"code":"SHRCB","logo":"zf555","isB2B":false},

                    {"code":"SHBANK","logo":"zf6","isB2B":false},
                    {"code":"NBBANK","logo":"zf66","isB2B":false},
                    {"code":"HZCBB2C","logo":"zf666","isB2B":false},

                    {"code":"BJBANK","logo":"zf7","isB2B":false},
                    {"code":"BJRCB","logo":"zf77","isB2B":false},
                    {"code":"FDB","logo":"zf777","isB2B":false},

                    {"code":"WZCBB2C-DEBIT","logo":"zf8","isB2B":false},
                    [#--{"code":"CDB（无）","logo":"zf88","isB2B":false},--]
                    {"code":"ICBCBTB","logo":"zf888","isB2B":true},

                    {"code":"CCBBTB","logo":"zf9","isB2B":true},
                    {"code":"ABCBTB","logo":"zf99","isB2B":true},
                    {"code":"CMBBTB","logo":"zf999","isB2B":true}
                    ]/]

                    <!--网银支付-->
                    <div class="yh" style="display: none;">
                    [#list bankList?chunk(3) as row]
                        <ul>
                            [#list row as item]
                                <li>
                                    <a href="javascript:void(0)">
                                        <input name="bankType" type="radio" id="payment_${item.code}" value="${item.code}"
                                               style="width:15px;height:15px;float:left;margin-top:13px">
                                        <label for="payment_${item.code}">
                                            <img src="${IMG_PATH}/${item.logo}.png">
                                        </label>
                                    </a>
                                </li>
                            [/#list]
                        </ul>
                    [/#list]
                    </div>
                    <!--结束-->
                    <div class="d-anniu">
                        <div class="d-qr">
                            确认支付
                        </div>
                        <div class="d-qx">
                            取消
                        </div>
                    </div>
                </form>
            </div>
        </div>

        <div id="confirm_pay" style="display:none;">
            <table class="layerbox">
                <tr>
                    <td class="popborder hborder" colspan="3"></td>
                </tr>
                <tr>
                    <td class="popborder vborder"></td>
                    <td align="left" valign="top" class="popcontent">
                        <h1 class="boxcont" id="loginBox">
                            <table border="0" cellpadding="0" cellspacing="0" style="font-size:14px; font-family: "微软雅黑";>
                                <tr>
                                    <td height="64" colspan="3" style="line-height:27px;color:#333333">支付完成前，请不要关闭此支付验证窗口！<br />
                                        支付完成后，请根据您支付的情况选择下面按钮！ </td>
                                </tr>
                                <tr>
                                    <td width="123"><div class="tanchuang"><a class="pay_succ" style="text-decoration: none;" href="javascript:void(0)">已完成支付</a></div></td>
                                    <td width="134"><div class="tanchuang1"><a class="pay_fail" style="text-decoration: none;" href="javascript:void(0)">支付遇到问题</a></div></td>
                                    <td width="63">&nbsp;</td>
                                </tr>
                                <tr>
                                    <td height="33" colspan="3" valign="bottom">
                                        <span class="blue">
                                            <a class="pay_fail" href="javascript:void(0)">返回重新选择银行&gt;&gt;</a>
                                        </span>
                                    </td>
                                </tr>
                            </table>
                        </h1>
                    </td>
                    <td class="popborder vborder"></td>
                </tr>
                <tr>
                    <td class="popborder hborder" colspan="3"></td>
                </tr>
            </table>
    [/@mainLayout]
[/#escape]