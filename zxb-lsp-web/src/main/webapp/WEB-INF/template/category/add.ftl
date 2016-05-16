[#include "../_layout/_js.ftl"/]
<link rel="stylesheet" type="text/css" href="${CSS_PATH}/in-gggg.css">
<link rel="stylesheet" type="text/css" href="${CSS_PATH}/pinlei-sq.css">
<link type="text/css" rel="stylesheet" href="${JS_PATH}/layer/skin/layer.css">
<link type="text/css" rel="stylesheet" href="${JS_PATH}/layer/skin/layer.ext.css">

<style>
    .progress {
        margin-top: 2px;
        width: 150px;
        height: 14px;
        /*margin-bottom: 10px;*/
        overflow: hidden;
        background-color: #f5f5f5;
        border-radius: 4px;
        -webkit-box-shadow: inset 0 1px 2px rgba(0, 0, 0, .1);
        box-shadow: inset 0 1px 2px rgba(0, 0, 0, .1);
        display: inline-block;
    }

    .progress-bar {
        background-color: rgb(92, 184, 92);
        background-image: linear-gradient(45deg, rgba(255, 255, 255, 0.14902) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, 0.14902) 50%, rgba(255, 255, 255, 0.14902) 75%, transparent 75%, transparent);
        background-size: 40px 40px;
        box-shadow: rgba(0, 0, 0, 0.14902) 0px -1px 0px 0px inset;
        box-sizing: border-box;
        color: rgb(255, 255, 255);
        display: block;
        float: left;
        font-size: 12px;
        height: 20px;
        line-height: 20px;
        text-align: center;
        transition-delay: 0s;
        transition-duration: 0.6s;
        transition-property: width;
        transition-timing-function: ease;
        width: 266.188px;
        overflow: hidden;
    }

    .fileName {
        overflow: hidden;
        display: inline-block;
        position: relative;
        width: 200px;
        left: 0;
        text-align: left;

    }

    .progress a {
        position: absolute;
        right: 0;
    }

    #ossfile b {
        vertical-align: top;
    }
</style>

