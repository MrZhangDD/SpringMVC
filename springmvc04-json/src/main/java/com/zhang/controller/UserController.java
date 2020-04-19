package com.zhang.controller;

import com.alibaba.fastjson.JSON;
import com.zhang.pojo.User;
import com.zhang.util.JsonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping("/json1")
    public String json1(){
        User user = new User("zhang",12,23);
        return user.toString();
    }

    @RequestMapping("/json2")
    public String json2(){
        User user1 = new User("zhang1",12,23);
        User user2 = new User("zhang2",12,23);
        User user3 = new User("zhang3",12,23);
        User user4 = new User("zhang4",12,23);
        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        return JsonUtils.getJson(userList);
    }

    @RequestMapping("/json3")
    public String json3(){
        Date date = new Date();
        return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
    }

    @RequestMapping("/json4")
    public String json4(){
        User user1 = new User("zhang1",12,23);
        User user2 = new User("zhang2",12,23);
        User user3 = new User("zhang3",12,23);
        User user4 = new User("zhang4",12,23);
        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        return JSON.toJSONString(userList);
    }
}
