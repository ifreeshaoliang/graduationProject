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
}
