package com.allen.dao;

import com.allen.pojo.OrderDetail;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderDetailMapper {
    @Insert("insert into orderdetail(orderID, goodsID) " +
            "values (#{orderID}, #{goodsID})")
    int addOrderDetail(OrderDetail orderDetail);

    @Delete("delete from orderdetail where ID = #{ID} ")
    int deleteOrderDetail(int id);

    @Update("update orderdetail " +
            "set orderID = #{orderID}, goodsID=#{goodsID} " +
            "where ID = #{ID} ")
    int updateOrderDetail(OrderDetail orderDetail);

    @Select("select * from orderdetail where ID = #{ID}")
    OrderDetail queryOrderDetailByID(int id);

    @Select("select * from orderdetail")
    List<OrderDetail> queryAllOrderDetail();
}
