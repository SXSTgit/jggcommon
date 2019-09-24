package com.zb.pojo;

import java.io.Serializable;

/***
 *
 */
public class Goods implements Serializable {
    private Integer id;
    private String goodsId;//淘宝商品id
    private String itemLink;//商品淘宝链接
    private String title;//淘宝标题
    private String dtitle;//大淘客短标题
    private String desc;//推广文案
    private int cid;//商品在大淘客的分类id
    private int tbcid;//商品在淘宝的分类id
    private String mainPic;//商品主图链接
    private String marketingMainPic;//营销主图链接
    private Double originalPrice;//商品原价
    private Double actualPrice;//券后价
    private String couponLink;//优惠券链接
    private int shopType;//淘宝卖家id
    private String sellerId;//淘宝卖家id
    private String shopName;//店铺名称
    private int shopLevel;//淘宝店铺等级

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getItemLink() {
        return itemLink;
    }

    public void setItemLink(String itemLink) {
        this.itemLink = itemLink;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDtitle() {
        return dtitle;
    }

    public void setDtitle(String dtitle) {
        this.dtitle = dtitle;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getTbcid() {
        return tbcid;
    }

    public void setTbcid(int tbcid) {
        this.tbcid = tbcid;
    }

    public String getMainPic() {
        return mainPic;
    }

    public void setMainPic(String mainPic) {
        this.mainPic = mainPic;
    }

    public String getMarketingMainPic() {
        return marketingMainPic;
    }

    public void setMarketingMainPic(String marketingMainPic) {
        this.marketingMainPic = marketingMainPic;
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Double getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(Double actualPrice) {
        this.actualPrice = actualPrice;
    }

    public String getCouponLink() {
        return couponLink;
    }

    public void setCouponLink(String couponLink) {
        this.couponLink = couponLink;
    }

    public int getShopType() {
        return shopType;
    }

    public void setShopType(int shopType) {
        this.shopType = shopType;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getShopLevel() {
        return shopLevel;
    }

    public void setShopLevel(int shopLevel) {
        this.shopLevel = shopLevel;
    }
}
