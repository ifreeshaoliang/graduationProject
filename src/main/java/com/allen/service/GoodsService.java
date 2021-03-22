package com.allen.service;

import com.allen.pojo.Goods;

import java.util.List;

public interface GoodsService {
    int addGoods(Goods goods);
    int deleteGoods(int id);
    int updateGoods(Goods goods);
    Goods queryGoodsByID(int id);
    List<Goods> queryAllGoods();
}
