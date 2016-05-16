(function (factory) {
    if (typeof define === "function" && define.amd) {
        define(["jquery", "../jquery.validate"], factory);
    } else {
        factory(jQuery);
    }
}(function ($) {

    $.validator.addMethod("alphanumeric", function (value, element) {
        return this.optional(element) || /^\w+$/i.test(value);
    }, "Letters, numbers or underscores only please");

    $.validator.addMethod("lettersonly", function (value, element) {
        return this.optional(element) || /^[a-z]+$/i.test(value);
    }, "Letters only please");

    $.validator.addMethod("nowhitespace", function (value, element) {
        return this.optional(element) || /^\S+$/i.test(value);
    }, "No white space please");

    $.validator.addMethod("integer", function (value, element) {
        return this.optional(element) || /^-?\d+$/.test(value);
    }, "A positive or negative non-decimal number please");

    $.validator.addMethod("phone", function (value, element) {
        return this.optional(element) || /^[0-9 \(\)]{7,30}$/.test(value);
    }, "Please specify a valid phone number");

    $.validator.addMethod("mobile", function (value, element) {
        return this.optional(element) || /^13[0-9]{9}$|14[0-9]{9}$|15[0-9]{9}$|18[0-9]{9}$|17[0-9]{9}$/.test(value);
    }, "Please specify a valid mobile number");

    $.validator.addMethod("postcode", function (value, element) {
        return this.optional(element) || /^[0-9 A-Za-z]{5,20}$/.test(value);
    }, "Please specify a valid postcode");

    $.validator.addMethod("date", function (value, element) {
        value = value.replace(/\s+/g, "");
        if (String.prototype.parseDate) {
            var $input = $(element);
            var pattern = $input.attr('dateFmt') || 'yyyy-MM-dd';

            return !$input.val() || $input.val().parseDate(pattern);
        } else {
            return this.optional(element) || value.match(/^\d{4}[\/-]\d{1,2}[\/-]\d{1,2}$/);
        }
    }, "Please enter a valid date.");

    $.validator.addMethod("time", function (value, element) {
        return this.optional(element) || /^([01]\d|2[0-3])(:[0-5]\d){1,2}$/.test(value);
    }, "Please enter a valid time, between 00:00 and 23:59");
    $.validator.addMethod("time12h", function (value, element) {
        return this.optional(element) || /^((0?[1-9]|1[012])(:[0-5]\d){1,2}(\ ?[AP]M))$/i.test(value);
    }, "Please enter a valid time in 12-hour am/pm format");

    /*自定义js函数验证
     * <input type="text" name="xxx" customvalid="xxxFn(element)" title="xxx" />
     */
    $.validator.addMethod("customvalid", function (value, element, params) {
        try {
            return eval('(' + params + ')');
        } catch (e) {
            return false;
        }
    }, "Please fix this field.");

    $.validator.addMethod("money", function (value, element) {
        return this.optional(element) || /^(([1-9]{1}\d{0,17})|([0]{1}))(\.(\d){1,2})?$/.test(value);
    }, "Please specify a valid money");


    $.validator.addMethod("gt", function (value, element, param) {
        return this.optional(element) || value > param;
    }, $.validator.format("Please enter a value greater than {0}."));
    $.validator.addMethod("lt", function (value, element, param) {
        return this.optional(element) || value < param;
    }, $.validator.format("Please enter a value less than {0}."));

    $.validator.addMethod("notblank", function (value, element) {
        return value.length > 0 ? $.trim(value).length > 0 : true;
    }, "不允许输入空白字符串");


    $.validator.addMethod("pattern", function (value, element, param) {
        if (this.optional(element)) {
            return true;
        }
        if (typeof param === "string") {
            param = new RegExp("^(?:" + param + ")$");
        }
        return param.test(value);
    }, "Invalid format.");


    $.validator.addMethod("require_from_group", function (value, element, options) {
        var $fields = $(options[1], element.form),
            $fieldsFirst = $fields.eq(0),
            validator = $fieldsFirst.data("valid_req_grp") ? $fieldsFirst.data("valid_req_grp") : $.extend({}, this),
            isValid = $fields.filter(function () {
                    return validator.elementValue(this);
                }).length >= options[0];

        // Store the cloned validator for future validation
        $fieldsFirst.data("valid_req_grp", validator);

        // If element isn't being validated, run each require_from_group field's validation rules
        if (!$(element).data("being_validated")) {
            $fields.data("being_validated", true);
            $fields.each(function () {
                validator.element(this);
            });
            $fields.data("being_validated", false);
        }
        return isValid;
    }, $.validator.format("Please fill at least {0} of these fields."));


    //验证敏感词
    $.validator.addMethod("words", function (value, element, options) {
        var flag = true;
        var url = zxb.APP_PATH + "/wordFilter";
        $.ajax({
            type: "post",
            async: false,
            data: {
                str: value
            },
            url: url,
            success: function (result) {
                flag = result;
            }
        });
        return flag;
    }, '该内容存在敏感词!');


    /*
     * Translated default messages for the jQuery validation plugin.
     * Locale: ZH (Chinese, 中文 (Zhōngwén), 汉语, 漢語)
     */
    $.extend($.validator.messages, {
        required: "这是必填字段",
        remote: "请修正此字段",
        email: "请输入有效的电子邮件地址",
        url: "请输入有效的网址",
        date: "请输入有效的日期",
        dateISO: "请输入有效的日期 (YYYY-MM-DD)",
        number: "请输入有效的数字",
        digits: "只能输入数字",
        creditcard: "请输入有效的信用卡号码",
        equalTo: "你的输入不相同",
        extension: "请输入有效的后缀",
        maxlength: $.validator.format("最多可以输入 {0} 个字符"),
        minlength: $.validator.format("最少要输入 {0} 个字符"),
        rangelength: $.validator.format("请输入长度在 {0} 到 {1} 之间的字符串"),
        range: $.validator.format("请输入范围在 {0} 到 {1} 之间的数值"),
        max: $.validator.format("请输入不大于 {0} 的数值"),
        min: $.validator.format("请输入不小于 {0} 的数值"),

        alphanumeric: "字母、数字、下划线",
        lettersonly: "必须是字母",
        phone: "数字、空格、括号",
        mobile: "请输入正确的手机号码",
        nowhitespace: "不允许输入空白字符串",
        money: "请输入合法的金额",
        time: "请输入00:00-23:59之间的时间",
        time12: "",
        gt: $.validator.format("请输入一个大于 {0} 的值"),
        lt: $.validator.format("请输入一个小于 {0} 的值")
    });

    $.validator.setDefaults({
        highlight: function (element) {
            $(element).closest('.form-group').removeClass('has-success').addClass('has-error');
        },
        success: function (element) {
            element.closest('.form-group').removeClass('has-error').addClass('has-success');
        },
        errorElement: "span",
        errorPlacement: function (error, element) {
            if (element.is(":radio") || element.is(":checkbox")) {
                error.appendTo(element.parent().parent().parent());
            } else {
                error.appendTo(element.parent());
            }
        },
        errorClass: "help-block m-b-none",
        validClass: "help-block m-b-none"
    });
}));


