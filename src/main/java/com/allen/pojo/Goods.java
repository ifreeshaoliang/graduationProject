package com.allen.pojo;


/**
 * @author ifree
 */

public class Goods {
    private int goodsID;
    private String goodsName;
    private double goodsPrice;
    private String goodsRegion;
    private double goodsWeight;
    private int goodsCapacity;
    private int goodsProductionYear;
    private String goodsStorageMethod;
    private String goodsCategory;
    private int goodsShelfLife;

    public Goods() {
    }

    public Goods(int goodsID, String goodsName, double goodsPrice, String goodsRegion, double goodsWeight, int goodsCapacity, int goodsProductionYear, String goodsStorageMethod, String goodsCategory, int goodsShelfLife) {
        this.goodsID = goodsID;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsRegion = goodsRegion;
        this.goodsWeight = goodsWeight;
        this.goodsCapacity = goodsCapacity;
        this.goodsProductionYear = goodsProductionYear;
        this.goodsStorageMethod = goodsStorageMethod;
        this.goodsCategory = goodsCategory;
        this.goodsShelfLife = goodsShelfLife;
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

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsRegion() {
        return goodsRegion;
    }

    public void setGoodsRegion(String goodsRegion) {
        this.goodsRegion = goodsRegion;
    }

    public double getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(double goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public int getGoodsCapacity() {
        return goodsCapacity;
    }

    public void setGoodsCapacity(int goodsCapacity) {
        this.goodsCapacity = goodsCapacity;
    }

    public int getGoodsProductionYear() {
        return goodsProductionYear;
    }

    public void setGoodsProductionYear(int goodsProductionYear) {
        this.goodsProductionYear = goodsProductionYear;
    }

    public String getGoodsStorageMethod() {
        return goodsStorageMethod;
    }

    public void setGoodsStorageMethod(String goodsStorageMethod) {
        this.goodsStorageMethod = goodsStorageMethod;
    }

    public String getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory;
    }

    public int getGoodsShelfLife() {
        return goodsShelfLife;
    }

    public void setGoodsShelfLife(int goodsShelfLife) {
        this.goodsShelfLife = goodsShelfLife;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsID=" + goodsID +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsRegion='" + goodsRegion + '\'' +
                ", goodsWeight=" + goodsWeight +
                ", goodsCapacity=" + goodsCapacity +
                ", goodsProductionYear=" + goodsProductionYear +
                ", goodsStorageMethod='" + goodsStorageMethod + '\'' +
                ", goodsCategory='" + goodsCategory + '\'' +
                ", goodsShelfLife=" + goodsShelfLife +
                '}';
    }
}
