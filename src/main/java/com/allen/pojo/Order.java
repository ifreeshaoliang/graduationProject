package com.allen.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author ifree
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private int orderID;
    private int userID;
    private int contactID;
    private Date orderTime;
    private int discount;
    private double pay;
}
