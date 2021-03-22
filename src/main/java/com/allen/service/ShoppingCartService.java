package com.allen.service;

import com.allen.pojo.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {
    int addShoppingCart(ShoppingCart shoppingCart);

    int deleteShoppingCart(int id);

    int updateShoppingCart(ShoppingCart shoppingCart);

    List<ShoppingCart> queryUserShoppingCart(int userID);
}
