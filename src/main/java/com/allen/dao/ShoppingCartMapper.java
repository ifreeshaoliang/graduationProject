package com.allen.dao;

import com.allen.pojo.ShoppingCart;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ShoppingCartMapper {
    @Insert("insert into shoppingcart (userID, goodsID, goodsCounts)" +
            "       values (#{userID}, #{goodsID}, #{goodsCounts})")
    int addShoppingCart(ShoppingCart shoppingCart);

    @Delete("delete from shoppingcart where sID = #{sID}")
    int deleteShoppingCart(int id);

    @Update("update shoppingcart" +
            " set userID = #{userID}, goodsID = #{goodsID}, goodsCounts = #{goodsCounts} " +
            " where sID= #{sID}")
    int updateShoppingCart(ShoppingCart shoppingCart);

    @Select("select * from shoppingcart where userID = #{userID}")
    List<ShoppingCart> queryUserShoppingCart(int userID);
}
