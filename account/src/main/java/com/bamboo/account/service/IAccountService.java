package com.bamboo.account.service;

import com.bamboo.account.model.Account;

import java.util.List;

/**
 * @author WuWei
 * @date 2020/9/7 10:38 下午
 */

public interface IAccountService {

    List<Account> selectAll();

}
