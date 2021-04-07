package com.allen.pojo;


/**
 * @author ifree
 */

public class OrderDetail {
    private int ID;
    private int orderID;
    private int goodsID;

    public OrderDetail() {
    }

    public OrderDetail(int ID, int orderID, int goodsID) {
        this.ID = ID;
        this.orderID = orderID;
        this.goodsID = goodsID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(int goodsID) {
        this.goodsID = goodsID;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "ID=" + ID +
                ", orderID=" + orderID +
                ", goodsID=" + goodsID +
                '}';
    }
}
