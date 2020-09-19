package com.bamboo.order.feign;

import com.bamboo.account.model.Account;
import com.bamboo.order.feign.fallback.AccountFeignClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author WuWei
 * @date 2020/9/8 9:54 上午
 */

@FeignClient(name = "bamboo-account", path = "/account", fallbackFactory = AccountFeignClientFallbackFactory.class)
public interface AccountFeignClient {

    @GetMapping(value = "/all")
    List<Account> allAccounts();

}
