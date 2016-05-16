[#escape x as x?html]
    [#include "../_layout.ftl" /]
    [@mainLayout]
    <div class="wrapper wrapper-content">
        <div class="row">
            <div class="col-sm-12">
                <div class="alert alert-danger">
                    您没有当前模块操作权限!
                </div>
            </div>
        </div>
    </div>
    [/@mainLayout]
[/#escape]
