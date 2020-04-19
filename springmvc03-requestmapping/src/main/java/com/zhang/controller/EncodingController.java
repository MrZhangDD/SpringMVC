package com.zhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EncodingController {

    @RequestMapping("/test/e")
    public String test1(String name, Model model){
        model.addAttribute("msg","EncodingController"+name);
        return "requestmapping";
    }

}
