package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Cart implements Serializable {
    //
    private String id;
    //
    private String userId;
    //订单编号
    private String orderNo;
    //商品Id
    private String goodsId;
    //购买量
    private Integer num;
    //总价
    private Double amount;
    //阿里支付交易号
    private String aliTradeNo;
    //
    private Date createdTime;
    //
    private Date updatedTime;
    //版本 乐观锁
    private Integer version;
    //状态(0：待支付 1：支付成功 2:支付失败,3:已签收)
    private Integer status;
    //get set 方法
    public void setId (String  id){
        this.id=id;
    }
    public  String getId(){
        return this.id;
    }
    public void setUserId (String  userId){
        this.userId=userId;
    }
    public  String getUserId(){
        return this.userId;
    }
    public void setOrderNo (String  orderNo){
        this.orderNo=orderNo;
    }
    public  String getOrderNo(){
        return this.orderNo;
    }
    public void setGoodsId (String  goodsId){
        this.goodsId=goodsId;
    }
    public  String getGoodsId(){
        return this.goodsId;
    }
    public void setNum (Integer  num){
        this.num=num;
    }
    public  Integer getNum(){
        return this.num;
    }
    public void setAmount (Double  amount){
        this.amount=amount;
    }
    public  Double getAmount(){
        return this.amount;
    }
    public void setAliTradeNo (String  aliTradeNo){
        this.aliTradeNo=aliTradeNo;
    }
    public  String getAliTradeNo(){
        return this.aliTradeNo;
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
    public void setVersion (Integer  version){
        this.version=version;
    }
    public  Integer getVersion(){
        return this.version;
    }
    public void setStatus (Integer  status){
        this.status=status;
    }
    public  Integer getStatus(){
        return this.status;
    }
}
