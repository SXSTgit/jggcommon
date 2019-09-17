package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class JggGoodsMassage implements Serializable {
    //商品ID
    private Integer goodsid;
    //商品名称
    private String goodsname;
    //商品描述
    private String goodsinfo;
    //商品价格
    private String goodsprice;
    //商品图片
    private String goodsImg;
    //商品库存
    private Integer goodsstock;
    //创建时间
    private Date createdTime;
    //修改时间
    private Date updatedTime;
    //商品分类
    private Integer goodssortId;
    //get set 方法
    public void setGoodsid (Integer  goodsid){
        this.goodsid=goodsid;
    }
    public  Integer getGoodsid(){
        return this.goodsid;
    }
    public void setGoodsname (String  goodsname){
        this.goodsname=goodsname;
    }
    public  String getGoodsname(){
        return this.goodsname;
    }
    public void setGoodsinfo (String  goodsinfo){
        this.goodsinfo=goodsinfo;
    }
    public  String getGoodsinfo(){
        return this.goodsinfo;
    }
    public void setGoodsprice (String  goodsprice){
        this.goodsprice=goodsprice;
    }
    public  String getGoodsprice(){
        return this.goodsprice;
    }
    public void setGoodsImg (String  goodsImg){
        this.goodsImg=goodsImg;
    }
    public  String getGoodsImg(){
        return this.goodsImg;
    }
    public void setGoodsstock (Integer  goodsstock){
        this.goodsstock=goodsstock;
    }
    public  Integer getGoodsstock(){
        return this.goodsstock;
    }
    public void setCreatedTime (Date  createdTime){
        this.createdTime=createdTime;
    }
    public  Date getCreatedTime(){
        return this.createdTime;
    }
    public void setUpdatedTime (Date  updatedTime){
        this.updatedTime=updatedTime;
    }
    public  Date getUpdatedTime(){
        return this.updatedTime;
    }
    public void setGoodssortId (Integer  goodssortId){
        this.goodssortId=goodssortId;
    }
    public  Integer getGoodssortId(){
        return this.goodssortId;
    }
}
