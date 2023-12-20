package com.practice.demo.services;

import com.practice.demo.models.Account;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {
    public Account saveAccount(Account account);
}
