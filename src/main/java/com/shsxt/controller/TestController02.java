package com.shsxt.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 康晓伟
 * @date: 2018/10/11 09:45
 * @description: springMVC
 */
@Controller
@SessionAttributes({"userName"})
public class TestController02 {

    @RequestMapping("/test01")
    public ModelAndView test01(String userName){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("userName",userName);
        modelAndView.setViewName("hello");

        return modelAndView;
    }

    @RequestMapping("/test02")
    public ModelAndView test02(){
        ModelAndView modelAndView = new ModelAndView();


        modelAndView.setViewName("redirect:/test01?userName=ls");

        return modelAndView;
    }

    @RequestMapping("/test03")
    public ModelAndView test03(){
        ModelAndView modelAndView = new ModelAndView();


        modelAndView.setViewName("redirect:index.jsp");

        return modelAndView;
    }

    @RequestMapping("/test04")
    public ModelAndView test04(){
        ModelAndView modelAndView = new ModelAndView();


        modelAndView.setViewName("forward:/test01?userName=ww");

        return modelAndView;
    }
}
