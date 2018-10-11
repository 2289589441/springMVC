package com.shsxt.po;

/**
 * @auther: 康晓伟
 * @date: 2018/10/11 11:51
 * @description: springMVC
 */
public class Phone {

    private Integer num;

    @Override
    public String toString() {
        return "Phone{" +
                "num=" + num +
                '}';
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
