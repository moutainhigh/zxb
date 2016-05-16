[#ftl strip_whitespace=true strip_text=true]
[#include "_common.ftl" /]
[#macro mainLayout]
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>[#if page_title??]${page_title}[#else]${page_title!""}[/#if]</title>
    <meta name="keywords" content="${page_keyword!""}"/>
    <meta name="description" content="${page_desc!""}"/>
    [#if section_meta?? && section_meta?is_macro]
        [@section_meta/]
    [/#if]
    <link href="${SYS_PATH}/favicon.ico" rel="shortcut icon" type="image/x-icon"/>
    [#if section_css?? && section_css?is_macro]
        [@section_css/]
    [#else]
        [#include "_layout/_css.ftl"/]
    [/#if]
    [#if section_headcss?? && section_headcss?is_macro]
        [@section_headcss/]
    [/#if]

    [#include "_layout/_js.ftl"/]
    [#if section_headjs?? && section_headjs?is_macro]
        [@section_headjs/]
    [/#if]
</head>
<body>

    [#if section_head?? && section_head?is_macro]
        [@section_head /]
    [#else]
        [#include "_layout/_head.ftl"/]
    [/#if]

    [#nested/]

<!-- 底部begin -->
    [#if section_foot?? && section_foot?is_macro]
        [@section_foot /]
    [#else]
        [#include "_layout/_foot.ftl"/]
    [/#if]
<!-- 底部end -->

    [#include "_layout/_footjs.ftl"/]
    [#if section_footjs?? && section_footjs?is_macro]
        [@section_footjs /]
    [/#if]
</body>
</html>
[/#macro]