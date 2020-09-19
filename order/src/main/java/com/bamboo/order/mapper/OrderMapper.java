package com.bamboo.order.mapper;

import com.bamboo.order.model.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author WuWei
 * @date 2020/9/8 12:30 上午
 */

@Repository
public interface OrderMapper {

    List<Order> selectAll();

}
