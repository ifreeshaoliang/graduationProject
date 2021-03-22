package com.allen.service.Impl;

import com.allen.dao.ShoppingCartMapper;
import com.allen.pojo.ShoppingCart;
import com.allen.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ifree
 */
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    private ShoppingCartMapper shoppingCartMapper;

    @Autowired
    @Qualifier("shoppingCartMapper")
    public void setShoppingCartMapper(ShoppingCartMapper shoppingCartMapper) {
        this.shoppingCartMapper = shoppingCartMapper;
    }

    @Override
    public int addShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCartMapper.addShoppingCart(shoppingCart);
    }

    @Override
    public int deleteShoppingCart(int id) {
        return shoppingCartMapper.deleteShoppingCart(id);
    }

    @Override
    public int updateShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCartMapper.updateShoppingCart(shoppingCart);
    }

    @Override
    public List<ShoppingCart> queryUserShoppingCart(int userID) {
        return shoppingCartMapper.queryUserShoppingCart(userID);
    }
}
