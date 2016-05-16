[#escape x as x?html]
    [#include "../_layout.ftl"]
    [#assign page_title="品类查询"/]
    [#assign page_keyword="品类查询"/]
    [#assign page_desc="品类查询"/]
    [#macro section_footjs]
    <script type="text/javascript" src="${JS_PATH}/common/address_select.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            laypage({
                cont: 'pager',
                pages: ${(pagedList.totalPage)!1},
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

    [#macro section_css]
    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/in-gggg.css">
    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/pinlei-sq.css">
    [/#macro]
    [@mainLayout]



    <div class="d-pl">
        <div class="d-gl">
    <form action="../category/findCategoryPrices">
            <div class="d-gl1">
                <span class="s-p1">品类名：<input class="i-i" name="name" value="${pageInput.name!}" style="height: 24px;"/></span>
                    <span class="s-p2">集散中心：

                        <select class="v" name="allocCenterId">
                            <option value="">请选择</option>
                            [#if relationOutputs??]
                                [#list relationOutputs as relation]
                                    <option value="${relation.centerId!}" [#if pageInput.allocCenterId??][#if pageInput.allocCenterId==relation.centerId]selected[/#if][/#if]>${relation.allocCenterName!}</option>
                                [/#list]
                            [/#if]

                        </select>

                    </span>
                    <span class="d-cx1">
                        <input class="d-cx" type="submit" value="查询" style="border: none;outline:medium;"/>
                    </span>
            </div>



            <div class="address_select d-gl2" >
                <span class="s-p2"> 省份：
               <select class="v" name="endProvinceId" >
                    <option value="" >请选择</option>
                    [#list provinces as data]
                        <option value="${data.id}" [#if pageInput.endProvinceId??][#if pageInput.endProvinceId==data.id]selected[/#if][/#if]>${data.areaName}</option>
                    [/#list]
                </select>

                &nbsp;市级：
                <select class="v" name="endCityId" >
                    <option value="" >请选择</option>
                    [#if citys??]
                        [#list citys as city]
                            <option value="${city.id}" [#if pageInput.endCityId??][#if pageInput.endCityId==city.id]selected[/#if][/#if]>${city.areaName}</option>
                        [/#list]
                    [/#if]
                </select>

                &nbsp;区县：
               <select class="v"  name="endCountryId" >
                    <option value="" >请选择</option>
                    [#if countrys??]
                        [#list countrys as country]
                            <option value="${country.id}" [#if pageInput.endCountryId??][#if pageInput.endCountryId==country.id]selected[/#if][/#if]>${country.areaName}</option>
                        [/#list]
                    [/#if]
                </select>
                </span>
            </div>
    </form>

        </div>

        <div class="d-chax">
            <ul>
                <li class="p-1">品类名</li>
                <li class="p-2">省市区</li>
                <li class="p-3">价格区间</li>
                <li class="p-4">品类属性</li>
                <li class="p-5">集散中心</li>
            </ul>
        </div>

        <div class="d-cz1">
            [#if pagedList.totalPage??]
            [#list pagedList.content as category]
            <div class="d-cz2" style="height: 40px;">
                <ul>
                    <li class="n1">${category.name!}</li>
                    <li class="n2">${category.endProvinceName!} ${category.endCityName!} ${category.endCountryName!}</li>
                    <li class="n5">
                        <table style="width:100%;margin-top:-10px;text-align: left;">
                            <tr>
                                [#if category.priceTitle??]
                                    [#list category.priceTitle as title]
                                        <td>${title}</td>
                                    [/#list]
                                [#else ]
                                    <td>&nbsp;</td>
                                [/#if]

                            </tr>
                            <tr>
                                [#if category.prices??]
                                    [#list category.prices as price]
                                        <td>${price}</td>
                                    [/#list]
                                [#else ]
                                    <td>&nbsp;</td>
                                [/#if]
                            </tr>
                            [#--<tr>
                                <td>0-500</td>
                                <td>500-2000</td>
                                <td>2000-5400</td>
                                <td>5000-9999999</td>
                            </tr>
                            <tr></tr>--]

                        </table>
                    </li>
                    <li class="n6">
                        [#if category.goodType??]
                            [#if category.goodType==1]重货[/#if]
                            [#if category.goodType==2]抛货[/#if]
                            [#if category.goodType==3]重抛货[/#if]
                            [#else]
                            &nbsp;
                        [/#if]
                    </li>
                    <li class="n8" >${category.allocCenterName!}</li>

                </ul>
            </div>
            [/#list]
            [#else]
                <div class="d-cz2" style="text-align: center;">
                    暂无数据
                </div>
            [/#if]
            </div>
        </div>

    <div id="pager" class="pager"></div>

    [/@mainLayout]
[/#escape]