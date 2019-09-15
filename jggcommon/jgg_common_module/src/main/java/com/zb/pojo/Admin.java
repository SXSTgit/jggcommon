package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Admin implements Serializable {
    //
    private Integer id;
    //
    private String uid;
    //
    private String password;
    //
    private String name;
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
    public void setName (String  name){
        this.name=name;
    }
    public  String getName(){
        return this.name;
    }
}
