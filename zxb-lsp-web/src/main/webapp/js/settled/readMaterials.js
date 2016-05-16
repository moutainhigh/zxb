$().ready(function () {

    $("#settled").click(function () {
        var $isRead = $("#isRead");
        if ($isRead.is(":checked")) {
            $("#settledForm").submit();
        }else{
            layer.tips("请您确认已阅读申请注意事项", "#isRead");
            return;
        }
    });

});