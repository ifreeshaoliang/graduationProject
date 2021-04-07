package com.allen.pojo;

import java.util.Date;

/**
 * @author ifree
 */

public class Order {
    private int orderID;
    private int userID;
    private int contactID;
    private Date orderTime;
    private int discount;
    private double pay;

    public Order() {
    }

    public Order(int orderID, int userID, int contactID, Date orderTime, int discount, double pay) {
        this.orderID = orderID;
        this.userID = userID;
        this.contactID = contactID;
        this.orderTime = orderTime;
        this.discount = discount;
        this.pay = pay;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getContactID() {
        return contactID;
    }

    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", userID=" + userID +
                ", contactID=" + contactID +
                ", orderTime=" + orderTime +
                ", discount=" + discount +
                ", pay=" + pay +
                '}';
    }
}
