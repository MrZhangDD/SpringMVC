package com.zhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequestMappingController {
    /**
     * @PathVariable  -路径变量
     * RequestMapping  --映射url
     * restful 风格，安全高效轻便  同样的参数不同的提交方式，后台处理方式不同
     */
    @RequestMapping(value = "/test/{a}/{b}",method = RequestMethod.POST)
    public String test1(@PathVariable int a, @PathVariable int b, Model model){

        String aa = a+b+"";
        model.addAttribute("msg","test1结果为+"+aa);
        return "requestmapping";
    }

    @RequestMapping(value = "/test/{a}/{b}",method = RequestMethod.GET)
    public String test2(@PathVariable int a, @PathVariable int b, Model model){
        String aa = a+b+"";
        model.addAttribute("msg","test2结果为+"+aa);
        return "requestmapping";
    }
    /**
     * 转发和重定向
     * 转发直接return相应的jsp名称，重定向需要redirect
     */
    @RequestMapping(value = "/test1/{a}/{b}",method = RequestMethod.GET)
    public String test3(@PathVariable int a, @PathVariable int b, Model model){
        String aa = a+b+"";
        model.addAttribute("msg","test3结果为+"+aa);
        return "redirect:/index.jsp";
    }
}
