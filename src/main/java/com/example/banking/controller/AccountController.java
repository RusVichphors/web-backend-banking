
package com.example.banking.controller;

import org.springframework.web.bind.annotation.*;
import com.example.banking.entity.Account;
import com.example.banking.service.AccountService;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService accountService;

    // Constructor
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    // Create Account
    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountService.saveAccount(account);
    }

    // Get All Accounts
    @GetMapping
    public List<Account> getAll() {
        return accountService.getAll();
    }
}
