package com.allen.pojo;

/**
 * @author ifree
 */

public class ShoppingCart {
    private int sID;
    private int userID;
    private int goodsID;
    private int goodsCounts;

    public ShoppingCart() {
    }

    public ShoppingCart(int sID, int userID, int goodsID, int goodsCounts) {
        this.sID = sID;
        this.userID = userID;
        this.goodsID = goodsID;
        this.goodsCounts = goodsCounts;
    }

    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(int goodsID) {
        this.goodsID = goodsID;
    }

    public int getGoodsCounts() {
        return goodsCounts;
    }

    public void setGoodsCounts(int goodsCounts) {
        this.goodsCounts = goodsCounts;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "sID=" + sID +
                ", userID=" + userID +
                ", goodsID=" + goodsID +
                ", goodsCounts=" + goodsCounts +
                '}';
    }
}
