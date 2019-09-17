package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Goods implements Serializable {
    //
    private Integer id;
    //
    private String goodsId;
    //
    private String itemLink;
    //
    private String title;
    //
    private String dtitle;
    //
    private String desc;
    //
    private Integer cid;
    //
    private String subcid;
    //
    private Integer tbcid;
    //
    private String mainPic;
    //
    private String marketingMainPic;
    //
    private String originalPrice;
    //
    private String actualPrice;
    //
    private String discounts;
    //
    private Integer commissionType;
    //
    private Integer commissionRate;
    //
    private String couponLink;
    //
    private Integer couponTotalNum;
    //
    private Integer couponReceiveNum;
    //
    private Date couponEndTime;
    //
    private Date couponStartTime;
    //
    private Integer couponPrice;
    //
    private String couponConditions;
    //
    private Integer monthSales;
    //
    private Integer twoHoursSales;
    //
    private Integer dailySales;
    //
    private Integer brand;
    //
    private Integer brandId;
    //
    private String brandName;
    //
    private Date createTime;
    //
    private Integer tchaoshi;
    //
    private Integer activityType;
    //
    private Date activityStartTime;
    //
    private Date activityEndTime;
    //
    private Integer shopType;
    //
    private Integer haitao;
    //
    private Integer goldSellers;
    //
    private String sellerId;
    //
    private String shopName;
    //
    private Integer shopLevel;
    //
    private String descScore;
    //
    private String dsrScore;
    //
    private String dsrPercent;
    //
    private String shipScore;
    //
    private String shipPercent;
    //
    private String serviceScore;
    //
    private String servicePercent;
    //
    private Integer hotPush;
    //
    private String teamName;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setGoodsId (String  goodsId){
        this.goodsId=goodsId;
    }
    public  String getGoodsId(){
        return this.goodsId;
    }
    public void setItemLink (String  itemLink){
        this.itemLink=itemLink;
    }
    public  String getItemLink(){
        return this.itemLink;
    }
    public void setTitle (String  title){
        this.title=title;
    }
    public  String getTitle(){
        return this.title;
    }
    public void setDtitle (String  dtitle){
        this.dtitle=dtitle;
    }
    public  String getDtitle(){
        return this.dtitle;
    }
    public void setDesc (String  desc){
        this.desc=desc;
    }
    public  String getDesc(){
        return this.desc;
    }
    public void setCid (Integer  cid){
        this.cid=cid;
    }
    public  Integer getCid(){
        return this.cid;
    }
    public void setSubcid (String  subcid){
        this.subcid=subcid;
    }
    public  String getSubcid(){
        return this.subcid;
    }
    public void setTbcid (Integer  tbcid){
        this.tbcid=tbcid;
    }
    public  Integer getTbcid(){
        return this.tbcid;
    }
    public void setMainPic (String  mainPic){
        this.mainPic=mainPic;
    }
    public  String getMainPic(){
        return this.mainPic;
    }
    public void setMarketingMainPic (String  marketingMainPic){
        this.marketingMainPic=marketingMainPic;
    }
    public  String getMarketingMainPic(){
        return this.marketingMainPic;
    }
    public void setOriginalPrice (String  originalPrice){
        this.originalPrice=originalPrice;
    }
    public  String getOriginalPrice(){
        return this.originalPrice;
    }
    public void setActualPrice (String  actualPrice){
        this.actualPrice=actualPrice;
    }
    public  String getActualPrice(){
        return this.actualPrice;
    }
    public void setDiscounts (String  discounts){
        this.discounts=discounts;
    }
    public  String getDiscounts(){
        return this.discounts;
    }
    public void setCommissionType (Integer  commissionType){
        this.commissionType=commissionType;
    }
    public  Integer getCommissionType(){
        return this.commissionType;
    }
    public void setCommissionRate (Integer  commissionRate){
        this.commissionRate=commissionRate;
    }
    public  Integer getCommissionRate(){
        return this.commissionRate;
    }
    public void setCouponLink (String  couponLink){
        this.couponLink=couponLink;
    }
    public  String getCouponLink(){
        return this.couponLink;
    }
    public void setCouponTotalNum (Integer  couponTotalNum){
        this.couponTotalNum=couponTotalNum;
    }
    public  Integer getCouponTotalNum(){
        return this.couponTotalNum;
    }
    public void setCouponReceiveNum (Integer  couponReceiveNum){
        this.couponReceiveNum=couponReceiveNum;
    }
    public  Integer getCouponReceiveNum(){
        return this.couponReceiveNum;
    }
    public void setCouponEndTime (Date  couponEndTime){
        this.couponEndTime=couponEndTime;
    }
    public  Date getCouponEndTime(){
        return this.couponEndTime;
    }
    public void setCouponStartTime (Date  couponStartTime){
        this.couponStartTime=couponStartTime;
    }
    public  Date getCouponStartTime(){
        return this.couponStartTime;
    }
    public void setCouponPrice (Integer  couponPrice){
        this.couponPrice=couponPrice;
    }
    public  Integer getCouponPrice(){
        return this.couponPrice;
    }
    public void setCouponConditions (String  couponConditions){
        this.couponConditions=couponConditions;
    }
    public  String getCouponConditions(){
        return this.couponConditions;
    }
    public void setMonthSales (Integer  monthSales){
        this.monthSales=monthSales;
    }
    public  Integer getMonthSales(){
        return this.monthSales;
    }
    public void setTwoHoursSales (Integer  twoHoursSales){
        this.twoHoursSales=twoHoursSales;
    }
    public  Integer getTwoHoursSales(){
        return this.twoHoursSales;
    }
    public void setDailySales (Integer  dailySales){
        this.dailySales=dailySales;
    }
    public  Integer getDailySales(){
        return this.dailySales;
    }
    public void setBrand (Integer  brand){
        this.brand=brand;
    }
    public  Integer getBrand(){
        return this.brand;
    }
    public void setBrandId (Integer  brandId){
        this.brandId=brandId;
    }
    public  Integer getBrandId(){
        return this.brandId;
    }
    public void setBrandName (String  brandName){
        this.brandName=brandName;
    }
    public  String getBrandName(){
        return this.brandName;
    }
    public void setCreateTime (Date  createTime){
        this.createTime=createTime;
    }
    public  Date getCreateTime(){
        return this.createTime;
    }
    public void setTchaoshi (Integer  tchaoshi){
        this.tchaoshi=tchaoshi;
    }
    public  Integer getTchaoshi(){
        return this.tchaoshi;
    }
    public void setActivityType (Integer  activityType){
        this.activityType=activityType;
    }
    public  Integer getActivityType(){
        return this.activityType;
    }
    public void setActivityStartTime (Date  activityStartTime){
        this.activityStartTime=activityStartTime;
    }
    public  Date getActivityStartTime(){
        return this.activityStartTime;
    }
    public void setActivityEndTime (Date  activityEndTime){
        this.activityEndTime=activityEndTime;
    }
    public  Date getActivityEndTime(){
        return this.activityEndTime;
    }
    public void setShopType (Integer  shopType){
        this.shopType=shopType;
    }
    public  Integer getShopType(){
        return this.shopType;
    }
    public void setHaitao (Integer  haitao){
        this.haitao=haitao;
    }
    public  Integer getHaitao(){
        return this.haitao;
    }
    public void setGoldSellers (Integer  goldSellers){
        this.goldSellers=goldSellers;
    }
    public  Integer getGoldSellers(){
        return this.goldSellers;
    }
    public void setSellerId (String  sellerId){
        this.sellerId=sellerId;
    }
    public  String getSellerId(){
        return this.sellerId;
    }
    public void setShopName (String  shopName){
        this.shopName=shopName;
    }
    public  String getShopName(){
        return this.shopName;
    }
    public void setShopLevel (Integer  shopLevel){
        this.shopLevel=shopLevel;
    }
    public  Integer getShopLevel(){
        return this.shopLevel;
    }
    public void setDescScore (String  descScore){
        this.descScore=descScore;
    }
    public  String getDescScore(){
        return this.descScore;
    }
    public void setDsrScore (String  dsrScore){
        this.dsrScore=dsrScore;
    }
    public  String getDsrScore(){
        return this.dsrScore;
    }
    public void setDsrPercent (String  dsrPercent){
        this.dsrPercent=dsrPercent;
    }
    public  String getDsrPercent(){
        return this.dsrPercent;
    }
    public void setShipScore (String  shipScore){
        this.shipScore=shipScore;
    }
    public  String getShipScore(){
        return this.shipScore;
    }
    public void setShipPercent (String  shipPercent){
        this.shipPercent=shipPercent;
    }
    public  String getShipPercent(){
        return this.shipPercent;
    }
    public void setServiceScore (String  serviceScore){
        this.serviceScore=serviceScore;
    }
    public  String getServiceScore(){
        return this.serviceScore;
    }
    public void setServicePercent (String  servicePercent){
        this.servicePercent=servicePercent;
    }
    public  String getServicePercent(){
        return this.servicePercent;
    }
    public void setHotPush (Integer  hotPush){
        this.hotPush=hotPush;
    }
    public  Integer getHotPush(){
        return this.hotPush;
    }
    public void setTeamName (String  teamName){
        this.teamName=teamName;
    }
    public  String getTeamName(){
        return this.teamName;
    }
}
