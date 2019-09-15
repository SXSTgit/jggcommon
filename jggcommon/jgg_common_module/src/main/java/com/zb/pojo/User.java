package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class User implements Serializable {
    //用户id
    private Integer id;
    //用户名
    private String uid;
    //密码
    private String password;
    //注册时间
    private Date creatTime;
    //账户安全
    private String SAM;
    //头像图片
    private String userImg;
    //手机号
    private String phone;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setUid (String  uid){
        this.uid=uid;
    }
    public  String getUid(){
        return this.uid;
    }
    public void setPassword (String  password){
        this.password=password;
    }
    public  String getPassword(){
        return this.password;
    }
    public void setCreatTime (Date  creatTime){
        this.creatTime=creatTime;
    }
    public  Date getCreatTime(){
        return this.creatTime;
    }
    public void setSAM (String  SAM){
        this.SAM=SAM;
    }
    public  String getSAM(){
        return this.SAM;
    }
    public void setUserImg (String  userImg){
        this.userImg=userImg;
    }
    public  String getUserImg(){
        return this.userImg;
    }
    public void setPhone (String  phone){
        this.phone=phone;
    }
    public  String getPhone(){
        return this.phone;
    }
}