(function ($) {
    $.fn.serializeJson = function () {
        var serializeObj = {};
        var array = this.serializeArray();
        var str = this.serialize();
        $(array).each(function () {
            if (serializeObj[this.name]) {
                if ($.isArray(serializeObj[this.name])) {
                    serializeObj[this.name].push(this.value);
                } else {
                    serializeObj[this.name] = [serializeObj[this.name], this.value];
                }
            } else {
                serializeObj[this.name] = this.value;
            }
        });
        return serializeObj;
    };
})(jQuery);


(function ($) {

    toastr.options = {
        "closeButton": true,
        "debug": false,
        "progressBar": true,
        "positionClass": "toast-top-right",
        "showDuration": "400",
        "hideDuration": "1000",
        "timeOut": "3000",
        "extendedTimeOut": "1000",
        "showEasing": "swing",
        "hideEasing": "linear",
        "showMethod": "fadeIn",
        "hideMethod": "fadeOut"
    }


    $.redirectLogin = function (redirectUrl, message) {
        var href = zxb.SYS_PATH + "/login";
        if (redirectUrl != null) {
            href += "?returnUrl=" + encodeURIComponent(redirectUrl);
        }

        if (message != null) {

        } else {
        }

        window.top.location.href = href;
    }


    $(document).ajaxComplete(function (event, request, settings) {
        var loginStatus = request.getResponseHeader("loginStatus");
        var permissionStatus = request.getResponseHeader("permissionStatus");

        if (loginStatus == "accessDenied") {
            $.redirectLogin(location.href, "请登录后再进行操作");
        } else if (permissionStatus == "accessDenied") {
            toastr.warning("您没有当前模块操作权限!");
        }
    });


    $(document).ajaxError(function (e, xhr, opt) {
        toastr.error("请求服务器失败,请稍候再试!");
        //layer.msg("请求服务器失败,请稍候再试!")
        //alert("Error requesting " + opt.url + ": " + xhr.status + " " + xhr.statusText);
    });


})(jQuery);

