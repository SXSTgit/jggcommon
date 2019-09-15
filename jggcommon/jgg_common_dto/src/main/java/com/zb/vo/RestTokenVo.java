package com.zb.vo;

import com.zb.pojo.User;

import java.io.Serializable;

public class RestTokenVo implements Serializable {

    private String str;
    private User user;

    public RestTokenVo() {
    }

    public RestTokenVo(String str, User user) {
        this.str = str;
        this.user = user;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
