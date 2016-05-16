$(function(){
    $("#shipperLink").on("click",function(){
        $(this).css("color","#ed6d00");
        $("#receiverLink").css("color",'');
        window.location.href = zxb.SYS_PATH+"/receicerShipper/index?type=0";
    });
    $("#receiverLink").on("click",function(){
        $(this).css("color","#ed6d00");
        $("#shipperLink").css("color",'');
        window.location.href = zxb.SYS_PATH+"/receicerShipper/index?type=1";
    });
});


function deleteRecord(id){

    layer.confirm('确定删除么？', {
        icon:3,title:"提示",btn: ['确认','取消'] //按钮
    }, function(){
        $.ajax({
            url:"../receicerShipper/del/"+id,
            type: "POST",
            data: {id:id},
            success:function(data){
                if(data){
                    window.location.reload();
                }else{
                    layer.msg("删除失败");
                }
            },
            error:function(){
                layer.msg("删除失败");
            }
        });
    }, function(){

    });

}

function setDefault(id){
    layer.confirm('确定设置为默认么？', {
        icon:3,title:"提示",btn: ['确认','取消'] //按钮
    }, function(){
        $.ajax({
            url:"../receicerShipper/setDefault/"+id,
            type: "POST",
            data: {id:id},
            success:function(data){
                if(data){
                    window.location.reload();
                }else{
                    layer.msg("设置失败");
                }
            },
            error:function(){
                layer.msg("设置失败");
            }
        });
    }, function(){

    });

}

function updateRecord(id,type){
    $("#baseUrl").val(window.location);
    var url ='';
    var title ='';
    if(id){
        url = zxb.SYS_PATH+'/receicerShipper/'+id;
        title="修改";
    }else{
        url = zxb.SYS_PATH+'/receicerShipper/add?type='+type;
        title="新增"+type=='1'?'收货人':'发货人';
    }

    layer.open({
        type: 2,
        area: ['580px','300px'],
        fix: true, //固定
        maxmin: false,
        title:"",
        content: url,
        scrollbar: false
    });
}