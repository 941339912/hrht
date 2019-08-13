package cn.bdqn.service.menu;

import cn.bdqn.dao.MenuMapper;
import cn.bdqn.entity.Menu;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService{

    @Resource
    private MenuMapper menuMapper;

    @Override
    public List<Menu> getMenuList(int isqianhou,int roleId) {
        return menuMapper.findMenuList(isqianhou,roleId);
    }

    @Override
    public List<Menu> getTwoMenuList(int isqianhou,int roleId) {
        return menuMapper.findTwoMenuList(isqianhou,roleId);
    }
}
