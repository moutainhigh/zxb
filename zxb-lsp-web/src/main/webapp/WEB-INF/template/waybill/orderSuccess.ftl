[#include "../_layout.ftl"]
[#escape x as x?html]

    [#assign page_title="运单支付成功"/]
    [#assign page_desc="运单支付成功"/]
    [#macro section_footjs]
    <script type="text/javascript" src="${JS_PATH}/waybill/paySuccess.js"></script>
    [/#macro]

    [#macro section_css]
    <link rel="stylesheet" type="text/css" href="${CSS_PATH}/in-gggg.css">
    <link rel="stylesheet" type="text/css" href="${CSS_PATH}/pay-success.css">

    [/#macro]
    [@mainLayout]
    <div class="ybk">

        <div class="d-tijiao">
            <div class="tj-2">运单提交成功！</div>
            <div class="tj-3">
                <ul>
                    <li>
                        您好,[#if feeStatus??]
                        [#if feeStatus=="-1"]
                            由于您的送货距离较远暂无报价，专线宝客服会及时与您联系！<br>
                            运单已自动生成,专线宝客服将在稍后立即和您取得联系，竭诚为你服务。<br>
                            你的手机（${mobile!}），请注意查收！
                        [#elseif feeStatus=="-3"]
                            由于您的收货地区暂无报价，专线宝客服会及时与您联系！<br>
                            运单已自动生成,专线宝客服将在稍后立即和您取得联系，竭诚为你服务。<br>
                            你的手机（${mobile!}），请注意查收！
                        [#elseif feeStatus=="0"]
                            您的订单已提交成功，请您尽快前往配载管理进行配载发车操作！<br>
                        [/#if]
                        [/#if]

                    </li>
                    <li>订单编号：${systemSn!}</li>
                    <li>服务热线：400-711-0056</li>

                    <li class="l-i">
                        <a>你可以</a>
                        <a href="${SYS_PATH}/waybill/list">返回我的发货</a>
                        <a href="${SYS_PATH}/waybill/add">继续发货</a>
                        <a href="${SYS_PATH}/waybill/detail/${waybillId!}">查看运单详情</a>
                    </li>
                </ul>
            </div>

        </div>
    </div>
    [/@mainLayout]
[/#escape]