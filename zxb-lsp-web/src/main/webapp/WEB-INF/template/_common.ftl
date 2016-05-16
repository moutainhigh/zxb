
[#-- 格式化地址，传入参数 省,市,县,具体地址 --]
[#function formatAddress areas... ]
    [#if !areas?? || !areas?is_sequence]
        [#return "" /]
    [/#if]

    [#if areas?size lt 1]
        [#return "" /]
    [/#if]

    [#local specialCitys = ["北京", "上海", "天津", "重庆"]]
    [#local address = "" /]
    [#list areas as area]
        [#if area_index == 0]
            [#if !specialCitys?seq_contains(area)]
                [#local address = address + area /]
            [/#if]
        [#else]
            [#if area?? && address?index_of(area) == -1]
                [#local address = address + area /]
            [/#if]
        [/#if]
    [/#list]
    [#return address /]
[/#function]

[#function formatAddressWithSeparator separator="" areas... ]
    [#if !areas?? || !areas?is_sequence]
        [#return "" /]
    [/#if]

    [#if areas?size lt 1]
        [#return "" /]
    [/#if]

    [#local specialCitys = ["北京", "上海", "天津", "重庆"]]
    [#local address = "" /]
    [#list areas as area]
        [#if area_index == 0]
            [#if !specialCitys?seq_contains(area)]
                [#if address==""]
                    [#local address =  area /]
                [#else]
                    [#local address = address + separator + area /]
                [/#if]
            [/#if]
        [#else]
            [#if area?? && address?index_of(area) == -1]
                [#--[#local address = address + separator + area /]--]
                [#if address==""]
                    [#local address =  area /]
                [#else]
                    [#local address = address + separator + area /]
                [/#if]
            [/#if]
        [/#if]
    [/#list]
    [#return address /]
[/#function]




[#-- 格式化显示手机和电话 --]
[#function formatMobileAndPhone mobile phone]
    [#local backStr = ""]
    [#if mobile?? && mobile?has_content]
        [#local backStr = mobile]
    [/#if]
    [#if phone?? && phone?has_content]
        [#if backStr!=""]
            [#local backStr = backStr + "&nbsp;&nbsp;&nbsp;&nbsp;" + phone]
        [#else]
            [#local backStr = backStr + phone]
        [/#if]
    [/#if]
    [#return backStr/]
[/#function]

[#-- 格式化显示手机或电话 --]
[#function formatMobileOrPhone mobile phone]
    [#if mobile?? && mobile?has_content]
        [#return mobile/]
    [#else]
        [#return phone/]
    [/#if]
[/#function]


[#--返回交易收货人完整地址--]
[#function formatTradeConsigneeAddress trade, includeAddress = true]
    [#if includeAddress]
        [#return formatAddress(trade.consigneeProvince,trade.consigneeCity,
        trade.consigneeCounty,trade.consigneeTown,trade.consigneeAddress)/]
    [#else]
        [#return formatAddress(trade.consigneeProvince,trade.consigneeCity,
        trade.consigneeCounty,trade.consigneeTown)/]
    [/#if]
[/#function]

[#-- 返回交易发货人完整地址 --]
[#function formatTradeConsignerAddress trade, includeAddress = true]
    [#if includeAddress]
        [#return formatAddress(trade.consignerProvince,trade.consignerCity,
        trade.consignerCounty,trade.consignerTown,trade.consignerAddress)/]
    [#else]
        [#return formatAddress(trade.consignerProvince,trade.consignerCity,
        trade.consignerCounty,trade.consignerTown)/]
    [/#if]
[/#function]

[#-- 格式化显示交易支付类型 --]
[#function formatPayType trade]
    [#if trade.payType == 0]
        [#if trade.payWay == 0]
            [#return "在线支付"/]
        [#else]
            [#return "线下汇款"/]
        [/#if]
    [#else]
        [#return "收货方支付"/]
    [/#if]
[/#function]


[#-- 格式化显示送货方式 --]
[#function formatDeliveryType trade]
    [#local ret=""]
    [#if trade.deliveryType==1]
        [#local ret ="到站自提"]
    [#else]
        [#local ret ="送货上门"]
    [/#if]

    [#if trade.needNotify]
        [#local ret = ret + "（等通知放货）"]
    [/#if]
    [#return ret]
[/#function]

[#-- 格式化显示提货方式--]
[#function formatPickType trade]
    [#switch trade.pickType]
        [#case 0]
            [#return "等通知"]
        [#case 1]
            [#return "上门提货"]
        [#case 2]
            [#return "自送到站"]
    [/#switch]

[/#function]