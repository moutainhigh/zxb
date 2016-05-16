//基础信息10S更新一次
var baseDateTime = 10;
//图标3分钟更新一次
var chartTime = 180;
//地图的货物轨迹清理为10s
var mapTime = 5 * 2;
var mapIntervalId;
//初始化地图id
var maxId = 0;
//地图
var mapChart;
//目的区域
var destinationChart;
//发货区
var deliveryChart;
//专线
var lineChart;
//货物品类
var goodCategoryChart;

//页面刷新时间的定义
//window.setInterval(function () {
//    location.reload();
//}, 180 * 1000);

var geoCoordMap = {};
var convertData = function (data) {
    var res = [];
    for (var i = 0; i < data.length; i++) {
        var dataItem = data[i];
        var fromCoord = geoCoordMap[dataItem[0].name];
        var toCoord = geoCoordMap[dataItem[1].name];
        if (fromCoord && toCoord) {
            res.push([{
                coord: fromCoord
            }, {
                coord: toCoord
            }]);
        }
    }
    return res;
};

$(function () {
    $.get("../smart/getItude", function (data) {
        var map = {};
        for (var i = 0; i < data.length; i++) {

            var name = data[i].cityName;
            map[name] = [data[i].longitude, data[i].latitude]
        }
        geoCoordMap = map;
        //console.log(map);
        init();
    });

    //

});


function init() {
    mapChart = echarts.init(document.getElementById('map'));
    // 基于准备好的dom，初始化echarts实例
    destinationChart = echarts.init(document.getElementById('destinationArea'));
    // 基于准备好的dom，初始化echarts实例
    deliveryChart = echarts.init(document.getElementById('deliveryArea'));
    // 基于准备好的dom，初始化echarts实例
    lineChart = echarts.init(document.getElementById('lineSuppliers'));
    // 基于准备好的dom，初始化echarts实例
    goodCategoryChart = echarts.init(document.getElementById('goodCategory'));
    //地图
    centerMap();
    //getMaxId();
    //目的区域排行（交易额）
    destinationArea();
    //发货区域排行（交易额）
    deliveryArea();
    //专线排行（交易额）
    lineSuppliers();
    //货物品类分布
    goodCategory();
    //定时更新基础参数 5秒
    window.setInterval(showBaseDate, baseDateTime * 1000);

    //目的区域排行（交易额）
    window.setInterval(destinationArea, chartTime * 1000);

    //发货区域排行（交易额）
    window.setInterval(deliveryArea, chartTime * 1000);
    //专线排行（交易额）
    window.setInterval(lineSuppliers, chartTime * 1000);
    //地图
    // mapIntervalId =  window.setInterval(centerMap, mapTime * 1000+getRandomTime());
    //货物品类分布
    window.setInterval(goodCategory, chartTime * 1000);
    //
    //window.setInterval(function () {
    //    window.location.reload();
    //}, 300 * 1000);
}
/**获取最近一次运单id*/
//function getMaxId() {
//    if ($.cookie('smartShowmaxId')) {
//        maxId = parseInt($.cookie('smartShowmaxId'));
//    } else {
//        $.get("../smart/deliveryMap", function (data) {
//            maxId = data.id;
//        });
//    }
//}

//获取地图数据的随机时间（20-36S）
function getRandomTime() {
    return Math.floor(Math.random() * 5 + 11) * 1000;
}

function getCityItude() {
    $.get("../smart/getItude", function (data) {
        var map = {};
        for (var i = 0; i < data.length; i++) {

            var name = data[i].cityName;
            map[name] = [data[i].longitude, data[i].latitude]
        }
        geoCoordMap = map;
        //console.log(map);
    });
}

