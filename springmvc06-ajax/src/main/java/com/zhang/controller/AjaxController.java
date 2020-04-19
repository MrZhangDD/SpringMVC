package com.zhang.controller;

import com.zhang.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public String ajax1(){
        return "hello";
    }

    @RequestMapping("/t2")
    public void ajax2(String name, HttpServletResponse response) throws IOException {
        System.out.println("ajax2=>"+name);
        if("zhang".equals(name)){
            response.getWriter().println("true");
        } else {
            response.getWriter().println("false");
        }
    }

    @RequestMapping("/ajax3")
    public List<User> ajax3(){
        List<User> userlist = new ArrayList<User>();
        userlist.add(new User("zhang1","男",23));
        userlist.add(new User("zhang2","男",13));
        userlist.add(new User("zhang3","男",23));
        return userlist;
    }

    @RequestMapping("/ajax4")
    public String ajax4(String name,String pwd){
        String msg = "";
        if(name != null && name != ""){
            if("admin".equals(name)){
                msg = "ok";
            } else {
                msg = "用户名不正确";
            }
        }
        if(pwd != null && pwd != ""){
            if("admin".equals(pwd)){
                msg = "ok";
            } else {
                msg = "密码不正确";
            }
        }
        return msg;
    }
}
