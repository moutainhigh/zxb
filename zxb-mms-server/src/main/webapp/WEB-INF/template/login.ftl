<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>网阔营销管理系统 - 登录</title>
    <meta name="keywords" content="网阔营销管理系统">
    <meta name="description" content="网阔营销管理系统">

    <link rel="shortcut icon" href="favicon.ico">
[#include "./_layout/_css.ftl"]
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;${SYS_PATH}/common/ie"/>
    <![endif]-->
    <script>
        if (window.top !== window.self) {
            window.top.location = window.location;
        }
    </script>
</head>

<body class="gray-bg">
<div class="middle-box text-center loginscreen  animated fadeInDown">
    <div>
        <h3>欢迎使用 营销管理系统</h3>
        <form class="m-t" role="form" id="loginForm">
            <div class="form-group text-left">
                <input type="text" name="account" class="form-control" placeholder="登录名" required="">
            </div>
            <div class="form-group text-left">
                <input type="password" name="password" class="form-control" placeholder="密码" required="">
            </div>
            <button type="submit" class="btn btn-primary block full-width m-b" id="loginButton"
                    data-loading-text="正在登录...">登 录
            </button>
        </form>
    </div>
</div>

<!-- 全局js -->
[#include "./_layout/_footjs.ftl"]

<script type="text/javascript">
    $(function () {
        var $loginButton = $('#loginButton');
        var $loginForm = $('#loginForm');
        var $validator = $loginForm.validate({
            rules: {
                account: {
                    required: true
                },
                password: {
                    required: true
                }
            },
            messages: {
                account: {
                    required: '请输入登录名'
                },
                password: {
                    required: '请输入密码'
                }

            },
            submitHandler: function (form) {
                login();
                return false;
            }
        });

/*
        $loginButton.click(function () {
            $loginForm.submit();
        });*/




        function login() {
            $.ajax({
                url: 'login',
                type: 'POST',
                data: $('#loginForm').serialize(),
                success: function (re) {
                    switch (re.code) {
                        case 1:
                            top.location.href = '${SYS_PATH}/';
                            break;
                        case -1:
                        case -2:
                            layer.msg('用户不存在或者密码错误');
                            break;
                        case 400:
                            layer.msg('参数不正确');
                            break;
                    }

                },
                beforeSend: function () {
                    $loginButton.button('loading');
                },
                complete: function () {
                    $loginButton.button('reset');
                }
            });
            return false;
        }
    });
</script>
</body>
</html>