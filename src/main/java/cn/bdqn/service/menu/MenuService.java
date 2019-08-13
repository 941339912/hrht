package cn.bdqn.service.menu;

import cn.bdqn.entity.Menu;

import java.util.List;

public interface MenuService {

    /**
     * 获取一级菜单列表
     * @return
     */
    public List<Menu> getMenuList(int isqianhou,int roleId);

    /**
     * 获取二级菜单列表
     * @param isqianhou
     * @return
     */
    public List<Menu> getTwoMenuList(int isqianhou,int roleId);
}
