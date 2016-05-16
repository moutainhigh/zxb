<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>专线宝数据监控</title>
    <script type="text/javascript" src="${JS_PATH}/jquery-1.12.3.min.js"></script>
    <script type="text/javascript" src="${JS_PATH}/jquery.cookie.js"></script>
    <script type="text/javascript" src="${JS_PATH}/echarts.min.js"></script>
    <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/map/js/china.js"></script>
    <script type="text/javascript" src="${JS_PATH}/macarons.js"></script>
<#--<script type="text/javascript" src="${JS_PATH}/map.js"></script>-->
    <script type="text/javascript" src="${JS_PATH}/show.js"></script>
</head>
<style>
    * {
        margin: 0;
        padding: 0;
    }

    .body {
        margin: 0;
        padding: 0;
        color: #6db8cc;
    }

    .dk {
        width: 1440;
        height: 720px;
        background-image: url(${IMG_PATH}/bj.png);
        background-repeat: no-repeat;
        background-size: 100%;
        background-position: center center;

    }

    .lg {
        width: 1440px;
        margin: 0 auto;
    }

    .lg1, .lg2, .lg3 {
        display: block;
        float: left;
        margin-top: 20px;
    }

    .lg1 {
        margin-left: 65px;
        position: relative;
        top: 11px;
    }

    .lg2 {
        margin-left: 157px;
        font-size: 58px;
        font-family: "黑体";
        font-weight: bold;
        color: #6db8cc;
        position: absolute;
        left: 244px;
        top: 12px;
    }

    .lg3 {
        font-size: 24px;
        color: #6db8cc;
        font-family: "微软雅黑";
        margin-left: 60px;
        margin-top: 55px;
        position: absolute;
        top: 10px;
        right: 149px;
    }

    .zjk {
        width: 1440px;
        clear: both;
        margin: 0 auto;
    }

    .zbk {
        width: 320px;
        height: 500px;
        float: left;
        margin-top: 100px;
        margin-left: 60px;
    }

    .z1 {
        font-size: 60px;
        color: #6db8cc;
        font-weight: bold;
        float: left;
    }

    .dw {
        background-image: url(${IMG_PATH}/dw.png);
        background-repeat: no-repeat;
        width: 700px;
        height: 30px;
        color: #02aec2;
        font-size: 20px;
        font-weight: bold;
    }

    .dw1 {
        background-image: url(${IMG_PATH}/dw1.png);
        background-repeat: no-repeat;
        width: 180px;
        height: 20px;
        color: #cddde6;
        font-size: 13px;
        font-weight: bold;
    }

    .dw2 {
        background-image: url(${IMG_PATH}/dw2.png);
        background-repeat: no-repeat;
        width: 225px;
        height: 20px;
        color: #cddde6;
        font-size: 13px;
        font-weight: bold;
    }

    .zbk1 {
        width: 290px;
        height: 290px;
        float: left;
    }

    .nrk1 {
        width: 280px;
        height: 250px;
        clear: both;
    }

    .zbk2 {
        clear: both;
        width: 375px;
        height: 111px;
        background: #244d77;
        border-radius: 10px;
        margin-top: 22px;
        float: left;
        margin-left: -40px;
    }

    .w1 {
        color: #ef6b00;
        font-size: 22px;
        float: left;
        margin: 10px;
        font-weight: bold;
        margin-left: 30px;
    }

    .wz11 {
        width: 330px;
        height: 60px;
        clear: both;
        margin-left: 25px;
    }

    .w2 {
        width: 150px;
        height: 58px;
        margin-left: 10px;
        float: left;
    }

    .suz {
        color: #ecef00;
        font-size: 32px;
        font-weight: bold;
    }

    .jy {
        font-size: 14px;
        color: #bcc4cf;
        font-weight: bold;
    }

    .suz1 {
        color: #ecef00;
        font-size: 32px;
        font-weight: bold;
    }

    .jy1 {
        font-size: 14px;
        color: #bcc4cf;
        font-weight: bold;
    }

    .fgx {
        background: #bcc4cf;
        width: 1px;
        height: 53px;
        float: left;
        margin-left: 30px;
    }

    .w3 {
        float: left;
        height: 58px;
        width: 130px;
        float: right;
        margin-right: -5px;

    }

    /*youbiank*/

    .ybk {
        float: right;
        width: 560px;
        height: 570px;
        margin-right: 120px;
    }

    .y1 {
        height: 570px;
        width: 560px;
        float: right;
        margin-top: 35px;
    }

    .yx1 {
        width: 360px;
        height: 1px;
        background: #FFF;
        float: right;
    }

    .zw1 {
        margin-left: 196px;
    }

    .zw1, .zw2, .zw3 {
        color: #FFF;
        font-size: 14px;
        float: left;
    }

    .qq {
        color: #FFF;
        font-size: 12px;
        float: left;
        margin-left: 10px;
    }

    .zw11, .zw22, .zw33 {
        clear: both;
        color: #f6e526;
        font-size: 32px;
        text-align: center;
        font-weight: bold;
    }

    .zw1, .zw2, .zw3 {
        width: 120px;
        height: 50px;
        font-size: 12px;
    }

    .zw2 {
        border: solid 1px #535d8b;
        border-top: none;
        border-bottom: none;
    }

    .yx2 {
        width: 360px;
        height: 1px;
        background: #FFF;
        float: right;
    }

    .t {
        width: 360px;
        height: 50px;
        float: right;
    }

    .c {
        width: 360px;
        height: 50px;
        float: right;
        border: solid 1px #FFFFFF;
        border-bottom: none;
        border-left: none;
        border-right: none;
    }

    .tp11 {
        width: 175px;
        height: 50px;
        border: solid 1px #535d8b;
        border-bottom: none;
        border-top: none;
        border-left: none;
        float: left;
    }

    .tp22 {
        width: 180px;
        float: right;
    }

    .tp2 {
        display: block;
        float: left;
        margin-top: 10px;
    }

    .tp3 {
        display: block;
        float: left;
        margin-top: 20px;
    }

    .tp1 {
        display: block;
        float: left;
        margin-top: 10px;
    }

    .pp {
        float: left;
        width: 120px;
        margin-left: 5px;
    }

    .p1 {
        color: #FFF;
        font-size: 12px;
        float: left;
        line-height: 30px;
    }

    .p2 {
        color: #f6e526;
        font-size: 18px;
        width: 120px;
        float: left;
        font-weight: bold;
    }

    .fahuo {
        width: 380px;
        height: 360px;
        clear: both;
        float: right;
        margin-top: 40px;
        margin-right: -20px;
    }

    .ybk1 {
        width: 180px;
        height: 120px;
        float: left;
    }

    .ybk2 {
        width: 180px;
        height: 120px;
        float: left;
        margin-left: 20px;
    }

    .ybk3 {
        clear: both;
        width: 400px;
        height: 200px
    }

    .ali {
        float: left;
        margin-left: -120px;
        margin-top: -95px;
    }

    .nrk1, .nrk2 {
        width: 200px;
        height: 100px;
    }

    .nrk4 {
        width: 450px;
        height: 140px
    }