/**刷新基础信息*/
function showBaseDate() {
    //Date.parse(new Date())
    $.get("../smart/baseData", function (data) {
        $("#totalDeal").text(data.totalDeal);
        $("#totalFee").text(data.totalFee);
        $("#totalVolume").text(data.totalVolume);
        $("#totalWeight").text(data.totalWeight);
        $("#totalDealMonth").text(data.totalDealMonth);
        $("#totalFeeMonth").text(data.totalFeeMonth);
        $("#transportCenterCount").text(data.transportCenterCount);
        $("#serviceBranchCount").text(data.serviceBranchCount);
        $("#lineSuppliersCount").text(data.lineSuppliersCount);
    });
}

/**目的区域排行（交易额）*/
function destinationArea() {
    var areaData = [];
    var feeData = [];
    $.get("../smart/destinationArea", {date: new Date()}, function (data) {
        //var color = ["#f17f37", "#1e54a6", "#e7493e", "#d1774f", "#5bec48", "#ecac68", "#ecac68", "#ecac68", "#ecac68", "#f17f37",];
        var color = ["#f17f37", "#1e54a6", "#e7493e", "#d1774f", "#5bec48", "#FFDEAD", "#FAF0E6", "#BA55D3", "#4169E1", "#87CEEB",];
        for (var i = 0; i < data.length; i++) {
            areaData[i] = data[i].consigneeArea;
            var obj = {
                value: parseInt(data[i].totalFee),
                //自定义特殊 itemStyle，仅对该数据项有效
                itemStyle: {
                    normal: {
                        color: color[i]
                    }
                }
            };
            feeData[i] = obj;
        }

        var series1 = [{
            name: '销量',
            type: 'bar',
            label: {
                normal: {
                    show: true,
                    formatter: '{c}',//显示的值
                    position: "top",
                    textStyle: {
                        color: 'white',
                        fontWeight: 'bold',
                        fontSize: 12
                    }
                    //{a}：series的name属性
                    //{b}：当前数据的name
                    //{c}：当前数据的value
                    //{d}：当前数据的百分比
                }
            },
            data: feeData
        }];
        var option1 = {
            title: {
                show: false,
                text: '目的区域排行（交易额）'
            },
            tooltip: {},
            xAxis: {
                data: areaData,
                axisLine: {
                    show: true
                },
                splitLine: {
                    show: false
                },
                axisTick: {
                    show: true
                },
                axisLabel: {
                    show: true,
                    textStyle: {
                        color: '#f6e526'
                    },
                    interval: 0,//字体显示的样式定义
                    rotate: 45,
                    margin: 1
                }
            },
            yAxis: {
                axisLine: {// 轴线
                    show: true,
                    lineStyle: {
                        type: 'solid',
                        width: 1
                    }
                },
                splitLine: {
                    show: false
                },
                axisTick: {// 轴标记
                    show: true
                },
                axisLabel: {
                    show: true,
                    textStyle: {
                        color: '#f6e526',
                        align: 'right',
                        fontSize: 10
                    },
                    interval: 0,// 0全部显示   auto:自动隐藏显示不下的  {number}:用户指定选择间隔
                    rotate: 30,
                    margin: 2
                },
                calculable: true,
                splitNumber: 4//y轴刻度分段默认为5
            },
            series: series1
        };
        destinationChart.setOption(option1);
        //echarts生成的图表大小怎么随屏幕的大小改变自适应
        window.onresize = destinationChart.resize;
    });

}

