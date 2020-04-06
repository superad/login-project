package com.mengma.interceptor;

import com.mengma.utils.MD5Utils;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

/**
 * @author fgm
 * @description  登录拦截器
 * @date 2020-03-05
 ***/
@Component
public class LoginInterceptor implements HandlerInterceptor {



    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws
        Exception {

        HttpSession session = request.getSession();

        System.out.println("==========>>>>sessionId:" + session.getId());
        Enumeration<String> attrs = session.getAttributeNames();
        // 遍历attrs中的
        String tokenValue = "";
        while(attrs.hasMoreElements()){
            // 获取session键值
            String name = attrs.nextElement();
            String value = session.getAttribute(name).toString();
            if("token".equalsIgnoreCase(name)){
                tokenValue = value;
            }
            // 根据键值取session中的值
            if("userName".equalsIgnoreCase(name)){
                // 打印结果
                System.out.println("------" + name + ":" + value +"--------\n");
            }

        }
        String token= MD5Utils.toMD5("admin_admin");
        if(!StringUtils.isEmpty(tokenValue)&&tokenValue.equals(token)){
            return true;
        }else{
            response.sendRedirect(request.getContextPath() + "/login/toLogin");
            return false;
        }

    }





}
