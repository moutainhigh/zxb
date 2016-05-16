[#escape x as x?html]
    [#include "../_layout.ftl"]
    [#include "../_layout/_pagination.ftl"]
    [#assign page_title="品类申请"/]
    [#assign page_keyword="品类申请"/]
    [#assign page_desc="品类申请"/]
    [#macro section_footjs]
    <script type="text/javascript" src="${JS_PATH}/plupload.full.min.js"></script>
    <script type="text/javascript" src="${JS_PATH}/category/index.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            laypage({
                cont: 'pager',
                pages: ${pagedList.totalPage!1},
                curr: function () { //通过url获取当前页，也可以同上（pages）方式获取
                    var page = location.search.match(/pageNo=(\d+)/);
                    return page ? page[1] : 1;
                }(),
                jump: function (e, first) { //触发分页后的回调

                    if (!first) { //一定要加此判断，否则初始时会无限刷新
                        var pageRe = /pageNo=(\d+)/;
                        if (pageRe.test(location.search)) {
                            location.href = location.href.replace(pageRe, "pageNo=" + e.curr);
                        } else {
                            if(location.search==''){
                                location.href = location.href + "?pageNo=" + e.curr;
                            }else{
                            location.href = location.href + "&pageNo=" + e.curr;
                            }
                        }

                    }
                }

            });
        });
    </script>
    [/#macro]

    [#macro section_headcss]
    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/in-gggg.css">
    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/pinlei-sq.css">
    [/#macro]

    [#macro section_css]
    <style>

        .progress {
            margin-top: 2px;
            width: 200px;
            height: 14px;
            margin-bottom: 10px;
            overflow: hidden;
            background-color: #f5f5f5;
            border-radius: 4px;
            -webkit-box-shadow: inset 0 1px 2px rgba(0, 0, 0, .1);
            box-shadow: inset 0 1px 2px rgba(0, 0, 0, .1);
        }
        .progress-bar {
            background-color: rgb(92, 184, 92);
            background-image: linear-gradient(45deg, rgba(255, 255, 255, 0.14902) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, 0.14902) 50%, rgba(255, 255, 255, 0.14902) 75%, transparent 75%, transparent);
            background-size: 40px 40px;
            box-shadow: rgba(0, 0, 0, 0.14902) 0px -1px 0px 0px inset;
            box-sizing: border-box;
            color: rgb(255, 255, 255);
            display: block;
            float: left;
            font-size: 12px;
            height: 20px;
            line-height: 20px;
            text-align: center;
            transition-delay: 0s;
            transition-duration: 0.6s;
            transition-property: width;
            transition-timing-function: ease;
            width: 266.188px;
        }
    </style>
    [/#macro]
    [@mainLayout]
<form id="indexForm" action="../category/index">
    <input id="baseUrl" type="hidden">
    <div class="d-pl">
        <div class="d-gl">
            <div class="d-gl1">
                <span class="s-p1">品类名：<input class="i-i" name="name" value="${pageInput.name!}" style="height:24px;"/></span>
                <span class="s-p2">集散中心：
                     <select class="i-i" id="allocCenterId" name="allocCenterId" style="height: 28px;">
                         <option value="">请选择</option>
                         [#if relationOutputs??]
                             [#list relationOutputs as relation]
                                 <option value="${relation.centerId!}" [#if pageInput.allocCenterId??][#if pageInput.allocCenterId==relation.centerId]selected[/#if][/#if]>${relation.allocCenterName!}</option>
                             [/#list]
                         [/#if]

                     </select>
                </span>
                <span class="s-p3">状态：
                    <select class="i-i" name="status" style="height: 28px;">
                        <option value="">请选择</option>
                        <option value="0" [#if pageInput.status??][#if pageInput.status==0]selected[/#if][/#if]>未申请</option>
                        <option value="1" [#if pageInput.status??][#if pageInput.status==1]selected[/#if][/#if]>未审核</option>
                        <option value="2" [#if pageInput.status??][#if pageInput.status==2]selected[/#if][/#if]>审核通过</option>
                        <option value="3" [#if pageInput.status??][#if pageInput.status==3]selected[/#if][/#if]>审核拒绝</option>
                    </select>
                </span>
            </div>

            <div class="d-cx">
                <input id="submitBtn" class="d-cx"  type="button" style="border: none;outline:medium;" value="查询"/>
            </div>
            <div class="d-pinl" id="addBtn">
               品类申请
            </div>

        </div>



        <div class="d-cz">
            <ul>
                <li class="s1">申请时间</li>
                <li class="s2">品类名</li>
                <li class="s3">状态</li>
                <li class="s4">重轻比</li>
                <li class="s5">包装</li>
                <li class="s6">集散中心</li>
                <li class="s7">操作</li>
            </ul>
        </div>
        [#if pagedList.totalPage!=0]
        [#list pagedList.content as category]
        <div class="d-cz1">
            <div class="d-cz2">
                <ul>
                    <li class="l1">[#if category.applyTime??]${category.applyTime?string("yyyy-MM-dd")}[#else]&nbsp;[/#if]</li>
                    <li class="l2">${category.name!}</li>
                    <li class="l3">
                        [#if category.status??]
                            [#if category.status==0]未申请
                            [#elseif category.status==1]未审核
                            [#elseif category.status==2]审核通过
                            [#elseif category.status==3]审核拒绝
                            [/#if]
                        [#else]未申请
                        [/#if]
                    </li>
                    <li class="l4">${category.rateHeavy!}:${category.rateLight!}</li>
                    <li class="l5">
                        [#if category.pack??]
                            [#if category.pack=='0']无
                            [#elseif category.pack=='1']纸箱
                            [#elseif category.pack=='2']袋
                            [#elseif category.pack=='3']桶
                            [#elseif category.pack=='4']包
                            [#elseif category.pack=='5']托
                            [#elseif category.pack=='6']木架
                            [#elseif category.pack=='7']纸
                            [#else]${category.pack}
                            [/#if]
                        [/#if]
                    </li>
                    <li class="l6">${category.allocCenterName!}</li>
                        [#if category.status??]
                            [#if category.status==0]
                                <li class="l7 applyBtn" style="color:#1e79d2"  target="${category.allotId!}">申请</li>
                                <li class="l8" style="color:#1e79d2" onclick="editCategory(${category.id})">｜ 编辑 ｜</li>
                            [#else ]
                                <li class="l7"></li>
                                <li class="l8" ></li>
                            [/#if]
                        [#else]
                            <li class="l7 applyBtn" style="color:#1e79d2" target="${category.allotId!}">申请</li>
                            <li class="l8" style="color:#1e79d2" onclick="editCategory(${category.id})">｜ 编辑 ｜</li>
                        [/#if]

                    <li class="l9" style="color:#1e79d2;[#if category.status??][#if category.status!=0]margin-left: 45px;[/#if][/#if]" onclick="showDetail(${category.allotId})">详情</li>
                </ul>
            </div>
        </div>
        [/#list]
        [#else ]
        <div class="d-cz1" style="line-height: 400px;text-align: center;">

                    暂无数据

        </div>
        [/#if]
        </div>
    <div id="pager" class="pager"></div>

</form>


    [/@mainLayout]
[/#escape]