/**发货区域排行（交易额）*/
function deliveryArea() {
    var deliverys = [];
    var sales = [];
    var color = ["#f17f37", "#00CCFF", "#0099CC", "#FF9900", "#006699"];
    //var color = ["#f17f37", "#1e54a6", "#e7493e", "#d1774f", "#5bec48"]
    $.get("../smart/deliveryArea", {date: new Date()}, function (data) {
        for (var i = 0; i < data.length; i++) {
            deliverys[i] = data[i].consignerArea
            var obj = {
                value: parseInt(data[i].totalFee),
                //自定义特殊 itemStyle，仅对该数据项有效
                itemStyle: {
                    normal: {
                        color: color[i],
                        label: {
                            show: true,
                            formatter: function (c) {
                                return c.name + '               ' + c.value;
                            },
                            //formatter: '{c}        '+data[i].consignerArea,//显示的值
                            position: 'insideLeft',//insideLeft
                            textStyle: {
                                color: 'white'
                            }
                            //{a}：series的name属性
                            //{b}：当前数据的name
                            //{c}：当前数据的value
                            //{d}：当前数据的百分比
                        },
                    }
                }
            };
            sales[i] = obj;
        }
        var series = [{
            name: '销量',
            type: 'bar',
            data: sales
        }];
        var option = {
            title: {
                show: false,
                text: '发货区域排行'
            },
            tooltip: {},
            xAxis: {
                axisLine: {
                    show: false
                },
                splitLine: {
                    show: false
                },
                axisTick: {
                    show: false
                },
                axisLabel: {
                    show: false
                }
            },
            yAxis: {
                data: deliverys,
                axisLine: {
                    show: false
                },
                splitLine: {
                    show: false
                },
                axisTick: {
                    show: true
                },
                axisLabel: {
                    show: false,
                    textStyle: {
                        color: '#f6e526',
                        align: 'right'
                    },
                    interval: 0,//间隔
                    rotate: 0,//旋转
                    margin: -1// 边缘
                }
            },
            series: series
        };


        // 使用刚指定的配置项和数据显示图表。
        deliveryChart.setOption(option);
        //echarts生成的图表大小怎么随屏幕的大小改变自适应
        window.onresize = deliveryChart.resize;
    });

}

/**物流专线排行（交易额）*/
function lineSuppliers() {
    var lines = [];
    var sales = [];
    var color = ["#f17f37", "#00CCFF", "#0099CC", "#FF9900", "#006699"];
    //var color = ["#f17f37", "#1e54a6", "#e7493e", "#d1774f", "#5bec48"];
    $.get("../smart/lineSuppliers", {date: new Date()}, function (data) {
        for (var i = 0; i < data.length; i++) {
            var str = '                         ';
            var ss = '';
            lines[i] = data[i].shipers;
            var obj = {
                value: parseInt(data[i].totalFee),
                //自定义特殊 itemStyle，仅对该数据项有效
                itemStyle: {
                    normal: {
                        color: color[i],
                        label: {
                            show: true,
                            formatter: function (c) {
                                var name = c.name;
                                var char = name.match(/[^\x00-\xff]/ig);
                                var nameLength = name.length + (char == null ? 0 : char.length * 2.5);
                                ss = str.substring(nameLength, str.length);
                                return name + ss + c.value;
                            },
                            position: 'insideLeft',//insideLeft  insideRight insideTop
                            textStyle: {
                                color: 'white'
                            }
                            //{a}：series的name属性
                            //{b}：当前数据的name
                            //{c}：当前数据的value
                            //{d}：当前数据的百分比
                        },
                    }
                }
            };
            sales[i] = obj;
        }
        var series = [{
            name: '销量',
            type: 'bar',
            data: sales
        }];

        var option = {
            title: {
                show: false,
                text: '专线排行（交易额）'
            },
            tooltip: {},
            xAxis: {
                axisLine: {
                    show: false
                },
                splitLine: {
                    show: false
                },
                axisTick: {
                    show: false
                },
                axisLabel: {
                    show: false
                }
            },

            yAxis: {
                data: lines,
                axisLine: {
                    show: false
                },
                splitLine: {
                    show: false
                },
                axisTick: {
                    show: false
                },
                axisLabel: {
                    show: false,
                    textStyle: {
                        color: '#f6e526',
                        align: 'right'
                    },
                    interval: 0,//间隔
                    rotate: 0,//旋转
                    margin: 0// 边缘
                }
            },
            series: series
        };


        // 使用刚指定的配置项和数据显示图表。
        lineChart.setOption(option);

    });

}

