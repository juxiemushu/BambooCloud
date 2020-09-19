package com.bamboo.account.mapper;

import com.bamboo.account.model.Account;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author WuWei
 * @date 2020/9/7 10:41 下午
 */

@Component
public interface AccountMapper {

    List<Account> selectAll();

}
