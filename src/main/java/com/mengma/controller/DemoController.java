package com.mengma.controller;

import com.mengma.pojo.Resume;
import com.mengma.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author fgm
 * @description ${DESCRIPTION}
 * @date 2020-04-06
 ***/
@Controller
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private ResumeService resumeService;

    @RequestMapping("result")
    public String result(HttpServletRequest request){
        List<Resume> resumeList=resumeService.findAll();
        request.setAttribute("resumeList",resumeList);
        return "result";
    }


}
