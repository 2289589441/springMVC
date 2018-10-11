package com.shsxt.controller;


import com.shsxt.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 康晓伟
 * @date: 2018/10/11 09:45
 * @description: springMVC
 */
@Controller
@RequestMapping("/hello")
public class UserController {
    @RequestMapping("queryUserByName")
    @ResponseBody
    public User queryUserByName(String userName){
        User user = new User();
        user.setUserName(userName);
        user.setUserPwd("123456");

        return user;
    }

}
