package com.shsxt.Interceptors;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 康晓伟
 * @date: 2018/10/11 16:43
 * @description: springMVC
 */
public class LoginInterceptors extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
     final String login = "login";
        if (request.getContextPath().contains(login)) {
            return true;
        }
        return false;
    }
}
