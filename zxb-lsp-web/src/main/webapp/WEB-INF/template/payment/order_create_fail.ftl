[#include "../_layout.ftl"]
[#escape x as x?html]

    [#assign page_title="订单生成失败"/]
    [#assign page_desc="订单生成失败"/]

    [@mainLayout]
    订单生成失败,${info.errorMsg},点击<span id="re"><a href="${SYS_PATH}/lspUser/index">这里</a></span>返回首页
    [/@mainLayout]
[/#escape]