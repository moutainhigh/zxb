/**
 * Created by wangjh on 2016/5/9.
 */

var chart;

function initChart(){

    //初始化之前销毁原来的chart对象
    if (chart){
        chart.dispose();
    }
    chart = echarts.init(document.getElementById('chart'));

    $.ajax({
        url: zxb.SYS_PATH + '/allotCenter/chartData',
        type: 'GET',
        data: $('#queryForm').serialize(),
        success: function (data) {
            if(data.length == 0){
                layer.msg("基础数据不存在，请重新选择");
            }
            var data1=[];
            var data2=[];
            var data3=[];
            var data4=[];
            var data5=[];
            var data6=[];
            var xdata = [];
            for(var i=0;i<data.length;i++){
                data1[i] = data[i].lineSupplierCountPercent
                data2[i] = data[i].totalWayBillCountPercent;
                data3[i] = data[i].unusualWayBillCountPercent;
                data4[i] = data[i].totalOfferWightPercent;
                data5[i] = data[i].totalOfferVolumePercent;
                data6[i] = data[i].totalAmountPercent;
                xdata[i] = data[i].yearAndMonth;
            }

            //alert(data.length)
            var colors = ['#CC1529','#25C8CC', '#C839CC', '#3BCC65','#201FCC','#CCC42E'];
            var option = {
                color:colors,
                title: {
                    text: '集散发货属性趋势图'
                },
                tooltip: {
                    trigger: 'axis',
                    formatter:function(params){
                        console.log(params);
                        console.log(option.color);
                        var res = "";
                        for(var i = 0;i<params.length;i++){
                            //console.log(params[i].seriesName+"*****"+params[i].data);
                            if(params[i].seriesName){
                                var color=""
                                    switch(params[i].seriesName)
                                    {
                                    case '调用供应商数':
                                        color = colors[0]
                                        break;
                                    case '总票数':
                                         color = colors[1]
                                         break;
                                    case '异常票数':
                                         color = colors[2]
                                         break;
                                    case '总重量':
                                         color = colors[3]
                                         break;
                                    case '总体积':
                                        color = colors[4]
                                        break;
                                    case '总金额':
                                        color = colors[5]
                                        break;
                                    default:
                                    }

                                res += "<br /><span class='circle' style='background-color: "+color+
                                    "'></span>"+params[i].seriesName+": "+params[i].data+"%"
                            }

                        }
                        res = params[0].name+res;
                        return res;
                    }

                        /*'{b0}<br />调用供应商数: {c0}%<br />总票数: {c1}%<br />异常票数: {c2}%<br />总重量: {c3}%<br />总体积: {c4}%<br />总金额: {c5}%'*/
                },
                legend: {
                    data:['调用供应商数','总票数','异常票数','总重量','总体积','总金额']
                },
                grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                toolbox: {
                    feature: {
                        saveAsImage: {}
                    }
                },
                xAxis: {
                    type: 'category',
                    boundaryGap: false,
                    data: xdata
                },
                yAxis: {
                    type: 'value',
                    axisLabel : {
                        formatter: '{value}%'
                    }
                },
                series: [
                    {
                        name:'调用供应商数',
                        type:'line',
                        // stack: '总量',
                        data:data1,
                        itemStyle : {
                            normal:{
                                label : {
                                    show: true,
                                    formatter:'{c}%'
                                }
                            }
                        },
                    },
                    {
                        name:'总票数',
                        type:'line',
                        //stack: '总量',
                        data:data2,
                        itemStyle : {
                            normal:{
                                label : {
                                    show: true,
                                    formatter:'{c}%'
                                }
                            }
                        },
                    },
                    {
                        name:'异常票数',
                        type:'line',
                        //stack: '总量',
                        data:data3,
                        itemStyle : {
                            normal:{
                                label : {
                                    show: true,
                                    formatter:'{c}%'
                                }
                            }
                        },
                    },
                    {
                        name:'总重量',
                        type:'line',
                        // stack: '总量',
                        data:data4,
                        itemStyle : {
                            normal:{
                                label : {
                                    show: true,
                                    formatter:'{c}%'
                                }
                            }
                        },
                    },
                    {
                        name:'总体积',
                        type:'line',
                        //stack: '总量',
                        data:data5,
                        itemStyle : {
                            normal:{
                                label : {
                                    show: true,
                                    formatter:'{c}%'
                                }
                            }
                        },
                    },
                    {
                        name:'总金额',
                        type:'line',
                        //stack: '总量',
                        data:data6,
                        itemStyle : {
                            normal:{
                                label : {
                                    show: true,
                                    formatter:'{c}%'
                                }
                            }
                        }
                    }
                ]
            };

            chart.setOption(option);

        }
    });

}



function queryParams(params) {
    return $.extend({}, params, $('#queryForm').serializeJson());
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
    initChart();

    $('#queryButton').click(function () {
        //判断是否选择年月
        if(!$("#year").val()){
            layer.tips('请选择年', '#year', {
                tips: [1, '#3595CC'],
                time: 2000
            });
            return false;
        }
        if(!$("#month").val()){

            layer.tips('请选择月', '#month', {
                tips: [1, '#3595CC'],
                time: 2000
            });
            return false;
        }


        initChart();
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
                    $("#cityId").html("");
                    for(var i=0;i<data.length;i++){
                        //console.log(data[i].areaName);
                        $("#cityId").append("<option value='"+data[i].id+"'>"+data[i].areaName+"</option>");
                    }
                }
            });
        }else{
            $("#cityId").html("");
        }
    })
});