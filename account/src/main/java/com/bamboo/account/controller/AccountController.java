package com.bamboo.account.controller;

import com.bamboo.account.model.Account;
import com.bamboo.account.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author WuWei
 * @date 2020/9/7 10:38 下午
 */

@RequestMapping(value = "/account")
@RestController
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping(value = "/all")
    public List<Account> allAccounts() {
        return accountService.selectAll();
    }

}
