/**
 * 地址三级级联
 * 引入该js并在页面添加以下内容：
 *
* <div class="address_select">
    <select><option value=''>请选择</option></select>
    <select><option value=''>请选择</option></select>
    <select><option value=''>请选择</option></select>

    <input  type="hidden"/>
    <input  type="hidden"/>
    <input  type="hidden"/>
    </div>
    */


$(function(){
    var hasInput = false;

    $("html").find(".address_select").each(function(div_index,element){
        //给当前页面每一个class=‘address_select’的div元素增加id
        $(this).attr("id","address_select"+div_index);

        if($("#address_select"+div_index).find("input").length>0){
            hasInput = true;
        }

        /**给隐藏input元素增加id属性*/
        if(hasInput){
            $("#address_select"+div_index).find("input").each(function(index,element){
                    $(element).attr("id","adress_name"+div_index+index);
            });
        }
        /**遍历div下的select元素*/
        $("#address_select"+div_index).find("select").each(function(index,element){

            if(index == 0){//省（第一个select标签）
                $.get("../sbarea/city",{id:'0'},function(data) {
                    $.each(data,function(n,value) {
                        var html = "<option value='"+value.id+"' >"+value.areaName+"</option>";
                        $(element).append(html);

                    });
                });

                $(element).change(function() {//给第一个select绑定onchange事件
                    if(hasInput) {
                        $("#adress_name" + div_index + index).val($(this).find("option:selected").text());
                    }
                    $(element).next().html("<option value='' >请选择</option>");
                    $(element).next().next().html("<option value='' >请选择</option>");

                    if ($(element).val() !=''){
                        $.get("../sbarea/city", {id: $(element).val()}, function (data) {
                            $.each(data, function (n, value) {
                                var html = "<option value='" + value.id + "' >" + value.areaName + "</option>";
                                $(element).next().append(html);
                            });

                        });
                    }else{
                        if(hasInput) {
                            $("#adress_name" + div_index + index).val('');
                            $("#adress_name" + div_index + index).next().val('');
                            $("#adress_name" + div_index + index).next().next().val('');
                        }
                        $(element).next().html("<option value='' >请选择</option>");
                    }
                });

            }else if(index == 1) {//市

                    $(element).change(function () {
                        $(element).next().html("<option value='' >请选择</option>");
                        if(hasInput) {
                            $("#adress_name" + div_index + index).val($(this).find("option:selected").text());
                        }
                        $(element).next().html("<option value='' >请选择</option>");
                        if ($(element).val() != '') {
                            $.get("../sbarea/city", {id: $(element).val()}, function (data) {
                                $.each(data, function (n, value) {
                                    var html = "<option value='" + value.id + "' >" + value.areaName + "</option>";
                                    $(element).next().append(html);
                                });
                            });
                        }else{
                            if(hasInput) {
                                $("#adress_name" + div_index + index).val('');
                                $("#adress_name" + div_index + index).next().val('');
                            }
                            $(element).next().html("<option value='' >请选择</option>");
                        }
                    });

            }else if(index == 2){//县区
                $(element).change(function () {
                    if(hasInput) {
                        $("#adress_name" + div_index + index).val($(this).find("option:selected").text());
                    }
                    if($(element).val()==''){

                            $("#adress_name" + div_index + index).val('');

                    }
                });
            }


        });

    });


});
