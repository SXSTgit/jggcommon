package com.zb.vo;

import com.zb.pojo.Admin;

public class AdminToken {
    private String str;
    private Admin admin;

    public AdminToken() {
    }

    public AdminToken(String str, Admin admin) {
        this.str = str;
        this.admin = admin;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
