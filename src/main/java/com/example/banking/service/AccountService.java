
package com.example.banking.service;

import org.springframework.stereotype.Service;
import com.example.banking.entity.Account;
import com.example.banking.reponsitory.AccountRepository;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    // Constructor
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    // Save Account
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    // Get All Accounts
    public List<Account> getAll() {
        return accountRepository.findAll();
    }
}
