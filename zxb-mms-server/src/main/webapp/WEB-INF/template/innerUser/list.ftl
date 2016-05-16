[#escape x as x?html]
    [#include "../_layout.ftl" /]
    [#macro section_footjs]
    <script type="text/javascript" src="${JS_PATH}/plugins/datapicker/bootstrap-datepicker.js"></script>
    <script type="text/javascript" src="${JS_PATH}/validate.expand.js"></script>

    <script>
        var $table = $('#table'),
                $remove = $('#remove'),
                selections = [];

        function judgeCheckeds(fieldName,obj){
            if(obj && obj != ''){
                var objs =  (obj+'').split(",");
                for(var i=0;i<objs.length;i++){
                    $("input[name='"+fieldName+"'][value='"+objs[i]+"']").attr("checked",true);
                }
            }
        }

        /**填充编辑页面的数据*/
        function fillEditData(data){

            console.log(data);
            $("#idAdd").val(data.id);
            $("#allocCentreInput").val(data.allocCentreId);
            $("#allocCentreInput").trigger("change",data.allocCentreId);

            var regionId = setInterval(function(){
                if(data.regionId){
                    if(!$("#regionInput").val() || $("#regionInput").val()==''){
                        $("#regionInput").val(data.regionId);
                    }else{
                        clearInterval(regionId);
                    }
                }else{
                    clearInterval(regionId);
                }
            },20);

            $("#merchantTypeInput").val(data.merchantType);
            $("#merchantStatusInput").val(data.merchantStatus);
            $("#customerNameInput").val(data.customerName);
            $("#sysAccountInput").val(data.sysAccount);
            //地址级联
            $("#provinceAdd").val(data.province);
            $("#province").val(data.provinceId);
            $("#province").trigger("change",data.provinceId);

            var cityIntervalId = setInterval(function(){
                if(data.cityId){
                    if(!$("#city").val() || $("#city").val()==''){
                        $("#city").val(data.cityId);
                        $("#city").trigger("change",data.cityId);
                    }else{
                        clearInterval(cityIntervalId);
                    }
                }else{
                    clearInterval(cityIntervalId);
                }
            },20);
            $("#cityAdd").val(data.city);

            var countyIntervalId = setInterval(function(){
                //console.log($("#countyIdAdd").val());
                if(data.cityId){
                    if(!$("#county").val() || $("county").val()==''){
                        $("#county").val(data.countyId);
                        $("#county").trigger("change",data.countyId);
                    }else{
                        clearInterval(countyIntervalId);
                    }
                }else{
                    clearInterval(countyIntervalId);
                }
            },20);
            $("#countyAdd").val(data.county);

            $("#address").val(data.address);
            $("#linkman").val(data.linkman);
            $("#mobile").val(data.mobile);
            $("#telephone").val(data.telephone);
            $("#jobTitle").val(data.jobTitle);
            judgeCheckeds('status',data.status);

            $("#sysAccountInput").val(data.sysAccount);
            $("#memo").text(data.memo);

        }

        function initTable() {
            $table.bootstrapTable({
                onDblClickRow: function (row) {
                    $.get("${SYS_PATH}/inneruser/edit",{id:row.id},function(data){
                        $("#addInnerCustomer").trigger("click");
                        fillEditData(data);
                    });
                },
                height: getHeight(),
                columns: [
                    {
                        field: 'state',
                        checkbox: 'true'
                    },
                    {
                        field: 'allocCentre',
                        title: '集散',
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
                        field: 'merchantType',
                        title: '招商类型',
                        sortable: false,
                        align: 'center',
                        formatter: function (value, row, index) {
                            return value == 1 ? "网点" : "服务商";
                        }
                    },
                    {
                        field: 'customerName',
                        title: '客户名',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'status',
                        title: '客户状态',
                        sortable: false,
                        align: 'center',
                        formatter: function (value, row, index) {
                            if (value == 1) {
                                return "有意向";
                            }
                            if (value == 2) {
                                return "已注册";
                            }
                            return "-";
                        }
                    },
                    {
                        field: 'merchantStatus',
                        title: '招商状态',
                        sortable: false,
                        align: 'center',
                        formatter: function (value, row, index) {
                            if (value == 1) {
                                return "待跟进";
                            }
                            if (value == 2) {
                                return "重点客户";
                            }
                            if (value == 3) {
                                return "成功客户";
                            }
                            if (value == 4) {
                                return "放弃";
                            }
                            return "-";
                        }
                    },
                    {
                        field: 'inviteName',
                        title: '招商人',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'tYear',
                        title: '年份',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'tMonth',
                        title: '月份',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'curSendGoodTotalNum',
                        title: '本期发货票数',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'curSendGoodTotalNumChainRate',
                        title: '票数环比(%)',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'curSendGoodFee',
                        title: '本期发货金额',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'curSendGoodFeeChainRate',
                        title: '发货金额环比(%)',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'curCarrierTotalNum',
                        title: '本期承运票数',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'curCarrierTotalNumChainRate',
                        title: '承运票数环比(%)',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'curStowageTotalNum',
                        title: '本期到车数量',
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


        $(function () {
            initTable();
            var icon = "<i class='fa fa-times-circle'></i> ";
            var $editForm = $('#editForm');
//            var $addInnerCustomer = $('#addInnerCustomer')
            var $editInnerCustomerModal = $('#editInnerCustomerModal')
            var $saveButton = $('#saveButton');
            var $validator = $editForm.validate({
                rules: {
                    allocCentreId: {required: true},
                    regionId: {required: true},
                    merchantStatus: {required: true},
                    merchantType: {required: true},
//                    status: {required: true},
                    customerName: {required: true},
                    provinceId: {required: true},
                    cityId: {required: true},
                    countyId: {required: true},
                    address: {required: true},
                    linkman: {required: true},
                    mobile: {
                        required: {
                            depends: function () { //二选一
                                return ($('#telephone').val() == "");
                            }
                        },
                        isMobile: true
                    },
                    telephone: {
                        required: {
                            depends: function () { //二选一
                                return ($('#mobile').val() == "");
                            }
                        },
                        isTelphone: true
                    },
                    sysAccount:{required: true,minlength: 1},
                },
                messages: {
                    allocCentreId: {required: icon + '请选择集散'},
                    regionId: {required: icon + '请选择区域'},
                    merchantStatus: {required: icon + '请选择招商状态'},
                    merchantType: {required: icon + '请选择招商类型'},
//                    status: {required: icon + '请选择客户状态'},
                    customerName: {required: icon + '请输入客户名',},
                    provinceId: {required: icon + '请选择省',},
                    cityId: {required: icon + '请选择市',},
                    countyId: {required: icon + '请选择区/县',},
                    address: {required: icon + '请输入地址信息',},
                    linkman: {required: icon + '请输入联系人'},
                    mobile: {required: icon + "请输入电话号码", isMobile: icon + "电话号码格式不对"},
                    telephone: {required: icon + "请输入固定电话", isTelphone: icon + "座机号码格式不对"},
                    sysAccount: {required: icon + "请输入注册名"}
                } ,
                submitHandler: function (form) {
                    saveData();
                    return false;
                }
            });

            function saveData() {
                $saveButton.prop('disabled', true);
                $.ajax({
                    url: zxb.SYS_PATH + '/inneruser/add',
                    type: 'POST',
                    data: $editForm.serialize(),
                    success: function (data) {
                        toastr.options.positionClass = "toast-top-center";
                        if (data.code == 1) {
                            //表格重置
                            $editInnerCustomerModal.modal('hide');
                            $editForm[0].reset();
                            toastr.success('保存成功');
                            $table.bootstrapTable('refresh');
                        } else if (data.code == -2) {
                            toastr.warning('有同名客户，不能提交');
                        } else {
                            toastr.error('保存失败');
                        }
                        return false;
                    },
                    beforeSend: function () {
                        $saveButton.prop('disabled', true);
                    },
                    complete: function () {
                        $saveButton.prop('disabled', false);
                    }
                });
            }

            $saveButton.click(function () {
                $editForm.submit();
            });

            //查询集散，区域的加载
            $("#allocCentre").change(function () {
                if ($(this).val()) {
                    $.ajax({
                        url: zxb.SYS_PATH + '/common/regionItems',
                        type: 'GET',
                        data: {allocId: $(this).val(),permissionCode:"INNER_CUSTOMER"},
                        success: function (data) {
                             //清空外客户接受人
                            $("#acceptId").html("<option value>请选择</option>");
                            $("#region").html("<option value>请选择</option>");
                            for (var i = 0; i < data.length; i++) {
                                $("#region").append("<option value='" + data[i].value + "'>" + data[i].text + "</option>");
                            }
                        }
                    });
                } else {
                    $("#acceptId").html("<option value>请选择</option>");
                    $("#region").html("<option value>请选择</option>");
                    $("#regionSql").val('');
                }
            });
            $("#region").change(function () {
                $("#regionSql").val($(this).find("option:selected").text());
            });

            //内客户接收人
            $("#region").change(function () {
                //var allocCentreId = $("#allocCentreId").val();
                if ($(this).val()) {
                    $.ajax({
                        url: zxb.SYS_PATH + '/region/users',
                        type: 'GET',
                        data: {regionId: $(this).val()},
                        success: function (data) {
                            $("#acceptId").html("<option value>请选择</option>");
                            for (var i = 0; i < data.length; i++) {
                                $("#acceptId").append("<option value='" + data[i].id + "'>" + data[i].realName + "</option>");
                            }
                        }
                    });
                } else {
                    $("#acceptId").html("<option value>请选择</option>");
                }
            });
            $("#acceptId").change(function () {
                $("#acceptName").val($(this).find("option:selected").text());
            });

            //migratoryBtn 客户移交
            $('#migratoryBtn').click(function () {
                if($("#acceptId").val()==''){
                    layer.tips('请选择区域接受人', "#migratoryBtn");
                    return false;
                }
                var idsArr=new Array()
                var selects = $table.bootstrapTable('getSelections');
                var regionSame = true;
                var regionInput = $('#regionSql').val();
                $.each(selects, function() {
                    idsArr.push(this.id);
                    if(this.region!=regionInput){
                        regionSame = false;
                    }
                });
                if(idsArr.length==0){
                    layer.tips('请选择要移交客户', "#migratoryBtn");
                    return false;
                }
                if(regionSame == false){
                    layer.tips('选择的移交客户区域应该为'+regionInput, "#migratoryBtn");
                    return false;
                }
                $.ajax({
                    url: zxb.SYS_PATH + '/inneruser/migratory',
                    type: 'POST',
                    data: {ids:idsArr,acceptId:$("#acceptId").val(),acceptName:$("#acceptName").val()},
                    success: function (data) {
                        if (data.code == 1) {
                            toastr.success('保存成功');
                            $table.bootstrapTable('refresh');
                        } else {
                            toastr.error('保存失败');
                        }
                    },
                    beforeSend: function () {
                        $('#migratoryBtn').prop('disabled', true);
                    },
                    complete: function () {
                        $('#migratoryBtn').prop('disabled', false);
                    }
                });
            });

            //省份和市区的添加
            $("#province").change(function () {
                $("#provinceAdd").val($(this).find("option:selected").text());
                if ($(this).val()) {
                    $.ajax({
                        url: zxb.SYS_PATH + '/area/citys',
                        type: 'GET',
                        data: {parentId: $(this).val()},
                        success: function (data) {
                            $("#city").html("<option value>请选择市</option>");
                            for (var i = 0; i < data.length; i++) {
                                $("#city").append("<option value='" + data[i].id + "'>" + data[i].areaName + "</option>");
                            }
                        }
                    });
                } else {
                    $("#city").html("<option value>请选择市</option>");
                }
            });
            $("#city").change(function () {
                $("#cityAdd").val($(this).find("option:selected").text());
                if ($(this).val()) {
                    $.ajax({
                        url: zxb.SYS_PATH + '/area/countrys',
                        type: 'GET',
                        data: {parentId: $(this).val()},
                        success: function (data) {
                            $("#county").html("<option value>请选择区/县</option>");
                            for (var i = 0; i < data.length; i++) {
                                //console.log(data[i].areaName);
                                $("#county").append("<option value='" + data[i].id + "'>" + data[i].areaName + "</option>");
                            }
                        }
                    });
                } else {
                    $("#county").html("<option value>请选择区/县</option>");
                }
            });
            $("#county").change(function () {
                $("#countyAdd").val($(this).find("option:selected").text());
            });


            //新增集散，区域的加载
            $("#allocCentreInput").change(function () {
                $("#allocCentreAdd").val($(this).find("option:selected").text());
                if ($(this).val()) {
                    $.ajax({
                        url: zxb.SYS_PATH + '/common/regionItems',
                        type: 'GET',
                        data: {allocId: $(this).val(),permissionCode:"INNER_CUSTOMER"},
                        success: function (data) {
                            $("#regionInput").html("<option value>请选择</option>");
                            for (var i = 0; i < data.length; i++) {
                                $("#regionInput").append("<option value='" + data[i].value + "'>" + data[i].text + "</option>");
                            }
                        }
                    });
                } else {
                    $("#regionInput").html("<option value>请选择</option>");
                }
            });
            $("#regionInput").change(function () {
                $("#regionAdd").val($(this).find("option:selected").text());
            });
            $editInnerCustomerModal.on('show.bs.modal', function (e) {
                $validator.resetForm();
                $editForm.get(0).reset();
            });

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
                <div class="panel panel-default" style="margin-bottom: 10px;">
                    <form class="form-inline" id="queryForm" onsubmit="javascript:return false;">
                    <div class="panel-body">
                            <div class="form-group">
                                <label>年份:</label>
                                <select name="tYear" class="form-control">
                                    <option value="">全部</option>
                                    [#list 2012..(.now?string("yyyy")?number) as year]
                                        <option value="${year}">${year}</option>
                                    [/#list]
                                </select>
                            </div>
                            <div class="form-group">
                                <label>月份:</label>
                                <select name="tMonth" class="form-control">
                                    <option value="">全部</option>
                                    [#list 1..12 as moth]
                                        <option value="${moth}">${moth}</option>
                                    [/#list]
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="merchantTypeInput">招商类型</label>
                                <select id="merchantType" name="merchantType" class="form-control">
                                    <option value="">全部</option>
                                    <option value="1">网点</option>
                                    <option value="2">服务商</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="statusInput">客户状态</label>
                                <select id="status" name="status" class="form-control">
                                    <option value="">全部</option>
                                    <option value="1">有意向</option>
                                    <option value="2">已注册</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="merchantStatusInput">招商状态</label>
                                <select id="merchantStatus" name="merchantStatus" class="form-control">
                                    <option value="">全部</option>
                                    <option value="1">待跟进</option>
                                    <option value="2">重点客户</option>
                                    <option value="3">成功客户</option>
                                    <option value="4">放弃</option>
                                </select>
                            </div>
                        </div>
                        <div class="panel-body">
                            <div class="form-group">
                                <label for="allocCentreInput">集散</label>
                                <select id="allocCentre" name="allocCentreId" class="form-control">
                                    <option value="">全部</option>
                                    [#if allocCentres??]
                                        [#list allocCentres as allocCentre]
                                            <option value="${allocCentre.id!}">${allocCentre.name}</option>
                                        [/#list]
                                    [/#if]
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="regionInput">区域</label>
                                <input type="hidden" id="regionSql" name="regionInput" value="">
                                <select id="region" name="regionId" class="form-control">
                                    <option value="">全部</option>
                                    [#--[#if regions??]--]
                                        [#--[#list regions as region]--]
                                            [#--<option value="${region.id!}">${region.name}</option>--]
                                        [#--[/#list]--]
                                    [#--[/#if]--]
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="nameInput">客户名</label>
                                <input type="text" id="customerName" name="customerName" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="inviteNameInput">招商人</label>
                                <input type="text" id="inviteName" name="inviteName" class="form-control">
                            </div>
                            <button type="button" class="btn btn-primary" id="queryButton">查询</button>
                    </div>
                    </form>
                </div>

                <div class="btn-group hidden-xs" id="tableToobar" role="group">
                    <button type="button" class="btn btn-primary" data-toggle="modal" id="addInnerCustomer" data-target="#editInnerCustomerModal">
                        <i class="glyphicon glyphicon-plus"></i> 新增客户
                    </button>

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
                       data-url="${SYS_PATH}/inneruser/getdata"
                       data-query-params="queryParams"
                       data-query-params-type="">
                </table>
            </div>
        </div>

        <div class="row">
            <div class="col-sm-12">
                <div class="ibox float-e-margins">
                    <div class="ibox-content">
                        <form role="form" class="form-inline">
                            <div class="form-group col-sm-8">
                                <label>区域接受人</label>
                                <input type="hidden" id="acceptName" name="acceptName" value="">
                                <select id="acceptId" name="acceptId" class="form-control">
                                    <option value="">请选择</option>
                                </select>
                                <button class="btn btn-primary" type="submit" id="migratoryBtn">客户移交</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

    </div>

    [#-- 新增客户模态窗口 --]
    <div class="modal fade" id="editInnerCustomerModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document" style="width:1000px">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                            aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">添加客户</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" id="editForm">
                        <input type="hidden" id="idAdd" name="id">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">集散：</label>
                            <div class="col-sm-2">
                                <input type="hidden" id="allocCentreAdd" name="allocCentre" value="">
                                <select id="allocCentreInput" name="allocCentreId" class="form-control" aria-required="true">
                                    <option value="">请选择</option>
                                    [#if allocCentres??]
                                        [#list allocCentres as allocCentre]
                                            <option value="${allocCentre.id!}">${allocCentre.name}</option>
                                        [/#list]
                                    [/#if]
                                </select>
                            </div>
                            <label class="col-sm-2 control-label">区域:</label>
                            <div class="col-sm-2">
                                <input type="hidden" id="regionAdd" name="region" value="">
                                <select id="regionInput" name="regionId" class="form-control" aria-required="true">
                                [#--[#if regions??]--]
                                [#--[#list regions as region]--]
                                [#--<option value="${region.id!}">${region.name}</option>--]
                                [#--[/#list]--]
                                [#--[/#if]--]
                                </select>
                            </div>
                            <label class="col-sm-2 control-label">招商类型:</label>
                            <div class="col-sm-2">
                                <select id="merchantTypeInput" name="merchantType" class="form-control" aria-required="true">
                                    <option value="1">网点</option>
                                    <option value="2">服务商</option>
                                </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-2 control-label">招商状态：</label>
                            <div class="col-sm-2">
                                <select id="merchantStatusInput" name="merchantStatus" class="form-control" aria-required="true">
                                    <option value="1">待跟进</option>
                                    <option value="2">重点客户</option>
                                    <option value="3">成功客户</option>
                                    <option value="4">放弃</option>
                                </select>
                            </div>
                            <label class="col-sm-2 control-label">客户状态：</label>
                            <div class="col-sm-3">
                                <label>
                                    <input type="radio" name="status" value="1" checked="checked">有意向
                                    <input type="radio" name="status" value="2">已注册
                                    <input type="radio" name="status" value="3">已成功
                                </label>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">客户名：</label>
                            <div class="col-sm-3">
                                <input type="text" placeholder="客户名" id="customerNameInput" name="customerName" class="form-control">
                            </div>
                            <label class="col-sm-2 control-label">注册名：</label>
                            <div class="col-sm-3">
                                <input type="text" placeholder="注册名" id="sysAccountInput" name="sysAccount"class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">地址：</label>
                            <div class="col-sm-3">
                                <input type="hidden" id="provinceAdd" name="province" value="">
                                <select id="province" name="provinceId" class="form-control" aria-required="true">
                                    <option value="">请选择省</option>
                                    [#if provices??]
                                        [#list provices as p ]
                                            <option value="${p.id!}">${p.areaName!}</option>
                                        [/#list]
                                    [/#if]
                                </select>
                            </div>
                            <div class="col-sm-3 control-label">
                                <input type="hidden" id="cityAdd" name="city" value="">
                                <select id="city" name="cityId" class="form-control" aria-required="true">
                                    <option value="">请选择市</option>
                                </select>
                            </div>
                            <div class="col-sm-4 control-label">
                                <input type="hidden" id="countyAdd" name="county" value="">
                                <select id="county" name="countyId" class="form-control" aria-required="true">
                                    <option value="">请选择区/县</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">详细地址：</label>
                            <div class="col-sm-10 ">
                                <input type="text" placeholder="详细地址" id="address" name="address" class="form-control" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">联系人：</label>
                            <div class="col-sm-3">
                                <input type="text" placeholder="联系人" id="linkman" name="linkman" class="form-control" aria-required="true">
                            </div>
                            <label class="col-sm-1 control-label">电话：</label>
                            <div class="col-sm-2">
                                <input type="text" placeholder="电话" id="mobile" name="mobile" class="form-control" aria-required="true">
                            </div>
                            <label class="col-sm-1 control-label">座机：</label>
                            <div class="col-sm-3">
                                <input type="text" placeholder="座机" id="telephone" name="telephone" class="form-control" aria-required="true">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">职务：</label>
                            <div class="col-sm-2">
                                <input type="text" placeholder="职务" id="jobTitle" name="jobTitle" class="form-control" >
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-11">
                                <textarea rows="5" placeholder="客户招商情况记录" id="memo" name="memo" class="form-control"></textarea>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="saveButton">保存</button>
                </div>
            </div>
        </div>
    </div>


    [/@mainLayout]
[/#escape]
