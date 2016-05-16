[#escape x as x?html]
    [#include "../_layout.ftl"]
    [#include "../_layout/_css.ftl"]
    [#assign page_title="申请入驻操作流程"/]
    [#assign page_keyword="申请入驻操作流程"/]
    [#assign page_desc="申请入驻操作流程"/]
    [#macro section_footjs]

    [/#macro]
    [#macro section_css]
    [/#macro]
    [#macro section_headcss]
    <link rel="stylesheet" type="text/css" href="${CSS_PATH}/in-gggg.css">

    <link rel="stylesheet" type="text/css" href="${CSS_PATH}/ruzhu-tiaojian.css">

    [/#macro]
    [@mainLayout]
    <!--右边框-->
    <div class="ybk">
        <div class="ruzhu">
            <h2>申请入驻操作流程</h2>
        </div>
        <div class="text-tj">
            <ul>
                <li><h3>平台多数功能仅向已入驻服务商提供，如您想获得平台所有功能，可以按照以下步骤做申请</h3></li>
                <li><h3>步骤1：请点击快捷入口的“首页”，如下图所示</h3></li>
                <li><img src="${IMG_PATH}/lsp_tp-js1.jpg"></li>
                <li><h3>步骤2：在您的首页中，请点击红圈中的“申请入驻”，如下图所示</h3></li>
                <li><img src="${IMG_PATH}/lsp_tp-js2.jpg"></li>
                <li><h3>步骤3：平台会显示您的相关注册信息</h3></li>
                <li><img src="${IMG_PATH}/lsp_tp-js3.jpg"></li>
                <li><h3>步骤4：此时，在您的首页中，状态会显示为“我正在等待申请审核”，专线宝工作人员会联系您， 请您保持您的联系方式通畅。</h3></li>
                <li><img src="${IMG_PATH}/lsp_tp-js4.jpg"></li>
                <li><h3>步骤5：如果您提交给专线宝工作人员的资料真实、有效，同时满足专线宝入驻条件，专线宝平台会在7个工
                    作日内为您开通平台正式身份。登陆后，上图红圈中标识的信息，
                    会显示“已入驻服务商”。此时，您就可以使用平台全部功能。
                </h3></li>
            </ul>
        </div>
    </div>
    [/@mainLayout]
[/#escape]