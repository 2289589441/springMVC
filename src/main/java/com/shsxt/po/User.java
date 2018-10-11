package com.shsxt.po;

import java.util.List;

/**
 * @author 康晓伟
 * @date: 2018/10/11 11:48
 * @description: springMVC
 */
public class User {

    private String userName;
    private String userPwd;

    private List<Phone> userPhones;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userPhones=" + userPhones +
                '}';
    }

    public List<Phone> getUserPhones() {
        return userPhones;
    }

    public void setUserPhones(List<Phone> userPhones) {
        this.userPhones = userPhones;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
