package com.allen.service.Impl;

import com.allen.dao.OrderMapper;
import com.allen.pojo.Order;
import com.allen.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ifree
 */
@Service
public class OrderServiceImpl implements OrderService {
    private OrderMapper orderMapper;

    @Autowired
    @Qualifier("orderMapper")
    public void setOrderMapper(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @Override
    public int addOrder(Order order) {
        return orderMapper.addOrder(order);
    }

    @Override
    public int deleteOrder(int id) {
        return orderMapper.deleteOrder(id);
    }

    @Override
    public int updateOrder(Order order) {
        return orderMapper.updateOrder(order);
    }

    @Override
    public Order queryOrderByID(int id) {
        return orderMapper.queryOrderByID(id);
    }

    @Override
    public List<Order> queryAllOrder() {
        return orderMapper.queryAllOrder();
    }
}
