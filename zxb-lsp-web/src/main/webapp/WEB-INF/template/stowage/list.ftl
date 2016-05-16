[#-- @ftlvariable name="pagedList" type="com.wangkuo.zxb.lsp.api.dto.output.PagedList<com.wangkuo.zxb.lsp.api.dto.output.StowageOutput>" --]
[#escape x as x?html]
    [#include "../_layout.ftl"]
    [#include "../_layout/_pagination.ftl"]
    [#assign page_title="配载管理"/]
    [#assign page_keyword="配载管理"/]
    [#assign page_desc="配载管理"/]
    [#macro section_footjs]
    <script type="text/javascript" src="${JS_PATH}/My97DatePicker/WdatePicker.js"></script>
    <script type="text/javascript" src="${JS_PATH}/stowage/stowage.js"></script>


    <script type="text/javascript">
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
                            if (location.href.indexOf("?") > 0) {
                                location.href = location.href + "&pageNo=" + e.curr;
                            } else {
                                location.href = location.href + "?pageNo=" + e.curr;
                            }
                        }
                    }
                }
            }
        );



    </script>

    [/#macro]

    [#macro section_headcss]
    [#--<link rel="stylesheet" type="text/css" href="${CSS_PATH}/wofahuo-shouyan.css">--]
    <link rel="stylesheet" type="text/css" href="${CSS_PATH}/peizai.css">

    [/#macro]
    [@mainLayout]
    [#--<div class="ybk" style="background:#FFF">--]
        <div class="juzhong">
            <form method="get" id="queryFrm">
            <div class="zk1">
                <div class="zk-1">
                    <span class="kd">配载日期：</span>
                    <input name="beginTime" id="queryStartTime" type="text" class="in" style="width:75px;" value="${(input.beginTime?string("yyyy-MM-dd"))!}"
                           onClick="WdatePicker({maxDate:'#F{$dp.$D(\'queryEndTime\')||\'%y-%M-%d\'}'})"/>
                    <span class="kd">&nbsp;-&nbsp;</span>
                    <input name="endTime" id="queryEndTime" type="text" class="in" style="width:75px;" value="${(input.endTime?string("yyyy-MM-dd"))!}"
                           onClick="WdatePicker({minDate:'#F{$dp.$D(\'queryStartTime\')}',maxDate:'%y-%M-%d'})">

                    <span class="yd">司机：</span>
                    <input class="in" name="driverName" type="" value="${input.driverName!}">

                    <span class="mc">车牌号：</span>
                    <input class="in" name="plateNumber" type="" value="${input.plateNumber!}">
                </div>
                <div class="zk-3">
                    <div class="zk-33">
                        <span class="kd">状态：</span>
                        <select class="t" name="status">
                            <option value="" >请选择</option>
                            <option value="0" [#if input.status??][#if input.status==0]selected[/#if][/#if]>未发车</option>
                            <option value="5" [#if input.status??][#if input.status==5]selected[/#if][/#if]>已发车</option>
                            <option value="10" [#if input.status??][#if input.status==10]selected[/#if][/#if]>已落货</option>
                        </select>

                        <span class="yd">集散中心：</span>
                        <select class="t" name="allocCenterId">
                            <option value="">请选择</option>
                            [#if relationOutputs??]
                                [#list relationOutputs as relation]
                                    <option value="${relation.centerId!}" [#if input.allocCenterId??][#if input.allocCenterId==relation.centerId]selected[/#if][/#if]>${relation.allocCenterName!}</option>
                                    [#--<option value="${relation.centerId!}">${relation.allocCenterName!}</option>--]
                                [/#list]
                            [/#if]
                        </select>
                    </div>
                    <div class="s-cx" id="queryStowage">查询</div>
                    <div class="s-hb" id="new-stowage">新建配载</div>
                </div>
            </div>
            </form>
            <table width="916" height="33" border="0" align="center" cellpadding="0" cellspacing="0" style="font-size:14px; background:#ebf2f8;" >
                <tr>
                    <td width="107" align="center">配载日期</td>
                    <td width="106" align="center">车牌号</td>
                    <td width="60" align="center">司机</td>
                    <td width="133" align="center">司机电话</td>
                    <td width="66" align="center">车身长</td>
                    <td width="109" align="center">集散中心</td>
                    <td width="82" align="center">状态</td>
                    <td width="260" align="center">操作</td>
                </tr>
            </table>
            [#list pagedList.content as item]
                <table width="916" height="33" border="0" align="center" cellpadding="0" cellspacing="0" style="font-size:13px;">
                    <tr>
                        <td width="107" align="center">${item.stowageTime?string("yyyy-MM-dd")}</td>
                        <td width="106" align="center" >${item.plateNumber!}</td>
                        <td width="60" align="center">${item.driverName!}</td>
                        <td width="133" align="center" >${item.driverPhone!}</td>
                        <td  width="66" align="center">${item.truckLength!}</td>
                        <td width="109" align="center">${item.allocCenterName!}</td>
                        <td width="82" align="center">[#if item.status??]
                                            [#if item.status==0]未发车[/#if]
                                            [#if item.status==5]已发车[/#if]
                                            [#if item.status==10]已落货[/#if]
                                            [/#if]
                        </td>
            <td width="260" align="center" >
                    [#if item.status == 0]
                        <a href="edit/${item.id}">编辑</a> ｜
                    [/#if]
                    <a href="${item.id}">查看详情</a>
                    [#if item.status == 0]
                        ｜<a href="javascript:void(0)" onclick="depart(${item.id})">确认发车</a>
                    [/#if]
            </td>
            </tr>
            </table>
            [/#list]
    </div>
    <div id="pager" class="pager"></div>

    [/@mainLayout]
[/#escape]