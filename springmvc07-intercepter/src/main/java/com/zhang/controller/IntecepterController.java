package com.zhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class IntecepterController {

    @RequestMapping("/test1")
    public String test1(){
        System.out.println("执行");
        return "ok";
    }

    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password, Model model){
        //把用户信息传入session中
        System.out.println("username+"+username);
        session.setAttribute("usernameInfo",username);
        model.addAttribute("user",username);
        return "main";
    }

    @RequestMapping("/main")
    public String main(){
        return "main";
    }
    @RequestMapping("/gologin")
    public String gologin(){
        return "login";
    }

    @RequestMapping("/loginOut")
    public String loginOut(HttpSession session){
        session.removeAttribute("usernameInfo");
        return "main";
    }
}
