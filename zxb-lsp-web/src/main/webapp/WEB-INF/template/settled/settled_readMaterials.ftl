[#escape x as x?html]
[#include "../_layout.ftl"]
[#include "../_layout/_css.ftl"]
[#assign page_title="申请资料查看"/]
[#assign page_keyword="申请资料查看"/]
[#assign page_desc="申请资料查看"/]
[#macro section_footjs]
<script type="text/javascript" src="${JS_PATH}/settled/readMaterials.js"></script>
[/#macro]
[#macro section_css]
[/#macro]
[#macro section_headcss]
    <link rel="stylesheet" type="text/css" href="${CSS_PATH}/zl-chakan.css">

    [/#macro]
    [@mainLayout]
        <form id="settledForm" action="${SYS_PATH}/lspUser/settled">
            <div class="ybk">
                <div class="d-li">
                    <div class="d-g1">
                    你正在申请成为<span class="s-pt">专线宝平台入驻服务商</span>
                    ，请您务必仔细阅读一下申请注意事项
                    </div>
                    <div class="sq">
                        <ul>
                            <li><a href="about/settled/requirement" target="_blank">服务商入驻条件</a></li>
                            <li><a href="about/settled/droit" target="_blank" >服务商入驻协议</a></li>
                            <li><a href="about/settled/procedure" target="_blank" >服务商实操指引</a></li>
                            <li><a href="about/settled/damageprotocol" target="_blank">异常处理约定</a></li>
                        </div>
                        <div class="d-yued">
                            <input type="checkbox" class="v" id="isRead">
                            我已全部阅读
                            </div>
                            <div class="d-an" id="settled">
                            申请入驻
                            </div>
                        </div>
                    </div>
                </form>
    [/@mainLayout]
[/#escape]