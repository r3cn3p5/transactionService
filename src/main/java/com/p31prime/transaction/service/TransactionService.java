package com.p31prime.transaction.service;

import com.p31prime.transaction.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransactionService {

    public void saveTransaction(Transaction transaction) {
        System.out.println("Save Transaction");

    }

    public Optional<Transaction> getTransaction(int id) {
        System.out.println("Get Transaction");

        return Optional.empty();
    }

}
