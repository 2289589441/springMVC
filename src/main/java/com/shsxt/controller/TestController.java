package com.shsxt.controller;

import com.shsxt.po.Phone;
import com.shsxt.po.User;
import javafx.beans.DefaultProperty;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author 康晓伟
 * @date: 2018/10/11 09:45
 * @description: springMVC
 */
@Controller
@RequestMapping("/hello")
public class TestController {

    @RequestMapping("/hello01")
    public String hello01(){
        return "hello";
    }
    @RequestMapping("/hello02")
    public String hello02(String a, Model model){
        System.out.println(a);

        model.addAttribute("a", a);

        return "hello";
    }

    @RequestMapping("/hello03")
    public ModelAndView hello03(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("a","123");
        modelAndView.setViewName("hello");

        return modelAndView;

    }

    @RequestMapping("/hello04")
    public String hello04(@RequestParam(defaultValue = "123") String a,@RequestParam(defaultValue = "abc") String b){

        System.out.println(a+"--"+b);
        return "hello";

    }

    @RequestMapping("/hello05")
    public String hello05(String[] a){

        for (String str:a
             ) {
            System.out.println(str);
        }

        return "hello";

    }
    @RequestMapping("/hello06")
    public String hello06(User user){

        System.out.println(user);

        return "hello";

    }
    @RequestMapping("/hello07")
    public String hello07(User user){
        List<Phone> userPhones = user.getUserPhones();


        return "hello";

    }
}
