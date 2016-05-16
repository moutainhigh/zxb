[#escape x as x?html]
    [#include "../_layout.ftl" /]


    [#macro section_footjs]

    <script>
        var $table = $('#table'), selections = [];
        function initTable() {
            $table.bootstrapTable({
                height: getHeight(),
                columns: [
                    {
                        field: 'realName',
                        title: '姓名',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'account',
                        title: '登陆名',
                        sortable: false,
                        align: 'center'
                    },
                    {
                        field: 'isDeleted',
                        title: '是否注销',
                        sortable: false,
                        align: 'center',
                        formatter: function (value, row, index) {
                            return value ? "是" : "否";
                        }
                    },
                    {
                        field: 'isAdmin',
                        title: '系统角色',
                        sortable: false,
                        align: 'center',
                        formatter: function (value, row, index) {
                            return value ? "管理员" : "用户";
                        }
                    },
                    {
                        field: 'operate',
                        title: '设置',
                        align: 'center',
                        events: operateEvents,
                        formatter: operateFormatter
                    }
                ]
            });
        }

        function queryParams(params) {
            return $.extend({}, params, $('#queryForm').serializeJson());
        }

        function operateFormatter(value, row, index) {
            return [
                '<a class="permission" href="javascript:void(0)" title="Permission">',
                '权限设置',
                '</a>  ',
                '<a class="resetPwd" href="javascript:void(0)" title="ResetPwd">',
                '密码重置',
                '</a>  ',
                '<a class="remove" href="javascript:void(0)" title="Remove">',
                '注销用户',
                '</a>'
            ].join('');
        }

        window.operateEvents = {
            'click .permission': function (e, value, row, index) {

                cleanUserPermissionModal();

                var $userPermissionModal=$("#userPermissionModal");
                $userPermissionModal.find('[name="userId"]').val(row.id);
                $userPermissionModal.find('[name="realName"]').val(row.realName);
                $userPermissionModal.find('[name="account"]').val(row.account);
                $userPermissionModal.find('[name="mobile"]').val(row.mobile);
                $userPermissionModal.modal("show");

                viewUserPermission(row.id);
            },
            'click .resetPwd': function (e, value, row, index) {
                layer.confirm('确认重置该用户的密码吗?', {icon: 3, title: '提示'}, function (index) {
                    $.ajax({
                        url: zxb.SYS_PATH + '/user/reset_pwd/'+row.id,
                        type:'POST',
                        success: function (data) {
                            //TODO:
                            layer.close(index);
                        }
                    });
                });

            },
            'click .remove': function (e, value, row, index) {
                layer.confirm('确认注销该用户吗?', {icon: 3, title: '提示'}, function (index) {
                    $.ajax({
                        url: zxb.SYS_PATH + '/user/remove/'+row.id,
                        type:'POST',
                        success: function (data) {
//                            $table.bootstrapTable('remove', {
//                                field: 'id',
//                                values: [row.id]
//                            });
                            layer.close(index);
                            $table.bootstrapTable('refresh');
                        }
                    });
                });


            }
        };

        function responseHandler(res) {
            $.each(res.rows, function (i, row) {
                row.state = $.inArray(row.id, selections) !== -1;
            });
            return res;
        }


        function getHeight() {
            return $(window).height() - 120;
        }

        function cleanUserPermissionModal()
        {
            var $userPermissionModal=$("#userPermissionModal");
            $userPermissionModal.find('[name="userId"]').val("");
            $userPermissionModal.find('[name="txtAllPermissionValue"]').val("");
            $userPermissionModal.find('[name="txtAllPermissionRegionValue"]').each(function(){
                $(this).val("");
            });
            $userPermissionModal.find('[name="allocCentreId"]').each(function(){
                $(this).attr("disabled","disabled");
            });
            $userPermissionModal.find('[name="regionId"]').each(function(){
                $(this).attr("disabled","disabled");
            });
            $userPermissionModal.find('[name="allocCentreId"]').each(function()
            {
                //$(this).html("<option value>请选择</option>");
            });
            $userPermissionModal.find('[name="labSelectedRegion"]').each(function() {
                $(this).html("");
            });
            //全不选
            $userPermissionModal.find('[name="chkPermission"]').prop("checked",false);


        }

        function viewUserPermission(userId)
        {
            var $userPermissionModal=$("#userPermissionModal");
            var $chkPermission=$userPermissionModal.find("[name='chkPermission']");

            $.ajax({
                url: zxb.SYS_PATH + '/user/viewPermission/'+userId,
                type:'POST',
                success: function (data) {
                    if(data.code=="1")
                    {
                        $.each(data.data,function(n,value) {
                            var $txtAllPermissionValue=$userPermissionModal.find('[name="txtAllPermissionValue"]');
                            var appentValue="";
                            $chkPermission.each(function(e){
                                appentValue=","+value.permissionId+appentValue;
                            });
                            $txtAllPermissionValue.val(appentValue);

                            $chkPermission.each(function(){
                                var $chk=$(this);
                                if($chk.val()==value.permissionId)
                                {
                                    var $allocCentreId=$chk.closest('.form-group').find("[name='allocCentreId']");
                                    var $regionId=$chk.closest('.form-group').find("[name='regionId']");
                                    var $labSelectedRegion=$chk.closest('.form-group').find("[name='labSelectedRegion']");
                                    var $txtAllPermissionRegionValue=$chk.closest('.form-group').find('[name="txtAllPermissionRegionValue"]');

                                    $chk.prop("checked",true);
                                    $allocCentreId.removeAttr("disabled");
                                    $regionId.removeAttr("disabled");
                                    $labSelectedRegion.html(value.txtSelectedRegion);
                                    $txtAllPermissionRegionValue.val(value.txtPermissionRegionValue);
                                }
                            });
                        });

                    }
                }
            });
        }


        $(function () {
            initTable();
            var icon = "<i class='fa fa-times-circle'></i> ";
            var $editForm = $('#editForm');
            var $editUserModal = $('#editUserModal');
            var $saveButton = $('#saveButton');
            var $validator = $editForm.validate({
                rules: {
                    account: {
                        required: true,
                        minlength: 2,
                        alphanumeric: true
                    },
                    realName: {
                        required: true
                    },
                    password: {
                        required: true,
                        minlength: 5
                    },
                    mobile: {
                        required: true,
                        mobile: true
                    },
                    isAdmin: {required: true}

                },
                messages: {
                    account: {
                        required: icon + '请输入登录名',
                        minlength: icon + '登录名必须两个字符以上',
                        alphanumeric: icon + '登录名必须是字母、数字、下划线'
                    },
                    realName: {
                        required: icon + '请输入姓名'
                    },
                    password: {
                        required: icon + '请输入密码',
                        minlength: icon + '密码必须5个字符以上'
                    },
                    mobile: {
                        required: icon + '请输入手机号码',
                    },
                    isAdmin: {required: icon + '请选择角色'}

                },
                submitHandler: function (form) {
                    saveData();
                    return false;
                }
            });

            function saveData() {
                $saveButton.prop('disabled', true);
                $.ajax({
                    url: zxb.SYS_PATH + '/user/add',
                    type: 'POST',
                    data: $editForm.serialize(),
                    success: function (data) {
                        if (data.code == 1) {
                            $editUserModal.modal('hide');
                            $table.bootstrapTable('refresh');
                            $editForm.reset();
                        }else{
                            layer.alert("登录名已经存在",{icon: 2});
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

            $editUserModal.on('show.bs.modal', function (e) {
                $validator.resetForm();
                $editForm.get(0).reset();
            });


            $('#queryButton').click(function () {
                $table.bootstrapTable('refresh');
            });


            //权限中，集散区域的加载
            $("[name='allocCentreId']").change(function () {
                var $opThis=$(this);
                if ($(this).val()) {
                    $.ajax({
                        url: zxb.SYS_PATH + '/region/regions',
                        type: 'GET',
                        data: {allocCentreId: $(this).val()},
                        success: function (data) {
                            //找到对应的区域
                            $region=$opThis.closest('.form-group').find("[name='regionId']");

                            $region.html("<option value>请选择</option>");
                            for (var i = 0; i < data.length; i++) {
                                $region.append("<option value='" + data[i].id + "'>" + data[i].name + "</option>");
                            }
                        }
                    });
                } else {
                    $region=$opThis.closest('.form-group').find("[name='regionId']");
                    $region.html("<option value>请选择</option>");
                }
            });
            //权限-内容选择
            $("[name='chkPermission']").click(function(){
                var $chk=$(this);
                var $allocCentreId=$chk.closest('.form-group').find("[name='allocCentreId']");
                var $regionId=$chk.closest('.form-group').find("[name='regionId']");

                var $labSelectedRegion=$chk.closest('.form-group').find("[name='labSelectedRegion']");
                var $txtAllPermissionRegionValue=$chk.closest('.form-group').find('[name="txtAllPermissionRegionValue"]');

                var $txtAllPermissionValue=$chk.closest('form').find('[name="txtAllPermissionValue"]');

                var $chkPermission=$chk.closest('form').find(":checked[name='chkPermission']");

                var appentValue="";
                $chkPermission.each(function(e){
                    var c=$(this);
                     appentValue=","+c.val()+appentValue;
                });
                $txtAllPermissionValue.val(appentValue);
                if($chk[0].checked)
                {
                    $allocCentreId.removeAttr("disabled");
                    $regionId.removeAttr("disabled");
                }else{

                    $allocCentreId.attr("disabled","disabled");
                    $regionId.attr("disabled","disabled");
                    $labSelectedRegion.html("");
                    $txtAllPermissionRegionValue.val("");
                }
            });
            //权限——添加区域
            $("[name='btRegionAdd']").click(function(){
                var $button=$(this);
                var $chkPermission=$button.closest('.form-group').find("[name='chkPermission']");
                if(!$chkPermission[0].checked){return;}
                var $allocCentreId=$button.closest('.form-group').find("[name='allocCentreId']");
                var $regionId=$button.closest('.form-group').find("[name='regionId']");
                var $labSelectedRegion=$button.closest('.form-group').find("[name='labSelectedRegion']");
                var $txtAllPermissionRegionValue=$button.closest('.form-group').find('[name="txtAllPermissionRegionValue"]');
                var appentValue=","+$chkPermission.val()+"_"+$allocCentreId.val()+"_"+$regionId.val();
                if(!$allocCentreId.val()=='' && !$regionId.val()==''
                        && $txtAllPermissionRegionValue.val().indexOf(appentValue)<0)
                {
                    $labSelectedRegion.html($labSelectedRegion.html()+" "+$allocCentreId.find(':selected').text()+$regionId.find(':selected').text());
                    $txtAllPermissionRegionValue.val($txtAllPermissionRegionValue.val()+appentValue);
                    return;
                }

            });
           // 权限保存
            $("#btSavePermission").click(function () {
                var $button=$(this);
                $button.prop('disabled', true);
                var $userPermissionModal = $('#userPermissionModal');
                var $userId=$userPermissionModal.find("[name='userId']");
                var permissionRegionStr="";
                $userPermissionModal.find('[name="txtAllPermissionRegionValue"]').each(function(){
                    permissionRegionStr=permissionRegionStr+$(this).val();
                });
                var $txtAllPermissionValue=$userPermissionModal.find('[name="txtAllPermissionValue"]');
                $.ajax({
                    url: zxb.SYS_PATH + '/user/savepermission',
                    type: 'GET',
                    data: {userId:$userId.val(),permissions:$txtAllPermissionValue.val(),permissionRegion:permissionRegionStr},
                    success: function (data) {
                        $userPermissionModal.modal('hide');
                        return false;
                    },
                    beforeSend: function () {
                        $button.prop('disabled', true);
                    },
                    complete: function () {
                        $button.prop('disabled', false);
                    }
                });
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
                                <label for="realNameInput">姓名</label>
                                <input type="text" id="realNameInput" name="realName" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="isAdminInput">系统角色</label>
                                <select id="isAdminInput" name="isAdmin" class="form-control">
                                    <option value="">全部</option>
                                    <option value="0">用户</option>
                                    <option value="1">管理员</option>
                                </select>
                            </div>
                            <button type="button" class="btn btn-default" id="queryButton">查询</button>
                        </form>
                    </div>
                </div>

                <div class="btn-group hidden-xs" id="tableToobar" role="group">
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#editUserModal">
                        <i class="glyphicon glyphicon-plus"></i> 新增用户
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
                       data-url="${SYS_PATH}/user/data"
                       data-response-handler="responseHandler"
                       data-query-params="queryParams"
                       data-query-params-type="">
                </table>
            </div>
        </div>
    </div>

    [#-- 新增用户模态窗口 --]
    <div class="modal fade" id="editUserModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                            aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">添加用户</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" id="editForm">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">登录名：</label>
                            <div class="col-sm-8">
                                <input type="text" placeholder="登录名" name="account" class="form-control" maxlength="20"
                                       required=""
                                       aria-required="true">
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">姓名：</label>
                            <div class="col-sm-8">
                                <input type="text" placeholder="姓名" name="realName" class="form-control" maxlength="20"
                                       required=""
                                       aria-required="true">
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">手机号码：</label>
                            <div class="col-sm-8">
                                <input type="text" placeholder="手机号码" name="mobile" class="form-control" maxlength="11"
                                       required=""
                                       aria-required="true">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">角色：</label>
                            <div class="col-sm-8">
                                <div class="radio">
                                    <label>
                                        <input type="radio" name="isAdmin" value="0"> 普通用户
                                    </label>
                                </div>
                                <div class="radio">
                                    <label>
                                        <input type="radio" name="isAdmin" value="1"> 管理员
                                    </label>
                                </div>
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

    [#-- 权限模态窗口 --]
    <div class="modal fade" id="userPermissionModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document" style="width:800px">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                            aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">用户权限设置</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" id="formUserPermission">
                        <input type="text" name="userId" hidden>
                        <input type="text" name="txtAllPermissionValue" hidden>
                        <div class="form-group">
                            <label class="col-sm-1 control-label" style="width:70px">姓名：</label>
                            <div class="col-sm-2">
                                <input type="text" placeholder="姓名" name="realName" class="form-control" readonly>
                            </div>

                            <label class="col-sm-1 control-label" style="width:90px">登录名：</label>
                            <div class="col-sm-3">
                                <input type="text" placeholder="登录名" name="account" class="form-control" readonly>
                            </div>

                            <label class="col-sm-1 control-label" style="width:70px">手机：</label>
                            <div class="col-sm-3">
                                <input type="text" placeholder="手机" name="mobile" class="form-control" readonly>
                            </div>
                        </div>
                        [#--内客户管理--]
                        <div class="form-group" style="border:1px solid #D9D9F3;">
                            <label class="col-sm-1 control-label" style="width:100px">功能页：</label>
                            <div class="col-sm-10 checkbox" >
                                <label>
                                    <input type="checkbox" name="chkPermission" value="3">内客户管理
                                </label>
                            </div>

                            <label class="col-sm-1 control-label" style="width:100px">权限区域：</label>
                            <label class="col-sm-1 control-label" style="width:60px">集散</label>
                            <div class="col-sm-3">
                                <select  name="allocCentreId" class="form-control">
                                    <option value="">请选择</option>
                                    [#if allocCentres??]
                                        [#list allocCentres as allocCentre]
                                            <option value="${allocCentre.id!}">${allocCentre.name}</option>
                                        [/#list]
                                    [/#if]
                                </select>
                            </div>
                            <label class="col-sm-1 control-label">区域</label>
                            <div class="col-sm-3">
                                <select  name="regionId" class="col-sm-3 form-control">
                                    <option value="">请选择</option>
                                </select>
                            </div>
                            <button type="button" name="btRegionAdd" class="col-sm-1 btn btn-default" >添加</button>
                            <label class="col-sm-1 control-label" style="width:100px">已选：</label>
                            <label class="col-sm-9 control-label" style="text-align:left" name="labSelectedRegion"></label>
                            <input type="text" name="txtAllPermissionRegionValue" hidden>
                        </div>
                        [#--外客户管理--]
                        <div class="form-group" style="border:1px solid #D9D9F3;">
                            <label class="col-sm-1 control-label" style="width:100px">功能页：</label>
                            <div class="col-sm-10 checkbox" >
                                <label>
                                    <input type="checkbox" name="chkPermission" value="1">外客户管理
                                </label>
                            </div>

                            <label class="col-sm-1 control-label" style="width:100px">权限区域：</label>
                            <label class="col-sm-1 control-label" style="width:60px">集散</label>
                            <div class="col-sm-3">
                                <select name="allocCentreId" class="form-control">
                                    <option value="">请选择</option>
                                    [#if allocCentres??]
                                        [#list allocCentres as allocCentre]
                                            <option value="${allocCentre.id!}">${allocCentre.name}</option>
                                        [/#list]
                                    [/#if]
                                </select>
                            </div>
                            <label class="col-sm-1 control-label">区域</label>
                            <div class="col-sm-3">
                                <select  name="regionId" class="col-sm-3 form-control">
                                    <option value="">请选择</option>
                                </select>
                            </div>
                            <button type="button" name="btRegionAdd"  class="col-sm-1 btn btn-default" >添加</button>
                            <label class="col-sm-1 control-label" style="width:100px">已选：</label>
                            <label class="col-sm-10 control-label" style="text-align:left" name="labSelectedRegion"></label>
                            <input type="text" name="txtAllPermissionRegionValue" hidden>
                        </div>
                         [#--推广成绩汇总--]
                        <div class="form-group" style="border:1px solid #D9D9F3;">
                            <label class="col-sm-1 control-label" style="width:100px">功能页：</label>
                            <div class="col-sm-10 checkbox" >
                                <label>
                                    <input type="checkbox" name="chkPermission" value="2">推广成绩汇总
                                </label>
                            </div>
                        </div>
                    [#--区域营销统计--]
                        <div class="form-group" style="border:1px solid #D9D9F3;">
                            <label class="col-sm-1 control-label" style="width:100px">功能页：</label>
                            <div class="col-sm-10 checkbox" >
                                <label>
                                    <input type="checkbox" name="chkPermission" value="4">区域营销统计
                                </label>
                            </div>

                            <label class="col-sm-1 control-label" style="width:100px">权限区域：</label>
                            <label class="col-sm-1 control-label" style="width:60px">集散</label>
                            <div class="col-sm-3">
                                <select name="allocCentreId" class="form-control">
                                    <option value="">请选择</option>
                                    [#if allocCentres??]
                                        [#list allocCentres as allocCentre]
                                            <option value="${allocCentre.id!}">${allocCentre.name}</option>
                                        [/#list]
                                    [/#if]
                                </select>
                            </div>
                            <label class="col-sm-1 control-label">区域</label>
                            <div class="col-sm-3">
                                <select name="regionId" class="col-sm-3 form-control">
                                    <option value="">请选择</option>
                                </select>
                            </div>
                            <button type="button" name="btRegionAdd"  class="col-sm-1 btn btn-default" >添加</button>
                            <label class="col-sm-1 control-label" style="width:100px">已选：</label>
                            <label class="col-sm-10 control-label" style="text-align:left" name="labSelectedRegion"></label>
                            <input type="text" name="txtAllPermissionRegionValue" hidden>
                        </div>
                    [#--集散发货属性--]
                        <div class="form-group" style="border:1px solid #D9D9F3;">
                            <label class="col-sm-1 control-label" style="width:100px">功能页：</label>
                            <div class="col-sm-10 checkbox" >
                                <label>
                                    <input type="checkbox" name="chkPermission" value="5">集散发货属性
                                </label>
                            </div>

                            <label class="col-sm-1 control-label" style="width:100px">权限区域：</label>
                            <label class="col-sm-1 control-label" style="width:60px">集散</label>
                            <div class="col-sm-3">
                                <select name="allocCentreId" class="form-control">
                                    <option value="">请选择</option>
                                    [#if allocCentres??]
                                        [#list allocCentres as allocCentre]
                                            <option value="${allocCentre.id!}">${allocCentre.name}</option>
                                        [/#list]
                                    [/#if]
                                </select>
                            </div>
                            <label class="col-sm-1 control-label">区域</label>
                            <div class="col-sm-3">
                                <select  name="regionId" class="col-sm-3 form-control">
                                    <option value="">请选择</option>
                                </select>
                            </div>
                            <button type="button" name="btRegionAdd"  class="col-sm-1 btn btn-default" >添加</button>
                            <label class="col-sm-1 control-label" style="width:100px">已选：</label>
                            <label class="col-sm-10 control-label" style="text-align:left" name="labSelectedRegion"></label>
                            <input type="text" name="txtAllPermissionRegionValue" hidden>
                        </div>
                    </form>
                </div>



                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="btSavePermission">保存</button>
                </div>
            </div>
        </div>
    </div>

    [/@mainLayout]
[/#escape]