</style>


<body>
<div class="dk">
    <div class="lg">
        <div class="lg1"><img src="${IMG_PATH}/logo.png"></div>
        <div class="" id = "aliImag" style="position: absolute;margin-left: 201px;margin-top: 120px;"><img src="${IMG_PATH}/ali.png"></div>
        <div class="" id = "linkImag" style="position: absolute;margin-left: 56px;margin-top: 108px;"><img src="${IMG_PATH}/link.png"></div>
        <div class="lg2">智能展示系统-全网数据</div>
        <div class="lg3">${.now?string("yyyy-MM-dd")}</div>
    </div>
<#--地图-->
    <div id="map" style="width: 60%;height: 95%; position: absolute;left: 200px;top: 0%;left: 13%;"></div>
    <!--中间框-->
    <div class="zjk">
        <div class="zbk" style="margin-top:60px">
            <div class="zbk1" style="margin-left:-42px;margin-top: 30px;">
                <div class="dw">货物品类分布</div>
                <div class="nrk1" id="goodCategory"
                     style="margin-top:3px;margin-left:8px;width: 260px;height: 380px;top:-53px"></div>
            </div>

            <div class="zbk2" style="margin-top: 60px">
                <div class="w1">累计交易数据</div>
                <div class="wz11">
                    <div class="w2">
                        <div id="totalFee" class="suz">${baseData.totalFee}</div>
                        <div class="jy">累计交易额</div>
                    </div>

                    <div class="fgx"></div>

                    <div class="w3">
                        <div id="totalDeal" class="suz1">${baseData.totalDeal}</div>
                        <div class="jy1">累计交易票数</div>
                    </div>
                </div>
            </div>
        </div>


        <!--右边框  -->

        <div class="ybk">
            <div class="y1" style="margin-top: 10px">
                <div class="yx1"></div>
                <div class="zw1">
                    <div class="qq">全国运力中心数</div>
                    <div id="transportCenterCount" class="zw11">${baseData.transportCenterCount}</div>
                </div>
                <div class="zw2">
                    <div class="qq">全国服务网点数</div>
                    <div id="serviceBranchCount" class="zw22">${baseData.serviceBranchCount}</div>
                </div>
                <div class="zw3">
                    <div class="qq">专线供应商数</div>
                    <div id="lineSuppliersCount" class="zw33">${baseData.lineSuppliersCount}</div>
                </div>

                <div class="yx2"></div>

                <div class="t">

                    <div class="tp11">
                        <div class="tp1"><img src="${IMG_PATH}/t1.png"></div>
                        <div class="pp">
                            <div class="p1">累计发货重量（吨）</div>
                            <p>
                            <div id="totalWeight" class="p2">${baseData.totalWeight}</div>
                        </div>

                    </div>


                    <div class="tp22">
                        <div class="tp2"><img src="${IMG_PATH}/t2.png"></div>
                        <div class="pp">
                            <div class="p1">累计发货体积（立方）</div>
                            <p>
                            <div id="totalVolume" class="p2">${baseData.totalVolume}</div>

                        </div>
                    </div>
                </div>


                <!--2-->
                <div class="c">

                    <div class="tp11">
                        <div class="tp1"><img src="${IMG_PATH}/t3.png"></div>
                        <div class="pp">
                            <div class="p1">当月交易票数</div>

                            <div id="totalDealMonth" class="p2">${baseData.totalDealMonth}</div>

                        </div>

                    </div>

                    <div class="tp22">
                        <div class="tp3"><img src="${IMG_PATH}/t4.png"></div>
                        <div class="pp">
                            <div class="p1">当月交易额</div>
                            <div id="totalFeeMonth" class="p2">${baseData.totalFeeMonth}</div>
                        </div>

                    </div>
                </div>

                <div class="yx2"></div>

                <div class="fahuo" style="margin-top:20px">
                    <div class="ybk1">
                        <div class="dw1">发货区域排行
                        </div>
                        <div id="deliveryArea"
                             style="width: 200px;height: 245px;position: absolute;background-color: transparent;left: 940px;top: 235px;"></div>
                        <div class="nrk2">
                        </div>
                    </div>
                    <div class="ybk2">
                        <div class="dw1">物流专线排行</div>
                    <#--<div id="lineSuppliers" style="width: 230px;height: 180px;position: absolute;background-color: transparent;right: 241px;top: 287px;"></div>-->
                        <div class="nrk3" style="margin-top:100px">
                            <div class="nrk3" style="width: 200px;height: 245px;right: 20px;top: -158px;"
                                 id="lineSuppliers"></div>
                        </div>
                    </div>

                    <div class="ybk3">
                        <div class="nrk4" style="margin-top:162px">
                            <div class="dw2">目的区域排行（交易额万元）</div>
                        <#--目的区域排行（交易额）-->
                            <div id="destinationArea" style="width: 400px;height:265px;top: -54px"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
