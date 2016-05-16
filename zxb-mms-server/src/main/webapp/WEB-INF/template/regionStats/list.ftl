[#escape x as x?html]
    [#include "../_layout.ftl" /]
    [#macro section_footjs]
    <script>
        var $table = $('#table');

        function initTable() {
            $table.bootstrapTable({
                height: getHeight(),
                columns: [
                    {
                        field: 'allocCentre',
                        title: '集散中心',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'region',
                        title: '区域',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'totalCustomerCount',
                        title: '属地已发货客户总数',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'statsYear',
                        title: '年份',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'statsMonth',
                        title: '月份',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'customerCount',
                        title: '当期发货客户总数',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'waybillCount',
                        title: '当期发货总票数',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'waybillCountChainIndex',
                        title: '当期总票数环比（%）',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'allFee',
                        title: '当期发货总金额（元）',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'allFeeChainIndex',
                        title: '当期总金额环比（%）',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'stowageCount',
                        title: '当期发车总数（车）',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'stowageCountChainIndex',
                        title: '当期总车数同比（%）',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'weight',
                        title: '当期发货总重量（吨）',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'weightChainIndex',
                        title: '当期总重量环比（%）',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'volume',
                        title: '当期发货总体积（立方）',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'volumeChainIndex',
                        title: '当期总体积环比（%）',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'newCustomerCount',
                        title: '新增发货客户客户数',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'newCustomerCountChainIndex',
                        title: '当期新发货客户环比（%）',
                        sortable: false,
                        align: 'center'
                    }
                ]
            });

        }

        function queryParams(params) {
            return $.extend({}, params, $('#queryForm').serializeJson());
        }


        function getHeight() {
            return $(window).height() - 120;
        }


        function bindSelect($select, url) {
            $.getJSON(url, function (data) {
                $select.empty();//清空下拉框
                $select.append("<option value=''>全部</option>")
                $.each(data, function (i, item) {
                    $select.append("<option value='" + item.value + "'>&nbsp;" + item.text + "</option>");
                });
            });
        }

        $(function () {

            var $allocCentreSelect = $("select[name='allocCentreId']");
            bindSelect($allocCentreSelect, zxb.SYS_PATH + "/common/allocItems?permissionCode=REGION_STATS");
            $allocCentreSelect.on("change", function (e) {
                var allocId = $allocCentreSelect.val();
                bindSelect($("select[name='regionId']"), zxb.SYS_PATH + "/common/regionItems?permissionCode=REGION_STATS&allocId=" + allocId);
            });


            initTable();


            $('#queryButton').click(function () {
                $table.bootstrapTable('refresh');
            });
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
                                <label>集散:</label>
                                <select name="allocCentreId" class="form-control">
                                    <option value="">全部</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>区域:</label>
                                <select name="regionId" class="form-control">
                                    <option value="">全部</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>年份:</label>
                                <select name="year" class="form-control">
                                    <option value="">全部</option>
                                    [#list 2012..(.now?string("yyyy")?number) as year]
                                        <option value="${year}">${year}</option>
                                    [/#list]
                                </select>
                            </div>
                            <div class="form-group">
                                <label>月份:</label>
                                <select name="month" class="form-control">
                                    <option value="">全部</option>
                                    [#list 1..12 as moth]
                                        <option value="${moth}">${moth}</option>
                                    [/#list]
                                </select>
                            </div>

                            <div class="form-group">
                                <label>当期总票数环比:</label>
                                <select name="waybillCountChainIndex" class="form-control">
                                    <option value="">全部</option>
                                    <option value="1">增长</option>
                                    <option value="2">下降</option>
                                    <option value="3">持平</option>
                                </select>
                            </div>

                            <div class="form-group">
                                <label>当期总金额环比:</label>
                                <select name="allFeeChainIndex" class="form-control">
                                    <option value="">全部</option>
                                    <option value="1">增长</option>
                                    <option value="2">下降</option>
                                    <option value="3">持平</option>
                                </select>
                            </div>

                            <div class="form-group">
                                <label>新发货客户环比:</label>
                                <select name="newCustomerCountChainIndex" class="form-control">
                                    <option value="">全部</option>
                                    <option value="1">增长</option>
                                    <option value="2">下降</option>
                                    <option value="3">持平</option>
                                </select>
                            </div>


                            <button type="button" class="btn btn-default" id="queryButton">查询</button>
                        </form>
                    </div>
                </div>


                <table id="table"
                       data-classes="table table-hover table-condensed"
                       data-striped="true"
                       data-show-refresh="false"
                       data-pagination="false"
                       data-id-field="id"
                       data-page-list="[ALL]"
                       data-side-pagination="server"
                       data-url="${SYS_PATH}/region_stats/data"
                       data-query-params="queryParams"
                       data-query-params-type="">
                </table>
            </div>
        </div>
    </div>

    [/@mainLayout]
[/#escape]
