[#-- @ftlvariable name="pagedList" type="com.wangkuo.zxb.lsp.api.dto.output.PagedList<com.wangkuo.zxb.lsp.api.dto.output.WaybillAndFeeOutput>" --]
[#escape x as x?html]
    [#include "../_layout.ftl"]
    [#include "../_layout/_pagination.ftl"]
    [#assign page_title="运单管理"/]
    [#assign page_keyword="运单管理"/]
    [#assign page_desc="运单管理"/]
    [#macro section_footjs]

    <script type="text/javascript" src="${JS_PATH}/My97DatePicker/WdatePicker.js"></script>
    <script type="text/javascript" src="${JS_PATH}/waybill/list.js"></script>
    <script type="text/javascript">
        laypage({
                    cont: 'pager',
                    pages: [#if pagedList??] ${pagedList.totalPage!1}[#else] 1 [/#if],
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
    <link rel="stylesheet" type="text/css" href="${CSS_PATH}/in-gggg.css">
    <link rel="stylesheet" type="text/css" href="${CSS_PATH}/liebiao.css">
    [/#macro]

    [@mainLayout]

    <form method="get" id="queryFrm">
    <div class="d-tx">
        <ul>

            <li>
                <span class="ks">快速查询：</span>
                <input id="searchString" name="searchString" class="in in-w" type="text" value="${input.searchString!}" placeholder=" 请输入运单号,货物名,收发货方信息">
            </li>

            <li>
                <span class="yd">开单日期：</span>
                <input id="operationTimeBegin" name="operationTimeBegin" class="in" type="text" value="${(input.operationTimeBegin?string("yyyy-MM-dd"))!''}"
                       onClick="WdatePicker({maxDate:'%y-%M-%d'})" >
                <span class="s-d"> 到</span>
                <input id="operationTimeEnd" name="operationTimeEnd" class="in" type="text" value="${(input.operationTimeEnd?string("yyyy-MM-dd"))!''}"
                       onClick="WdatePicker({maxDate:'%y-%M-%d'})">
            </li>

            <li class="l-f1">
                <span class="mc">费用状态：</span>
                <select class="t" name="feeStatus">
                    <option value="" >请选择</option>
                    <option value="1" [#if input.feeStatus??][#if input.feeStatus==1]selected[/#if][/#if]>待付款</option>
                    <option value="2" [#if input.feeStatus??][#if input.feeStatus==2]selected[/#if][/#if]>已付款</option>
                    <option value="3" [#if input.feeStatus??][#if input.feeStatus==3]selected[/#if][/#if]>待收款</option>
                    <option value="4" [#if input.feeStatus??][#if input.feeStatus==4]selected[/#if][/#if]>已收款</option>
                    <option value="6" [#if input.feeStatus??][#if input.feeStatus==6]selected[/#if][/#if]>已作废</option>
                </select>
            </li>

            <li>
                <span class="yd">运单状态：</span>
                <select class="t" name="waybillStatus">
                    <option value="" >请选择</option>
                    <option value="0" [#if input.waybillStatus??][#if input.waybillStatus==0]selected[/#if][/#if]>等待报价</option>
                    <option value="5" [#if input.waybillStatus??][#if input.waybillStatus==5]selected[/#if][/#if]>已确认交易</option>
                    <option value="15" [#if input.waybillStatus??][#if input.waybillStatus==15]selected[/#if][/#if]>待配载</option>
                    <option value="20" [#if input.waybillStatus??][#if input.waybillStatus==20]selected[/#if][/#if]>未发车</option>
                    <option value="25" [#if input.waybillStatus??][#if input.waybillStatus==25]selected[/#if][/#if]>已发车</option>
                    <option value="30" [#if input.waybillStatus??][#if input.waybillStatus==30]selected[/#if][/#if]>集散已落地</option>
                    <option value="35" [#if input.waybillStatus??][#if input.waybillStatus==35]selected[/#if][/#if]>运输中</option>
                    <option value="40" [#if input.waybillStatus??][#if input.waybillStatus==40]selected[/#if][/#if]>待签收</option>
                    <option value="45" [#if input.waybillStatus??][#if input.waybillStatus==45]selected[/#if][/#if]>已签收</option>
                    <option value="60" [#if input.waybillStatus??][#if input.waybillStatus==60]selected[/#if][/#if]>签收异常</option>
                    <option value="50" [#if input.waybillStatus??][#if input.waybillStatus==50]selected[/#if][/#if]>已关闭</option>
                </select>
            </li>

            <li class="l-anniu">
                <div class="s-cx" id="queryWaybill">查询</div>
            </li>
        </ul>
    </div>
    </form>


    <div class="d-lb">
        <div class="kd">
            <ul>
                <li class="l-k1">开单日期</li>
                <li class="l-k2">运单号</li>
                <li class="l-k3">货物信息</li>
                <li class="l-k4">收货方</li>
                <li class="l-k5">状态</li>
                <li class="l-k6">操作</li>
            </ul>
        </div>
        <div class="d-nr">
            <div class="d-bk">
                [#if pagedList??]
                [#list pagedList.content as item]
                <div class="[#if item_index%2==1 ]d-bk2[#else]d-bk1[/#if]">
                    <ul>
                        <li style="margin-bottom: 10px; float: left;">
                            <span class="c-1" style="width:100px; margin-left:40px;">${(item.operationTime?string("yyyy-MM-dd"))!''}</span>
                            <span class="c-2" style="width:140px;">${item.systemSn!""}</span>
                            <span class="c-3" style="width:280px;">${item.goodName!""}, ${item.pack!"无包装"} , ${item.num!""}件,${item.offerWeight!""}公斤, ${item.offerVolume!""}立方</span>
                            <span class="c-4" style="width:150px;">${item.getReceiveLinkName()!""}</span>
                            <span class="c-5" style="width:100px;">
                                [#if item.status??]
                                    [#if item.status==0]等待报价
                                    [#elseif item.status==5]已确认交易
                                    [#elseif item.status==10]安排提货
                                    [#elseif item.status==15]待配载
                                    [#elseif item.status==20]未发车
                                    [#elseif item.status==25]已发车
                                    [#elseif item.status==30]集散已落地
                                    [#elseif item.status==35]运输中
                                    [#elseif item.status==40]待签收
                                    [#elseif item.status==45]已签收
                                    [#elseif item.status==60]签收异常
                                    [#elseif item.status==50]已关闭
                                    [/#if]
                                [/#if]
                            </span>
                            <span class="c-6" style="width:40px; margin-left: 45px;"><a href="detail/${item.id}">详情</a></span>
                            [#if (item.status?? && item.status==0)]<span class="c-7" style="width:40px;"><a href="javascript:void(0)" onclick="closeWaybill(${item.id})">关闭</a></span>[/#if]
                        </li>
                        [#if item.feeList??]
                            [#list item.feeList as itemfee]
                        <li class="l-i">

                            <span class="c-9" style="width:100px; ">${(itemfee.bookerTime?string("yyyy-MM-dd"))!''}</span>

                            <span class="c-10" style="width:70px; ">
                                [#if itemfee.type==1]-[/#if]
                                [#if itemfee.type==2]改单费[/#if]
                                [#if itemfee.type==3]异常费[/#if]
                            </span>
                            <span class="c-10" style="width:100px; font-weight: bold; [#if itemfee.zbReceiveAllFee?? && itemfee.zbReceiveAllFee >0] color: red;[#else]color: #01bf00;[/#if]">
                                ${itemfee.zbReceiveAllFee!""} 元
                            </span>

                            <span class="c-10" style="width: 150px;">

                                [#if itemfee.status??]
                                    [#if itemfee.status==0]
                                        [#if (itemfee.zbReceiveAllFee?? && itemfee.zbReceiveAllFee >=0) ]待付款[#else]待收款[/#if]
                                    [#elseif itemfee.status==1]
                                        [#if (itemfee.zbReceiveAllFee?? && itemfee.zbReceiveAllFee >=0) ]已付款[#else]已收款[/#if]
                                    [#elseif itemfee.status==2]已免单
                                    [#elseif itemfee.status==3]已作废
                                    [/#if]
                                [#else]待支付
                                [/#if]
                            </span>
                            [#if (!itemfee.status?? || itemfee.status==0) && (itemfee.zbReceiveAllFee?? && itemfee.zbReceiveAllFee >0) ]
                                <span class="c-11" style="margin-left:25px;">
                                    <a href="${SYS_PATH}/payment/${item.id}/${itemfee.id}" >立即付款</a>
                                </span>
                            [/#if]
                        </li>
                            [/#list]
                        [/#if]
                    </ul>
                </div>
                [/#list]
                [/#if]
            </div>

            <div id="pager" class="pager"></div>
        </div>
    [/@mainLayout]
[/#escape]