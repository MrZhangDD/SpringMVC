package com.zhang.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInteceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(request.getRequestURI().contains("login")){
            return true;
        }
        if(request.getRequestURI().contains("gologin")){
            return true;
        }
        //拦截器是controller中的，mvc中的
        //获取session
        HttpSession session = request.getSession();
        Object usernameInfo = session.getAttribute("usernameInfo");
        if(usernameInfo !=null && usernameInfo!= ""){
            return true;
        }
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        //判断session中是否有信息
        return true;
    }
}
