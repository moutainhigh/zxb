/**
 * Created by Administrator on 2016/4/5.
 */
$().ready(function () {

    /**
     * 新建配载
     */
    $("#new-stowage").click(function () {
        location.href = "edit/0";
        return false;
    });

    $("#queryStowage").click(function(){
        $("#queryFrm").submit();
    });

//    $("#depart").click(function(){
//        $("#queryFrm").submit();
//    });

});

function depart(id){
    layer.confirm('是否确认发车？', {
        icon:3,title:"提示",btn: ['确认','取消'] //按钮
    }, function(){
        $.ajax(
            {
                url: zxb.SYS_PATH + "/stowage/depart/"+id,
                data: {'id':id},
                type: 'post',
                success: function (data) {
                    if (data.status == 1) {
                        layer.msg(data.msg);
                        window.location.reload();
                    }else{
                        layer.msg(data.msg);
                    }
                },
                error: function () {
                    layer.msg("加载运单数据失败,请稍候再试!");
                }
            }
        );
    }, function(){

    });

}