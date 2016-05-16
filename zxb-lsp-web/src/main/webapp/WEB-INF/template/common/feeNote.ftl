[#include "../_layout.ftl"]
[#escape x as x?html]

    [#assign page_title="资费说明"/]
    [#assign page_desc="资费说明"/]


    [#macro section_css]
    <link rel="stylesheet" type="text/css" href="${CSS_PATH}/in-gggg.css">
    <link rel="stylesheet" type="text/css" href="${CSS_PATH}/pinlei-sq.css">

    [/#macro]
    [@mainLayout]

        <!--右边框-->
        <div id="checkout1" style="width:1000px;">
            <div class="checkout-steps">
                <div style="font-family:microsoft yahei;font-size:23px;height:26px;color:#333;padding:20px 0 0 0;"><strong><img src="../img/huo99.png" width="43" height="43" style="margin:-18px 0 -10px 19px;">&nbsp;资费说明</strong></div>
                <div class="step-content">
                    <div id="div" class="sbox-wrap">
                        <form>
                            <div class="item fahuo"  ></div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="checkout-steps">
                <div class="step-title3x"><strong>上楼费</strong></div>
                <div class="step-content">
                    <div id="div" class="sbox-wrap">
                        <form>
                            <div class="item fahuo2" style="border:0px solid #ccc;"  >
                                <table>

                                    <tr>
                                        <td width="90"><span class="label">重货计费</span>：</td>
                                        <td width="884">有电梯（40元/吨	）；无电梯（50元/层/吨）</td>
                                    </tr>
                                    <tr>
                                        <td><span class="label">抛货计费</span>：</td>
                                        <td>有电梯（10元/方	）；无电梯（15元/层/方）</td>
                                    </tr>
                                    <tr>
                                        <td><span class="label">说明A</span>：</td>
                                        <td>您在平台上选择上楼且选择无电梯但未填写楼层信息的情况下，默认按照5层的标准收费，后续将根据实际情况进行补付或补收。</td>
                                    </tr>
                                </table>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="checkout-steps">
                <div class="step-title3x"><strong>装卸费</strong></div>
                <div class="step-content">
                    <div id="div" class="sbox-wrap">
                        <form>
                            <div class="item fahuo2"  >
                                <table>
                                    <tr>
                                        <td width="90">计费标准：</td>
                                        <td width="653">100公斤或0.5方以内免收装卸费</td>
                                    </tr>
                                    <tr>
                                        <td width="90"><span class="label">重货计费</span>：</td>
                                        <td>50元/吨</td>
                                    </tr>
                                    <tr>
                                        <td><span class="label">抛货计费</span>：</td>
                                        <td>15元/方</td>
                                    </tr>

                                </table>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="checkout-steps">
                <div class="step-title3x"><strong>进仓费</strong></div>
                <div class="step-content">
                    <div id="div" class="sbox-wrap">
                        <form>
                            <div class="item fahuo2"  >
                                <table>
                                    <tr>
                                        <td width="90">外贸进仓费：</td>
                                        <td width="841">统一按照每方15元，叉车费每1.5方15元标准计费</td>
                                    </tr>
                                    <tr>
                                        <td width="90">电商进仓费：</td>
                                        <td>统一按照每方25元的标准计费（含卸货、缠绕膜等费用）</td>
                                    </tr>
                                    <tr>
                                        <td width="90"><span class="label">超时等待费</span>：</td>
                                        <td> 2小时内免费，超出2小时内按每30分钟20元收取等待费用</td>
                                    </tr>
                                </table>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="checkout-steps">
                <div class="step-title3x"><strong>签回单</strong></div>
                <div class="step-content">
                    <div id="div" class="sbox-wrap">
                        <form>
                            <div class="item fahuo2"  >
                                <table width="821">
                                    <tr>
                                        <td width="664">如您选择签回单，按照每票10元标准进行收取</td>
                                    </tr>
                                </table>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="checkout-steps">
                <div class="step-title3x"><strong>改单费用</strong></div>
                <div class="step-content">
                    <div id="div" class="sbox-wrap">
                        <form>
                            <div class="item fahuo2"  >
                                <table width="900">

                                    <tr>
                                        <td width="900">如您的运单在运输过程中发生品类、重量、体积、件数、包装、送货方式、支付方式、收货地区、发票以及增值服务的增加或减少等信息时，需额外收取10元/票的改单费用<br></td>
                                    </tr>
                                </table>
                            </div>
                        </form>
                    </div>
                </div>
            </div>

            <div class="checkout-steps">
                <div class="step-content">
                    <div id="div" class="sbox-wrap">
                        <form>
                        </form>
                    </div>
                </div>
            </div>

        </div>
    [/@mainLayout]
[/#escape]