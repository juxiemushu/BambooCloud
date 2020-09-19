package com.bamboo.account.service.impl;

import com.bamboo.account.mapper.AccountMapper;
import com.bamboo.account.model.Account;
import com.bamboo.account.service.IAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author WuWei
 * @date 2020/9/7 10:40 下午
 */

@Slf4j
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> selectAll() {
        List<Account> accountList = accountMapper.selectAll();
        log.info("query result: " + accountList);
        return accountList;
    }

}
