package com.zhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnnotionController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","hello Annotion");
        return "annotion";
    }

}
