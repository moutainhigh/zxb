accessid = ''
accesskey = ''
host = ''
policyBase64 = ''
signature = ''
callbackbody = ''
filename = ''
key = ''
expire = 0
count =0
/**最多上传10张图片*/
MaxFiles=10
g_object_name = ''
g_object_name_type = ''
now = timestamp = Date.parse(new Date()) / 1000;

function initCount(c){
    count =parseInt(c);
}


function deletePic(obj){
    var conIndex = layer.confirm('确认删除么？', {
        icon:3,title:"提示",btn: ['确认','取消'] //按钮
    }, function(){
        var thePicUrl = $(obj).attr("target");
        if($("#fileUrl").val()){
            var urls = $("#fileUrl").val().split(",");
            for(var i=0;i<urls.length;i++){
                if(urls[i]==thePicUrl){
                    urls. splice(i,1);
                }
            }
            var newUrl = '';
            for(var i=0;i<urls.length;i++){
                if(urls[i]!=''){
                    newUrl+= urls[i]+",";
                }
            }
            /*if(newUrl.length <= 10){
             newUrl='';
             }*/
            //newUrl.substring(0,newUrl.length-2);
            $("#fileUrl").val(newUrl);
        }
        $(obj).parent().parent().remove();
        count--;
        layer.close(conIndex);

    }, function(){

    });
}



function send_request() {
    var xmlhttp = null;
    if (window.XMLHttpRequest) {
        xmlhttp = new XMLHttpRequest();
    }
    else if (window.ActiveXObject) {
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }

    if (xmlhttp != null) {
        phpUrl = zxb.OSS_PATH+'?subDir=/lsp/category';
        xmlhttp.open("GET", phpUrl, false);
        xmlhttp.send(null);
        return xmlhttp.responseText
    }
    else {
        alert("Your browser does not support XMLHTTP.");
    }
};

function check_object_radio() {
    var tt = document.getElementsByName('myradio');
    for (var i = 0; i < tt.length; i++) {
        if (tt[i].checked) {
            g_object_name_type = tt[i].value;
            break;
        }
    }
}

function get_signature() {
    //可以判断当前expire是否超过了当前时间,如果超过了当前时间,就重新取一下.3s 做为缓冲
    now = timestamp = Date.parse(new Date()) / 1000;
    if (expire < now + 3) {
        body = send_request()
        var obj = eval("(" + body + ")");
        host = obj['host']
        policyBase64 = obj['policy']
        accessid = obj['accessid']
        signature = obj['signature']
        expire = parseInt(obj['expire'])
        callbackbody = obj['callback']
        key = obj['dir']
        return true;
    }
    return false;
};

function random_string(len) {
    len = len || 32;
    var chars = 'ABCDEFGHJKMNPQRSTWXYZabcdefhijkmnprstwxyz2345678';
    var maxPos = chars.length;
    var pwd = '';
    for (i = 0; i < len; i++) {
        pwd += chars.charAt(Math.floor(Math.random() * maxPos));
    }
    return pwd;
}

function get_suffix(filename) {
    pos = filename.lastIndexOf('.')
    suffix = ''
    if (pos != -1) {
        suffix = filename.substring(pos)
    }
    return suffix;
}


function uuid() {
    var s = [];
    var hexDigits = "0123456789abcdef";
    for (var i = 0; i < 36; i++) {
        s[i] = hexDigits.substr(Math.floor(Math.random() * 0x10), 1);
    }
    s[14] = "4"; // bits 12-15 of the time_hi_and_version field to 0010
    s[19] = hexDigits.substr((s[19] & 0x3) | 0x8, 1); // bits 6-7 of the clock_seq_hi_and_reserved to 01
    s[8] = s[13] = s[18] = s[23] = "-";

    var uuid = s.join("");
    return uuid;
}

function calculate_object_name(filename) {
    /*if (g_object_name_type == 'local_name') {
        g_object_name += "${filename}"
    }*/
    //else if (g_object_name_type == 'random_name') {
        suffix = get_suffix(filename)
        g_object_name = key + uuid() + suffix
   // }
   // return ''
}

function get_uploaded_object_name(filename) {
   /* if (g_object_name_type == 'local_name') {
        tmp_name = g_object_name
        tmp_name = tmp_name.replace("${filename}", filename);
        return tmp_name
    }*/
   // else if (g_object_name_type == 'random_name') {
        return g_object_name
    //}
}



function set_upload_param(up, filename, ret) {
    if (ret == false) {
        ret = get_signature()
    }
    g_object_name = key;
    if (filename != '') {
        suffix = get_suffix(filename)
        calculate_object_name(filename)
    }
    new_multipart_params = {
        'key': g_object_name,
        'policy': policyBase64,
        'OSSAccessKeyId': accessid,
        'success_action_status': '200', //让服务端返回200,不然，默认会返回204
        'callback': callbackbody,
        'signature': signature,
    };

    up.setOption({
        'url': host,
        'multipart_params': new_multipart_params
    });

    up.start();
}

/*
var uploader = new plupload.Uploader({
    runtimes: 'html5,flash,silverlight,html4',
    browse_button: 'selectfiles',
    //multi_selection: false,
    container: document.getElementById('container'),
    flash_swf_url: 'lib/plupload-2.1.2/js/Moxie.swf',
    silverlight_xap_url: 'lib/plupload-2.1.2/js/Moxie.xap',
    url: 'http://oss.aliyuncs.com',

    init: {
        PostInit: function () {
            document.getElementById('ossfile').innerHTML = '';
            document.getElementById('postfiles').onclick = function () {
                set_upload_param(uploader, '', false);
                return false;
            };
            document.getElementById('selectfiles').onclick = function () {
                alert(11);
                return false;
            };
        },

        FilesAdded: function (up, files) {
           if(count+files.length<=MaxFiles){
            count+=files.length;
            $("#errorMsg").text('');
            plupload.each(files, function (file) {
                document.getElementById('ossfile').innerHTML += '<div id="' + file.id + '">' + file.name + ' (' + plupload.formatSize(file.size) + ')<b></b>'
                    + '<div class="progress"><div class="progress-bar" style="width: 0%"></div></div>'
                    + '</div>';
            });
           }else{
               $("#errorMsg").text("最多上传"+MaxFiles+"张图片");
           }
        },

        BeforeUpload: function (up, file) {
            check_object_radio();

            set_upload_param(up, file.name, true);
        },

        UploadProgress: function (up, file) {
            var d = document.getElementById(file.id);
            d.getElementsByTagName('b')[0].innerHTML = '<span>' + file.percent + "%</span>";
            var prog = d.getElementsByTagName('div')[0];
            var progBar = prog.getElementsByTagName('div')[0]
            progBar.style.width = 2 * file.percent + 'px';
            progBar.setAttribute('aria-valuenow', file.percent);
        },

        FileUploaded: function (up, file, info) {
            if (info.status == 200) {
                document.getElementById(file.id).getElementsByTagName('b')[0].innerHTML = '完成';
                if($("#fileUrl").val()) {
                    $("#fileUrl").val($("#fileUrl").val()+","+get_uploaded_object_name(file.name));
                }else{
                    $("#fileUrl").val(get_uploaded_object_name(file.name));
                }
            }
            else {
                document.getElementById(file.id).getElementsByTagName('b')[0].innerHTML = info.response;
            }
        },

        Error: function (up, err) {
            document.getElementById('console').appendChild(document.createTextNode("\nError xml:" + err.response));
        }
    }
});

uploader.init();*/
