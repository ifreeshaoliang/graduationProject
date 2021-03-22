package com.allen.service;

import com.allen.pojo.Order;

import java.util.List;

public interface OrderService {
    int addOrder(Order order);

    int deleteOrder(int id);

    int updateOrder(Order order);

    Order queryOrderByID(int id);

    List<Order> queryAllOrder();
}
