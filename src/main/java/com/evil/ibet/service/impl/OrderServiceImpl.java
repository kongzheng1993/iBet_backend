package com.evil.ibet.service.impl;

import com.evil.ibet.domain.Order;
import com.evil.ibet.repository.OrderRepository;
import com.evil.ibet.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderRepository orderRepository;

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> getOrderByUserId(String userId) {
        return orderRepository.selectOrdersByUserId(userId);
    }
}
