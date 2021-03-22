package com.allen.service.Impl;

import com.allen.dao.OrderDetailMapper;
import com.allen.pojo.OrderDetail;
import com.allen.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ifree
 */
@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    private OrderDetailMapper orderDetailMapper;

    @Autowired
    @Qualifier("orderDetailMapper")
    public void setOrderDetailMapper(OrderDetailMapper orderDetailMapper) {
        this.orderDetailMapper = orderDetailMapper;
    }

    @Override
    public int addOrderDetail(OrderDetail orderDetail) {
        return orderDetailMapper.addOrderDetail(orderDetail);
    }

    @Override
    public int deleteOrderDetail(int id) {
        return orderDetailMapper.deleteOrderDetail(id);
    }

    @Override
    public int updateOrderDetail(OrderDetail orderDetail) {
        return orderDetailMapper.updateOrderDetail(orderDetail);
    }

    @Override
    public OrderDetail queryOrderDetailByID(int id) {
        return orderDetailMapper.queryOrderDetailByID(id);
    }

    @Override
    public List<OrderDetail> queryAllOrderDetail() {
        return orderDetailMapper.queryAllOrderDetail();
    }
}
