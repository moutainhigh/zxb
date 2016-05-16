/**
 * 配载管理-新建和编辑
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-09
 */
$(function () {

    var isSubmitting = false;
    //TODO:表单验证和提交
    $.jgrid.defaults.styleUI = 'jQueryUI';

    //编辑时配载单原来的运单信息
    var editBillItems = [];

    //运单表格初始化
    var jqGridOptions = {
        datatype: "local",
        width: "440",
        height:"250",
        autoScroll: false,
        shrinkToFit: false,
        multiselect: true,
        //multiboxonly: true,
        rownumbers: true,
        beforeSelectRow: function (rowid, e) {
            var $myGrid = $(this),
                rowData = $myGrid.jqGrid('getRowData', rowid);
            if ($myGrid.attr("id") == $gridDest.attr("id")) {
                return true;
            }
            return (rowData.isAlreadyPay == 1);
        },
        onSelectAll: function (rowids, status) {
            if (!status) {
                return;
            }
            var grid = $(this);
            if (grid.attr("id") == $gridDest.attr("id")) {
                return;
            }

            var rowIds = grid.jqGrid('getDataIDs');
            for (var i = 0; i < rowIds.length; i++) {
                var rowData = grid.jqGrid('getRowData', rowIds[i]);
                if (rowData.isAlreadyPay != 1) {
                    grid.jqGrid("setSelection", rowIds[i], false);
                    //chkbox.attr("checked", false);
                }
            }
        },
        onSelectRow: function (rowid, status, e) {
            //alert(rowid);
        },
        gridComplete: function () {
            var grid = $(this);
            var rowIds = grid.jqGrid('getDataIDs');
            for (var k = 0; k < rowIds.length; k++) {
                var rowData = grid.jqGrid('getRowData', rowIds[k]);
                if (rowData.isAlreadyPay != 1) {
                    if (grid.attr("id") == $gridSource.attr("id")) {
                        grid.find("input[id='jqg_" + grid.attr('id') + "_" + rowIds[k] + "']").prop("disabled", true);
                    }
                    $("#" + rowIds[k]).find("td").css("background-color", "red");
                    $("#" + rowIds[k]).find("td").css("color", "white");
                }
            }
        },
        colNames: ['运单号', '开单日期', '货物名称', '件数', '总重量', '总体积', '发货方', '收货方', '收货地址', '省份', '城市','区县', '支付状态', 'id'],
        colModel: [
            {
                name: 'systemSn',
                index: 'systemSn',
                editable: false,
                width: 110,
                frozen: false,
                align: "center"
            },
            {
                name: 'operationTime',
                index: 'operationTime',
                editable: false,
                width: 80,
                sorttype: "date",
                formatter: "date",
                search: true,
                align: "center"
            },
            {
                name: 'goodName',
                index: 'goodName',
                editable: false,
                width: 90,
                align: "center"
            },
            {
                name: 'num',
                index: 'num',
                editable: false,
                width: 50,
                sorttype: "int",
                align: "center"

            },
            {
                name: 'offerWeight',
                index: 'offerWeight',
                editable: false,
                sorttype: "float",
                width: 70,
                formatter: "number",
                align: "center"
            },
            {
                name: 'offerVolume',
                index: 'offerVolume',
                editable: false,
                width: 70,
                sorttype: "float",
                formatter: "number",
                align: "center"

            },
            {
                name: 'shipperCustomerName',
                index: 'receiveName',
                editable: false,
                width: 80,
                align: "center"
            },
            {
                name: 'receiveName',
                index: 'receiveName',
                editable: false,
                width: 80,
                align: "center"
            },
            {
                name: 'address',
                index: 'address',
                editable: false,
                width: 100,
                sortable: false,
                formatter: function (cellvalue, options, rowObject) {
                    return rowObject.receiveProvinceName + rowObject.receiveCityName + rowObject.receiveCountryName;
                },
                align: "center"
            },
            {
                name: 'receiveProvinceName',
                index: 'receiveProvinceName',
                editable: false,
                width: 0,
                sortable: false,
                hidden: true
            },
            {
                name: 'receiveCityName',
                index: 'receiveCityName',
                editable: false,
                width: 0,
                sortable: false,
                hidden: true
            },
            {
                name: 'receiveCountryName',
                index: 'receiveCountryName',
                editable: false,
                width: 0,
                sortable: false,
                hidden: true
            },
            {
                name: 'isAlreadyPay',
                index: 'isAlreadyPay',
                editable: false,
                width: 0,
                sortable: false,
                hidden: true
            },
            {
                name: 'id',
                index: 'id',
                editable: false,
                hidden: true,
                frozen: true,
                width: 0
            }
        ]
    };

    var $gridSource = $("#waybill-source").jqGrid(jqGridOptions);
    var $gridDest = $("#waybill-dest").jqGrid(jqGridOptions);

    $gridSource.jqGrid("setFrozenColumns");
    $gridDest.jqGrid("setFrozenColumns");


    $gridSource.jqGrid("setCaption", "未配载");
    $gridDest.jqGrid("setCaption", "已选择");

    //运单操作
    $("#btnAdd").click(function () {
        moveParticleGridData($gridSource, $gridDest, true);
        $("input[name='waybillIds']").val($gridDest.jqGrid("getCol", "id").join(","));
    });
    $("#btnAddAll").click(function () {
        moveAllGridData($gridSource, $gridDest, true);
        $("input[name='waybillIds']").val($gridDest.jqGrid("getCol", "id").join(","));

    });
    $("#btnRemove").click(function () {
        moveParticleGridData($gridDest, $gridSource, false);
        $("input[name='waybillIds']").val($gridDest.jqGrid("getCol", "id").join(","));
    });
    $("#btnRemoveAll").click(function () {
        moveAllGridData($gridDest, $gridSource, false);
        $("input[name='waybillIds']").val("");
    });

    $("select[name='allocCenterId']").change(function () {
        var $selectedItem = $(this).children("option:selected");
        $("input[name='allocCenterAddress']").val($selectedItem.attr("data-addr"));
        $("input[name='allocCenterLinkName']").val($selectedItem.attr("data-linkman"));
        $("input[name='allocCenterLinkPhone']").val($selectedItem.attr("data-linkphone"));

        if ($gridDest.jqGrid("getRowData").length > 0) {
            layer.alert("已经移除不属于" + $selectedItem.text() + "的运单，请重新配载", {
                icon: 1, end: function () {
                    $gridDest.jqGrid("clearGridData");
                    refreshNoStowageBillUI();
                    $("input[name='waybillIds']").val("");
                }
            });
        } else {
            $gridDest.jqGrid("clearGridData");
            $gridDest.jqGrid("resetSelection");
            refreshNoStowageBillUI();
            $("input[name='waybillIds']").val("");
        }
    });

    /**
     * 复制部分数据
     * @param $srcGrid
     * @param $destGrid
     */
    function moveParticleGridData($srcGrid, $destGrid, direct) {
        var rowIds = $srcGrid.jqGrid("getGridParam", "selarrrow");

        rowIds = $.extend(true, [], rowIds);

        var rowCount = rowIds.length;
        if (rowCount == 0) {
            layer.msg("请选择运单");
            return;
        }
        for (var i = 0; i < rowCount; i++) {
            var rowId = rowIds[i];
            var srcRow = $srcGrid.jqGrid("getRowData", rowId);
            if (srcRow.isAlreadyPay == 1 || !direct) {
                $destGrid.jqGrid("addRowData", rowId, srcRow);
                $srcGrid.delRowData(rowId);
            }
        }
        $srcGrid.jqGrid("resetSelection");
    }

    /**
     * 复制全部数据
     * @param $srcGrid
     * @param $destGrid
     */
    function moveAllGridData($srcGrid, $destGrid, direct) {
        var destData = $srcGrid.jqGrid("getRowData");

        var rowIds = $srcGrid.jqGrid('getDataIDs');
        var rowCount = rowIds.length;

        for (var i = 0; i < rowCount; i++) {
            var rowId = rowIds[i];
            var srcRow = $srcGrid.jqGrid("getRowData", rowId);
            if (srcRow.isAlreadyPay == 1 || !direct) {
                $destGrid.jqGrid("addRowData", rowId, srcRow);
                $srcGrid.delRowData(rowId);
            }
        }

        $srcGrid.jqGrid("resetSelection");
    }

    /**
     * 获取未配载运单列表
     * @param options {data:{shipperCustomerName:"",receiveName:"",address:""},success:func(data){}}
     */
    function getNoStowageBillData(options) {
        var opt = $.extend({}, options);
        $.ajax(
            {
                url: zxb.SYS_PATH + "/stowage/noStowageBill",
                data: opt.data,
                type: 'post',
                success: function (data) {
                    if (opt.success) {
                        opt.success(data);
                    }
                },
                error: function () {
                    layer.msg("加载运单数据失败,请稍候再试!");
                }
            }
        );
    }

    /**
     * 获取配载单内运单
     * @param options {data:{id:1},success:func(data){}}
     */
    function getStowageBillData(options) {
        var opt = $.extend({}, options);
        $.ajax(
            {
                url: zxb.SYS_PATH + "/stowage/stowageBill",
                data: opt.data,
                type: 'post',
                async: false,
                success: function (data) {
                    if (opt.success) {
                        opt.success(data);
                    }
                },
                error: function () {
                    layer.msg("加载运单数据失败,请稍候再试!");
                }
            }
        );
    }


    /**
     * 刷新未配载界面
     */
    function refreshNoStowageBillUI() {
        var reqData = {};
        reqData.startTime = $("input[name='startTime']").val();
        reqData.endTime = $("input[name='endTime']").val();
        reqData.shipperCustomerName = $("input[name='shipperCustomerName']").val();
        reqData.address = $("input[name='address']").val();
        reqData.allocCenterId = $("select[name='allocCenterId']").val();

        getNoStowageBillData({
            data: reqData,
            success: function (data) {
                $gridSource.jqGrid("clearGridData");
                $gridSource.jqGrid("resetSelection");

                var swapData = $.merge([], editBillItems);
                data = $.merge(swapData, data);

                var destDataIds = $gridDest.jqGrid("getCol", "id");
                //if (destDataIds.length > 0) {
                data = $.grep(data, function (value, index) {

                    return parseInt(value.allocCenterId) == reqData.allocCenterId &&
                        $.inArray(value.id.toString(), destDataIds) == -1;
                });
                //}
                $gridSource.jqGrid("addRowData", "id", data);
            }
        });
    }

    /**
     * 刷新配载单列表
     * @param stowageId
     */
    function refreshStowageBillUI(stowageId) {
        getStowageBillData({
            data: {id: stowageId},
            success: function (data) {
                editBillItems = data;
                $gridDest.jqGrid("clearGridData");
                $gridDest.jqGrid("resetSelection");
                $gridDest.jqGrid("addRowData", "id", data);
                $("input[name='waybillIds']").val($gridDest.jqGrid("getCol", "id").join(","));
            }
        });
    }


    $("#btnQueryWaybill").click(function () {
        refreshNoStowageBillUI();
    });


    //保存配载单
    var $form = $("#frmStowage");
    var $btnSave = $("#btnSaveStowage");
    var $validator = $form.validate({
        rules: {
            stowageTime: {
                required: true
            },
            allocCenterId: {
                required: true
            },
            plateNumber: {
                required: true,
                pattern: /^[\u4e00-\u9fa5]{1}[A-Z]{1}[A-Z_0-9]{5}$/
            },
            driverName: {
                required: true
            },
            driverPhone: {
                required: true
            },
            truckLength: {
                required: true
            },
            waybillIds: {
                required: true
            }
        },
        messages: {
            stowageTime: {
                required: "请填写配载日期"
            },
            allocCenterId: {
                required: "请选择集散中心"
            },
            plateNumber: {
                required: "请填写车牌号",
                pattern: "请填写正确的车牌号"
            },
            driverName: {
                required: "请填写司机"
            },
            driverPhone: {
                required: "请填写司机电话"
            },
            truckLength: {
                required: "请选择车身长"
            },
            waybillIds: {
                required: "请选择运单"
            }
        },
        ignore: "",
        errorPlacement: function (error, element) {
            if (element.is("input[name='waybillIds']")) {
                //error.appendTo("");
                $("#waybillIdErr").html(error);
            } else {
                error.appendTo(element.parent());
            }
        }
    });


    $form.submit(function () {
        if (!$validator.form()) {
            return false;
        }

        $.ajax({
            type: "post",
            url: zxb.SYS_PATH + "/stowage/save",
            data: $form.serialize(),
            success: function (re) {
                switch (re.status) {
                    case 1:
                        layer.alert("配载保存成功", {
                            icon: 1, time: 0, end: function () {
                                location.href = zxb.SYS_PATH + "/stowage/list";
                            }
                        });
                        break;
                    case -1:
                        layer.alert("保存失败,配载单不存在", {icon: 2});
                        break;
                    case -2:
                        layer.alert("保存失败,配载单已经发车", {icon: 2});
                        break;
                    case -3:
                        layer.alert("保存失败,服务商不存在", {icon: 2});
                        break;
                    case -4:
                        layer.alert("保存失败,集散中心不存在", {icon: 2});
                        break;
                    case -5:
                        layer.alert("保存失败,选择的运单包含未支付或者已配载", {icon: 2});
                        break;
                    case -6:
                        layer.alert("保存失败,选择的运单不存在", {icon: 2});
                        break;
                    case 400:
                        layer.msg("保存失败,参数错误");
                        break;
                }
            },
            beforeSend: function () {
                isSubmitting = true;
            },
            complete: function () {
                isSubmitting = false;            }
        });


        return false;
    });


    $btnSave.click(function () {
        if(!isSubmitting){
            $form.submit();
        }
    });


    if (EDIT_MODE) {
        refreshStowageBillUI(STOWAGE_ID);
        refreshNoStowageBillUI();
    } else {
        refreshNoStowageBillUI();
    }
});
