package com.youbin.springboot.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: springboot-demo
 * @description: 测试cookie
 * @author: Mr.You
 * @create: 2019-03-24 20:25
 **/
@RestController
public class CookieController {

    @GetMapping("setCookie")
    public String setCookie(HttpServletResponse response){
        Cookie cookie = new Cookie("test","same");
        cookie.setPath("/");
        response.addCookie(cookie);
        return "success";
    }

    @GetMapping("getCookie")
    public String getCookie(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if(cookies != null && cookies.length >0){
            for (Cookie cookie :cookies){
                System.out.println("name:" + cookie.getName() + "----value" + cookie.getValue() );
            }
        }

        return "success";
    }
}
