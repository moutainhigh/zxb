/**
 * Created by wangjh on 2016/5/7.
 */
var $table = $('#table'),
    selections = [];

function initTable() {
    $table.bootstrapTable({
        height: getHeight(),
        columns: [
            {
                field: 'centerName',
                title: '集散',
                sortable: false,
                align: 'center'
            },
            {
                field: 'year',
                title: '年份',
                sortable: false,
                align: 'center'
            },
            {
                field: 'month',
                title: '月份',
                sortable: false,
                align: 'center'
            },
            {
                field: 'provinceName',
                title: '目的地（省）',
                sortable: false,
                align: 'center'
            },
            {
                field: 'cityName',
                title: '目的地（市）',
                sortable: false,
                align: 'center'
            },
            {
                field: 'lineSupplierCount',
                title: '调度供应商数',
                sortable: false,
                align: 'center'
            },
            {
                field: 'totalWayBillCount',
                title: '总票数',
                sortable: false,
                align: 'center'
            },
            {
                field: 'avgTotalWayBillCount',
                title: '日均票数',
                sortable: false,
                align: 'center'
            },
            {
                field: 'unusualWayBillCount',
                title: '异常票数',
                sortable: false,
                align: 'center'
            },
            {
                field: 'totalAmount',
                title: '总金额',
                sortable: false,
                align: 'center'
            },
            {
                field: 'avgTotalAmount',
                title: '日均金额',
                sortable: false,
                align: 'center'
            },
            {
                field: 'totalOfferWight',
                title: '总重量',
                sortable: false,
                align: 'center'
            },
            {
                field: 'avgTotalOfferWight',
                title: '日均重量',
                sortable: false,
                align: 'center'
            },
            {
                field: 'totalOfferVolume',
                title: '总体积',
                sortable: false,
                align: 'center'
            },
            {
                field: 'avgTotalOfferVolume',
                title: '日均体积',
                sortable: false,
                align: 'center',
                width:'20'
            }

        ]
    });

}

function queryParams(params) {
    return $.extend({}, params, $('#queryForm').serializeJson());
}


function responseHandler(res) {
    $.each(res.rows, function (i, row) {
        row.state = $.inArray(row.id, selections) !== -1;
    });
    return res;
}


function getHeight() {
    return $(window).height() - 120;
}


function loadYears(){
    var now = new Date();
    var nowYear = now.getFullYear();
    for(var i = nowYear;i>=2011;i--){
        $("#year").append("<option value='"+i+"'>"+i+"年</option>");
    }

    $("#year").find("option").eq(1).attr("selected","selected");
}


$(function () {
    loadYears();
    initTable();
    $('#queryButton').click(function () {
        $table.bootstrapTable('refresh');
    });
    $("#year").change(function(){
        if(!$(this).val()){
            $("#month").val('');
        }
    });
    $("#provinceId").change(function(){
        if($(this).val()){
            $.ajax({
                url: zxb.SYS_PATH + '/area/citys',
                type: 'GET',
                data: {parentId:$(this).val()},
                success: function (data) {
                    $("#cityId").html("<option value>全部</option>");
                    for(var i=0;i<data.length;i++){
                        //console.log(data[i].areaName);
                        $("#cityId").append("<option value='"+data[i].id+"'>"+data[i].areaName+"</option>");
                    }
                }
            });
        }else{
            $("#cityId").html("<option value>全部</option>");
        }
    })
});