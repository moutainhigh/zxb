[#-- @ftlvariable name="noStowageBillList" type="java.util.List<com.wangkuo.zxb.lsp.api.dto.output.WaybillOutput>" --]
[#-- @ftlvariable name="allocCentreList" type="java.util.List<com.wangkuo.zxb.lsp.api.dto.output.AllocCentreOutput>" --]
[#-- @ftlvariable name="truckLengthTypeList" type="java.util.List<com.wangkuo.zxb.lsp.api.dto.output.DicDataOutput>" --]
[#-- @ftlvariable name="stowage" type="com.wangkuo.zxb.lsp.api.dto.output.StowageOutput" --]
[#escape x as x?html]
    [#include "../_layout.ftl"]
    [#include "../_layout/_pagination.ftl"]
    [#assign page_title="配载管理"/]
    [#assign page_keyword="配载管理"/]
    [#assign page_desc="配载管理"/]
    [#macro section_footjs]
    <script type="text/javascript">
        var EDIT_MODE = ${(stowage.id?? && stowage.id >0)?string("true","false")};
        var STOWAGE_ID = ${stowage.id!0};
    </script>
    <script type="text/javascript" src="${JS_PATH}/jqgrid/i18n/grid.locale-cn.js"></script>
    <script type="text/javascript" src="${JS_PATH}/jqgrid/jquery.jqGrid.min.js"></script>
    <script type="text/javascript" src="${JS_PATH}/My97DatePicker/WdatePicker.js"></script>
    <script type="text/javascript" src="${JS_PATH}/stowage/edit.js"></script>
    [/#macro]

    [#macro section_headcss]
    <style type="text/css">
        span.error {
            color: #F90;
        }

        input.cbox {
            height:13px;
        }
    </style>
    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/peizai.css">
    <link type="text/css" rel="stylesheet" href="${JS_PATH}/jqgrid/ui.jqgrid.css">
    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/jquery-ui.min.css">
    [/#macro]
    [@mainLayout]
    <div class="juzhong" style="font-size: 13px;">
        <form id="frmStowage">
            <table width="943" height="30" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#ebf3f9"
                   class="dh" style="margin:23px auto 0 auto">
                <tbody>
                <tr>
                    <td width="18" height="34">&nbsp;</td>
                    <td width="685"><span style="font-size:17px"><strong>基本信息</strong></span></td>
                </tr>
                </tbody>
            </table>
            <table width="943" height="40" border="0" align="center" cellpadding="0" cellspacing="0" class="tb"
                   style="margin:11px auto 0 auto;">
                <tbody>
                <tr>
                    <td width="76" align="left"> <font    color: #F90;>*</font>配载日期：</td>
                    <td width="226" align="left">
                        <input name="stowageTime" type="text" class="inp"
                               value="${((stowage.stowageTime)!.now)?string("yyyy-MM-dd")}" readonly/>
                    </td>
                    <td width="76" height="34" align="left">始发服务商：</td>
                    <td width="325" align="left">
                        <input type="text" class="inp" value="${(CURR_USER.nickName)!}" readonly/>
                    </td>
                </tr>
                </tbody>
            </table>
            <table width="943" height="40" border="0" align="center" cellpadding="0" cellspacing="0" class="tb">
                <tbody>
                <tr>
                    <td width="76" align="left"> <font     color: #F90;>*</font>发往集散：</td>
                    <td width="226" align="left">
                        <select name="allocCenterId">
                            <option value="">请选择</option>
                            [#list allocCentreList as item ]
                                <option value="${item.id!}"
                                        data-addr="${item.address!}" data-linkman="${item.linkname!}"
                                        data-linkphone="${item.linkmanPhone!}" [#if ((stowage.allocCenterId)?? && stowage.allocCenterId == item.id)]
                                        selected[/#if]>${item.name!}</option>
                            [/#list]
                        </select>
                    </td>
                    <td width="76" height="34" align="left">集散地址：</td>
                    <td width="325" align="left">
                        <input name="allocCenterAddress" type="text" class="inp" style="width:310px;" maxlength="200"
                               value="${(stowage.allocCenterAddress)!}" readonly/>
                    </td>
                </tr>
                </tbody>
            </table>

            <table width="943" height="40" border="0" align="center" cellpadding="0" cellspacing="0" class="tb">
                <tbody>
                <tr>
                    <td width="76" align="left">集散联系人：</td>
                    <td width="226" align="left">
                        <input name="allocCenterLinkName" type="text" class="inp" maxlength="20"
                               value="${(stowage.allocCenterLinkName)!}" readonly/>
                    </td>
                    <td width="76" height="34" align="left">联系方式：</td>
                    <td width="325" align="left">
                        <input name="allocCenterLinkPhone" type="text" class="inp" maxlength="20"
                               value="${(stowage.allocCenterLinkPhone)!}" readonly/>
                    </td>
                </tr>
                </tbody>
            </table>

            <table width="943" height="30" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#ebf3f9"
                   class="dh" style="margin:23px auto 0 auto">
                <tbody>
                <tr>
                    <td width="18" height="34">&nbsp;</td>
                    <td width="685"><span style="font-size:17px"><strong>车辆信息</strong></span></td>
                </tr>
                </tbody>
            </table>
            <table width="943" height="40" border="0" align="center" cellpadding="0" cellspacing="0" class="tb"
                   style="margin:11px auto 0 auto;">
                <tbody>
                <tr>
                    <td width="76" align="left"> <font     color: #F90;>*</font>车牌号：</td>
                    <td width="226" align="left">
                        <input name="plateNumber" type="text" class="inp" maxlength="20"
                               value="${(stowage.plateNumber)!}"/>
                    </td>
                    <td width="76" height="34" align="left"> <font    color: #F90;>*</font>司机：</td>
                    <td width="325" align="left">
                        <input name="driverName" type="text" class="inp" maxlength="20"
                               value="${(stowage.driverName)!}"/>
                    </td>
                </tr>
                </tbody>
            </table>
            <table width="943" height="40" border="0" align="center" cellpadding="0" cellspacing="0" class="tb">
                <tbody>
                <tr>
                    <td width="76" align="left"> <font     color: #F90;>*</font>司机电话：</td>
                    <td width="226" align="left">
                        <input name="driverPhone" type="text" class="inp" maxlength="20"
                               value="${(stowage.driverPhone)!}"/>
                    </td>
                    <td width="76" height="34" align="left">车型：</td>
                    <td width="325" align="left">
                        <input name="truckModel" type="text" class="inp" maxlength="20"
                               value="${(stowage.truckModel)!}"/>
                    </td>
                </tr>
                </tbody>
            </table>
            <table width="943" height="40" border="0" align="center" cellpadding="0" cellspacing="0" class="tb">
                <tbody>
                <tr>
                    <td width="76" align="left"><font color: #F90;>*</font>车身长：</td>
                    <td width="226" align="left">
                        <select name="truckLength">
                            <option value="">请选择</option>
                            [#list truckLengthTypeList as item ]
                                <option value="${item.value!}"
                                        [#if ((stowage.truckLength)?? && stowage.truckLength == item.value)]
                                        selected[/#if]>${item.item!}</option>
                            [/#list]
                        </select>

                    </td>
                    <td width="76" height="34" align="left"></td>
                    <td width="325" align="left">
                    </td>
                </tr>
                </tbody>
            </table>


            <table width="943" height="30" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#ebf3f9"
                   class="dh" style="margin:23px auto 0 auto">
                <tbody>
                <tr>
                    <td width="18" height="34">&nbsp;</td>
                    <td width="685">
                        <span style="font-size:17px"><strong>运单信息</strong></span>
                        <span id="waybillIdErr"></span>
                    </td>
                </tr>
                </tbody>
            </table>
            <table width="943" height="10" border="0" align="center" cellpadding="0" cellspacing="0" class="tb"
                   style="margin:11px auto 0 auto;">
                <tbody>
                <tr>
                    <td width="70" align="left"> 开单日期：</td>
                    <td width="200" align="left">
                        <input name="startTime" id="queryStartTime" type="text" class="inp" style="width:75px;"
                               onClick="WdatePicker({maxDate:'#F{$dp.$D(\'queryEndTime\')||\'%y-%M-%d\'}'})"/>
                        -
                        <input name="endTime" id="queryEndTime" type="text" class="inp" style="width:75px;"
                               onClick="WdatePicker({minDate:'#F{$dp.$D(\'queryStartTime\')}',maxDate:'%y-%M-%d'})"/>
                    </td>
                    <td width="69" height="34" align="left">发货方：</td>
                    <td width="149" align="left">
                        <input name="shipperCustomerName" type="text" class="inp" style="width:110px;"/>
                    </td>
                    <td width="70" align="left">收货地址：</td>
                    <td width="180" align="left">
                        <input name="address" type="text" class="inp" style="width:175px;"/>
                    </td>
                    <td width="180" align="left">
                        <div class="s-hb" style="font-size:14px" id="btnQueryWaybill">查询</div>
                    </td>
                </tr>
                </tbody>
            </table>
            <br>
            <table width="943" height="40" border="0" align="center" cellpadding="0" cellspacing="0" class="tb">
                <tbody>
                <tr>
                    <td width="226" align="left" valign="top">
                        <table id="waybill-source" cellspacing="0" width="100%" height="100%">
                        </table>
                    </td>
                    <td width="76" align="left">
                        <table width="72" height="128" border="0" align="center" cellpadding="0" cellspacing="0">
                            <tbody>
                            <tr>
                                <td align="center"><a href="javascript:;" id="btnAdd">&gt;添加</a></td>
                            </tr>
                            <tr>
                                <td align="center"><a href="javascript:;" id="btnAddAll">&gt;&gt;所有</a></td>
                            </tr>
                            <tr>
                                <td align="center"><a href="javascript:;" id="btnRemove">&lt;移除</a></td>
                            </tr>
                            <tr>
                                <td align="center"><a href="javascript:;" id="btnRemoveAll">&lt;&lt;所有</a></td>
                            </tr>
                            </tbody>
                        </table>
                    </td>
                    <td width="226" align="left" valign="top">
                        <table id="waybill-dest" cellspacing="0" width="100%" height="100%">
                        </table>
                    </td>
                </tr>
                </tbody>
            </table>
            <table style="font-size:14px;margin:39px auto 0 auto;" width="943" height="10" border="0" align="center"
                   cellpadding="0" cellspacing="0" class="tb">
                <tbody>
                <tr>
                    <td width="329" align="left">&nbsp;</td>
                    <td width="139" align="left">
                        <div class="s-cx" id="btnSaveStowage">保存</div>
                    </td>
                    <td width="187" height="34" align="left">
                        <div class="s-hb" onclick="javascript:history.back();">返回</div>
                    </td>
                    <td width="288" align="left">&nbsp;</td>
                </tr>
                </tbody>
            </table>
            <input type="hidden" name="waybillIds" value=""/>
            <input type="hidden" name="id" value="${stowage.id!0}"/>
        </form>
    </div>

    [/@mainLayout]
[/#escape]