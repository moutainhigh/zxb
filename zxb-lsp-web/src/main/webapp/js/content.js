var $parentNode = window.parent.document;

function $childNode(name) {
    return window.frames[name]
}

// tooltips
$('.tooltip-demo').tooltip({
    selector: "[data-toggle=tooltip]",
    container: "body"
});
// 使用animation.css修改Bootstrap Modal
$('.modal').appendTo("body");

$("[data-toggle=popover]").popover();

//折叠ibox
$('.collapse-link').click(function () {
    var ibox = $(this).closest('div.ibox');
    var button = $(this).find('i');
    var content = ibox.find('div.ibox-content');
    content.slideToggle(200);
    button.toggleClass('fa-chevron-up').toggleClass('fa-chevron-down');
    ibox.toggleClass('').toggleClass('border-bottom');
    setTimeout(function () {
        ibox.resize();
        ibox.find('[id^=map-]').resize();
    }, 50);
});

//关闭ibox
$('.close-link').click(function () {
    var content = $(this).closest('div.ibox');
    content.remove();
});

//判断当前页面是否在iframe中
/*if (top == this) {
    var gohome = '<div class="gohome"><a class="animated bounceInUp" href="index.html?v=4.0" title="返回首页"><i class="fa fa-home"></i></a></div>';
    $('body').append(gohome);
}
*/
//animation.css
function animationHover(element, animation) {
    element = $(element);
    element.hover(
        function () {
            element.addClass('animated ' + animation);
        },
        function () {
            //动画完成之前移除class
            window.setTimeout(function () {
                element.removeClass('animated ' + animation);
            }, 2000);
        });
}

//拖动面板
function WinMove() {
    var element = "[class*=col]";
    var handle = ".ibox-title";
    var connect = "[class*=col]";
    $(element).sortable({
            handle: handle,
            connectWith: connect,
            tolerance: 'pointer',
            forcePlaceholderSize: true,
            opacity: 0.8,
        })
        .disableSelection();
};


//地区三级级联
$("#consigner-province-name").bsSuggest({
    url: zxb.APP_PATH + "/area/0/children",
    effectiveFields: ['areaName'],
    idField: "id",
    keyField: "areaName"
}).on('onSetSelectValue', function (e, keyword) {
    $("#consigner-city-name").bsSuggest("destroy");
    $('#consigner-province-id').val(keyword.id);
    $('#consigner-city-id').val('');
    $('#consigner-city-name').val('');
    $('#consigner-country-id').val('');
    $('#consigner-country-name').val('');

    $("#consigner-city-name").bsSuggest({
        url: zxb.APP_PATH + "/area/"+keyword.id+"/children",
        effectiveFields: ['areaName'],
        idField: "id",
        keyField: "areaName"
    }).on('onSetSelectValue', function (e, keyword) {
        $("#consigner-country-name").bsSuggest("destroy");
        $('#consigner-city-id').val(keyword.id);
        $('#consigner-country-id').val('');
        $('#consigner-country-name').val('');
        $("#consigner-country-name").bsSuggest({
            url: zxb.APP_PATH + "/area/"+keyword.id+"/children",
            effectiveFields: ['areaName'],
            idField: "id",
            keyField: "areaName"
        }).on('onSetSelectValue', function (e, keyword) {
            $('#consigner-country-id').val(keyword.id);
        });
    });
});