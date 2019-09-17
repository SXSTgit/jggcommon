package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class JggGoodsSort implements Serializable {
    //
    private Integer id;
    //分类名称
    private String sortname;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setSortname (String  sortname){
        this.sortname=sortname;
    }
    public  String getSortname(){
        return this.sortname;
    }
}
