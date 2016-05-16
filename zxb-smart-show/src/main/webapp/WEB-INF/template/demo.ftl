<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Untitled Document</title>
    <script src="${JS_PATH}/echarts.min.js"></script>
    <!-- 引主题 -->
    <script src="${JS_PATH}/macarons.js"></script>
</head>

<body>
<!-- 为 ECharts 准备一个具备大小（宽高）的Dom -->
<div id="main" style="width: 200px;height:300px;"></div>
<div id="main2" style="width: 500px;height:260px;"></div>
<div id="main3" style="width: 400px;height:260px;"></div>
<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart1 = echarts.init(document.getElementById('main'));

    // 指定图表的配置项和数据
    var option1 = {
        title: {
            show: false,
            text: 'ECharts 入门示例'
        },
        tooltip: {},
        xAxis: {
            data: ["衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子"],
            axisLine: {
                show: false
            },
            splitLine: {
                show: false
            },
            axisTick: {
                show: false
            }
        },
        yAxis: {
            axisLine: {
                show: false
            },
            splitLine: {
                show: false
            },
            axisTick: {
                show: false
            }
        },
        series: [{
            name: '销量',
            type: 'bar',
            data: [{
                value: 5,
                //自定义特殊 itemStyle，仅对该数据项有效
                itemStyle: {
                    normal: {
                        color: "#f17f37"
                    }
                }
            }, {
                value: 20,
                //自定义特殊 itemStyle，仅对该数据项有效
                itemStyle: {
                    normal: {
                        color: "#1e54a6"
                    }
                }
            }, {
                value: 36,
                //自定义特殊 itemStyle，仅对该数据项有效
                itemStyle: {
                    normal: {
                        color: "#e7493e"
                    }
                }
            }, {
                value: 10,
                //自定义特殊 itemStyle，仅对该数据项有效
                itemStyle: {
                    normal: {
                        color: "#d1774f"
                    }
                }
            }, {
                value: 10,
                //自定义特殊 itemStyle，仅对该数据项有效
                itemStyle: {
                    normal: {
                        color: "#5bec48"
                    }
                }
            }, {
                value: 20,
                //自定义特殊 itemStyle，仅对该数据项有效
                itemStyle: {
                    normal: {
                        color: "#ecac68"
                    }
                }
            }]
        }]
    };

    // 使用刚指定的配置项和数据显示图表。
    myChart1.setOption(option1);

    var myChart2 = echarts.init(document.getElementById('main2'));
    var option2 = {
        title: {
            show: false,
            text: 'ECharts 入门示例'
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
            data: ["衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子"],
            axisLine: {
                show: false
            },
            splitLine: {
                show: false
            },
            axisTick: {
                show: false
            }
        },
        series: [{
            name: '销量',
            type: 'bar',
            label: {
                normal: {
                    show: true,
                    position: "insideLeft"
                }
            },
            data: [{
                value: 5,
                //自定义特殊 itemStyle，仅对该数据项有效
                itemStyle: {
                    normal: {
                        color: "#f17f37"
                    }
                }
            }, {
                value: 20,
                //自定义特殊 itemStyle，仅对该数据项有效
                itemStyle: {
                    normal: {
                        color: "#1e54a6"
                    }
                }
            }, {
                value: 36,
                //自定义特殊 itemStyle，仅对该数据项有效
                itemStyle: {
                    normal: {
                        color: "#e7493e"
                    }
                }
            }, {
                value: 10,
                //自定义特殊 itemStyle，仅对该数据项有效
                itemStyle: {
                    normal: {
                        color: "#d1774f"
                    }
                }
            }, {
                value: 10,
                //自定义特殊 itemStyle，仅对该数据项有效
                itemStyle: {
                    normal: {
                        color: "#5bec48"
                    }
                }
            }, {
                value: 20,
                //自定义特殊 itemStyle，仅对该数据项有效
                itemStyle: {
                    normal: {
                        color: "#ecac68"
                    }
                }
            }]
        }]
    };

    myChart2.setOption(option2);


    var myChart3 = echarts.init(document.getElementById('main3'));
    var option3 = {
        title: {
            show: false,
            text: 'ECharts 入门示例'
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
            },
            inverse: true
        },

        yAxis: {
            position: "right",
            data: ["衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子"],
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
                margin: 30
            }
        },
        series: [{
            name: '销量',
            type: 'bar',
            label: {
                normal: {
                    show: true,
                    position: "right",
                    textStyle: {color: "#000"}
                }
            },
            data: [{
                value: 5,
                //自定义特殊 itemStyle，仅对该数据项有效
                itemStyle: {
                    normal: {
                        color: "#f17f37"
                    }
                }
            }, {
                value: 20,
                //自定义特殊 itemStyle，仅对该数据项有效
                itemStyle: {
                    normal: {
                        color: "#1e54a6"
                    }
                }
            }, {
                value: 36,
                //自定义特殊 itemStyle，仅对该数据项有效
                itemStyle: {
                    normal: {
                        color: "#e7493e"
                    }
                }
            }, {
                value: 10,
                //自定义特殊 itemStyle，仅对该数据项有效
                itemStyle: {
                    normal: {
                        color: "#d1774f"
                    }
                }
            }, {
                value: 10,
                //自定义特殊 itemStyle，仅对该数据项有效
                itemStyle: {
                    normal: {
                        color: "#5bec48"
                    }
                }
            }, {
                value: 20,
                //自定义特殊 itemStyle，仅对该数据项有效
                itemStyle: {
                    normal: {
                        color: "#ecac68"
                    }
                }
            }]
        }]
    };

    myChart3.setOption(option3);

</script>
</body>
</body>

</html>
