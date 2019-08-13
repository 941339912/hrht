package cn.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SkipController {

    //首页
    @RequestMapping("/home")
    public String home() {
        return "index";
    }

    //修改密码
    @RequestMapping("/userPwd")
    public String userPwd() {
        return "userPwd";
    }

    //新闻列表
    @RequestMapping("/news")
    public String news(){
        return "news";
    }

    //新闻添加
    @RequestMapping("/newsAdd")
    public String newsAdd(){
        return "newsAdd";
    }

    //退出系统
    @RequestMapping("/logOut ")
    public String logOut(){
        return "logOut";
    }

    //医生列表
    @RequestMapping("/doctor")
    public String doctor(){
        return "doctor";
    }

    //添加医生
    @RequestMapping("/doctorAdd")
    public String doctorAdd(){
        return "doctorAdd";
    }

    //科室列表
    @RequestMapping("/koffice")
    public String koffice(){
        return "koffice";
    }

    //添加科室
    @RequestMapping("/kofficeAdd")
    public String kofficeAdd(){
        return "kofficeAdd";
    }

    //登录
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    //病人列表
    @RequestMapping("/patients")
    public String patients(){
        return "patients";
    }

    //用户列表
    @RequestMapping("/user")
    public String user(){
        return "user";
    }

    @RequestMapping("/userAdd")
    public String userAdd(){
        return "userAdd";
    }
}