/** 货物品类分布*/
function goodCategory() {
    var color = ["#ecac68", "#f17f37", "#0099FF", "#FFCC00", "#FF6633", "#006699", "#FF6633", "#006699", "#FF9966", "#5bec48", "#f17f37", "#0099FF", "#f17f37", "#ecac68", "#006699", "#e7493e"];
    //var color = ["#f17f37", "#1e54a6", "#e7493e", "#ecac68", "#e7493e", "#ecac68", "#f17f37", "#f17f37"];
    var sales = [];
    var goodCategorys = [];
    $.get("../smart/goodCategory", {date: new Date()}, function (data) {
        for (var i = 0; i < data.length; i++) {
            goodCategorys[i] = data[i].categoryName;
            var obj = {
                value: data[i].categoryRate,
                //自定义特殊 itemStyle，仅对该数据项有效
                itemStyle: {
                    normal: {
                        color: color[i],
                        label: {
                            show: true,
                            formatter: function (c) {
                                var value = c.value;
                                if (value > 5) {
                                    return value + "%";
                                } else {
                                    return value + "%" + '      ';
                                }
                            },
                            //position: position,
                            textStyle: {
                                color: 'white',
                                fontWeight: 'bold',
                                fontSize: 0
                            }
                            //{a}：series的name属性
                            //{b}：当前数据的name
                            //{c}：当前数据的value
                            //{d}：当前数据的百分比
                        },
                    }
                }
            };
            sales[i] = obj;
        }
        var series = [
            {
                name: '占比(%)',
                type: 'bar',
                data: sales
            }
        ]
        var option = {
            tooltip: {
                trigger: 'axis',
                axisPointer: {            // 坐标轴指示器，坐标轴触发有效
                    type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                }
            },
            grid: {
                left: '3%',
                right: '4%',
                bottom: '3%',
                containLabel: true
            },
            xAxis: [
                {

                    axisLine: {
                        show: false
                    },
                    splitLine: {
                        show: false
                    },
                    axisTick: {
                        show: false
                    },
                    axisLabel: {
                        show: false
                    },
                    inverse: true
                },
            ],
            yAxis: [
                {
                    position: "right",
                    axisTick: {show: false},
                    data: goodCategorys,
                    axisLine: {
                        show: false
                    },
                    splitLine: {
                        show: false
                    },
                    axisTick: {
                        show: false
                    },
                    axisLabel: {
                        show: true,
                        textStyle: {
                            color: '#f6e526',
                            align: 'left'
                        },
                        interval: 0//间隔
                    }
                }
            ],
            series: series
        };

        // 使用刚指定的配置项和数据显示图表。
        goodCategoryChart.setOption(option);
    })
}
//var idIdx = 974;
/** 地图信息*/
function centerMap() {
    //970   105549
    $.get("../smart/deliveryMap", {date: new Date()}, function (data) {
        //如果没有数据初始化地图
        //console.log("此时clearMapFlag为："+clearMapFlag);
        if (data.datas.length == 0) {
            mapChart.dispose();
            //console.log("服务端没数据或清理轨迹进来");
            mapChart = echarts.init(document.getElementById('map'));
            data.datas = [];
            data.senders = [];
        }
        //$.cookie('smartShowmaxId', data.id, {expires: 100 * 365});
        //maxId = data.id;
        //发货地区  ----->   该发货地区的全部集合（发货--->收货）
        var baseData = [];
        //发货区域
        var senders = data.senders;
        //区域信息
        var datas = data.datas;
        var areaFeeOutputs = data.areaFeeOutputs;
        for (var i = 0; i < datas.length; i++) {
            var obj = [];

            //console.log("senders[i]===" + senders[i]);
            obj.push(senders[i]);
            obj.push(datas[i]);
            baseData.push(obj);
        }
        //var planePath = 'path://m 247.71105,698.78354 c -1.28735,-2.26644 -6.88145,-20.78844 -8.23878,-27.27849 -2.10313,-10.0561 -2.97034,-25.76818 -1.61287,-29.22207 0.69662,-1.77245 2.04154,-2.9188 3.85521,-3.28598 7.84933,-1.58913 13.61442,-3.95662 21.7364,-8.92625 6.76857,-4.14153 9.27075,-5.21157 10.26233,-4.38863 1.04652,0.86854 1.25834,8.38123 1.04897,37.20561 l -0.26233,36.11732 -13.17337,0.27849 c -7.24536,0.15317 -13.37236,-0.0718 -13.61556,-0.5 z m 40.89592,-0.86028 c -0.33385,-0.86998 -0.60699,-75.93397 -0.60699,-166.80887 0,-130.60801 0.26191,-165.5834 1.25,-166.92769 1.16046,-1.57879 6.65831,-1.68202 76.75,-1.44113 l 75.5,0.25948 0.25291,168.25 0.2529,168.25 -76.39591,0 c -68.7406,0 -76.45675,-0.1585 -77.00291,-1.58179 z m -62.30715,-74.21525 c -6.58262,-2.35686 -12.00365,-6.10982 -17.84319,-12.35276 -7.40465,-7.91617 -8.924,-12.30859 -8.94165,-25.8502 -0.0136,-10.43787 0.2358,-12.03527 2.70051,-17.29551 3.3239,-7.09394 12.42393,-16.41079 19.28449,-19.74397 6.48809,-3.15221 17.93024,-3.84949 25.77003,-1.5704 27.51599,7.99912 35.819,44.49508 15.14999,66.59193 -9.45109,10.10398 -24.52975,14.37078 -36.12018,10.22091 z m 39.14475,-83.26622 c -2.23047,-1.65673 -9.19605,-4.82299 -15.47907,-7.03613 -6.28302,-2.21314 -11.74316,-4.54083 -12.13364,-5.17264 -0.73348,-1.18678 -0.0379,-200.58398 0.71282,-204.33511 0.32694,-1.63367 2.45244,-2.83357 9.45927,-5.33997 19.99711,-7.15315 33.66217,-21.27549 38.41184,-39.69724 3.18143,-12.33928 1.56735,-23.71909 -5.37695,-37.90943 -6.9207,-14.14208 -13.55976,-19.68164 -31.03886,-25.89848 -4.125,-1.46715 -8.5125,-3.32596 -9.75,-4.13069 -2.86361,-1.86218 -2.96448,-6.27303 -0.21104,-9.22849 2.03421,-2.18347 2.13536,-2.18856 43.52173,-2.18856 l 41.48278,0 26.22827,10.40563 c 36.79471,14.59769 40.9408,16.58417 43.60244,20.8908 2.74494,4.4414 3.57576,11.61249 5.52678,47.70357 2.96712,54.8876 2.93963,53.51655 1.10976,55.34642 -1.48851,1.48851 -6.3132,1.66153 -48.33215,1.73319 -48.71186,0.0831 -75.4631,0.87175 -76.85763,2.26588 -0.45152,0.45139 -1.1442,45.44581 -1.5393,99.98761 -0.3951,54.54179 -1.10247,100.5169 -1.57192,102.1669 -1.12909,3.96844 -2.87794,4.0668 -7.76513,0.43674 z m 113.05541,-243.79527 6,-0.64147 0.33147,-9.5 c 0.50858,-14.57572 -2.66339,-47.88644 -4.97556,-52.25135 -1.66015,-3.13403 -19.7059,-11.04914 -41.66124,-18.2732 -12.96279,-4.2652 -16.21804,-4.27332 -17.34085,-0.0433 -1.79876,6.77668 5.27283,75.60564 8.12035,79.0367 0.64793,0.7807 2.8313,1.59394 4.85194,1.80718 6.12897,0.64683 38.2706,0.54998 44.67389,-0.1346 z m -149.88226,8.80743 c -10.58555,-2.65195 -21.93479,-11.77523 -26.5767,-21.36412 -7.13186,-14.73246 -3.02268,-36.12234 9.01934,-46.94915 7.48062,-6.72573 14.20594,-9.02765 26.43962,-9.04969 8.70175,-0.0157 10.73421,0.32179 15.65538,2.59939 7.21346,3.33849 12.9642,9.28086 17.08792,17.65732 3.08674,6.27006 3.25522,7.19045 3.22825,17.63632 -0.0349,13.52886 -2.19355,19.86736 -9.48175,27.84181 -8.59525,9.40457 -24.01453,14.47347 -35.37206,11.62812 z';
        var planePath = 'path://M493.049393 94.132914 68.514443 284.053428l444.647009 185.455829 433.467389-183.217858L493.049393 94.132914 493.049393 94.132914 493.049393 94.132914 493.049393 94.132914zM66.281589 746.574526l420.064125 196.624193L486.345714 507.494383 66.281589 335.446935 66.281589 746.574526 66.281589 746.574526 66.281589 746.574526 66.281589 746.574526zM198.110033 480.68376l167.58174 78.202083 0 60.33004-167.58174-78.202083L198.110033 480.68376 198.110033 480.68376 198.110033 480.68376 198.110033 480.68376zM539.972075 507.494383l0 435.70536 420.064125-207.794603L960.036199 326.509379 539.972075 507.494383 539.972075 507.494383 539.972075 507.494383 539.972075 507.494383zM539.972075 507.494383';
        //var color = ['#1945F8', '#49C849', '#59A4B8', '#19F8F8', '#808790', '#F0DB14'];
        //var color = ['#FF9900', '#00CCFF', '#5bec48', '#4169E1', '#ff33cc', '#00ffff'];
        //var color = ['#FF9900', '#00CCFF', '#5bec48', '#4169E1', '#ff33cc', '#00ffff'];

        var color = ['#00BFFF', '#FF1493', '#FF4500', '#FFFF00', '#59A4B8', '#008000', '#00FF00', '#19F8F8', '#DC143C', '#FF9900'];
        // 	#FF0000  #008000   	#FFFF00
        var series = [];
        //地图显示收货量
        var feeData = [];

        for (var i = 0; i < areaFeeOutputs.length; i++) {
            var provice = areaFeeOutputs[i].consigneeArea + '';
            provice = provice.replace("省", "");
            obj = {
                name: provice,
                value: parseInt(areaFeeOutputs[i].totalFee)
            };
            feeData[i] = obj;
        }

        //series.push({
        //    name: '收货量',
        //    type: 'map',
        //    mapType: 'china',
        //    roam: false,
        //    label: {
        //        normal: {
        //            show: false,
        //
        //        },
        //        emphasis: {
        //            show: true
        //        }
        //    },
        //    data: feeData,
        //    itemStyle: {
        //        color: '#f60',
        //        normal: {
        //            areaColor: 'rgba(255,255,255,0)',
        //            borderColor: '#3244CF',
        //
        //        },
        //        emphasis: {
        //            areaColor: '#C27585'
        //        }
        //    }
        //});
        baseData.forEach(function (item, i) {
            series.push({
                    name: item[0] + ' 发出',
                    type: 'lines',
                    zlevel: 1,
                    effect: {
                        show: true,
                        period: 5,
                        trailLength: 0.6,//轨迹0.7
                        color: '#ffffff',//#fff
                        symbolSize: 3
                    },
                    lineStyle: {
                        normal: {
                            color: color[i],
                            width: 0,
                            curveness: 0.2
                        }
                    },
                    data: convertData(item[1])
                },
                {
                    name: item[0] + ' 发出',
                    type: 'lines',
                    zlevel: 2,
                    effect: {
                        show: true,
                        period: 5,//5s
                        trailLength: 0,
                        symbol: planePath,
                        symbolSize: 15
                    },
                    lineStyle: {
                        normal: {
                            color: color[i],
                            width: 1,
                            opacity: 0.4,
                            curveness: 0.2
                        }
                    },
                    data: convertData(item[1])
                },
                {
                    name: item[0] + ' 发出',
                    type: 'effectScatter',
                    coordinateSystem: 'geo',
                    zlevel: 2,
                    rippleEffect: {
                        brushType: 'stroke'
                    },
                    label: {
                        normal: {
                            show: true,
                            position: 'right',
                            formatter: '{b}'
                        }
                    },
                    symbolSize: function (val) {
                        return val[2] / 8;
                    },
                    itemStyle: {
                        normal: {
                            color: color[i]
                        }
                    },
                    data: item[1].map(function (dataItem) {
                        return {
                            name: dataItem[1].name,
                            value: geoCoordMap[dataItem[1].name].concat([dataItem[1].value])
                        };
                    })
                });
        });

        var option = {
            backgroundColor: 'rgba(1,1,1,0)',
            //visualMap: {
            //    min: 0,
            //    max: 1000,
            //    right: '120',
            //    top: '300',
            //    text: ['收货量高', '收货量低'], // 文本，默认为数值文本
            //    calculable: false,
            //    //color: ['rgba(255,0,255,0.8)','rgba(255,255,255,0.6)'],
            //    color: ['rgba(237,109,0,1)','rgba(255,255,255,1)'],
            //    //'rgba(237,109,0,1)' 橘色：#ed6d00
            //    //
            //    //color: ['rgba(255,255,0,0.6)','rgba(65,105,225,0.8)'],
            //    itemStyle: {
            //        normal: {
            //            backgroundColor: 'rgba(1,1,1,0)',
            //            color: '#000'
            //        },
            //
            //    },
            //    textStyle: {color: '#fff'}
            //},
            tooltip: {
                trigger: 'item'
            },
            //legend: {
            //    show:false,
            //    orient: 'vertical',//vertical  horizontal
            //    top: 'bottom',
            //    left: 'right',
            //    data: [''],
            //    textStyle: {
            //        color: '#fff'
            //    },
            //    selectedMode: 'single',//multiple  single
            //},
            geo: {
                map: 'china',
                label: {
                    normal: {
                        show: true,
                        textStyle: {
                            color: '#fff'
                        },
                    },
                    emphasis: {
                        show: true,//鼠标点击显示省份
                        textStyle: {
                            color: '#fff'
                        },
                    }
                },
                roam: false,
                itemStyle: {
                    normal: {
                        areaColor: 'rgba(255,255,255,0)',
                        borderColor: '#3244CF'
                    },
                    emphasis: {
                        areaColor: '#C27585'
                    }
                }
            },
            series: series
        };
        //地图填充
        mapChart.setOption(option);
        //15秒 清除轨迹
        window.setTimeout(function () {
            clareCenterMap();
        }, mapTime * 1000);
    });
}

function clareCenterMap() {
    mapChart.dispose();
    //console.log("服务端没数据或清理轨迹进来");
    //mapChart = echarts.show(document.getElementById('map'));
    mapChart = echarts.init(document.getElementById('map'));
    var series = [];
    var option = {
        backgroundColor: 'rgba(1,1,1,0)',
        tooltip: {
            trigger: 'item'
        },
        geo: {
            map: 'china',
            label: {
                normal: {
                    show: true,
                    textStyle: {
                        color: '#fff'
                    },
                },
                emphasis: {
                    show: true,//鼠标点击显示省份
                    textStyle: {
                        color: '#fff'
                    },
                }
            },
            roam: false,
            itemStyle: {
                normal: {
                    areaColor: 'rgba(255,255,255,0)',
                    borderColor: '#3244CF'
                },
                emphasis: {
                    areaColor: '#C27585'
                }
            }
        },
        series: series
    };
    //地图填充
    mapChart.setOption(option);
};

//10-40s 请求数据
window.clearInterval(mapIntervalId);
var randomTime = getRandomTime();
//console.log("randomTime :"+randomTime);
mapIntervalId = window.setInterval(centerMap, randomTime);