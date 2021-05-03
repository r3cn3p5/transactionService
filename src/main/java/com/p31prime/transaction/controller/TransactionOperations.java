package com.p31prime.transaction.controller;

import com.p31prime.transaction.model.Transaction;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RequestMapping ("/transaction")
public interface TransactionOperations {

    @GetMapping("/{id}")
    Optional<Transaction> getById(@PathVariable Integer id);

    @PostMapping("/save")
    void save(@RequestBody Transaction transaction);

}
