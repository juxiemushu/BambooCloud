package com.bamboo.order.feign.fallback;

import com.bamboo.order.feign.AccountFeignClient;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author WuWei
 * @date 2020/9/8 9:57 上午
 */

@Slf4j
@Component
public class AccountFeignClientFallbackFactory implements FallbackFactory<AccountFeignClient> {

    @Override
    public AccountFeignClient create(Throwable throwable) {
        log.error("feign error: " + throwable.getCause());
        return null;
    }

}
