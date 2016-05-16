
<div class="dk">
    <div class="dk-k">
        <div class="dk1">
                <span class="w1">
                    <a id="storePage" href="javascript:void(0)"><img src="${IMG_PATH}/shouc.png">收藏</a>
                </span>
                <span class="w2">
                    <a href="javaScript:window.open('http://www.56123.com/market/service')"><img src="${IMG_PATH}/shouc2.png">我们的服务</a>
                </span>
        </div>
        <div class="dk2">
            <ul>
                <li>${CURR_USER.nickName!}，欢迎来到专线宝!</li>
                <li><a href="${SYS_PATH}/lspUser/loginOut">[退出]</a></li>
            [#--<li>|</li>
                <li><img src="${IMG_PATH}/new.png" style="
                   margin-top: 2px;
                    margin-right: -6px;">
                </li>
            <li><a href="#">我的运单</a></li>--]
                <li>|</li>
                <li>
                    <a href="#"><img src="${IMG_PATH}/w-sj.png" style="margin-top:-5px;"></a>
                </li>
                <li><a href="javaScript:window.open('http://www.56123.com/about/mobile');">手机专线宝</a></li>
                <li>|</li>
                <li><a href="javaScript:window.open('http://wpa.qq.com/msgrd?v=3&uin=2082932824&site=qq&menu=yes')">在线客服</a>
                </li>
            </ul>
        </div>
    </div>
    <br>
</div>
<div class="text-x"></div>

<div class="top">
    <div class="logo-1">
        <img src="${IMG_PATH}/logo-1.png">
    </div>
    <!--导航-->
    <div class="dh-0" style=" float:left; margin-top:60px;  margin-bottom:10px;">
        <ul>
            <a href="#">
                <li class="dh-1" onclick="javascript:location='${SYS_PATH}/lspUser/index'">首页</li>
            </a>
            [#--<a href="#">
                <li class="dh-2">我要接单</li>
            </a>--]

            <a id="sendGoods" href="javascript:void(0)" >
                <li class="dh-3">我要发货</li>
            </a>

           [#-- <a href="#">
                <li class="dh-4">快速充值</li>
            </a>--]
        </ul>
    </div>
    <!--二维码-->
    <div class="ewm"><img src="${IMG_PATH}/lg-dh.png"></div>
</div>
<div class="text-cxx"></div>
<script type="text/javascript">
    $().ready(function(){
        $("#sendGoods").click(function(){
            [#if CURR_USER.blocked??]
                [#if CURR_USER.blocked==1]
                    layer.msg("您的发货功能已被冻结");
                [#else]
                    window.location.href="${SYS_PATH}/waybill/add";
                [/#if]
            [#else ]
                window.location.href="${SYS_PATH}/waybill/add";
            [/#if]

        });

        $("#storePage").click(function(){
            var url = window.location;
            var title = document.title;
            var ua = navigator.userAgent.toLowerCase();

            try
            {
                window.external.addFavorite(url, title);
            }
            catch (e)
            {
                try
                {
                    window.sidebar.addPanel(title, url, "");
                }
                catch (e)
                {
                   layer.msg("加入收藏失败，请使用Ctrl+D进行添加");
                }
            }

        });
    });
</script>