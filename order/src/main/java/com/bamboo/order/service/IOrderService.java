package com.bamboo.order.service;

import com.bamboo.order.model.Order;

import java.util.List;

/**
 * @author WuWei
 * @date 2020/9/8 12:31 上午
 */

public interface IOrderService {

    List<Order> selectAll();

}
