package com.bamboo.order.controller;

import com.bamboo.order.model.Order;
import com.bamboo.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author WuWei
 * @date 2020/9/8 12:33 上午
 */

@RequestMapping(value = "/order")
@RestController
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @RequestMapping(value = "/all")
    public List<Order> allOrders() {
        return orderService.selectAll();
    }

}
