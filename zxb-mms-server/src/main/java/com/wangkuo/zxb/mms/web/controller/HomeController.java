package com.wangkuo.zxb.mms.web.controller;

import com.google.common.collect.Lists;
import com.wangkuo.zxb.mms.server.db.po.TPermission;
import com.wangkuo.zxb.mms.server.db.po.TUser;
import com.wangkuo.zxb.mms.server.service.IPermissionService;
import com.wangkuo.zxb.mms.web.bind.annotation.CurrentUser;
import com.wangkuo.zxb.mms.web.viewmodel.MenuItem;
import org.apache.commons.beanutils.BeanComparator;
import org.apache.commons.collections.ComparatorUtils;
import org.apache.commons.collections.comparators.ComparableComparator;
import org.apache.commons.collections.comparators.ComparatorChain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-25
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private IPermissionService permissionService;

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model, @CurrentUser TUser user) {
        List<MenuItem> menuItems = getMenus(user);
        model.addAttribute("menuItems", menuItems);
        return "/index";
    }

    /**
     * 获取菜单,支持2级
     *
     * @param user
     * @return
     */
    private List<MenuItem> getMenus(TUser user) {


        List<TPermission> userPermissions = permissionService.findListByUser(user);

        List<TPermission> permissions = permissionService.findAll();

        List<MenuItem> menuItems = new ArrayList<>();

        for (final TPermission permission : userPermissions) {
            if (null == permission.getParentId() || permission.getParentId() != 0 ||
                    null == permission.getIsEnable() || !permission.getIsEnable()) {
                continue;
            }

            MenuItem item = new MenuItem();
            item.setText(permission.getName());
            item.setUrl(permission.getUrl());
            item.setRank(permission.getRank());
            List<MenuItem> childMenus = Lists.newArrayList();
            for (TPermission tPermission : permissions) {

                if (tPermission.getParentId() == null || !tPermission.getParentId().equals(permission.getId())) {
                    continue;
                }

                MenuItem subItem = new MenuItem();
                subItem.setText(tPermission.getName());
                subItem.setUrl(tPermission.getUrl());
                subItem.setRank(tPermission.getRank());
                childMenus.add(subItem);
            }

            sortMenu(childMenus);

            item.setChildMenus(childMenus);


            menuItems.add(item);
        }

        sortMenu(menuItems);

        return menuItems;
    }

    private void sortMenu(List<MenuItem> menus) {

        Comparator rankCmp = ComparableComparator.getInstance();
        rankCmp = ComparatorUtils.nullHighComparator(rankCmp);

        ArrayList<Object> sortFields = new ArrayList<>();
        sortFields.add(new BeanComparator("rank", rankCmp)); //主排序（第一排序）

        ComparatorChain multiSort = new ComparatorChain(sortFields);

        Collections.sort(menus, multiSort);
    }
}
