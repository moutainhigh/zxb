[#escape x as x?html]
    [#include "../_layout.ftl" /]

    [#macro section_headcss]
    <style type="text/css">
        .form-group{
            padding-left:10px;
        }
        .circle {
            width: 10px;
            height: 10px;
            -moz-border-radius: 5px;
            -webkit-border-radius: 5px;
            border-radius: 5px;
            display: inline-block;
            margin:0 5px;
        }
    </style>
    [/#macro]
    [#macro section_footjs]
    <script src="${SYS_PATH}/js/plugins/echarts/echarts-all.js"></script>
    <script src="${SYS_PATH}/js/plugins/layer/layer.min.js"></script>
    <script src="${SYS_PATH}/js/allot/chart.js"></script>

    [/#macro]
    [@mainLayout]
    <div class="wrapper wrapper-content animated fadeInRight">
        <div class="row">
            <div class="col-sm-12">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <form class="form-inline" id="queryForm" onsubmit="javascript:return false;">
                            <div class="form-group">
                                <label for="centerId">集散</label>
                                <select id="centerId" name="centerId" class="form-control">

                                    [#if allots??]
                                        [#list allots as allot ]
                                            <option value="${allot.id!}">${allot.name!}</option>
                                        [/#list]
                                    [/#if]
                                </select>
                            </div>

                            <div class="form-group">
                                <label for="provinceId">目的地</label>
                                <select id="provinceId" name="provinceId" class="form-control">

                                    [#if provices??]
                                        [#list provices as p ]
                                            <option value="${p.id!}">${p.areaName!}</option>
                                        [/#list]
                                    [/#if]
                                </select>

                                <select id="cityId" name="cityId" class="form-control">
                                    [#if citys??]
                                        [#list citys as c ]
                                            <option value="${c.id!}">${c.areaName!}</option>
                                        [/#list]
                                    [/#if]
                                </select>
                            </div>

                            <div class="form-group">
                                <label for="year">选择基础数据</label>
                                <select id="year" name="year" class="form-control">
                                    <option value>年</option>
                                </select>

                                <select id="month" name="month" class="form-control">
                                    <option value>月</option>
                                    <option selected value="0">1月</option>
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





                            <button type="button" class="btn btn-w-m btn-info" id="queryButton" style=" margin-left:10px;">查询趋势图</button>
                        </form>
                    </div>
                </div>



                <!-- 图表 -->

                <div id="chart" style="width: 100%;height: 580px;border: 1px solid #e5e6e7;"></div>
            </div>
        </div>
    </div>

    [/@mainLayout]
[/#escape]