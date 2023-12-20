package com.practice.demo.services;

import com.practice.demo.models.Account;
import com.practice.demo.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImplementation implements AccountService{

    private final AccountRepository accountRepository;

    @Autowired
    public AccountServiceImplementation(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    //These will definitely be changed in the future, with some validations.
    @Override
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }
}
