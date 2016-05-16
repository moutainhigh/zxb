[#escape x as x?html]
    [#include "../_layout.ftl" /]

    [#macro section_footjs]
    <script type="text/javascript" src="${JS_PATH}/bootstrap-suggest.min.js"></script>
    <script>
        //地区查询级联
        $("#province-name").bsSuggest({
            url: zxb.SYS_PATH + "/area/child?parentId=0",
            effectiveFields: ['areaName'],
            idField: "id",
            keyField: "areaName"
        }).on('onSetSelectValue', function (e, keyword) {
            $("#city-name").bsSuggest("destroy");
            $("#country-name").bsSuggest("destroy");

            $('#province-id').val(keyword.id);
            $('#city-id').val('');
            $('#city-name').val('');
            $('#country-id').val('');
            $('#country-name').val('');

            $("#city-name").bsSuggest({
                url: zxb.SYS_PATH + "/area/child?parentId="+keyword.id,
                effectiveFields: ['areaName'],
                idField: "id",
                keyField: "areaName"
            }).on('onSetSelectValue', function (e, keyword) {
                $("#country-name").bsSuggest("destroy");

                $('#city-id').val(keyword.id);
                $('#country-id').val('');
                $('#country-name').val('');

                $("#country-name").bsSuggest({
                    url: zxb.SYS_PATH + "/area/child?parentId="+keyword.id,
                    effectiveFields: ['areaName'],
                    idField: "id",
                    keyField: "areaName"
                }).on('onSetSelectValue', function (e, keyword) {
                    $('#country-id').val(keyword.id);
                });
            });
        });

        $("#allotCenterName").bsSuggest({
            url: zxb.SYS_PATH + "/allotCenter/listSuggest",
            effectiveFields: ['name'],
            idField: "id",
            keyField: "name"
        }).on('onSetSelectValue', function (e, keyword) {
            $('#allotCenterId').val(keyword.id);
        });




        var $table = $('#table');

        function queryParams(params) {
            return $.extend({}, params, $('#queryForm').serializeJson());
        }

        function responseHandler(res) {
            var max1 = res.maxHeavyColumns;
            var max2 = res.maxLightColumns;
            var max3 = res.maxHeavyLightColumns;
            var i = 0,
                maxColumns = 9,
                preColumns = 4;//4为sections1.section1的index
            $table.on('load-success.bs.table', function(e, data) {
                for (i=1;i<=9;i++)
                    $table.bootstrapTable("showColumn","sections1.section"+i);
                for (i=1;i<=9;i++)
                    $table.bootstrapTable("showColumn","sections2.section"+i);
                for (i=1;i<=9;i++)
                    $table.bootstrapTable("showColumn","sections3.section"+i);

                for (i=max1+1;i<=maxColumns;i++)
                    $table.bootstrapTable("hideColumn","sections1.section"+i);
                for (i=max2+1;i<=maxColumns;i++)
                    $table.bootstrapTable("hideColumn","sections2.section"+i);
                for (i=max3+1;i<=maxColumns;i++)
                    $table.bootstrapTable("hideColumn","sections3.section"+i);

                if(max1>0) mergeHead(preColumns,max1);
                if(max2>0) mergeHead(preColumns+max1,max2);
                if(max3>0) mergeHead(preColumns+max1+max2,max3);

                for(i=0;i<res.rows.length;i+=2){
                    $table.bootstrapTable("mergeCells",{
                        index:i,
                        field:'allocCenterName',
                        rowspan:2
                    });
                    $table.bootstrapTable("mergeCells",{
                        index:i,
                        field:'endProvinceName',
                        rowspan:2
                    });
                    $table.bootstrapTable("mergeCells",{
                        index:i,
                        field:'endCityName',
                        rowspan:2
                    });
                    $table.bootstrapTable("mergeCells",{
                        index:i,
                        field:'endCountryName',
                        rowspan:2
                    });
                }
            });
            return res;
        }

        $('#queryButton').click(function () {
            $table.bootstrapTable('refresh');
        });

        $('#excelButton').click(function () {
            $.get(zxb.SYS_PATH + "/benchmark/price/excel",$('#queryForm').serializeJson(), function (data) {
                window.location.href = zxb.SYS_PATH + "/" + data;
            })
        });

        function mergeHead(col,colspan){
            colspan = colspan || 1;
            var $tr = $table.find('>thead').find('>tr').eq(0),
                $th = $tr.find('>th').eq(col);

            for (var i = col; i <= col + colspan; i++) {
                $tr.find('>th').eq(i).hide();
            }

            $th.attr('colspan', colspan).show();
        }
    </script>
    [/#macro]

    [@mainLayout]
    <div class="wrapper wrapper-content animated fadeInRight">
        <div class="row">
            <div class="col-sm-12">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <form class="form-inline form-horizontal m-t" id="queryForm" onsubmit="javascript:return false;">
                            <div class="form-group col-sm-12">
                                <label class="control-label col-sm-2">起始地：</label>
                                <div class="input-group m-b">
                                    <input id='allotCenterId' name='allotId' hidden="hidden">
                                    <span class="input-group-addon">集散</span>
                                    <div class="input-group">
                                        <input id="allotCenterName" type="text" class="form-control" name="allotCenterName" readonly="readonly">
                                        <div class="input-group-btn">
                                            <button type="button" class="btn btn-white dropdown-toggle" data-toggle="dropdown"
                                                    style="margin-bottom: 0px">
                                                <span class="caret"></span>
                                            </button>
                                            <ul class="dropdown-menu dropdown-menu-right" role="menu">
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group col-sm-12">
                                <label class="control-label col-sm-2">目的地：</label>
                                <div class="input-group m-b col-sm-3">
                                    <input id='province-id' name='provinceId' hidden="hidden">
                                    <span class="input-group-addon">省</span>
                                    <div class="input-group">
                                        <input id="province-name" type="text" class="form-control" name="provinceName" readonly="readonly">
                                        <div class="input-group-btn">
                                            <button type="button" class="btn btn-white dropdown-toggle" data-toggle="dropdown"
                                                    style="margin-bottom: 0px">
                                                <span class="caret"></span>
                                            </button>
                                            <ul class="dropdown-menu dropdown-menu-right" role="menu">
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <div class="input-group m-b col-sm-3">
                                    <input id='city-id' name='cityId' hidden="hidden">
                                    <span class="input-group-addon">市</span>
                                    <div class="input-group">
                                        <input id="city-name" type="text" class="form-control" name="cityName" readonly="readonly">
                                        <div class="input-group-btn">
                                            <button type="button" class="btn btn-white dropdown-toggle" data-toggle="dropdown"
                                                    style="margin-bottom: 0px">
                                                <span class="caret"></span>
                                            </button>
                                            <ul class="dropdown-menu dropdown-menu-right" role="menu">
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <div class="input-group m-b col-sm-3">
                                    <input id='country-id' name='countryId' hidden="hidden">
                                    <span class="input-group-addon">区</span>
                                    <div class="input-group">
                                        <input id="country-name" type="text" class="form-control" name="countryName" readonly="readonly">
                                        <div class="input-group-btn">
                                            <button type="button" class="btn btn-white dropdown-toggle" data-toggle="dropdown"
                                                    style="margin-bottom: 0px">
                                                <span class="caret"></span>
                                            </button>
                                            <ul class="dropdown-menu dropdown-menu-right" role="menu">
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group col-sm-12">
                                <button type="button" class="btn btn-primary col-sm-offset-2" id="queryButton">查询</button>
                                <button type="button" class="btn btn-primary" id="excelButton">导出</button>
                            </div>
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
                        data-url="${SYS_PATH}/benchmark/price/data"
                        data-query-params="queryParams"
                        data-response-handler="responseHandler"
                        data-query-params-type=""
                        data-toggle="table">
                    <thead>
                    <tr>
                        <th data-field="allocCenterName">集散中心</th>
                        <th data-field="endProvinceName">目的省</th>
                        <th data-field="endCityName">目的市</th>
                        <th data-field="endCountryName">目的区</th>
                        <th data-field="sections1.section1" data-halign="center">重货区间</th>
                        <th data-field="sections1.section2">重货区间</th>
                        <th data-field="sections1.section3">重货区间</th>
                        <th data-field="sections1.section4">重货区间</th>
                        <th data-field="sections1.section5">重货区间</th>
                        <th data-field="sections1.section6">重货区间</th>
                        <th data-field="sections1.section7">重货区间</th>
                        <th data-field="sections1.section8">重货区间</th>
                        <th data-field="sections1.section9">重货区间</th>
                        <th data-field="sections2.section1" data-halign="center">抛货区间</th>
                        <th data-field="sections2.section2">抛货区间</th>
                        <th data-field="sections2.section3">抛货区间</th>
                        <th data-field="sections2.section4">抛货区间</th>
                        <th data-field="sections2.section5">抛货区间</th>
                        <th data-field="sections2.section6">抛货区间</th>
                        <th data-field="sections2.section7">抛货区间</th>
                        <th data-field="sections2.section8">抛货区间</th>
                        <th data-field="sections2.section9">抛货区间</th>
                        <th data-field="sections3.section1" data-halign="center">重抛货区间</th>
                        <th data-field="sections3.section2">重抛货区间</th>
                        <th data-field="sections3.section3">重抛货区间</th>
                        <th data-field="sections3.section4">重抛货区间</th>
                        <th data-field="sections3.section5">重抛货区间</th>
                        <th data-field="sections3.section6">重抛货区间</th>
                        <th data-field="sections3.section7">重抛货区间</th>
                        <th data-field="sections3.section8">重抛货区间</th>
                        <th data-field="sections3.section9">重抛货区间</th>
                    </tr>
                    </thead>
                </table>
            </div>
        </div>
    </div>
    [/@mainLayout]
[/#escape]
