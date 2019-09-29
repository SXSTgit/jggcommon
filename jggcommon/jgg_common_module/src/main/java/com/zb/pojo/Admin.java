package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;

public class Admin implements Serializable {
    private Integer id;//后台用户编号
    private String loginName;//登录名
    private String passWord;//密码
    private String nickName;//登陆昵称

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
