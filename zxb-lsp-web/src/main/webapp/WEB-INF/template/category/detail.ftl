<script type="text/javascript" src="${JS_PATH}/jquery.min.js"></script>
<script type="text/javascript" src="${JS_PATH}/layer/layer.js"></script>

<script type="text/javascript">
        layer.config({
            extend: 'extend/layer.ext.js'
        });
        layer.ready(function(){
            layer.photos({
                photos: '#layer-photos-demo'
            });
        });
$().ready(function(){
    $("#showPics").click(function(){

        $('#layer-photos-demo img').first().trigger("click");

    });


});

</script>

<link type="text/css" rel="stylesheet" href="${JS_PATH}/layer/skin/layer.css">
<link type="text/css" rel="stylesheet" href="${JS_PATH}/layer/skin/layer.ext.css">
<link type="text/css" rel="stylesheet" href="${CSS_PATH}/in-gggg.css">
<link type="text/css" rel="stylesheet" href="${CSS_PATH}/pinlei-sq.css">
<style>
    table td {
        font-size: 13px;
        text-align: left;
    }
    table{
        margin-left: 0;
    }
</style>

<div class="d1"> <span class="s-q">查看详情</span></div>
<div class="d2" style="width:480px;font-size:13px;height:auto!important; height:28px; min-height:28px; overflow:hidden; _overflow:visible;
display: block;font-size:13px;">
    <table width="479" height="60" border="0" cellpadding="0" cellspacing="0">
        <tr>
            <td><strong><span style="color:#666">品类名</span></strong>：${category.name!}</td>
            <td><strong><span style="color:#666">包装</span></strong>：
            [#if category.pack??]
                [#if category.pack=='0']无
                [#elseif category.pack=='1']纸箱
                [#elseif category.pack=='2']袋
                [#elseif category.pack=='3']桶
                [#elseif category.pack=='4']包
                [#elseif category.pack=='5']托
                [#elseif category.pack=='6']木架
                [#elseif category.pack=='7']纸
                [#else]${category.pack}
                [/#if]
            [/#if]</td>
            <td><strong><span style="color:#666">轻重比</span></strong>：${(category.rateHeavy)!} : ${(category.rateLight)!}</td>
        </tr>
        <tr>
            <td colspan="3"><strong><span style="color:#666">装卸方式</span></strong>：
            [#if category.loadUnloadType??]
                [#if category.loadUnloadType==0]人工搬运
                [#elseif category.loadUnloadType==1]吊车作业
                [#elseif category.loadUnloadType==2]叉车作业
                [/#if]
            [/#if]</td>
        </tr>
    </table>

    <table width="479" height="10" border="0" cellpadding="0" cellspacing="0" style="margin:5px 0 5px 0;line-height:23px;">
        <tr>
            <td><span style="color:#666"><strong>其它要求</strong>：</span>
            [#if category.stackRequire??]
                [#list category.stackRequire?split("|") as stack]
                    [#if stack=='1']不能混装
                    [#elseif stack=='2']不能挤压
                    [#elseif stack=='3']不能侧放
                    [#elseif stack=='4']不能倒置
                    [#elseif stack=='5']不能分拆
                    [#elseif stack=='6']不能堆叠
                    [/#if]
                [/#list]
            [/#if]
            </td>
        </tr>
    </table>
    <table width="479" height="10" border="0" cellpadding="0" cellspacing="0" style="margin:5px 0 5px 0;line-height:23px;">
        <tr>
            <td style="word-break: break-all;"><strong><span style="color:#666">注意事项</span></strong>： ${category.memo!}</td>
        </tr>
    </table>
    <table width="479" height="26" border="0" cellpadding="0" cellspacing="0">

        <tr>
            <td>
                <strong><span style="color:#666">品类图片</span></strong>：<a id="showPics" href="javascript:void(0)">查看图片&gt;&gt;</a>
                <div id="layer-photos-demo" class="layer-photos-demo" style="display: none;">
                [#if category.fileUrl??]
                    [#list category.fileUrl?split(",") as picUrl]
                        <img layer-pid="" layer-src="${OSS_IMG_PATH}${picUrl!}" src="${OSS_IMG_PATH}${picUrl!}" style="width: 0px;" alt="← →可以切换图片">
                    [/#list]
                [/#if]
                </div>
            </td>
        </tr>
    </table>
    <table width="480" height="1" border="0" cellpadding="0" cellspacing="0" bgcolor="#ccc" style="margin:13px auto 8px auto;">
        <tr>
            <td></td>
        </tr>
    </table>
    <table width="479" height="69" border="0" cellpadding="0" cellspacing="0">

        <tr>
            <td><strong><span style="color:#666">集散中心</span></strong>：${category.allocCenterName!}</td>
            <td><strong><span style="color:#666">审核状态</span></strong>：[#if category.status??]
                [#if category.status==0]未申请
                [#elseif category.status==1]未审核
                [#elseif category.status==2]审核通过
                [#elseif category.status==3]审核拒绝
                [/#if]
            [#else ]未申请
            [/#if]</td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>[#--<strong><span style="color:#666">审核说明</span></strong>：${category.allotMemo!}--]</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
    </table>
    <br>
</div>



