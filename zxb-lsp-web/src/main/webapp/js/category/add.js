$(function () {

    var $addCategoryForm = $("#addCategoryForm");
    /*var $addMsgTxt = $("#addMsgTxt");
     var $addMsg = $("#addMsg");*/
    var $saveBtn = $("#saveBtn");
    var $saveAndApplyBtn = $("#saveAndApplyBtn");

    var isApply = $("#isApply").val();
    var categoryId = $("#categoryId").val();
    var url = "../category/";
    var baseUrl = "";
    var categoryAddIndex;
    if (categoryId) {
        url = "../";
        if($("#initCount").val()){
        initCount($("#initCount").val());
        }
        //显示图片
    }
    function doAdd() {
        return $addCategoryForm.submit();
    }


    $addCategoryForm.validate({
        rules: {
            name: {
                required: true,
                noBlank:true,
                maxlength:20
            },
            pack: {required: true},
            rateHeavy: {
                required: true,
                good_num: true,
                maxlength:6
            },

            rateLight: {
                required: true,
                good_num: true,
                maxlength:6
            },
            loadUnloadType: {required: true},
            fileUrl: {required: true},
            memo:{maxlength:200}
        },
        messages: {
            name: {required: "请输入品类名",
                noBlank:"不能输入空格",
                maxlength:"最多输入20字符"},
            pack: {required: "请选择包装"},
            rateHeavy: {required: "请输入重轻比", good_num: "请输入大于零的整数",maxlength:"不能超过6位数"},
            rateLight: {required: "请输入重轻比", good_num: "请输入大于零的整数",maxlength:"不能超过6位数"},
            loadUnloadType: {required: "请选择装卸方式"},
            fileUrl: {required: "请上传图片"},
            memo:{maxlength:"不能超过200字符"}
        },
        showErrors: function (errorMap, errorList) {
            if (errorList && errorList.length > 0) {
                categoryAddIndex = layer.tips(errorList[0].message, '#' + errorList[0].element.id,{tips:[2, '#ef5b00']});
            } else {
                layer.close(categoryAddIndex);
            }
        },
        focusInvalid: true,
        submitHandler: function () {
            $.ajax({
                url: url + "add",
                type: "POST",
                data: $addCategoryForm.serialize(),
                beforeSend: function () {
                    isApply = $("#isApply").val();
                    if (isApply == "false") {
                        $saveBtn.html("请稍后...");
                        $saveBtn.unbind("click");
                    } else {
                        $saveAndApplyBtn.html("请稍后...");
                        $saveAndApplyBtn.unbind("click");
                    }
                },
                error: function () {
                    $saveBtn.html("保存");
                    $saveBtn.bind("click", function () {
                        doAdd();
                        return false;
                    });
                },
                success: function (data) {
                    if (data.status == 1) {//
                        window.parent.location.href = window.parent.document.getElementById("baseUrl").value;
                        var index = parent.layer.getFrameIndex(window.name); //获取窗口索引
                        parent.layer.close(index);
                    }else  {
                        //提示层
                        if(data.status == 400){
                            layer.tips("参数错误","#"+data.msg);
                        }else{
                            layer.msg(data.msg);
                        }
                        isApply = $("#isApply").val();
                        if (isApply == "false") {
                            $saveBtn.html("保存");
                            $saveBtn.bind("click", function () {
                                doAdd();
                                return false;
                            });
                        } else {
                            $saveAndApplyBtn.html("保存并申请");
                            $saveAndApplyBtn.bind("click", function () {
                                doAdd();
                                return false;
                            });
                        }
                    }
                },
                complete: function () {

                }
            });
        }
    });

    $saveBtn.click(function () {
        isApply = $("#isApply").val("false");
        doAdd();
        return false;
    });

    $saveAndApplyBtn.click(function () {
        isApply = $("#isApply").val("true");
        doAdd();
        return false;
    });


    //初始化上传控件
    var uploader = new plupload.Uploader({
        filters: {
            mime_types: [ //只允许上传图片和zip文件
                {title: "Image files", extensions: "jpg,gif,png,bmp"}
            ]
        },
        runtimes: 'html5,flash,silverlight,html4',
        browse_button: 'selectfiles',
        //multi_selection: false,
        container: document.getElementById('container'),
        flash_swf_url: 'lib/plupload-2.1.2/js/Moxie.swf',
        silverlight_xap_url: 'lib/plupload-2.1.2/js/Moxie.xap',
        url: 'http://oss.aliyuncs.com',

        init: {
            PostInit: function () {
                if(categoryId){

                }else{
                document.getElementById('ossfile').innerHTML = '';
                }
                document.getElementById('postfiles').onclick = function () {
                    set_upload_param(uploader, '', false);
                    return false;
                };
                document.getElementById('selectfiles').onclick = function () {
                    return false;
                };
            },

            FilesAdded: function (up, files) {
                /*if (categoryId && count == 0) {
                    $("#fileUrl").val('');//修改时，第一次选择文件将fileUrl的val置空
                }*/
                if (count + files.length <= MaxFiles) {
                    count += files.length;

                    plupload.each(files, function (file) {
                        var fileName = file.name;
                        // var suff = fileName.substring(fileName.lastIndexOf("."),fileName.length);
                        //fileName = fileName.substring(0,fileName.lastIndexOf("."));

                        if (fileName.length > 10) {
                            fileName = fileName.substring(0, 10) + "...";
                        }
                        document.getElementById('ossfile').innerHTML +=
                            '<div id="' + file.id + '">'
                            + '<div class="progress"><div class="progress-bar" style="width: 0%;"></div></div><b></b>'
                            + '<div class="fileName">'+
                            '<div onmouseover="showPic(this)" onmouseout="hidePic(this)" ' +
                            'style="width: 147px;overflow: hidden;text-overflow: ellipsis;white-space: nowrap;vertical-align: bottom;display: inline-block;">'
                            + fileName + '(' + plupload.formatSize(file.size) + ')</div><a href="javascript:void(0)" onclick="deletePic(this)">删除</a></div>'
                            + '</div>';
                    });


                } else {
                    layer.tips("最多上传" + MaxFiles + "张图片", '#selectfiles');

                }
            },

            BeforeUpload: function (up, file) {
                check_object_radio();

                set_upload_param(up, file.name, true);
            },

            UploadProgress: function (up, file) {
                var d = document.getElementById(file.id);
                if(d) {
                    d.getElementsByTagName('b')[0].innerHTML = '<span>' + file.percent + "%</span>";
                    var prog = d.getElementsByTagName('div')[0];
                    var progBar = prog.getElementsByTagName('div')[0]
                    progBar.style.width = 2 * file.percent + 'px';
                    progBar.setAttribute('aria-valuenow', file.percent);
                }

            },

            FileUploaded: function (up, file, info) {
                var d = document.getElementById(file.id);

                if (info.status == 200 && d) {
                    document.getElementById(file.id).getElementsByTagName('b')[0].innerHTML = '完成';
                    var fileName = get_uploaded_object_name(file.name);

                    if(fileName!='56123/demo/lsp/category/'){
                        if ($("#fileUrl").val()) {
                            $("#fileUrl").val($("#fileUrl").val() + "," + fileName);
                        } else {
                            $("#fileUrl").val(fileName);
                        }
                    }
                   document.getElementById(file.id).getElementsByTagName('a')[0].setAttribute("target", fileName);
                }
                else {
                    document.getElementById(file.id).getElementsByTagName('b')[0].innerHTML = info.response;
                }
            },

            Error: function (up, err) {
                //document.getElementById('console').appendChild(document.createTextNode("\nError xml:" + err.response));

                if (err.code == -602) {
                    layer.msg("请勿选择重复的图片");
                } else if (err.code == -601) {
                    layer.msg("请选择图片");
                } else {
                    layer.msg(err.message || err.response);
                }

            }
        }
    });

    uploader.init();
});

var picIndex ;
function showPic(obj){
    var $a = $(obj).next();
    var url =$a.attr("target");
    //var baseurl = "http://56123tu.oss-cn-hangzhou.aliyuncs.com/"
    var baseurl = zxb.OSS_IMG_PATH;
    //console.log(baseurl);
    if(url){
        picIndex =layer.msg("<img id='' style='max-width: 310px;max-height: 260px;' src='"+baseurl+url+"'/>",{time:-1,offset:'auto'});
    }
}

function hidePic(obj){
    if(picIndex){
    layer.close(picIndex);
    }
}
