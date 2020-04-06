package com.mengma.controller;

import com.mengma.utils.MD5Utils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author fgm
 * @description
 * @date 2020-04-06
 ***/
@Controller
@RequestMapping("login")
public class LoginController {


    @RequestMapping("/toLogin")
    public String login() throws IOException {
        System.out.println("================++++++++++++++跳转登录页面");
        return "login";
    }

    @RequestMapping("loginSystem")
    public String loginSystem(String username, String password, HttpSession session) {
        // 合法用户，信息写入session，同时跳转到系统主页面

        if("admin".equals(username)&&"admin".equals(password)){
            String token= MD5Utils.toMD5(username+"_"+password);
            session.setAttribute("token",token);
            session.setAttribute("userName",username);
            System.out.println("登录成功");
            return "redirect:/demo/result";
        }else{
            // 非法用户返回登录页面
            System.out.println("非法，跳转");
            return "redirect:/login/toLogin";
        }
    }


}
