package com.zhang.controller;

import com.zhang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

/**
 * 前提get提交的参数如过和后台获取的参数一致则不需要单独映射下params
 * 如果前台提交参数和后台的不一致，则可以在后台接收参数的时候加个@RequestParams('前台参数名')
 */
@Controller
@RequestMapping("/user")
public class ParamsController {
    @RequestMapping("/test1")
    public String test1(int aa, Model model){

        model.addAttribute("msg","ParamsController"+aa);
        return "requestmapping";
    }

    //也可以接收对象，参数对不上则相应的值为null
    @RequestMapping("/test2")
    public String test2(User user, Model model){
        model.addAttribute("msg","user+"+user);
        return "requestmapping";
    }
}
