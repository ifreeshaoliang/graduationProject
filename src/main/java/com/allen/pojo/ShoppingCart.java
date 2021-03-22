package com.allen.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ifree
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCart {
    private int sID;
    private int userID;
    private int goodsID;
    private int goodsCounts;
}
