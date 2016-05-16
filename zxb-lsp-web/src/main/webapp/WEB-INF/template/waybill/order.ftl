[#include "../_layout.ftl"]
[#escape x as x?html]

    [#assign page_title="我要发货"/]
    [#assign page_desc="我要发货"/]
    [#macro section_footjs]
    <script type="text/javascript" src="${JS_PATH}/jquery-ui.min.js"></script>
    <script type="text/javascript" src="${JS_PATH}/common/validate.expand.js"></script>
    <script type="text/javascript" src="${JS_PATH}/waybill/order.js"></script>
    <script type="text/javascript" src="${JS_PATH}/common/address_select.js"></script>
    <script type="text/javascript">
        $().ready(function(){
            if('${waybill.shipperProvinceName!}'!=''){
            $("input[name='shipperProvinceName']").val('${waybill.shipperProvinceName!}');
            $("input[name='shipperCityName']").val('${waybill.shipperCityName!}');
            $("input[name='shipperCountryName']").val('${waybill.shipperCountryName!}');

            var proviceIntervalId = window.setInterval(function(){
                $("select[name='shipperProvinceId']").val('${waybill.shipperProvinceId!}').trigger("change");
                 if($("select[name='shipperProvinceId']").val()){
                     window.clearInterval(proviceIntervalId);
                  }
            },20);
            var cityIntervalId = window.setInterval(function(){
                $("select[name='shipperCityId']").val('${waybill.shipperCityId!}').trigger("change");
                if($("select[name='shipperCityId']").val()){
                    window.clearInterval(cityIntervalId);
                }
            },20);

            var countryIntervalId = window.setInterval(function(){
                $("select[name='shipperCountryId']").val('${waybill.shipperCountryId!}').trigger("change");
                if($("select[name='shipperCountryId']").val()){
                    window.clearInterval(countryIntervalId);
                }
            },20);


            }

            if('${waybill.receiveProvinceName!}'!=''){
                $("input[name='receiveProvinceName']").val('${waybill.receiveProvinceName!}');
                $("input[name='receiveCityName']").val('${waybill.receiveCityName!}');
                $("input[name='receiveCountryName']").val('${waybill.receiveCountryName!}');

                //$("select[name='receiveProvinceId']").val('${waybill.receiveProvinceId!}').trigger("change");

                var receiveProviceIntervalId = window.setInterval(function(){
                    $("select[name='receiveProvinceId']").val('${waybill.receiveProvinceId!}').trigger("change");
                    if($("select[name='receiveProvinceId']").val()){
                        window.clearInterval(receiveProviceIntervalId);
                    }
                },20);
                var receiveCityIntervalId = window.setInterval(function(){
                    $("select[name='receiveCityId']").val('${waybill.receiveCityId!}').trigger("change");
                    if($("select[name='receiveCityId']").val()){
                        window.clearInterval(receiveCityIntervalId);
                    }
                },20);

                var receiveCountryIntervalId = window.setInterval(function(){
                    $("select[name='receiveCountryId']").val('${waybill.receiveCountryId!}').trigger("change");
                    if($("select[name='receiveCountryId']").val()){
                        window.clearInterval(receiveCountryIntervalId);
                    }
                },20);
            }
        });
        //品类选择,自动填充

        $("#goodCategoryId").change(function() {
            $("#goodCategoryName").val($(this).find("option:selected").text());
            if($("#goodCategoryId").val()!="0" && $("#goodCategoryId").val()!=""){
                $("#pack").find("option[value='${(categoryObj.pack)!}']").attr("selected",true);
                $("input:radio[name='isStandard'][value='${(categoryObj.isStandard)!}']").trigger("click");//attr("checked",true);
                $("#loadUnloadType").find("option[value='${(categoryObj.loadUnloadType)!}']").attr("selected",true);
                var require= '${(categoryObj.stackRequire)!}';
                var array = require.split('|');
                for(var i=0;i<array.length;i++){
                    if(array[i]!=""){
                        $("input[name='stackRequire'][value="+array[i]+"]").trigger("click");//attr('checked',true);
                    }
                }
                $("#memo").val('${(categoryObj.memo)!}');
            }else{//普货清除品类自动填充的内容
                $("#pack").find("option:selected").attr("selected",false);
                $("input:radio[name='isStandard']").attr("checked",false);
                $("#loadUnloadType").find("option:selected").attr("selected",false);
                $("input[name='stackRequire']").attr('checked',false);
                $("#memo").val("");
            }
        });
    </script>
    [/#macro]

    [#macro section_css]
    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/jquery-ui.min.css">
    <link rel="stylesheet" type="text/css" href="${CSS_PATH}/in-gggg.css">
    <link rel="stylesheet" type="text/css" href="${CSS_PATH}/xinxi-sr.css">
    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/layer.css">

    [/#macro]
    [@mainLayout]
    <form id="orderForm" >
    <div class="ybk-3">

        <div class="d-tx">填写并核对发货信息</div>
        <div class="xx"></div>

        <div class="d-hw">
            <div class="d-hw1">货物信息</div>
            <div class="d-hw2">
                <ul>
                    <li class="l-1">
                        <i class="s-p1">*</i>品类：
                        <input type="hidden" id="goodCategoryName" name="goodCategoryName" value="${(good.goodCategoryName)!'普货'}">
                        <select class="v" name="goodCategoryId" id="goodCategoryId">
                            [#--<option value="">请选择</option>--]
                            <option value="0" [#if good.goodCategoryId??][#if good.goodCategoryId==0]selected[/#if][/#if]>普货</option>
                            [#list categoryList as category]
                                [#assign categoryObj=category/]
                                <option value="${category.id}" [#if good.goodCategoryId??][#if category.id==good.goodCategoryId]selected[/#if][/#if]>${category.name}</option>
                            [/#list]
                        </select>
                    </li>

                    <li class="l-2">
                    <i class="s-p1">*</i>货物名称：
                    <input class="i-n"  name="goodName" id ="goodName" value="${(good.goodName)!}"/>
                </li>

                    <li class="l-3">
                        <i class="s-p1">*</i>包装：
                        <select name="pack" class="v" id="pack" >
                            <option value="">请选择</option>
                            <option value="无" [#if (good.pack)??][#if good.pack=='无']selected[/#if][/#if]>无</option>
                            <option value="纸箱" [#if (good.pack)??][#if good.pack=='纸箱']selected[/#if][/#if]>纸箱</option>
                            <option value="袋" [#if (good.pack)??][#if good.pack=='袋']selected[/#if][/#if]>袋</option>
                            <option value="桶" [#if (good.pack)??][#if good.pack=='桶']selected[/#if][/#if]>桶</option>
                            <option value="包" [#if (good.pack)??][#if good.pack=='包']selected[/#if][/#if]>包</option>
                            <option value="托" [#if (good.pack)??][#if good.pack=='托']selected[/#if][/#if]>托</option>
                            <option value="木架" [#if (good.pack)??][#if good.pack=='木架']selected[/#if][/#if]>木架</option>
                            <option value="纸" [#if (good.pack)??][#if good.pack=='纸']selected[/#if][/#if]>纸</option>
                        </select>
                        <span class="s-p2">指货物运输的外包装，而非产品包装</span>
                    </li>

                    <li class="l-4">
                        <i class="s-p1">*</i>件数：
                        <input class="i-n2" id="num" name="num" value="${(good.num)!}"/> 件
                    </li>

                    <li class="l-5" style="margin-left: -14px;">
                        <i class="s-p1">*</i>总重量：
                        <input class="i-n2" id="offerWeight" name="offerWeight" value="${(good.offerWeight)!}"/> 公斤
                    </li>

                    <li class="l-6" style="margin-left: -14px;">
                        <i class="s-p1">*</i>总体积：
                        <input class="i-n2" id="offerVolume" name="offerVolume" value="${(good.offerVolume)!}"/> 立方米
                        <span class="s-p3">用于估算运费，以实际重量体积为准</span>
                    </li>

                    <li class="l-7" style="margin-left: -14px;">
                        <i class="s-p1">*</i>标准件：
                        <input type="radio" name="isStandard" class="" value="1" [#if (waybill.isStandard)??][#if waybill.isStandard==1]checked[/#if][/#if]/>
                        是
                        <input type="radio" name="isStandard" class="" value="0" [#if (waybill.isStandard)??][#if waybill.isStandard==0]checked[/#if][/#if]/>
                        否
                        <a href="#">
                            <span class="s-p4">什么是标准件</span>
                            <span><img id="standard_tips" src="../img/why.png"></span>
                        </a>

                    </li>

                    <li class="l-8" style="margin-left: -28px;">
                        <i class="s-p1">*</i>装卸方式：
                        <select class="c" id="loadUnloadType" name="loadUnloadType">
                            <option value="">请选择</option>
                            <option value="0" [#if (waybill.loadUnloadType)??][#if waybill.loadUnloadType==0]selected[/#if][/#if]>人工搬运</option>
                            <option value="1" [#if (waybill.loadUnloadType)??][#if waybill.loadUnloadType==1]selected[/#if][/#if]>吊车作业</option>
                            <option value="2" [#if (waybill.loadUnloadType)??][#if waybill.loadUnloadType==2]selected[/#if][/#if]>叉车作业</option>
                        </select>
                    </li>

                    <li class="l-9" style="margin-left:-18px;">
                        <span>堆放要求：</span>
                   	<span>
                	<input type="checkbox" class="" name="stackRequire" value="6" [#if (waybill.stackRequire)??][#list waybill.stackRequire?split(",") as stack][#if stack=='6']checked[/#if][/#list][/#if]/>
                	不能堆叠
                    </span>

                    <span>
                	<input type="checkbox" class="" name="stackRequire" value="5" [#if (waybill.stackRequire)??][#list waybill.stackRequire?split(",") as stack][#if stack=='5']checked[/#if][/#list][/#if]/>
                	不能分拆
                    </span>

                    <span>
                	<input type="checkbox" class="" name="stackRequire" value="4" [#if (waybill.stackRequire)??][#list waybill.stackRequire?split(",") as stack][#if stack=='4']checked[/#if][/#list][/#if]/>
                	不能倒置
                    </span>

                    <span>
                	<input type="checkbox" class="" name="stackRequire" value="3" [#if (waybill.stackRequire)??][#list waybill.stackRequire?split(",") as stack][#if stack=='3']checked[/#if][/#list][/#if]/>
                	不能侧放
                    </span>

                    <span>
                	<input type="checkbox" class="" name="stackRequire" value="2" [#if (waybill.stackRequire)??][#list waybill.stackRequire?split(",") as stack][#if stack=='2']checked[/#if][/#list][/#if]/>
                	不能挤压
                    </span>

                    <span>
                	<input type="checkbox" class="" name="stackRequire" value="1" [#if (waybill.stackRequire)??][#list waybill.stackRequire?split(",") as stack][#if stack=='1']checked[/#if][/#list][/#if]/>
                	不能混装
                    </span>

                    </li>

                    <li class="l-10" style="margin-left:-18px;">
                        <span class="s-zhuyi">注意事项：</span>
                        <textarea class="t-t" id="memo" name="memo" >${(waybill.memo)!}</textarea>
                        <a href="#">
                            <span class="s-yuns">运输货物说明</span>
                            <div class="i-img">
                                <img id="memo_tips" src="../img/why.png">

                            </div>
                        </a>
                    </li>
                </ul>
            </div>
        </div>

        <div class="xx1"></div>


        <div class="d-fahf">
            <div class="d-fh">
                发货方信息
            </div>

            <div class="fahuo-r">

                <div class="fh-1">
                    <i class="s-p1">*</i>发货人：
                    <input class="r" id="shipperLinkName" name="shipperLinkName" value="${(waybill.shipperLinkName)!}"/>
                </div>

                <div class="fh-5">
                    公司名称：
                        <input class="r" id="shipperCustomerName" name="shipperCustomerName" value="${(waybill.shipperCustomerName)!}"/>
                </div>

                <div class="fh-2">

                    <div class="d-tck address_select">
                        <i class="s-p1">*</i>发货地址：

                        <select class="cc" name="shipperProvinceId" style="width:90px; height:27px;border:none; color:#8b8b8b;border:none;border: solid 1px #CCCCCC;">
                            <option value="">请选择</option>
                            [#--<option value="0">00</option>--]
                        </select>

                        <select class="cc" name="shipperCityId" style="width:90px; height:27px;border:none; color:#8b8b8b;border:none; border:solid 1px #CCCCCC;">
                            <option value="">请选择</option>
                            [#--<option value="11">11</option>--]
                        </select>


                        <select class="cc" name="shipperCountryId" style="width:90px; height:27px;border:none; color:#8b8b8b;border:none; border:solid 1px #CCCCCC;">
                            <option value="">请选择</option>
                            [#--<option value="22">22</option>--]
                        </select>
                        <input type="hidden" name="shipperProvinceName" value="${(waybill.shipperProvinceName)!}">
                        <input type="hidden" name="shipperCityName" value="${(waybill.shipperCityName)!}">
                        <input type="hidden" name="shipperCountryName" value="${(waybill.shipperCountryName)!}">
                    </div>

                </div>

                <div class="fh-2">
                    <i class="s-p1">*</i>详细地址：
                    <input class="r-r"  id="shipperAddress" name="shipperAddress" placeholder="请输入详细地址" value="${(waybill.shipperAddress)!}"/>
                </div>

                <div class="fh-2">

            	<span class="s-h">
            	<i class="s-p1">*</i>手机号码：
                <input class="r" id="shipperLinkMobile" name="shipperLinkMobile" value="${(waybill.shipperLinkMobile)!}"/>
               </span>

                    <span class="s-huo">或</span>

                <span class="s-gud">固定电话：
                <input class="r" id="shipperLinkPhone" name="shipperLinkPhone" value="${(waybill.shipperLinkPhone)!}"/></span>
                </div>

            </div>
        </div>

        <div class="xx1"></div>

        <!-- 收货方信息-->

        <div class="d-fahf">
            <div class="d-fh">
                收货方信息
            </div>

            <div class="fahuo-r">

                <div class="fh-1">
                    <i class="s-p1">*</i>收货人：
                    <input class="r" id="receiveLinkName" name="receiveLinkName" value="${(waybill.receiveLinkName)!}"/>
                </div>

                <div class="fh-5">
                    公司名称：
                    <input class="r" id="receiveName" name="receiveName" value="${(waybill.receiveName)!}"/>
                </div>

                <div class="fh-2">

                    <div class="d-tck address_select">
                        <i class="s-p1">*</i>收货地址：

                        <select class="cc" name="receiveProvinceId" style="width:90px; height:27px;border:none; color:#8b8b8b;border:none; border:solid 1px #CCCCCC;">
                            <option value="">请选择</option>

                        </select>

                        <select class="cc" name="receiveCityId" style="width:90px; height:27px;border:none; color:#8b8b8b;border:none; border:solid 1px #CCCCCC;">
                            <option value="">请选择</option>

                        </select>

                        <select class="cc" name="receiveCountryId" style="width:90px; height:27px;border:none; color:#8b8b8b;border:none; border:solid 1px #CCCCCC;">
                            <option value="">请选择</option>

                        </select>
                        <input type="hidden" name="receiveProvinceName" value="${(waybill.receiveProvinceName)!}">
                        <input type="hidden" name="receiveCityName" value="${(waybill.receiveCityName)!}">
                        <input type="hidden" name="receiveCountryName" value="${(waybill.receiveCountryName)!}">
                    </div>

                </div>


                <div class="fh-2">
                    <i class="s-p1">*</i>详细地址：
                    <input class="r-r"  id="receiveAddress" name="receiveAddress" placeholder="请输入详细地址" value="${(waybill.receiveAddress)!}"/>
                </div>

                <div class="fh-2">

            	<span class="s-h">
            	<i class="s-p1">*</i>手机号码：
                <input class="r" id="receiveLinkMobile" name="receiveLinkMobile" value="${(waybill.receiveLinkMobile)!}"/>
               </span>

                    <span class="s-huo">或</span>

                <span class="s-gud">固定电话：
                <input class="r" id="receiveLinkPhone" name="receiveLinkPhone" value="${(waybill.receiveLinkPhone)!}"/></span>
                </div>

            </div>
        </div>

        <div class="xx1"></div>

        <div class="anniu">
            <div class="an-1">
                <div class="xia-b">下一步选择保险、支付配送方式</div>
                <div class="ti-jiao">提交运单</div>
                <div class="zxb-yunshu">
                    <input type="checkbox" class="" id="agreement" name="agreement" value="1" checked/>
                    <a href="#">专线宝货物运输协议</a>
                </div>
            </div>

        </div>


    </div>
    </form>
    [/@mainLayout]
[/#escape]