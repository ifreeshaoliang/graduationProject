package com.allen.pojo;


/**
 * @author ifree
 */

public class Goods {
    private int goodsID;
    private String goodsName;
    private double price;
    private String goodsUrl;
    private String goodsImg;

    public Goods() {
    }

    public Goods(int goodsID, String goodsName, double price, String goodsUrl, String goodsImg) {
        this.goodsID = goodsID;
        this.goodsName = goodsName;
        this.price = price;
        this.goodsUrl = goodsUrl;
        this.goodsImg = goodsImg;
    }

    public int getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(int goodsID) {
        this.goodsID = goodsID;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGoodsUrl() {
        return goodsUrl;
    }

    public void setGoodsUrl(String goodsUrl) {
        this.goodsUrl = goodsUrl;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsID=" + goodsID +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                ", goodsUrl='" + goodsUrl + '\'' +
                ", goodsImg='" + goodsImg + '\'' +
                '}';
    }
}
