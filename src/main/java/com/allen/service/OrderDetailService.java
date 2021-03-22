package com.allen.service;

import com.allen.pojo.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    int addOrderDetail(OrderDetail orderDetail);

    int deleteOrderDetail(int id);

    int updateOrderDetail(OrderDetail orderDetail);

    OrderDetail queryOrderDetailByID(int id);

    List<OrderDetail> queryAllOrderDetail();
}
