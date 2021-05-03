package com.p31prime.transaction.service;

import com.p31prime.transaction.database.TransactionRepository;
import com.p31prime.transaction.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository repository;


    public void saveTransaction(Transaction transaction) {
        System.out.println("Save Transaction");
        repository.save(transaction);
    }

    public Optional<Transaction> getTransaction(Integer id) {
        System.out.println("Get Transaction");
        return repository.findById(id);
    }

}
