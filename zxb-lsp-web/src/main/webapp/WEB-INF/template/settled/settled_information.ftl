[#escape x as x?html]
    [#include "../_layout.ftl"]
    [#include "../_layout/_css.ftl"]
    [#assign page_title="入驻所需资料"/]
    [#assign page_keyword="入驻所需资料"/]
    [#assign page_desc="入驻所需资料"/]
    [#macro section_footjs]

    [/#macro]
    [#macro section_css]
    [/#macro]
    [#macro section_headcss]
    <link rel="stylesheet" type="text/css" href="${CSS_PATH}/ruzhu-tiaojian.css">
    [/#macro]
    [@mainLayout]

    <div class="ybk">
        <div class="ruzhu">
            <h2>入驻所需资料</h2>
        </div>
        <div class="text-tj">
            <ul>
                <li>1）服务商须根据平台相关规则及要求向专线宝提交证明文件或其他相关证明，包括但不限于营业执照、道路运输许可证、机动车驾驶证、法人身份证等。</li>
                <li>2）服务商保证向专线宝提供的上述证明文件或其他相关证明真实、合法、准确、有效，并保证上述证明文件或其他相关证明发生任何变更或更新时，及时通知专线宝，若上述文件变更或更新导致服务商不符合专线宝平台所规定入驻条件的，专线宝有权单方全部或部分限制服务商经营，直至终止。</li>
                <li>3）服务商对其提交的证明文件或其他相应证明的真实性、合法性、准确性、有效性承担全部法律责任，若因服务商提交虚假、过期文件或未及时更新或通知证明文件导致纠纷或被相关国家机关处罚的，由服务商独立承担全部法律责任，如因此造成专线宝损失的，服务商应予以赔偿。</li>

            </ul>
        </div>
    </div>
    [/@mainLayout]
[/#escape]