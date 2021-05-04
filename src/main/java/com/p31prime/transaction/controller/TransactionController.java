package com.p31prime.transaction.controller;

import com.p31prime.transaction.model.Transaction;
import com.p31prime.transaction.service.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

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
        Optional<Transaction> transaction = service.getTransaction(id);

        if (transaction.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Actor Not Found");

        return transaction;
    }

    @Override
    public void save(Transaction transaction) {
        service.saveTransaction(transaction);
    }

}
