[#escape x as x?html]
    [#include "../_layout.ftl"]
    [#include "../_layout/_pagination.ftl"]
    [#assign page_title="收发货人列表"/]
    [#assign page_keyword="收发货人列表"/]
    [#assign page_desc="收发货人列表"/]
    [#macro section_footjs]
    <script type="text/javascript" src="${JS_PATH}/lspreceivershipper/index.js"></script>
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
    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/gl-fahuoren.css">
    [/#macro]
    [@mainLayout]
    <div class="ybk-1">
<form action="${SYS_PATH}/receicerShipper/index">
   <input id="type" type="hidden" value="${pageInput.type!0}" name="type"/>
    <input id="baseUrl" type="hidden"/>
    <div class="anquan">
    <div id="shipperLink" class="jb-x1" [#if pageInput.type??][#if pageInput.type==0]style="color:#ed6d00;"[/#if][#else]style="color:#ed6d00;"[/#if] >发货人管理</div>
    <div id="receiverLink" class="aq-a1" [#if pageInput.type??][#if pageInput.type==1]style="color:#ed6d00;"[/#if][/#if]>收货人管理</div>
    </div>

    <div class="input-sousuo">
        <div class="input-s">
            <input class="input-ss" type="" name="linkName" value="${pageInput.linkName!}" placeholder="请输入联系人或手机号" value=""/>
        </div>
        [#--<div class="text-ss">搜索</div>--]
        <input class="text-ss" type="submit" value="查询" style="line-height: 28px;border: none;outline:medium;"/>
        <div class="text-sh" onclick="javascript:updateRecord('${pageInput.id!}','${pageInput.type!0}')">
            新增[#if pageInput.type??][#if pageInput.type==0]发货人[/#if][#if pageInput.type==1]收货人[/#if][/#if]</div>
    </div>
</form>

    <div class="lb-kuang">
        <div class="cz-tiao">
            <ul>
                <li class="lx-1" style="margin-left:10px;">联系人</li>
                <li class="lx-2" style="margin-left:50px;">公司名称</li>
                <li>手机号码</li>
                <li>固定电话</li>
                <li class="lx-3" style="margin-left:100px;">发货地址/详细地址</li>
                <li class="lx-4" style="margin-left:130px;">操作</li>
            </ul>
        </div>

        [#if pagedList.content??]
            [#list pagedList.content as receiverShipper]
        <div class="lb-tiao">
            <ul>
                <li class="wxm" style="width:60px; margin-left:0px;">${receiverShipper.linkName!'-'}</li>
                <li style="width:120px;">${receiverShipper.companyName!'-'}&nbsp;</li>
                <li style="width:100px; margin-left:20px;">${receiverShipper.mobile!'-'}</li>
                <li style="width:100px;">${receiverShipper.phone!'-'}</li>
                <li style="width:240px;">${receiverShipper.provinceName!'-'}${receiverShipper.cityName!}${receiverShipper.countryName!}${receiverShipper.detailedAddress!}</li>
                <li style="width:160px;">
                    <a href="javascript:updateRecord(${receiverShipper.id})">修改</a>
                    <a href="javascript:deleteRecord(${receiverShipper.id})">删除</a>
                    [#if  receiverShipper.type??]
                        [#if  receiverShipper.type==0]
                            <a href="${SYS_PATH}/waybill/add?shipperId=${receiverShipper.id}">发货</a>
                        [#else]
                            <a href="${SYS_PATH}/waybill/add?receiverId=${receiverShipper.id}">发货</a>
                        [/#if]
                    [/#if]

                    [#if receiverShipper.defaultAddress?? && receiverShipper.defaultAddress==1]
                        <a href="#" style="color:#ff6700; text-decoration:none;">默认地址</a>
                    [#else]<a href="javascript:setDefault(${receiverShipper.id})">设为默认</a>
                    [/#if]
                </li>
            </ul>
        </div>
            [/#list]
        [/#if]

    </div>
</div>
    <div id="pager" style="text-align: center"></div>
    [/@mainLayout]
[/#escape]