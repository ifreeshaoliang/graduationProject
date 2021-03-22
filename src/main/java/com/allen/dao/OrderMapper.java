package com.allen.dao;

import com.allen.pojo.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderMapper {
    @Insert("insert into order(userID,contactID,orderTime,discount,pay) " +
            "values (#{userID}, #{contactID}, #{orderTime}, #{discount}, #{pay})")
    int addOrder(Order order);

    @Delete("delete from order where orderID = #{orderID} ")
    int deleteOrder(int id);

    @Update("update order " +
    "set userID = #{userID}, contactID = #{contactID}, orderTime = #{orderTime}," +
            "  discount = #{discount}, pay = #{pay} " +
    "where orderID = #{orderID} ")
    int updateOrder(Order order);

    @Select("select * from order where orderID = #{orderID}")
    Order queryOrderByID(int id);

    @Select("select * from order")
    List<Order> queryAllOrder();
}
