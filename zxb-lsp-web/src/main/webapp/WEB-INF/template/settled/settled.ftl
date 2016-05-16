[#escape x as x?html]
    [#include "../_layout.ftl"]
    [#include "../_layout/_css.ftl"]
    [#assign page_title="申请入驻"/]
    [#assign page_keyword="申请入驻"/]
    [#assign page_desc="申请入驻"/]
    [#macro section_footjs]

    [/#macro]
    [#macro section_css]
    [/#macro]
    [#macro section_headcss]
    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/sq-rz.css">
    [/#macro]
    [@mainLayout]
    <div class="ybk">
        <div class="ybk-1">
            <div class="ruzhu">
                <ul>
                    <li><span class="n1">你的入驻申请已收到</span></li>
                    <li><span class="n2">您的用户名是: </span>${lspUserCommon.nickName!} </li>
                    <li><span class="n2">您的公司名是: </span>${lspUserCommon.companyName!} </li>
                    <li><span class="n2">您的联系电话是: </span>${lspUserCommon.mobile!}</li>
                    <li><span class="n2">您的联系人是: </span>${lspUserCommon.realUserName!}</li>
                </ul>
            </div>
            <div class="x-1"></div>
        </div>
        <div class="boot">
            <div class="text-gn">请保持您的通讯畅通，入驻服务商功能开通后我们会第一时间联系您
                <a href="${SYS_PATH}/lspUser/index">返回我的首页>></a></div>

        </div>
    </div>


    [/@mainLayout]
[/#escape]