
$().ready(function () {

    $("#queryWaybill").click(function(){
        $("#queryFrm").submit();
    });
});

function closeWaybill(id) {

    layer.confirm('确认关闭运单么？',
        {
            icon:3,title:"提示",btn: ['确认','取消']
        },

        function () {
            $.ajax({
                url: zxb.SYS_PATH + "/waybill/close",
                data: {'id':id},
                type: 'POST',
                success: function (data) {
                    if (data.status == 1) {
                        layer.msg(data.msg, {time: 2000},function () {
                            window.location.reload();
                        });
                    }else{
                        layer.msg(data.msg);
                    }
                },
                error: function () {
                    layer.msg("加载运单数据失败,请稍候再试!");
                }
            });
    });
}