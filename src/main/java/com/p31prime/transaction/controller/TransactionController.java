package com.p31prime.transaction.controller;

import com.p31prime.transaction.model.Transaction;
import com.p31prime.transaction.service.TransactionService;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.Optional;


@RestController
public class TransactionController implements TransactionOperations {

    private TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @Override
    public Optional<Transaction> getById(Integer id) {
        return service.getTransaction(id);
    }

    @Override
    public void save(Transaction transaction) {
        service.saveTransaction(transaction);
    }
}
