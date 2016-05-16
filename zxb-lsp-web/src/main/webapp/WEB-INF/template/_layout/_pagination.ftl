<#function getPageUrl baseUrl pageNum>
    <#if baseUrl?contains("?")>
        <#local pageUrl = baseUrl+"&pageNo="+pageNum >
    <#else>
        <#local pageUrl = baseUrl+"?pageNo="+pageNum >
    </#if>
    <#return pageUrl>
</#function>

<#macro pagination page url="">
    <#assign pageNumber=(page.pageNumber)!1 pageSize=(page.pageSize)!8 totalPage=(page.totalPage)!0 totalRow=(page.totalRow)!0>
<nav class="navigation paging" role="navigation">
    <div>
        <input type="hidden" name="pageNumber" class="page-no" value="${pageNumber}"/>
        <input type="hidden" name="pageSize" class="page-size" value="${pageSize}"/>
    </div>
    <#if totalPage == 0>
        <div>没有记录</div>
    <#else>
        <div class="page-info pull-left">共${totalRow}条 / 共${totalPage}页</div>
        <ul class="pagination pull-right no-margin">
            <#assign pagingSize = 7>
            <!-- 首页 -->
            <#if (totalPage > pagingSize)>
                <#if pageNumber == 1>
                    <li class="first disabled"><a href="javascript:void(0)">首页</a></li>
                <#else>
                    <li class="first" data-page-no="1"><a href="${getPageUrl(url,1)}">首页</a></li>
                </#if>
            </#if>

            <!-- 上一页 -->
            <#if pageNumber == 1>
                <li class="previous disabled"><a href="javascript:void(0)">上一页</a></li>
            <#else>
                <li class="previous" data-page-no="${pageNumber-1}"><a href="${getPageUrl(url,pageNumber-1)}">上一页</a></li>
            </#if>

            <!-- 不能全部显示 -->
            <#if (totalPage > pagingSize)>
                <#assign startPage = pageNumber - (pagingSize / 2) ? floor>
                <#if (startPage < 1)>
                    <#assign startPage = 1>
                </#if>

                <#assign endPage = startPage + pagingSize - 1>

                <#if (endPage > totalPage)>
                    <#assign endPage = totalPage startPage = totalPage - pagingSize + 1>
                </#if>
            <#else>
                <#assign startPage = 1 endPage = totalPage>
            </#if>

            <!-- ... -->
            <#if (totalPage > pagingSize && startPage != 1)>
                <li class="extend disabled"><a href="javascript:void(0)">...</a></li>
            </#if>

            <#list startPage..endPage as i>
                <#if pageNumber == i>
                    <!-- 当前页 -->
                    <li class="current active"><a href="javascript:void(0)">${i}</a></li>
                <#else>
                    <li class="" data-page-no="${i}"><a href="${getPageUrl(url,i)}">${i}</a></li>
                </#if>

            </#list>

            <!-- ... -->
            <#if (totalPage > pagingSize && endPage != totalPage)>
                <li class="extend disabled"><a href="javascript:void(0)">...</a></li>
            </#if>

            <!-- 下一页 -->
            <#if pageNumber == totalPage>
                <li class="next disabled"><a href="javascript:void(0)">下一页</a></li>
            <#else>
                <li class="next" data-page-no="${pageNumber+1}"><a href="${getPageUrl(url,pageNumber+1)}">下一页</a></li>
            </#if>

            <!-- 尾页 -->
            <#if (totalPage > pagingSize)>
                <#if pageNumber == totalPage>
                    <li class="last disabled"><a href="javascript:void(0)">尾页</a></li>
                <#else>
                    <li class="last" data-page-no="${totalPage}"><a href="${getPageUrl(url,totalPage)}">尾页</a></li>
                </#if>
            </#if>
        </ul>
    </#if>
</nav>
</#macro>