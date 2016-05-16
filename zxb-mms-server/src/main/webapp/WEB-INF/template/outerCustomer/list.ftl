[#escape x as x?html]
    [#include "../_layout.ftl" /]
    [#assign page_title="外客户管理"/]
    [#assign page_desc="外客户管理"/]
    [#macro section_footjs]
    <script type="text/javascript" src="${JS_PATH}/plugins/datapicker/bootstrap-datepicker.js"></script>
    <script type="text/javascript" src="${JS_PATH}/validate.expand.js"></script>
    <script>
        var $table = $('#table'),
                $remove = $('#remove'),
                selections = [];


        function clearEditData(){
            $(".form-group").each(function(){
                $(this).removeClass("has-error");
            });
            $("#editForm").find("input[type='text']").each(function(){
               $(this).val('');
            });
            $("#editForm").find("input[type='hidden']").each(function(){
               $(this).val('');
                $(this).attr('disabled',false);
            });

            $("#editForm").find("select").each(function(){
                $(this).val('');
                $(this).attr('disabled',false);
            });

            $("#editForm").find("input[type='checkbox']").each(function(){
                $(this).attr("checked",false);
            });

            $("#editForm").find("textarea").each(function(){
                $(this).text('');
            });
        }
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
            $("#customerNameAdd").val(data.customerName);
            $("#industryAdd").val(data.industry);

            $("#allocCentreIdAdd").val(data.allocCentreId);
            $("#allocCentreIdAdd").trigger("change",data.allocCentreId);

            $("#allocCentreAdd").val(data.allocCentre);
            $("#regionAdd").val(data.region);
            var regionId = setInterval(function(){
                //console.log(data.regionId);
                if(data.regionId){
                    if(!$("#regionIdAdd").val() || $("#regionIdAdd").val()==''){
                        $("#regionIdAdd").val(data.regionId);
                        $("#regionIdAdd").attr("disabled","disabled");
                        $("#allocCentreIdAdd").attr("disabled","disabled");
                        $("#regionAdd").attr("disabled","disabled");
                        $("#allocCentreAdd").attr("disabled","disabled");
                    }else{
                        clearInterval(regionId);
                    }
                }else{
                    clearInterval(regionId);
                }
            },20);

            $("#merchantStatus").val(data.merchantStatus);
            //地址级联
            $("#provinceAdd").val(data.province);
            $("#provinceIdAdd").val(data.provinceId);
            $("#provinceIdAdd").trigger("change",data.provinceId);

            var cityIntervalId = setInterval(function(){
                //console.log($("#cityIdAdd").val());
                if(data.cityId){
                    if(!$("#cityIdAdd").val() || $("#cityIdAdd").val()==''){
                        $("#cityIdAdd").val(data.cityId);
                        $("#cityIdAdd").trigger("change",data.cityId);
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
                    if(!$("#countyIdAdd").val() || $("countyIdAdd").val()==''){
                        $("#countyIdAdd").val(data.countyId);
                        $("#countyIdAdd").trigger("change",data.countyId);
                    }else{
                        clearInterval(countyIntervalId);
                    }
                }else{
                    clearInterval(countyIntervalId);
                }
            },20);
            $("#countyAdd").val(data.county);

           // $("#cityAdd").val(data.city);
            //$("#countyAdd").val(data.county);
            $("#address").val(data.address);
            $("#linkman").val(data.linkman);
            $("#mobile").val(data.mobile);
            $("#telephone").val(data.telephone);
            $("#jobTitle").val(data.jobTitle);
            judgeCheckeds('status',data.status);
            judgeCheckeds('logisticsDemand',data.logisticsDemand);
            //judgeCheckeds('shipmentsStatus',data.shipmentsStatus);
            if(data.shipmentsStatus===2){
                $("#shipmentsStatus").html('已发货');
            }else{
                $("#shipmentsStatus").html('');
            }
            $("#sysAccount").val(data.sysAccount);

            $("#goodsCategory").val(data.goodsCategory);
            judgeCheckeds('goodsAttr',data.goodsAttr);

            $("#goodsAttrMemo").val(data.goodsAttrMemo);
            judgeCheckeds('goodsPackage',data.goodsPackage);

            $("#goodsPackageMemo").val(data.goodsPackageMemo);
            judgeCheckeds('transportMode',data.transportMode);

            $("#transportModeMemo").val(data.transportModeMemo);
            judgeCheckeds('paymentMode',data.paymentMode);
            $("#paymentModeMemo").val(data.paymentModeMemo);
            judgeCheckeds('vehicleDemand',data.vehicleDemand);
            $("#vehicleDemandMemo").val(data.vehicleDemandMemo);
            judgeCheckeds('deliverySchedule',data.deliverySchedule);
            $("#deliveryScheduleMemo").val(data.deliveryScheduleMemo);
            judgeCheckeds('attention',data.attention);
            $("#attentionMemo").val(data.attentionMemo);
            $("#ccomment").text(data.memo);

        }

        function initTable() {
            $table.bootstrapTable({
                onDblClickRow: function (row) {

                    $.get("${SYS_PATH}/outer/edit",{id:row.id},function(data){
                        //clearEditData();
                        $("#addOuterCustomer").trigger("click");
                        fillEditData(data);
                    });
                },
                height: getHeight(),
                clickToSelect: true,
                columns: [

                    {
                        field: 'state',
                        checkbox: 'true'
                    },
                    /*{
                        field: 'id',
                        title: 'id',
                        sortable: false,
                        align: 'center',
                        hidden:true
                    },*/
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
                        field: 'customerName',
                        title: '客户名',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'currUser',
                        title: '推广人',
                        align: 'center',
                        sortable: false
                    },
                    {
                        field: 'status',
                        title: '客户状态',
                        align: 'center',
                        sortable: false,
                        formatter: function (value, row, index) {
                            if(value==1){
                                return '已注册';
                            }else if(value==2) {
                                return '已发货';
                            }else{
                                return'-';
                            }
                        }
                    },
                    {
                        field: 'merchantStatus',
                        title: '推广状态',
                        align: 'center',
                        sortable: false,
                        formatter: function (value, row, index) {
                            if(value==1){
                                return '待跟进';
                            }else if(value==2) {
                                return '重点客户';
                            }else if(value==3) {
                                return '成功客户';
                            }else if(value==4) {
                                return '放弃';
                            }else{
                                return'-';
                            }
                        }
                    },
                    {
                        field: 'operationTime',
                        title: '初次下单时间',
                        align: 'center',
                        sortable: false
                    },
                    {
                        field: 'waybillCount',
                        title: '本期发货票数',
                        align: 'center',
                        sortable: false
                    },
                    {
                        field: 'allFee',
                        title: '本期发货金额(元)',
                        align: 'center',
                        sortable: false
                    },
                    {
                        field: 'damagerCount',
                        title: '本期异常票数',
                        align: 'center',
                        sortable: false
                    }
                ]
            });

        }

        function queryParams(params) {
            return $.extend({}, params, $('#queryForm').serializeJson());
        }

        function responseHandler(res) {
            var waybillSum = 0;
            var amountSum = 0;
            var row = res.rows[0];
            if(row != null){
                waybillSum=row.waybillSum;
                amountSum = row.amountSum;
            }
            $("#waybillSum").html(waybillSum);
            $("#amountSum").html(amountSum);
            $.each(res.rows, function (i, row) {
                row.state = $.inArray(row.id, selections) !== -1;
            });
            return res;
        }


        function getHeight() {
            return $(window).height() - 180;
        }

        $(function () {
            initTable();

            var icon = "<i class='fa fa-times-circle'></i> ";
            var $editForm = $('#editForm');
            var $editOuterCustomerModal = $('#editOuterCustomerModal');
            var $saveButton = $('#saveButton');
            var $addOuterCustomer = $('#addOuterCustomer')
            var $validator = $editForm.validate({
                rules: {
                    allocCentreId: {required: true},
                    regionId: {required: true},
                    merchantStatus: {required: true},
                    customerName: {
                        required: true,
                        remote: {
                            url: "../outer/isCustomerNameExist",
                            type: "GET",
                            dataTypes: "json",
                            data: {
                                customerName: function () {
                                    return $("#customerNameAdd").val();
                                },
                                id:function(){
                                        return $("#idAdd").val();
                                }
                            }
                        },
                    },
                    provinceId: {required: true},
                    cityId: {required: true},
                    countyId: {required: true},
                    linkman: {required: true},
                    mobile:{
                        required: {
                            depends:function(){ //二选一
                                return ($('#telephone').val()=="");
                            }
                        },
                        isMobile:true
                    },
                    telephone:{
                        required: {
                            depends: function(){ //二选一
                                return ($('#mobile').val()=="");
                            }
                        },
                        isTelphone:true
                    },
                    logisticsDemand:{required: true,minlength: 1}
                    //sysAccount:{
                        //required: "#status1:checked"
                        /*remote: {
                            url: "../outer/isSysAccountNotExist",
                            type: "GET",
                            dataTypes: "json",
                            data: {
                                sysAccount: function () {
                                    return $("#sysAccount").val();
                                }
                            }
                        },*/
                    //}
                },
                messages: {
                    allocCentreId: {required: icon + '请选择集散'},
                    regionId: {required: icon + '请选择区域'},
                    merchantStatus: {required: icon + '请选择推广状态'},
                    customerName: {
                        required: icon + '请输入客户名',
                        remote: icon + '该客户名已存在'
                    },
                    provinceId: {required: icon + '请选择省',},
                    cityId: {required: icon + '请选择市',},
                    countyId: {required: icon + '请选择区/县',},
                    linkman: {required: icon + '请输入联系人'},
                    mobile: {required: icon +"请输入手机号码",isMobile: icon +"手机号码格式不对"},
                    telephone:{required: icon +"请输入固定电话",isTelphone: icon +"座机号码格式不对"},
                    logisticsDemand:{required: icon +"请至少选择一个物流需求"}
                    //sysAccount:{
                        //required: icon +"请输入注册名"
                        //remote: icon + '注册名不存在'
                    //}

                },
                submitHandler: function (form) {
                    saveData();
                    return false;
                }
            });

            function saveData() {
                $saveButton.prop('disabled', true);
                $.ajax({
                    url: zxb.SYS_PATH + '/outer/add',
                    type: 'POST',
                    data: $editForm.serialize(),
                    success: function (data) {
                        $editOuterCustomerModal.modal('hide');
                        $table.bootstrapTable('refresh');
                        clearEditData()
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

            $editOuterCustomerModal.on('show.bs.modal', function (e) {
                $validator.resetForm();
                $editForm.get(0).reset();
            });


            $('#queryButton').click(function () {
                $table.bootstrapTable('refresh');
            });

            $saveButton.click(function () {
                $editForm.submit();
            });


            //日期控件
            $('#waybill-date-id .input-group.date').datepicker({
                minViewMode: 1,
                keyboardNavigation: false,
                forceParse: false,
                autoclose: true,
                todayHighlight: true
            });
            /*$('#waybill-date-id .input-daterange').datepicker({
                keyboardNavigation: false,
                forceParse: false,
                autoclose: true
            });*/
            //上传组件
            //$( '#file-pretty input[type="file"]' ).prettyFile();

            //省份和市区的添加
            $("#provinceIdAdd").change(function () {
                $("#provinceAdd").val($(this).find("option:selected").text());
                if ($(this).val()) {
                    $.ajax({
                        url: zxb.SYS_PATH + '/area/citys',
                        type: 'GET',
                        data: {parentId: $(this).val()},
                        success: function (data) {
                            $("#cityIdAdd").html("<option value>请选择市</option>");
                            $("#countyIdAdd").html("<option value>请选择区/县</option>");
                            for (var i = 0; i < data.length; i++) {
                                $("#cityIdAdd").append("<option value='" + data[i].id + "'>" + data[i].areaName + "</option>");
                            }
                        }
                    });
                } else {
                    $("#cityIdAdd").html("<option value>请选择市</option>");
                    $("#countyIdAdd").html("<option value>请选择区/县</option>");
                }
            });
            $("#cityIdAdd").change(function () {
                $("#cityAdd").val($(this).find("option:selected").text());
                if ($(this).val()) {
                    $.ajax({
                        url: zxb.SYS_PATH + '/area/countrys',
                        type: 'GET',
                        data: {parentId: $(this).val()},
                        success: function (data) {
                            $("#countyIdAdd").html("<option value>请选择区/县</option>");
                            for (var i = 0; i < data.length; i++) {
                                //console.log(data[i].areaName);
                                $("#countyIdAdd").append("<option value='" + data[i].id + "'>" + data[i].areaName + "</option>");
                            }
                        }
                    });
                } else {
                    $("#countyIdAdd").html("<option value>请选择区/县</option>");
                }
            });
            $("#countyIdAdd").change(function () {
                $("#countyAdd").val($(this).find("option:selected").text());
            });

            //区域的加载
            $("#allocCentreId").change(function () {
                if ($(this).val()) {
                    $.ajax({
                        url: zxb.SYS_PATH + '/region/regions',
                        type: 'GET',
                        data: {allocCentreId: $(this).val()},
                        success: function (data) {
                            //清空外客户接受人
                            $("#acceptId").html("<option value>请选择</option>");
                            $("#regionId").html("<option value>请选择</option>");
                            for (var i = 0; i < data.length; i++) {
                                $("#regionId").append("<option value='" + data[i].id + "'>" + data[i].name + "</option>");
                            }
                        }
                    });
                } else {
                    $("#acceptId").html("<option value>请选择</option>");
                    $("#regionId").html("<option value>请选择</option>");
                    $("#regionInput").val('');
                }
            });
            $("#regionId").change(function () {
                $("#regionInput").val($(this).find("option:selected").text());
            });

            $("#allocCentreIdAdd").change(function () {
                $("#regionIdAdd").html("<option value>请选择</option>");
                $("#allocCentreAdd").val($(this).find("option:selected").text());
                if ($(this).val()) {
                    $.ajax({
                        url: zxb.SYS_PATH + '/region/regions',
                        type: 'GET',
                        data: {allocCentreId: $(this).val()},
                        success: function (data) {
                            for (var i = 0; i < data.length; i++) {
                                $("#regionIdAdd").append("<option value='" + data[i].id + "'>" + data[i].name + "</option>");
                            }
                        }
                    });
                } else {
                    $("#regionIdAdd").html("<option value>请选择</option>");
                }
            });
            $("#regionIdAdd").change(function () {
                $("#regionAdd").val($(this).find("option:selected").text());
            });

            //外客户接受人的加载
            $("#regionId").change(function () {
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
                var regionInput = $('#regionInput').val();
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
                if($("#acceptName").val()=='${(CURRENT_USER.realName)!}'){
                    layer.tips('请选择别的接受人（自己无法移交给自己）', "#migratoryBtn");
                    return false;
                }
                return;
                $.ajax({
                    url: zxb.SYS_PATH + '/outer/migratory',
                    type: 'POST',
                    data: {ids:idsArr,acceptId:$("#acceptId").val(),acceptName:$("#acceptName").val()},
                    success: function (data) {
                        $table.bootstrapTable('refresh');
                        return false;
                    },
                    beforeSend: function () {
                        $('#migratoryBtn').prop('disabled', true);
                    },
                    complete: function () {
                        $('#migratoryBtn').prop('disabled', false);
                    }
                });
            });

            $('a[data-toggle="tab"]').on('hide.bs.tab', function (e) {
                e.target; // newly activated tab
                e.relatedTarget; // previous active tab
                var newTab = e.target;
                var preTab = e.relatedTarget;
                if(newTab.hash=='#tab-1'){
                    if($editForm.valid()==false){
                        e.preventDefault();//阻止a链接的跳转行为
                        $('#customerTab a[href="#tab-1"]').tab('show');
                    }
                }
            })

        });
    </script>

    [/#macro]
    [#macro section_headcss]
    <style type="text/css">
        .form-group{
            margin:10px 10px;
        }
    </style>
    [/#macro]
    [@mainLayout]
    <div class="wrapper wrapper-content animated fadeInRight">
        <div class="row">
            <div class="col-sm-12">

                <div class="panel panel-default">
                    <div class="panel-body">
                        <form class="form-inline" id="queryForm" onsubmit="javascript:return false;">
                            <div class="form-group" id="waybill-date-id">
                                <label for="waybillDate">下单时间</label>
                                <div class="input-group date">
                                    <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                                    <input type="text" class="form-control" name="operationTime">
                                </div>
                                [#--<div class="input-daterange input-group" id="datepicker">
                                    <input type="text" class="input-sm form-control" name="start" />
                                    <span class="input-group-addon">到</span>
                                    <input type="text" class="input-sm form-control" name="end" />
                                </div>--]
                            </div>
                            <div class="form-group">
                                <label for="sustomerStatus">客户状态</label>
                                <select name="status" class="form-control">
                                    <option value="">全部</option>
                                    <option value="1">已注册</option>
                                    <option value="2">已发货</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="merchantStatus">推广状态</label>
                                <select name="merchantStatus" class="form-control">
                                    <option value="">全部</option>
                                    <option value="1">待跟进</option>
                                    <option value="2">重点客户</option>
                                    <option value="3">成功客户</option>
                                    <option value="4">放弃</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="allocCentreId">集散中心</label>
                                <select id = "allocCentreId" name="allocCentreId" class="form-control">
                                    <option value="">全部</option>
                                    [#if allocCentres??]
                                        [#list allocCentres as allocCentre]
                                            <option value="${allocCentre.id!}">${allocCentre.name}</option>
                                        [/#list]
                                    [/#if]
                                </select>
                            </div>
                            <div class="form-group" >
                                <label for="regionId">区域</label>
                                <input type="hidden" id="regionInput" name="regionInput" value="">
                                <select id="regionId" name="regionId" class="form-control">
                                    <option value="">全部</option>
                                    [#--[#if regions??]--]
                                        [#--[#list regions as region]--]
                                            [#--<option value="${region.id!}">${region.name}</option>--]
                                        [#--[/#list]--]
                                    [#--[/#if]--]
                                </select>
                            </div>
                            [#--<div class="form-group">
                                <label for="logisticsDemand">物流需求</label>
                                <select id="logisticsDemand" name="logisticsDemand" class="form-control">
                                    <option value="">全部</option>
                                    <option value="0">国内物流</option>
                                    <option value="2">外贸进仓</option>
                                    <option value="1">电商进仓</option>
                                </select>
                            </div>--]
                            <div class="form-group">
                                <label for="realNameInput">客户名</label>
                                <input type="text" id="customerName" name="customerName" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="realNameInput">推广人</label>
                                <input type="text" id="currUser" name="currUser" class="form-control">
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="checkbox" name="serviceLifeRadio" value="1">只显示外客户服务有效期内
                                </label>
                            </div>
                            <button type="button" class="btn btn-primary" id="queryButton">查询</button>
                        </form>
                    </div>
                </div>
                <div class="btn-group" id="tableToobar" role="group">
                    <button type="button" class="btn btn-primary" data-toggle="modal" id="addOuterCustomer" data-target="#editOuterCustomerModal">
                        <i class="glyphicon glyphicon-plus"></i> 增加客户
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
                       data-url="${SYS_PATH}/outer/data"
                       data-response-handler="responseHandler"
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
                            <div class="form-group col-sm-7">
                                <label>区域接受人</label>
                                <input type="hidden" id="acceptName" name="acceptName" value="">
                                <select id="acceptId" name="acceptId" class="form-control">
                                    <option value="">请选择</option>
                                    [#--[#if users??]--]
                                        [#--[#list users as user]--]
                                            [#--<option value="${user.id!}">${user.realName}</option>--]
                                        [#--[/#list]--]
                                    [#--[/#if]--]
                                </select>
                                <button class="btn btn-primary" type="submit" id="migratoryBtn">客户移交</button>
                            </div>

                            <div class="form-group col-sm-2">
                                <label>发货票数总计：</label>
                                <span id = "waybillSum"></span><span>票</span>
                            </div>
                            <div class="form-group col-sm-2">
                                <label>发货金额总计：</label>
                                <span id = "amountSum"></span><span>元</span>
                            </div>

                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    [#-- 新增客户模态窗口 --]
    <div class="modal fade" id="editOuterCustomerModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document" style="width:1000px">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close" onclick="clearEditData()"><span
                            aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">添加客户</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" id="editForm">
                        <input type="hidden" id="idAdd" name="id">
                        <div class="tabs-container">
                            <ul class="nav nav-tabs" id="customerTab">
                                <li class="active"><a data-toggle="tab" href="#tab-1" aria-expanded="true"> 客户信息</a>
                                </li>
                                <li class=""><a data-toggle="tab" href="#tab-2" aria-expanded="true">货品信息</a>
                                </li>
                                <li class=""><a data-toggle="tab" href="#tab-3" aria-expanded="true"> 物流信息</a>
                                </li>
                                <li class=""><a data-toggle="tab" href="#tab-4" aria-expanded="true">其它信息</a>
                                </li>
                            </ul>
                            <div class="tab-content">
                                <div id="tab-1" class="tab-pane active">
                                    <div class="panel-body">
                                        <div class="form-group">
                                            <label class="col-sm-2">集散：</label>
                                            <div class="col-sm-3">
                                                <input type="hidden" id="allocCentreAdd" name="allocCentre" value="">
                                                <select id="allocCentreIdAdd" name="allocCentreId" class="form-control" aria-required="true">
                                                    <option value="">全部</option>
                                                    [#if allocCentres??]
                                                        [#list allocCentres as allocCentre]
                                                            <option value="${allocCentre.id!}">${allocCentre.name}</option>
                                                        [/#list]
                                                    [/#if]
                                                </select>
                                                <span class="help-block m-b-none"></span>
                                            </div>
                                            <label class="col-sm-1">区域：</label>
                                            <div class="col-sm-2">
                                                <input type="hidden" id="regionAdd" name="region" value="">
                                                <select id="regionIdAdd" name="regionId" class="form-control" aria-required="true">
                                                <option value="">全部</option>
                                                    [#--[#if regions??]--]
                                                        [#--[#list regions as region]--]
                                                            [#--<option value="${region.id!}">${region.name}</option>--]
                                                        [#--[/#list]--]
                                                    [#--[/#if]--]
                                                </select>
                                                <span class="help-block m-b-none"></span>
                                            </div>
                                                <label class="col-sm-2 control-label">推广状态：</label>
                                                <div class="col-sm-2">
                                                    <select id="merchantStatus" name="merchantStatus" class="form-control" aria-required="true">
                                                        <option value="1">待跟进</option>
                                                        <option value="2">重点客户</option>
                                                        [#--<option value="3">成功客户</option>--]
                                                        <option value="4">放弃</option>
                                                    </select>
                                                </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 ">客户名：</label>
                                            <div class="col-sm-3">
                                                <input type="text" placeholder="客户名" id="customerNameAdd" name="customerName" class="form-control"  aria-required="true">
                                            </div>
                                            <label class="col-sm-1">行业：</label>
                                            <div class="col-sm-3">
                                                <input type="text" placeholder="行业" id="industryAdd" name="industry" class="form-control">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2">地址：</label>
                                            <div class="col-sm-3">
                                                <input type="hidden" id="provinceAdd" name="province" value="">
                                                <select id="provinceIdAdd" name="provinceId" class="form-control" aria-required="true">
                                                    <option value="">请选择省</option>
                                                    [#if provices??]
                                                        [#list provices as p ]
                                                            <option value="${p.id!}">${p.areaName!}</option>
                                                        [/#list]
                                                    [/#if]
                                                </select>
                                            </div>
                                            <div class="col-sm-3">
                                                <input type="hidden" id="cityAdd" name="city" value="">
                                                <select id="cityIdAdd" name="cityId" class="form-control" aria-required="true">
                                                    <option value="">请选择市</option>
                                                </select>
                                            </div>
                                            <div class="col-sm-4">
                                                <input type="hidden" id="countyAdd" name="county" value="">
                                                <select id="countyIdAdd" name="countyId" class="form-control" aria-required="true">
                                                    <option value="">请选择区/县</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 ">详细地址：</label>
                                            <div class="col-sm-10">
                                                <input type="text" placeholder="详细地址" id="address" name="address" class="form-control" >
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 ">联系人：</label>
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
                                            <label class="col-sm-2 ">职务：</label>
                                            <div class="col-sm-2">
                                                <input type="text" placeholder="职务" id="jobTitle" name="jobTitle" class="form-control" >
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 ">客户状态：</label>
                                            <div class="col-sm-2 checkbox" >
                                                <label class="checkbox-inline">
                                                    <input type="checkbox" id="status1" name="status" value="1">已注册
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label class="checkbox-inline">
                                                    [#--<input type="checkbox" id="shipmentsStatus" name="shipmentsStatus" value="2">--]
                                                        <span id="shipmentsStatus"></span>
                                                </label>
                                            </div>
                                            [#--<label class="col-sm-2 control-label">注册名：</label>
                                            <div class="col-sm-2">
                                                <input type="text" placeholder="注册名" id="sysAccount" name="sysAccount" class="form-control" aria-required="true">
                                            </div>--]
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 ">物流需求：</label>
                                            <div class="col-sm-2 checkbox" >
                                                <label>
                                                    <input type="checkbox" id="logisticsDemand" name="logisticsDemand" value="0" aria-required="true">国内物流
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox" id="logisticsDemand" name="logisticsDemand" value="2" aria-required="true">外贸进仓
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox" id="logisticsDemand" name="logisticsDemand" value="1" aria-required="true">电商进仓
                                                </label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div id="tab-2" class="tab-pane">
                                    <div class="panel-body">
                                        <div class="form-group">
                                            <label class="col-sm-2">货物品类：</label>
                                            <div class="col-sm-3">
                                                <input type="text" placeholder="货物品类" id="goodsCategory" name="goodsCategory" class="form-control">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2">货物属性：</label>
                                            <div class="col-sm-2 checkbox" >
                                                <label>
                                                    <input type="checkbox" name="goodsAttr" value="2">抛货
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox"  name="goodsAttr" value="1">重货
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox"  name="goodsAttr" value="3">重抛货
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox"  name="goodsAttr" value="4">抛重货
                                                </label>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2"></label>
                                            <div class="col-sm-2 checkbox" >
                                                <label>
                                                    <input type="checkbox"  name="goodsAttr" value="5">标准件
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox"  name="goodsAttr" value="6">异形件
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox"  name="goodsAttr" value="7">装卸有要求
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox"  name="goodsAttr" value="8">堆叠有要求
                                                </label>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2">备注：</label>
                                            <div class="col-sm-10">
                                                <input type="text" placeholder="属性备注" id="goodsAttrMemo" name="goodsAttrMemo" class="form-control">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2">外包装情况：</label>
                                            <div class="col-sm-2 checkbox" >
                                                <label>
                                                    <input type="checkbox" name="goodsPackage" value="无">无
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox" name="goodsPackage" value="纸箱">纸箱
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox" name="goodsPackage" value="桶">桶
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox" name="goodsPackage" value="包">包
                                                </label>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2"></label>
                                            <div class="col-sm-2 checkbox" >
                                                <label>
                                                    <input type="checkbox" name="goodsPackage" value="托盘">托盘
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox" name="goodsPackage" value="木架">木架
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox" name="goodsPackage" value="纸">纸
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox" name="goodsPackage" value="其它">其它
                                                </label>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2">备注：</label>
                                            <div class="col-sm-10">
                                                <input type="text" placeholder="外包装备注" id="goodsPackageMemo" name="goodsPackageMemo" class="form-control">
                                            </div>
                                        </div>
                                        [#--<div id="file-pretty">
                                        <div class="form-group">

                                            <label class="col-sm-2">货物图片（多选）：</label>
                                            <div class="col-sm-10">
                                                <input type="file" multiple="multiple" class="form-control">
                                            </div>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-12">
                                                <dl class="dl-horizontal">
                                                    <dd class="project-people">
                                                        <a href="project_detail.html">
                                                            <img alt="image" class="img-circle" src="img/a3.jpg">
                                                        </a>
                                                        <a href="project_detail.html">
                                                            <img alt="image" class="img-circle" src="img/a1.jpg">
                                                        </a>
                                                        <a href="project_detail.html">
                                                            <img alt="image" class="img-circle" src="img/a2.jpg">
                                                        </a>
                                                        <a href="project_detail.html">
                                                            <img alt="image" class="img-circle" src="img/a4.jpg">
                                                        </a>
                                                        <a href="project_detail.html">
                                                            <img alt="image" class="img-circle" src="img/a5.jpg">
                                                        </a>
                                                    </dd>
                                                </dl>
                                            </div>
                                        </div>--]
                                    </div>
                                </div>
                                <div id="tab-3" class="tab-pane">
                                    <div class="panel-body">
                                        <div class="form-group">
                                            <label class="col-sm-2">发货方式：</label>
                                            <div class="col-sm-2 checkbox" >
                                                <label>
                                                    <input type="checkbox" name="transportMode" value="3">门到门
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox" name="transportMode" value="2">站到门
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox" name="transportMode" value="1">站到站
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox" name="transportMode" value="4">门到站
                                                </label>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2">备注：</label>
                                            <div class="col-sm-10">
                                                <input type="text" placeholder="发货方式备注" id="transportModeMemo" name="transportModeMemo" class="form-control">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2">付款方式：</label>
                                            <div class="col-sm-2 checkbox" >
                                                <label>
                                                    <input type="checkbox" name="paymentMode" value="1">预付
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox" name="paymentMode" value="2">到付
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox" name="paymentMode" value="3">月结
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox" name="paymentMode" value="4">其它
                                                </label>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2">备注：</label>
                                            <div class="col-sm-10">
                                                <input type="text" placeholder="付款方式备注" id="paymentModeMemo" name="paymentModeMemo" class="form-control">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2">车辆要求：</label>
                                            <div class="col-sm-2 checkbox" >
                                                <label>
                                                    <input type="checkbox" name="vehicleDemand" value="0">无
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox" name="vehicleDemand" value="1">有，不必须
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox" name="vehicleDemand" value="2">有要求
                                                </label>
                                            </div>

                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2">备注：</label>
                                            <div class="col-sm-10">
                                                <input type="text" placeholder="车辆要求备注" id="vehicleDemandMemo" name="vehicleDemandMemo" class="form-control">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2">发货时间：</label>
                                            <div class="col-sm-2 checkbox" >
                                                <label>
                                                    <input type="checkbox" name="deliverySchedule" value="1">临时通知
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox" name="deliverySchedule" value="2">固定时间
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox" name="deliverySchedule" value="3">按计划
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox"name="deliverySchedule"  value="0">其它
                                                </label>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2">备注：</label>
                                            <div class="col-sm-10">
                                                <input type="text" placeholder="发货时间备注" id="deliveryScheduleMemo" name="deliveryScheduleMemo" class="form-control">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2">最关注物流内容：</label>
                                            <div class="col-sm-2 checkbox" >
                                                <label>
                                                    <input type="checkbox" name="attention" value="1">价格
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox" name="attention" value="2">时效
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox" name="attention" value="3">运输质量
                                                </label>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2"></label>
                                            <div class="col-sm-2 checkbox" >
                                                <label>
                                                    <input type="checkbox" name="attention" value="4">合作稳定度
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox" name="attention" value="5">异常处理
                                                </label>
                                            </div>
                                            <div class="col-sm-2 checkbox">
                                                <label>
                                                    <input type="checkbox" name="attention" value="6">其它
                                                </label>
                                            </div>

                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2">备注：</label>
                                            <div class="col-sm-10">
                                                <input type="text" placeholder="关注物流内容备注" id="attentionMemo" name="attentionMemo" class="form-control">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div id="tab-4" class="tab-pane">
                                    <div class="panel-body">
                                        <div class="form-group">
                                            <label class="col-sm-1">说明：</label>
                                            <div class="col-sm-11">
                                                <textarea rows="5" id="ccomment" name="memo" class="form-control"></textarea>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal" onclick="clearEditData();">关闭</button>
                                <button type="button" class="btn btn-primary" id="saveButton">保存</button>
                            </div>
                        </div>

                    </form>

                </div>

            </div>
        </div>
    </div>
    [/@mainLayout]
[/#escape]
