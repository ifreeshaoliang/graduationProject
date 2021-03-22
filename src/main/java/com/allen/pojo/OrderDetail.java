package com.allen.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ifree
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail {
    private int ID;
    private int orderID;
    private int goodsID;
}
