[#escape x as x?html]
    [#include "../_layout.ftl" /]
    [#macro section_footjs]

    <script>
        $(function () {
            //定义一些变量
            var icon = "<i class='fa fa-times-circle'></i>";
            var $userForm = $("#userForm");
            var $userButton = $("#userButton");
            var $innerForm = $("#innerForm");
            var $innerButton = $("#innerButton");
            var $outerForm = $("#outerForm");
            var $outerButton = $("#outerButton");

            //用户密码修改
            $userButton.click(function () {
                $userForm.submit();
            });
            $userForm.validate({
                rules: {
                    passwordValue: {
                        required: true,
                        rangelength: [6, 10]
                    }
                },
                messages: {
                    passwordValue: {
                        required: icon + '请输入密码'
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
                    updatePassword();
                    return false;
                }
            });
            function updatePassword() {
                var value = $("#passwordValue").val();
                ajax("password", value);
                //重置
                $userForm[0].reset();
                $("#originalPasswordValue").val(value);
            }

            //内客户
            $innerButton.click(function () {
                $innerForm.submit();
            });
            $innerForm.validate({
                rules: {
                    innerValue: {
                        required: true,
                        digits: true
                    }
                },
                messages: {
                    innerValue: {
                        required: icon + '请输入整数'
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
                    innerUpdate();
                    return false;
                }
            });
            function innerUpdate() {
                var value = $("#innerValue").val();
                var date = $("#innerDate").val();
                ajax("innerTime", value + date);
                //重置
                $innerForm[0].reset();
                $("#originalInnerValue").val(value + date);
            }

            //外客户
            $outerButton.click(function () {
                $outerForm.submit();
            });
            $outerForm.validate({
                rules: {
                    outerValue: {
                        required: true,
                        digits: true
                    }
                },
                messages: {
                    outerValue: {
                        required: icon + '请输入整数'
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
                    outerUpdate();
                    return false;
                }
            });
            function outerUpdate() {
                var value = $("#outerValue").val();
                var date = $("#outerDate").val();
                ajax("outerTime", value + date);
                //重置
                $outerForm[0].reset();
                $("#originalOuterValue").val(value + date);
            }
        })

        //请求
        function ajax(code, value) {
            $.ajax({
                url: zxb.SYS_PATH + "/dict/update",
                data: {"code": code, "value": value},
                type: 'POST',
                success: function (data) {
                    //关闭进度条
                    toastr.options.progressBar = false;
                    toastr.options.timeOut = 2000;
                    if (data) {
                        toastr.success('修改成功');
                    } else {
                        toastr.error('修改失败');
                    }
                }
            });
        }
    </script>
    [/#macro]

    [@mainLayout]
    <div class="wrapper wrapper-content animated fadeInRight">
        <div class="row">
            <div class="col-sm-12">
            [#--初始密码修改--]
                <div class="panel panel-default">
                    <div class="panel-body">
                        <form class="form-inline" id="userForm" onsubmit="javascript:return false;">
                            <div class="form-group">
                                <label for="originalPasswordValue">用户初始密码</label>
                                <input type="text" disabled="" id="originalPasswordValue" name="originalPasswordValue"
                                       value="${initPassword}" class="form-control"/>
                            </div>
                            <div class="form-group">
                                <label for="passwordValue">更改为：</label>
                                <input type="text" id="passwordValue" name="passwordValue" placeholder="请输入密码(6到10位字符)"
                                       class="form-control"/>
                            </div>
                            <button type="button" class="btn btn-primary" id="userButton">提交</button>
                        </form>
                    </div>
                </div>

                <div class="panel panel-default">
                [#--内客户服务有效期--]
                    <div class="panel-body">
                        <form class="form-inline" id="innerForm" onsubmit="javascript:return false;">
                            <div class="form-group">
                                <label for="originalInnerValue">内客户服务有效期</label>
                                <input type="text" disabled="" id="originalInnerValue" name="originalInnerValue"
                                       value="${initInner}" class="form-control"/>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="innerValue">更改为：</label>
                                <input type="text" id="innerValue" name="innerValue"
                                       placeholder="请输入整数" class="form-control"/>
                                <select id="innerDate" name="date" class="form-control">
                                    <option value="月" selected>月</option>
                                    <option value="年">年</option>
                                </select>
                            </div>
                            <button type="button" class="btn btn-primary" id="innerButton">提交</button>
                        </form>
                    </div>
                [#--外客户服务有效期--]
                    <div class="panel-body">
                        <form class="form-inline" id="outerForm" onsubmit="javascript:return false;">
                            <div class="form-group">
                                <label for="originalOuterValue">外客户服务有效期</label>
                                <input type="text" disabled="" id="originalOuterValue" name="originalOuterValue"
                                       value="${initOuter}" class="form-control"/>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="outerValue">更改为：</label>
                                <input type="text" id="outerValue" name="outerValue"
                                       placeholder="请输入整数" class="form-control"/>
                                <select id="outerDate" name="outerDate" class="form-control">
                                    <option value="月" selected>月</option>
                                    <option value="年">年</option>
                                </select>
                            </div>
                            <button type="button" class="btn btn-primary" id="outerButton">提交</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    [/@mainLayout]
[/#escape]