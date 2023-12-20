package com.practice.demo.services;

import com.practice.demo.models.Transaction;
import org.springframework.stereotype.Service;

@Service
public interface TransactionService {
    public Transaction saveTransaction(Transaction transaction);
}
