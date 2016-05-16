[#escape x as x?html]
    [#include "../_layout.ftl" /]


    [#macro section_footjs]
    <script>
        var $table = $('#table');

        function queryParams(params) {
            return $.extend({}, params, $('#queryForm').serializeJson());
        }

        $('#queryButton').click(function () {
            $table.bootstrapTable('refresh');
        });
    </script>
    [/#macro]

    [@mainLayout]
    <div class="wrapper wrapper-content animated fadeInRight">
        <div class="row">
            <div class="col-sm-12">

                <div class="panel panel-default">
                    <div class="panel-body">
                        <form class="form-inline" id="queryForm" onsubmit="javascript:return false;">
                            <div class="form-group">
                                <span>汇总时间</span>
                                <select id="yearInput" name="year" class="form-control">
                                    <option value="">不限</option>
                                    [#list 2015..(.now?string("yyyy")?number) as i]
                                        <option value=${i}>${i}</option>
                                    [/#list]
                                </select>
                                <label for="yearInput">年</label>
                                <select id="monthInput" name="month" class="form-control">
                                    <option value="">不限</option>
                                    [#list 1..12 as i]
                                        <option value=${i}>${i}</option>
                                    [/#list]
                                </select>
                                <label for="monthInput">月</label>
                            </div>
                            <div class="form-group col-sm-offset-1">
                                <label for="nameInput">推广人</label>
                                <input type="text" id="nameInput" name="realName" class="form-control">
                            </div>
                            <button type="button" class="btn btn-primary" id="queryButton">查询</button>
                        </form>
                    </div>
                </div>

                <table  id="table"
                        data-classes="table table-hover table-condensed"
                        data-striped="true"
                        data-pagination="true"
                        data-id-field="realName"
                        data-page-list="[10, 25, 50, 100, ALL]"
                        data-side-pagination="server"
                        data-url="${SYS_PATH}/merchant/report/data"
                        data-query-params="queryParams"
                        data-query-params-type=""
                        data-toggle="table">
                    <thead>
                    <tr>
                        <th data-field="realName">推广人</th>
                        <th data-field="year">年份</th>
                        <th data-field="month">月份</th>
                        <th data-field="orderSum">发货票数总计</th>
                        <th data-field="feeSum">发货金额总计</th>
                    </tr>
                    </thead>
                </table>
            </div>
        </div>
    </div>
    [/@mainLayout]
[/#escape]
