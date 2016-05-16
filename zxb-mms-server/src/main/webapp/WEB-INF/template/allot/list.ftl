[#escape x as x?html]
    [#include "../_layout.ftl" /]


    [#macro section_footjs]

    <script src="${SYS_PATH}/js/allot/list.js"></script>

    [/#macro]
    [#macro section_headcss]
        <style type="text/css">
            .form-group{
                padding-left:10px;
            }
            .panel-body{
                padding:5px 10px;
            }
        </style>
    [/#macro]
    [@mainLayout]
    <div class="wrapper wrapper-content animated fadeInRight" style="padding-bottom: 0;">
        <div class="row">
            <div class="col-sm-12">
                <div class="panel panel-default" style="margin-bottom: 10px;">
                    <form class="form-inline" id="queryForm" onsubmit="javascript:return false;">
                    <div class="panel-body">

                            <div class="form-group">
                                <label for="centerId">集散</label>
                                <select id="centerId" name="centerId" class="form-control">
                                    <option value>全部</option>
                                    [#if allots??]
                                    [#list allots as allot ]
                                        <option value="${allot.id!}">${allot.name!}</option>
                                    [/#list]
                                    [/#if]
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="year">年份</label>
                                <select id="year" name="year" class="form-control">
                                    <option value>全部</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="month">月份</label>
                                <select id="month" name="month" class="form-control">
                                    <option value>全部</option>
                                    <option value="0">1月</option>
                                    <option value="1">2月</option>
                                    <option value="2">3月</option>
                                    <option value="3">4月</option>
                                    <option value="4">5月</option>
                                    <option value="5">6月</option>
                                    <option value="6">7月</option>
                                    <option value="7">8月</option>
                                    <option value="8">9月</option>
                                    <option value="9">10月</option>
                                    <option value="10">11月</option>
                                    <option value="11">12月</option>
                                </select>
                            </div>

                            <div class="form-group">
                                <label for="provinceId">目的地(省)</label>
                                <select id="provinceId" name="provinceId" class="form-control">
                                    <option value="">全部</option>
                                    [#if provices??]
                                        [#list provices as p ]
                                            <option value="${p.id!}">${p.areaName!}</option>
                                        [/#list]
                                    [/#if]
                                </select>
                            </div>

                            <div class="form-group">
                                <label for="cityId">目的地(市)</label>
                                <select id="cityId" name="cityId" class="form-control">
                                    <option value="">全部</option>
                                </select>
                            </div>

                            <input name="orderParam" value="" type="hidden">


                    </div>
                    <div class="panel-body">
                        <div class="form-group">
                            <label for="orderBy1">排序：第一项</label>
                            <select id="orderBy1" name="orderBy1" class="form-control">
                                <option value="">不限</option>
                                <option value="lineSupplierCount">调度供应商数</option>
                                <option value="totalWayBillCount">总票数</option>
                                <option value="avgTotalWayBillCount">日均票数</option>
                                <option value="unusualWayBillCount">异常票数</option>
                                <option value="totalAmount">总金额</option>
                                <option value="avgTotalAmount">日均金额</option>
                                <option value="totalOfferWight">总重量</option>
                                <option value="avgTotalOfferWight">日均重量</option>
                                <option value="totalOfferVolume">总体积</option>
                                <option value="avgTotalOfferVolume">日均体积</option>
                            </select>
                            <select id="orderType1" name="orderType1" class="form-control">
                                <option value="asc">不限</option>
                                <option value="asc">升序</option>
                                <option value="desc">降序</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="orderBy2">第二项</label>
                            <select id="orderBy2" name="orderBy2" class="form-control">
                                <option value="">不限</option>
                                <option value="lineSupplierCount">调度供应商数</option>
                                <option value="totalWayBillCount">总票数</option>
                                <option value="avgTotalWayBillCount">日均票数</option>
                                <option value="unusualWayBillCount">异常票数</option>
                                <option value="totalAmount">总金额</option>
                                <option value="avgTotalAmount">日均金额</option>
                                <option value="totalOfferWight">总重量</option>
                                <option value="avgTotalOfferWight">日均重量</option>
                                <option value="totalOfferVolume">总体积</option>
                                <option value="avgTotalOfferVolume">日均体积</option>
                            </select>

                            <select id="orderType2" name="orderType2" class="form-control">
                                <option value="asc">不限</option>
                                <option value="asc">升序</option>
                                <option value="desc">降序</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="orderBy3">第三项</label>
                            <select id="orderBy3" name="orderBy3" class="form-control">
                                <option value="">不限</option>
                                <option value="lineSupplierCount">调度供应商数</option>
                                <option value="totalWayBillCount">总票数</option>
                                <option value="avgTotalWayBillCount">日均票数</option>
                                <option value="unusualWayBillCount">异常票数</option>
                                <option value="totalAmount">总金额</option>
                                <option value="avgTotalAmount">日均金额</option>
                                <option value="totalOfferWight">总重量</option>
                                <option value="avgTotalOfferWight">日均重量</option>
                                <option value="totalOfferVolume">总体积</option>
                                <option value="avgTotalOfferVolume">日均体积</option>
                            </select>

                            <select id="orderType3" name="orderType3" class="form-control">
                                <option value="asc">不限</option>
                                <option value="asc">升序</option>
                                <option value="desc">降序</option>
                            </select>
                        </div>
                        <button type="button" class="btn btn-w-m btn-info" id="queryButton" style="margin-left: 10px;">查询</button>
                    </div>
                    </form>
                </div>

                <table id="table"
                       data-classes="table table-hover table-condensed"
                       data-striped="true"
                       data-toolbar="#tableToobar"
                       data-show-refresh="true"
                       data-pagination="true"
                       data-id-field="id"
                       data-page-list="[10, 25, 50, 100, ALL]"
                       data-side-pagination="server"
                       data-url="${SYS_PATH}/allotCenter/data"
                       data-response-handler="responseHandler"
                       data-query-params="queryParams"
                       data-query-params-type="">
                </table>
            </div>
        </div>
    </div>

    [/@mainLayout]
[/#escape]