[#--<script type="text/javascript" src="${JS_PATH}/jquery.min.js"></script>
<script type="text/javascript" src="${JS_PATH}/jquery.validate.min.js"></script>--]
<script type="text/javascript" src="${JS_PATH}/common/validate.expand.js"></script>
<script type="text/javascript" src="${JS_PATH}/plupload.full.min.js"></script>
[#--<script type="text/javascript" src="${JS_PATH}/layer/layer.js"></script>--]
<script type="text/javascript" src="${JS_PATH}/category/upload.js"></script>
<script type="text/javascript" src="${JS_PATH}/category/add.js"></script>


<form id="addCategoryForm">
    <input id="type" type="hidden" value="0" name="type"/>
    <input id="isApply" type="hidden" value="false" name="isApply"/>
    <input id="categoryId" type="hidden" value="${(category.id)!}" name="id"/>

    <div class="d1"><span class="s-q">请依据货物真实信息填写</span></div>
    <div class="d2">
        <ul>
            <li><em style="color: #ff9937;">*</em> 品类名：<input class="wm" id="name" name="name"
                                                              onkeyup="javascript:this.value=this.value.replace(/^ +| +$/g,'')"
                                                              value="${(category.name)!}"/></li>
            <li class="l-bz"><em style="color: #ff9937;">*</em> 包装：<select class="wm" name="pack" id="pack">
                <option value="0" [#if (category.pack)??][#if category.pack=='0']selected[/#if][/#if]>无</option>
                <option value="1" [#if (category.pack)??][#if category.pack=='1']selected[/#if][/#if]>纸箱</option>
                <option value="2" [#if (category.pack)??][#if category.pack=='2']selected[/#if][/#if]>袋</option>
                <option value="3" [#if (category.pack)??][#if category.pack=='3']selected[/#if][/#if]>桶</option>
                <option value="4" [#if (category.pack)??][#if category.pack=='4']selected[/#if][/#if]>包</option>
                <option value="5" [#if (category.pack)??][#if category.pack=='5']selected[/#if][/#if]>托</option>
                <option value="6" [#if (category.pack)??][#if category.pack=='6']selected[/#if][/#if]>木架</option>
                <option value="7" [#if (category.pack)??][#if category.pack=='7']selected[/#if][/#if]>纸</option>
            </select>
            </li>
            <li>
                <em style="color: #ff9937;">*</em> 重轻比：<input id="rateHeavy" class="q" name="rateHeavy"
                                                              value="${(category.rateHeavy)!}"/>
                ：<input class="q" id="rateLight" name="rateLight" value="${(category.rateLight)!}"/> 吨/立方
            </li>
            <li class="l-z1"><em style="color: #ff9937;">*</em> 装卸方式：<select class="wm" id="loadUnloadType"
                                                                             name="loadUnloadType">
                <option value="">请选择</option>
                <option value="0" [#if category.loadUnloadType??][#if category.loadUnloadType==0]selected[/#if][/#if]>
                    人工搬运
                </option>
                <option value="1" [#if category.loadUnloadType??][#if category.loadUnloadType==1]selected[/#if][/#if]>
                    吊车作业
                </option>
                <option value="2" [#if category.loadUnloadType??][#if category.loadUnloadType==2]selected[/#if][/#if]>
                    叉车作业
                </option>
            </select>
            </li>
        </ul>
    </div>

    <div class="d3">
        <span  style="font-size: 14px;display: inline-block;text-align: left;vertical-align: top;">&nbsp;&nbsp;其它要求：</span>
        <table cellpadding="0" cellspacing="0"  style="display: inline-block;">
            <tr>
                <td>
                    <input type="checkbox" id="stackRequire1" name="stackRequire" value="1"
                           class="i-q" [#if category.stackRequire??][#list category.stackRequire?split("|") as stack][#if stack=='1']checked[/#if][/#list][/#if]/><label
                        for="stackRequire1">不能混装</label>
                </td>
                <td style="padding-left: 10px;">
                    <input type="checkbox" id="stackRequire2" class="i-q" name="stackRequire"
                           value="2" [#if category.stackRequire??][#list category.stackRequire?split("|") as stack][#if stack=='2']checked[/#if][/#list][/#if]/><label
                        for="stackRequire2">不能挤压</label>
                </td>
                <td style="padding-left: 10px;">
                    <input type="checkbox" id="stackRequire3" class="i-q" name="stackRequire"
                           value="3" [#if category.stackRequire??][#list category.stackRequire?split("|") as stack][#if stack=='3']checked[/#if][/#list][/#if]/><label
                        for="stackRequire3">不能侧放</label>
                </td>
            </tr>
            <tr>
                <td>
                    <input id="stackRequire4" type="checkbox" class="i-q" name="stackRequire"
                           value="4" [#if category.stackRequire??][#list category.stackRequire?split("|") as stack][#if stack=='4']checked[/#if][/#list][/#if]/><label
                        for="stackRequire4">不能倒置</label>
                </td>
                <td style="padding-left: 10px;">
                    <input type="checkbox" class="i-q" id="stackRequire5" name="stackRequire"
                           value="5" [#if category.stackRequire??][#list category.stackRequire?split("|") as stack][#if stack=='5']checked[/#if][/#list][/#if]/><label
                        for="stackRequire5">不能分拆</label>
                </td>
                <td style="padding-left: 10px;">
                    <input type="checkbox" class="i-q" id="stackRequire6" name="stackRequire"
                           value="6" [#if category.stackRequire??][#list category.stackRequire?split("|") as stack][#if stack=='6']checked[/#if][/#list][/#if]/><label
                        for="stackRequire6">不能堆叠</label>
                </td>
            </tr>
        </table>
    </div>

    <div class="d4">
        <span class="s-z1">注意事项：</span>

        <span class="s-z2">
        	<textarea class="text" id="memo" name="memo" placeholder="请详细描述货物价值等其它需注意信息">${category.memo!}</textarea>
        </span>


    </div>


    <div class="d5">
        <div class="d5-1"><em style="color: #ff9937;">*</em> 图片上传：</div>
        <div class="d5-2">

            <div id="ossfile" style="position: relative;">
            [#if category.id??]
                [#if attachmentOutputs??]
                    <input id="initCount" type="hidden" value="${attachmentOutputs?size}"/>
                    [#list attachmentOutputs as attach]
                        <div id="${attach.id!}">
                            <div class="progress">
                                <div class="progress-bar" style="width: 150px;" aria-valuenow="100">
                                </div>
                            </div><b>完成</b><div id="${attach.id!}1" class="fileName">
                                <div onmouseover="showPic(this)" onmouseout="hidePic(this)"
                                     style="width: 147px;overflow: hidden;text-overflow: ellipsis;white-space: nowrap;vertical-align: bottom;display: inline-block;">${attach.fileName!}${attach.fileSuffix!}</div>
                                <a href="javascript:void(0)" onclick="deletePic(this)"
                                   target="${attach.fileUrl!}">删除</a>
                            </div>
                        </div>
                    [/#list]
                [/#if]
            [/#if]
            </div>
            <div id="container" style="margin-top: 4px;">
                <input id="selectfiles" type="button" class="btn sc" style="" value="选择文件"/>
                <input id="postfiles" type="button" class="btn sc" value="开始上传"/>
                <input id="fileUrl" name="fileUrl" id="fileUrl" type="hidden" value="${fileUrl!}"/>
            </div>

        </div>
        <div class="d5-3" style="margin-left: 78px;clear: left;">（请上传清晰的货物照片）</div>
        <div class="d6" style="margin-left: 57px;margin-bottom: 10px;">
            <div class="d-bc" id="saveBtn">保存</div>
            <div class="d-bc1" id="saveAndApplyBtn">保存并申请</div>
        </div>
    </div>


    </div>
</form>
