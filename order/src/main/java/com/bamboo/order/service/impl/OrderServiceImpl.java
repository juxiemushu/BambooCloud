package com.bamboo.order.service.impl;

import com.bamboo.account.model.Account;
import com.bamboo.order.feign.AccountFeignClient;
import com.bamboo.order.mapper.OrderMapper;
import com.bamboo.order.model.Order;
import com.bamboo.order.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author WuWei
 * @date 2020/9/8 12:32 上午
 */

@Slf4j
@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private AccountFeignClient accountFeignClient;

    @Override
    public List<Order> selectAll() {
        List<Account> accounts = accountFeignClient.allAccounts();

        log.info("---------------------------");
        log.info(accounts.toString());
        return orderMapper.selectAll();
    }
}
