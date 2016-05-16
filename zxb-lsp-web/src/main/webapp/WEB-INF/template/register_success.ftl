
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="renderer" content="webkit"><title>注册</title>
    <meta name="keywords" content=""/>
    <meta name="description" content=""/>
    <script type="text/javascript" src="${JS_PATH}/jquery-1.12.3.min.js"></script>
    <script type="text/javascript" >

        $(function(){
            var intervalId;
            intervalId =window.setInterval(function(){
                var time =parseInt($("#showTime").text());
                time --;
                $("#showTime").text(time)
                if(time == 0){
                    clearInterval(intervalId);
                    location.href="../lspUser/index";
                }

            },1000);
        });
    </script>
    <style type="text/css">
        .ank div{
            margin: 15px 0;
        }
        .ank{
            width: 400px;
            position: absolute;
            bottom: 150px;
            left:50%;
            margin-left: -200px;
        }
    </style>

    <link type="text/css" rel="stylesheet" href="${CSS_PATH}/dl.css">
</head>
 <body>


         <div class="ank">

             <div class="">
                 恭喜您！注册成功！
             </div>

             <div>
                 请稍等，正在带您前往您的专属首页。。。。
             </div>

             <div >
                <span id="showTime">3</span>秒后转入
             </div>

             <div >
                 <a href="../lspUser/index">立即进入</a>
             </div>

         </div>

</body>
</html>
