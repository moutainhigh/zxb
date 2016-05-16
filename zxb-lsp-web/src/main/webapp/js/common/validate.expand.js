/**
 * Created by Administrator on 2016/3/30.
 */
//手机号是否正确
jQuery.validator.addMethod("isMobile", function(value, element) {
    var length = value.length;
    var regPhone = /^1([3578]\d|4[57])\d{8}$/;
    return this.optional(element) || ( length == 11 && regPhone.test( value ) );
}, "请正确填写您的手机号码");

//用户姓名是否为汉字
jQuery.validator.addMethod("isChar", function(value, element) {
    var length = value.length;
    var regName = /^[\u4e00-\u9fa5]+$/;
    return this.optional(element) || regName.test( value );
}, "请正确格式的姓名(暂支持汉字)");

jQuery.validator.addMethod("CharOrNum", function(value, element) {
    var length = value.length;
    var regName = /^[a-zA-Z\u4e00-\u9fa5]+$/;
    return this.optional(element) || regName.test( value );
}, "可输入汉字、英文字母、不可输入空格");

jQuery.validator.addMethod("enIsCharOrNum", function(value, element) {
    var length = value.length;
    var regName = /^[0-9a-zA-Z\u4e00-\u9fa5]+$/;
    return this.optional(element) || regName.test( value );
}, "可输入汉字、英文字母和数字，不可输入空格");

jQuery.validator.addMethod("noBlank", function(value, element) {
    var length = value.length;
    var regName = /\s+$/;
    return this.optional(element) || !regName.test( value );
}, "不可输入空格");

//邮政编码
jQuery.validator.addMethod("isZipCode", function(value, element) {
    var tel = /^[0-9]{6}$/;
    return this.optional(element) || (tel.test(value));
}, "请正确填写您的邮政编码");

//英文字母和数字
jQuery.validator.addMethod("alnum", function(value, element) {
    return this.optional(element) || /^[a-zA-Z0-9]+$/.test(value);
}, "只能包括英文字母和数字");

jQuery.validator.addMethod("alpwd", function(value, element) {
    return this.optional(element) || /^[a-zA-Z0-9#@!~%^&*]+$/.test(value);
}, "只能包括英文字母,数字和特殊字符");

jQuery.validator.addMethod("good_num",function(value, element){
    return this.optional(element) || (/^[\d]+$/.test(value) && value>0);
},"货物件数必须为大于0整数");

jQuery.validator.addMethod("gre0Number",function(value, element){
    return this.optional(element) || (/^\d+(\.\d{0,2})?$/.test(value) && value>0);
},"货物重量必须为大于0数字,且小数位只允许2位");

jQuery.validator.addMethod("good_num_length",function(value, element){
    return this.optional(element) || (value.length<9);
},"货物体积必须为大于0数字,且小数位只允许2位,长度");

jQuery.validator.addMethod("good_weightvolume_length",function(value, element){
    return this.optional(element) || (value.length<7);
},"货物体积必须为大于0数字,且小数位只允许2位,长度");

jQuery.validator.addMethod("isMobile", function(value, element) {
    var length = value.length;  //alert('mmm=='+value);
    var regMobile = /(^0?[1][0-9]{10}$)/;
    return this.optional(element) || ( length == 11 && regMobile.test( value ) );
}, "请正确填写您的手机号码");
jQuery.validator.addMethod("isTelphone", function(value, element) {
    var regPhone = /((^\d{3,4}-)?\d{7,8}$)/;
    return this.optional(element) || ( regPhone.test( value ) );
}, "请正确填写您的坐机号码");

jQuery.validator.addMethod("isPhone", function(value, element) {
    var regPhone = /((^\d{3,4}-)?\d{7,8}$)/;
    var regMobile = /(^0?[1][0-9]{10}$)/;
    return this.optional(element) || ( regPhone.test( value ) || regMobile.test( value ));
}, "请正确填写您的电话号码");

jQuery.validator.addMethod("insuredFee",function(value, element){
    return this.optional(element) || (/^\d+(\.\d{0,2})?$/.test(value) && value>=0 && value.length<9);
},"货物价值大于等于0数值，且小数位只能2位，最多8位");
