package cn.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SkipController {

    @RequestMapping("/")
    public  String demo(){
        return "demo";
    }

    @RequestMapping("/home")
    public String home() {
        return "index";
    }

    @RequestMapping("/news")
    public String news() {
        return "news";
    }

    @RequestMapping("/log")
    public String log() {
        return "log";
    }

    @RequestMapping("/role")
    public String role() { return "role"; }

    @RequestMapping("/user1")
    public String user1() { return "user1"; }

    @RequestMapping("/department1")
    public String department1() { return "department1"; }

    @RequestMapping("/table1")
    public String table1() { return "table1"; }

    @RequestMapping("/table3")
    public String table3() { return "table3"; }

    @RequestMapping("/table4")
    public String table4() { return "table4"; }

    @RequestMapping("/table2")
    public String table2() { return "table2"; }

    @RequestMapping("/table5")
    public String table5() { return "table5"; }

    @RequestMapping("/treeTable")
    public String treeTable() { return "treeTable"; }

    @RequestMapping("/tableTabs")
    public String tableTabs() { return "tableTabs"; }

    @RequestMapping("/goods")
    public String goods() { return "goods"; }

    @RequestMapping("/book01")
    public String book01() { return "book01"; }

    @RequestMapping("/book02")
    public String book02() { return "book02"; }

    @RequestMapping("/form")
    public String form() { return "form"; }

    @RequestMapping("/analysis")
    public String analysis() { return "analysis"; }

    @RequestMapping("/from_analysis")
    public String from_analysis() { return "from_analysis"; }

}
