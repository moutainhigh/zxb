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
        <div class="tj-2">运单支付成功！</div>
        <div class="tj-3">
            <ul>
                <li>
                    你的订单已支付成功，请你尽快前往配载
                    管理进行配载发车操作！
                </li>
                <li>订单编号：${order.systemSn!}</li>
                <li>服务热线：400-711-0056</li>

                <li class="l-i">
                    <a>你可以</a>
                    <a href="${SYS_PATH}/waybill/list">返回我的发货</a>
                    <a href="${SYS_PATH}/waybill/add">继续发货</a>
                    <a href="${SYS_PATH}/waybill/detail/${order.waybillId}">查看运单详情</a>
                </li>
            </ul>
        </div>

    </div>

</div>
[/@mainLayout]
[/#escape]