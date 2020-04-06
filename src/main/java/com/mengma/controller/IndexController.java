package com.mengma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fgm
 * @description
 * @date 2020-04-06
 ***/
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
         return "login";
    }


}
