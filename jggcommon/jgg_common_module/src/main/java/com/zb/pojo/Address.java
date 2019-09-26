package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Address implements Serializable {
    //
    private Integer id;
    //
    private String name;
    //
    private String phone;
    //
    private String address;
    //
    private Integer userid;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setName (String  name){
        this.name=name;
    }
    public  String getName(){
        return this.name;
    }
    public void setPhone (String  phone){
        this.phone=phone;
    }
    public  String getPhone(){
        return this.phone;
    }
    public void setAddress (String  address){
        this.address=address;
    }
    public  String getAddress(){
        return this.address;
    }
    public void setUserid (Integer  userid){
        this.userid=userid;
    }
    public  Integer getUserid(){
        return this.userid;
    }
}
