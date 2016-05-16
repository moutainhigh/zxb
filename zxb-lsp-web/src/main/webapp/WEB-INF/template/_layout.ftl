[#ftl strip_whitespace=true strip_text=true]
[#include "_common.ftl" /]
[#macro mainLayout]
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="renderer" content="webkit">
    <title>[#if page_title??]${page_title}[#else]${page_title!""}[/#if]</title>
    <meta name="keywords" content="${page_keyword!""}"/>
    <meta name="description" content="${page_desc!""}"/>
    [#if section_meta??]
        [@section_meta/]
    [/#if]
    <link href="${SYS_PATH}/favicon.ico" rel="shortcut icon" type="image/x-icon"/>
    [#if section_css??]
        [@section_css/]
    [#else]
        [#include "_layout/_css.ftl"/]
    [/#if]
    [#if section_headcss??]
        [@section_headcss/]
    [/#if]

    [#include "_layout/_js.ftl"/]
    [#if section_headjs??]
        [@section_headjs/]
    [/#if]
</head>
<body>

<div class="wbk">
    [#if section_head??]
        [@section_head /]
    [#else]
        [#include "_layout/_head.ftl"/]
    [/#if]
    <div class="hs-k">
        <div class="bs-k">
            <div class="dkk">
                <!-- 左侧菜单begin -->
                <div class="zbk">
                    [#include "_layout/_leftmenu.ftl"/]
                </div>
                <!-- 左侧菜单end -->
                <!-- 内容右边begin -->
                <div class="ybk">
                    [#nested/]
                </div>
                <!-- 右边end -->
            </div>
        </div>
    </div>
</div>
<!-- 底部begin -->
    [#if section_foot??]
        [@section_foot /]
    [#else]
        [#include "_layout/_foot.ftl"/]
    [/#if]
<!-- 底部end -->

[#include "_layout/_footjs.ftl"/]
[#if section_footjs??]
    [@section_footjs /]
[/#if]
</body>
</html>
[/#macro]