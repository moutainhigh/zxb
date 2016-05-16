[#-- @ftlvariable name="menuItems" type="java.util.List<com.wangkuo.zxb.mms.web.viewmodel.MenuItem>" --]
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">

    <title>营销管理系统 - 主页</title>

    <meta name="keywords" content="营销管理系统">
    <meta name="description" content="营销管理系统">

    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;${SYS_PATH}/common/ie"/>
    <![endif]-->

    <link rel="shortcut icon" href="favicon.ico">
[#include "_layout/_css.ftl"/]
</head>

<body class="fixed-sidebar full-height-layout gray-bg" style="overflow:hidden">
<div id="wrapper">
    <!--左侧导航开始-->
    <nav class="navbar-default navbar-static-side" role="navigation">
        <div class="nav-close"><i class="fa fa-times-circle"></i>
        </div>
        <div class="sidebar-collapse">
            <ul class="nav" id="side-menu">

                <li class="nav-header">
                    <div class="dropdown profile-element">
                        <span><img alt="image" class="img-circle" src="${IMG_PATH}/profile.jpg"
                                   style="width:64px;height: 64px;"/></span>
                                <span class="clear">
                               <span class="block m-t-xs"><strong class="font-bold">${(CURRENT_USER.realName)!}</strong></span>
                                <span class="text-muted text-xs block">${(CURRENT_USER.isAdmin?string("管理员","用户"))!}</span>
                                </span>
                    </div>
                </li>



            [#list menuItems as menuItem]
                <li>
                    [#if menuItem.url?? && menuItem.url?lower_case?starts_with("http://")]
                        [#assign url=menuItem.url]
                    [#else]
                        [#if menuItem.url?? && menuItem.url?has_content]
                            [#assign url=SYS_PATH + menuItem.url]
                        [#else]
                            [#assign url="#"]
                        [/#if]
                    [/#if]

                    <a [#if url!="#"]class="J_menuItem"[/#if] href="${url!"#"}">
                        <i class="fa fa-desktop"></i>
                        <span class="nav-label">${menuItem.text!}</span>
                        [#if menuItem.childMenus?? && menuItem.childMenus?has_content]
                        <span class="fa arrow"></span>
                        [/#if]
                    </a>

                    [#if menuItem.childMenus?? && menuItem.childMenus?has_content]
                        <ul class="nav nav-second-level">
                            [#list menuItem.childMenus as subMenuItem]
                                <li>
                                    [#if subMenuItem.url?? && subMenuItem.url?lower_case?starts_with("http://")]
                                        [#assign subUrl=subMenuItem.url]
                                    [#else]
                                        [#if subMenuItem.url?? && subMenuItem.url?has_content]
                                            [#assign subUrl=SYS_PATH + subMenuItem.url]
                                        [#else]
                                            [#assign subUrl="#"]
                                        [/#if]
                                    [/#if]
                                    <a class="J_menuItem" href="${subUrl!"#"}">${subMenuItem.text!}</a>
                                </li>
                            [/#list]
                        </ul>
                    [/#if]
                </li>
            [/#list]

                [#--
                <li>
                    <a href="#">
                        <i class="fa fa-edit"></i>
                        <span class="nav-label">内客户管理</span>
                        <span class="fa arrow"></span>
                    </a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a class="J_menuItem" href="${SYS_PATH}/inneruser/list" data-index="3">内客户信息</a>
                        </li>
                    </ul>
                </li>

                <li>
                    <a href="#">
                        <i class="fa fa-edit"></i>
                        <span class="nav-label">外客户管理</span>
                        <span class="fa arrow"></span>
                    </a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a class="J_menuItem" href="${SYS_PATH}/outer/list" data-index="0">外客户信息</a>
                        </li>

                    </ul>
                    <ul class="nav nav-second-level">
                        <li>
                            <a class="J_menuItem" href="${SYS_PATH}/benchmark/price/list" data-index="0">查询基准价</a>
                        </li>

                    </ul>
                </li>
                <li>
                    <a class="J_menuItem" href="${SYS_PATH}/merchant/report">
                        <i class="fa fa-table"></i>
                        <span class="nav-label">推广成绩汇总</span>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <i class="fa fa-home"></i>
                        <span class="nav-label">集散发货属性</span>
                        <span class="fa arrow"></span>
                    </a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a class="J_menuItem" href="${SYS_PATH}/allotCenter/index" data-index="0">数据表模式</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="${SYS_PATH}/allotCenter/chart" data-index="0">趋势图模式</a>
                        </li>
                    </ul>
                </li>

                <li>
                    <a class="J_menuItem" href="${SYS_PATH}/region_stats/list">
                        <i class="fa fa fa-bar-chart-o"></i>
                        <span class="nav-label">营销区域统计</span></a>
                </li>

                <li>
                    <a href="#">
                        <i class="fa fa-home"></i>
                        <span class="nav-label">系统管理</span>
                        <span class="fa arrow"></span>
                    </a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a class="J_menuItem" href="${SYS_PATH}/user/list" data-index="0">用户管理</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="${SYS_PATH}/region/list" data-index="1">区域设置</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="${SYS_PATH}/dict/index" data-index="2">参数设置</a>
                        </li>

                    </ul>
                </li>
                --]
            </ul>
        </div>
    </nav>
    <!--左侧导航结束-->
    <!--右侧部分开始-->
    <div id="page-wrapper" class="gray-bg dashbard-1">
        <div class="row content-tabs">
            <button class="roll-nav roll-left J_tabLeft"><i class="fa fa-backward"></i>
            </button>
            <nav class="page-tabs J_menuTabs">
                <div class="page-tabs-content">
                    <a href="javascript:;" class="active J_menuTab" data-id="index_v1.html">首页</a>
                </div>
            </nav>
            <button class="roll-nav roll-right J_tabRight"><i class="fa fa-forward"></i>
            </button>
            <div class="btn-group roll-nav roll-right">
                <button class="dropdown J_tabClose" data-toggle="dropdown">关闭操作<span class="caret"></span>

                </button>
                <ul role="menu" class="dropdown-menu dropdown-menu-right">
                    <li class="J_tabShowActive"><a>定位当前选项卡</a>
                    </li>
                    <li class="divider"></li>
                    <li class="J_tabCloseAll"><a>关闭全部选项卡</a>
                    </li>
                    <li class="J_tabCloseOther"><a>关闭其他选项卡</a>
                    </li>
                </ul>
            </div>
            <a href="${SYS_PATH}/logout" class="roll-nav roll-right J_tabExit"><i class="fa fa fa-sign-out"></i> 退出</a>
        </div>
        <div class="row J_mainContent" id="content-main">
            <iframe class="J_iframe" name="iframe0" width="100%" height="100%" src="about:blank" frameborder="0"
                    data-id="about:blank" seamless></iframe>
        </div>
        <div class="footer">
            <div class="pull-right">
                浙江专线宝网阔物联科技有限公司
            </div>
        </div>
    </div>
    <!--右侧部分结束-->
    <!--右侧边栏开始-->
    <!--右侧边栏结束-->
</div>

<!-- 全局js -->
<script type="text/javascript" src="${JS_PATH}/jquery.min.js?v=2.1.4"></script>
<script type="text/javascript" src="${JS_PATH}/bootstrap.min.js?v=3.3.6"></script>
<script type="text/javascript" src="${JS_PATH}/plugins/metisMenu/jquery.metisMenu.js"></script>
<script type="text/javascript" src="${JS_PATH}/plugins/slimscroll/jquery.slimscroll.min.js"></script>
<script type="text/javascript" src="${JS_PATH}/plugins/layer/layer.min.js"></script>


<!-- 自定义js -->
<script type="text/javascript" src="${JS_PATH}/hplus.js?v=4.1.0"></script>
<script type="text/javascript" src="${JS_PATH}/contabs.js"></script>

<!-- 第三方插件 -->
<script type="text/javascript" src="${JS_PATH}/plugins/pace/pace.min.js"></script>

</body>

</html>
