[#escape x as x?html]
    [#include "../_layout.ftl" /]
    [#macro section_footjs]

    <script>
        $(function () {
            //初始化表格
            initTable();
            //定义一些变量
            var icon = "<i class='fa fa-times-circle'></i>";
            var $addForm = $('#addForm');
            var $addButton = $('#addButton');
            var $transferForm = $('#transferForm');
            var $transferButton = $('#transferButton');
            //新增区域
            $addButton.click(function () {
                $addForm.submit();
            });
            $addForm.validate({
                rules: {
                    allocCentreId: {
                        required: true
                    },
                    provinceId: {
                        required: true
                    },
                    cityId: {
                        required: true
                    },
                    countryId: {
                        required: true
                    }
                },
                messages: {
                    allocCentreId: {
                        required: icon + '请选择集散中心'
                    },
                    provinceId: {
                        required: icon + '请选择省份'
                    },
                    cityId: {
                        required: icon + '请选择市级'
                    },
                    countryId: {
                        required: icon + '请选择区县'
                    }
                },
                showErrors: function (errorMap, errorList) {
                    if (errorList && errorList.length > 0) {
                        layer.tips(errorList[0].message, "#" + errorList[0].element.name, {
                            time: 1000
                        });
                    }
                },
                submitHandler: function (form) {
                    saveRegion();
                    return false;
                }
            });
            function saveRegion() {
                $.ajax({
                    url: zxb.SYS_PATH + "/region/add",
                    data: $addForm.serialize(),
                    type: 'POST',
                    success: function (data) {
                        //关闭进度条
                        toastr.options.progressBar = false;
                        toastr.options.timeOut = 2000;
                        if (data.code == 0) {
                            //表格重置
                            $addForm[0].reset();
                            toastr.success('区域保存成功');
                            $table.bootstrapTable('refresh');
                        } else if (data.code == 1001) {
                            toastr.warning('该区域已被占用');
                        } else {
                            toastr.error('区域保存失败');
                        }
                    }
                })
            }

            //注销区域
            $transferButton.click(function () {
                $transferForm.submit();
            });
            $transferForm.validate({
                rules: {
                    originalAllocCentreId: {
                        required: true
                    },
                    originalRegionId: {
                        required: true
                    },
                    transferAllocCentreId: {
                        required: true
                    },
                    transferRegionId: {
                        required: true
                    }
                },
                messages: {
                    originalAllocCentreId: {
                        required: icon + '请选择集散中心'
                    },
                    originalRegionId: {
                        required: icon + '请选择区域名称'
                    },
                    transferAllocCentreId: {
                        required: icon + '请选择集散中心'
                    },
                    transferRegionId: {
                        required: icon + '请选择区域名称'
                    }
                },
                showErrors: function (errorMap, errorList) {
                    if (errorList && errorList.length > 0) {
                        layer.tips(errorList[0].message, "#" + errorList[0].element.name, {
                            time: 1000
                        });
                    }
                },
                submitHandler: function (form) {
                    transferRegion();
                    return false;
                }
            });
            function transferRegion() {
                $.ajax({
                    url: zxb.SYS_PATH + "/region/transfer",
                    data: $transferForm.serialize(),
                    type: 'POST',
                    success: function (data) {
                        //关闭进度条
                        toastr.options.progressBar = false;
                        toastr.options.timeOut = 2000;
                        if (data) {
                            //表单重置
                            $transferForm[0].reset();
                            toastr.success('区域注销成功');
                            $table.bootstrapTable('refresh');
                        } else {
                            toastr.warn('区域注销失败');
                        }
                    }
                })
            };
            //省份和市区的添加
            $("#provinceId").change(function () {
                if ($(this).val()) {
                    $.ajax({
                        url: zxb.SYS_PATH + '/area/citys',
                        type: 'GET',
                        data: {parentId: $(this).val()},
                        success: function (data) {
                            $("#countryId").html("<option value>请选择</option>");
                            $("#cityId").html("<option value>请选择</option>");
                            for (var i = 0; i < data.length; i++) {
                                $("#cityId").append("<option value='" + data[i].id + "'>" + data[i].areaName + "</option>");
                            }
                        }
                    });
                } else {
                    $("#countryId").html("<option value>请选择</option>");
                    $("#cityId").html("<option value>请选择</option>");
                }
            });
            $("#cityId").change(function () {
                if ($(this).val()) {
                    $.ajax({
                        url: zxb.SYS_PATH + '/area/countrys',
                        type: 'GET',
                        data: {parentId: $(this).val()},
                        success: function (data) {
                            $("#countryId").html("<option value>请选择</option>");
                            for (var i = 0; i < data.length; i++) {
                                $("#countryId").append("<option value='" + data[i].id + "'>" + data[i].areaName + "</option>");
                            }
                        }
                    });
                } else {
                    $("#countryId").html("<option value>请选择</option>");
                }
            });
            //区域的加载
            $("#originalAllocCentreId").change(function () {
                if ($(this).val()) {
                    $.ajax({
                        url: zxb.SYS_PATH + '/region/regions',
                        type: 'GET',
                        data: {allocCentreId: $(this).val()},
                        success: function (data) {
                            $("#originalRegionId").html("<option value>请选择</option>");
                            for (var i = 0; i < data.length; i++) {
                                $("#originalRegionId").append("<option value='" + data[i].id + "'>" + data[i].name + "</option>");
                            }
                        }
                    });
                } else {
                    $("#originalRegionId").html("<option value>请选择</option>");
                }
            });
//            $("#originalRegionId").change(function () {
//                if ($(this).val()) {//选择不是请选择
//                    $("#transferAllocCentreId").options[0].selected = true;
//                    $("#transferAllocCentreId option:frist").attr("selected", 'selected');
//                    $("#transferAllocCentreId option[text='jQuery']").attr("selected", 'selected');
//                    $("#transferAllocCentreId option")[0].selected=true;
//                    $("#transferRegionId").html("<option value>请选择</option>");
//                }
//            });
//            $("#transferAllocCentreId").change(function () {
//                var originalAllocCentreId = $("#originalAllocCentreId").val();
//                var originalRegionId = $("#originalRegionId").val();
//                if ($(this).val()) {
//                    $.ajax({
//                        url: zxb.SYS_PATH + '/region/regions',
//                        type: 'GET',
//                        data: {
//                            allocCentreId: $(this).val(),
//                            originalAllocCentreId: originalAllocCentreId,
//                            originalRegionId: originalRegionId
//                        },
//                        success: function (data) {
//                            $("#transferRegionId").html("<option value>请选择</option>");
//                            for (var i = 0; i < data.length; i++) {
//                                $("#transferRegionId").append("<option value='" + data[i].id + "'>" + data[i].name + "</option>");
//                            }
//                        }
//                    });
//                } else {
//                    $("#transferRegionId").html("<option value>请选择</option>");
//                }
//            });


        });


        var $table = $('#table'),
                $remove = $('#remove'),
                selections = [];
        function initTable() {
            $table.bootstrapTable({
                height: getHeight(),
                columns: [
                    {
                        field: 'allocCentre',
                        title: '集散名',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'regionName',
                        title: '属地区域',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'innerCurrUser',
                        title: '内客户管理人',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'outerCurrUser',
                        title: '外客户管理人',
                        sortable: false,
                        align: 'center'
                    }
                ]
            });
        }
        function queryParams(params) {
            return $.extend({}, params, {});
        }
        function responseHandler(res) {
            $.each(res.rows, function (i, row) {
                row.state = $.inArray(row.id, selections) !== -1;
            });
            return res;
        }
        function getHeight() {
            return $(window).height() - 220;
        }
    </script>
    [/#macro]


    [@mainLayout]
    <div class="wrapper wrapper-content animated fadeInRight">
        <div class="row">
            <div class="col-sm-12">
            [#--新增区域--]
                <div class="panel panel-default">
                    <div class="panel-body">
                        <form class="form-inline" id="addForm" onsubmit="javascript:return false;">
                            <div class="form-group">
                                <label for="allocCentreInput">集散</label>
                                <select id="allocCentreId" name="allocCentreId" class="form-control">
                                    <option value="" selected>请选择</option>
                                    [#if allocCentres??]
                                        [#list allocCentres as allocCentre]
                                            <option value="${allocCentre.id!}">${allocCentre.name}</option>
                                        [/#list]
                                    [/#if]
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="provinceId">省份</label>
                                <select id="provinceId" name="provinceId" class="form-control">
                                    <option value="" selected>请选择</option>
                                    [#if provices??]
                                        [#list provices as p ]
                                            <option value="${p.id!}">${p.areaName!}</option>
                                        [/#list]
                                    [/#if]
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="cityId">市级</label>
                                <select id="cityId" name="cityId" class="form-control">
                                    <option value="" selected>请选择</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="countryId">区县</label>
                                <select id="countryId" name="countryId" class="form-control">
                                    <option value="" selected>请选择</option>
                                </select>
                            </div>
                            <button type="button" class="btn btn-primary" id="addButton">新增区域</button>
                        </form>
                    </div>
                </div>
            [#--注销区域--]
                <div class="panel panel-default">
                    <div class="panel-body">
                        <form class="form-inline" id="transferForm" onsubmit="javascript:return false;">
                            <div class="form-group">
                                <label for="originalAllocCentreId">集散</label>
                                <select id="originalAllocCentreId" name="originalAllocCentreId" class="form-control">
                                    <option value="">请选择</option>
                                    [#if allocCentres??]
                                        [#list allocCentres as allocCentre]
                                            <option value="${allocCentre.id!}">${allocCentre.name}</option>
                                        [/#list]
                                    [/#if]
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="originalRegionId">区域</label>
                                <select id="originalRegionId" name="originalRegionId" class="form-control">
                                    <option value="">请选择</option>
                                </select>
                            </div>
                            <label for="realNameInput">&nbsp;&nbsp;&nbsp;已有数据转入&nbsp;&nbsp;&nbsp;</label>
                            <div class="form-group">
                                <label for="transferAllocCentreId">集散</label>
                                <select id="transferAllocCentreId" name="transferAllocCentreId" class="form-control">
                                    <option value="" text="default">请选择</option>
                                    [#if allocCentres??]
                                        [#list allocCentres as allocCentre]
                                            <option value="${allocCentre.id!}">${allocCentre.name}</option>
                                        [/#list]
                                    [/#if]
                                </select>
                            </div>
                            <button type="button" class="btn btn-primary" id="transferButton">注销区域</button>
                        </form>
                    </div>
                </div>
            [#--table--]
                <h3 style="position: absolute;margin-left: 500px">当前属地区域列表</h3>
                <table id="table"
                       data-classes="table table-hover table-condensed"
                       data-striped="true"
                       data-toolbar="#tableToobar"
                       data-show-refresh="true"
                [#--是否显示分页（*）--]
                       data-pagination="true"
                       data-id-field="regionId"
                       data-page-list="[10, 25, 50, 100, ALL]"
                       data-side-pagination="server"
                [#--请求后台的URL--]
                       data-url="${SYS_PATH}/region/data"
                       data-response-handler="responseHandler"
                [#--传递参数--]
                       data-query-params="queryParams"
                       data-query-params-type="">
                </table>
            </div>
        </div>
    </div>
    [/@mainLayout]
[/#escape]
