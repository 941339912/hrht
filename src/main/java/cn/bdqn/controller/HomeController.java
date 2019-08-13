package cn.bdqn.controller;

import cn.bdqn.entity.Menu;
import cn.bdqn.service.menu.MenuService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {
    @Resource
    private MenuService menuService;

    @RequestMapping("/menuList")
    @ResponseBody
    public String getMenuList(Integer roleId){
        Map<String,Object> map = new HashMap<>();
        List<Menu> menuList = menuService.getMenuList(2,roleId);
        List<Menu> twoMenuList = menuService.getTwoMenuList(2,roleId);
        map.put("menuList",menuList);
        map.put("twoMenuList",twoMenuList);
        return JSON.toJSONString(map);
    }

}
