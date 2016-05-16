[#-- @ftlvariable name="CURR_USER" type="com.wangkuo.zxb.lsp.api.dto.output.LspUserOutput" --]
<ul>
    <li>
        <a href="#" style="font-weight:bold;font-size:16px;">运单管理</a>
[#--        <div class="w">
            <a href="#"><img src="${IMG_PATH}/j-d.png">&nbsp;我的接单</a>
        </div>--]
        <div class="w">
            <a href="${SYS_PATH}/waybill/list"><img src="${IMG_PATH}/f-h.png">&nbsp;我的发货</a>
        </div>
        <div class="w">
            <a href="${SYS_PATH}/stowage/list"><img src="${IMG_PATH}/f-h.png">&nbsp;配载管理</a>
        </div>
    </li>
<li>
[#if CURR_USER.checkBlocked()]
        <a href="${SYS_PATH}/waybill/add" style="font-weight:bold;font-size:16px;">我要发货</a>
[#else]
        <a href="javaScript:void(0)" onclick="javascript:layer.msg('您的发货功能已被冻结')" style="font-weight:bold;font-size:16px;">我要发货</a>
[/#if]
</li>
[#if CURR_USER.checkBlocked() && CURR_USER.isVerify()]
    <li>
        <a href="#" style="font-weight:bold;font-size:16px;">品类管理</a>
        <div class="w">
            <a href="${SYS_PATH}/category/findCategoryPrices"><img src="${IMG_PATH}/j-d.png">&nbsp;品类查询</a>
        </div>
        <div class="w">
            <a href="${SYS_PATH}/category/index"><img src="${IMG_PATH}/f-h.png">&nbsp;品类申请</a>
        </div>
    </li>
[/#if]
    <li>
        <a href="#" style="font-weight:bold;font-size:16px;">账户管理</a>
        <div class="w">
            <a href="${SYS_PATH}/account/personBase"><img src="${IMG_PATH}/z-l.png">&nbsp;我的资料管理</a>
        </div><div class="w">
            <a href="${SYS_PATH}/receicerShipper/index"><img src="${IMG_PATH}/f-h.png">&nbsp;收发货人管理</a>
        </div>
[#--        <div class="w">
            <a href="#"><img src="${IMG_PATH}/f-h.png">&nbsp;发收货人管理</a>
        </div>
        <div class="w">
            <a href="#"><img src="${IMG_PATH}/l-l.png">&nbsp;专线宝钱包</a>
        </div>--]
    </li>
[#if !CURR_USER.isVerify()]
    <li style="border-bottom:none;">
        <a href="#" style="font-weight:bold;font-size:16px;">入驻帮助中心</a>
        <div class="w"><a href="${SYS_PATH}/lspUser/about/settled/requirement"><img src="${IMG_PATH}/j-d.png">&nbsp;服务商入驻条件</a></div>
        <div class="w"><a href="${SYS_PATH}/lspUser/about/settled/droit"><img src="${IMG_PATH}/j-d.png">&nbsp;服务商入驻协议</a></div>
        <div class="w"><a href="${SYS_PATH}/lspUser/about/settled/procedure"><img src="${IMG_PATH}/j-d.png">&nbsp;服务商实操指引</a></div>
        <div class="w"><a href="${SYS_PATH}/lspUser/about/settled/damageprotocol"><img src="${IMG_PATH}/j-d.png">&nbsp;异常处理约定</a></div>
        <div class="w"><a href="${SYS_PATH}/lspUser/about/settled/applyprocess"><img src="${IMG_PATH}/j-d.png">&nbsp;申请入驻操作流程</a></div>
    </li>
[/#if]
</ul>