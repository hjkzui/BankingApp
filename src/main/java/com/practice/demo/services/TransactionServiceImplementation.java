package com.practice.demo.services;

import com.practice.demo.models.Transaction;
import com.practice.demo.repositories.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImplementation implements TransactionService{

    private final TransactionRepository transactionRepository;

    public TransactionServiceImplementation(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction saveTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
