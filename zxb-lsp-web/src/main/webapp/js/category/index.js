$(function(){

    $("#submitBtn").click(function(){
        $("#submitBtn").unbind("click");
        var fun = function(){
            $("#indexForm").submit();
        };
        loadPage(2,200,fun,$(".d-cz2"))
    });



    $("#addBtn").click(function(){
        //window.location.href = "../category/index"+window.location.search;
        //$("#categoryDialog").show();
        if($("#allocCenterId option").length > 1){
            $("#baseUrl").val(window.location);
            layer.open({
                type: 2,
                area: ['570px','650px'],
                fix: true, //固定
                maxmin: false,
                title:"品类申请",
                content: '../category/add',
                scrollbar: false
            });
        }else{
            layer.tips("您还没有关联集散中心，不能申请品类","#addBtn");
        }

    });


    $(".applyBtn").click(function(){
        var id=$(this).attr("target");
        //var flag = window.confirm("确认申请么？");



        layer.confirm('确认申请么？', {
            icon:3,title:"提示",btn: ['确认','取消'] //按钮
        }, function(){
            $.ajax({
                url:"../category/apply/"+id,
                type: "POST",
                data: {id:id},
                success:function(data){
                    if(data){
                        window.location.reload();
                    }else{
                        layer.msg('申请失败');
                    }
                },
                error:function(){

                }
            });
        }, function(){

        });
    });
});


function editCategory(id){
    $("#baseUrl").val(window.location);
    layer.open({
        type: 2,
        area: ['570px','650px'],
        fix: true, //固定
        maxmin: false,
        title:"品类修改",
        content: '../category/edit/'+id,
        scrollbar: false
    });
}

function showDetail(id){
    layer.open({
        type: 2,
        area: ['550px','430px'],
        fix: true, //固定
        maxmin: false,
        title:"",
        content: '../category/detail/'+id,
        scrollbar: false
    });
}


function loadPage(type,time,fun,laodArea){
    laodArea.hide();
    var index = layer.load(type, {time: time});
    setTimeout(fun,time);
}

