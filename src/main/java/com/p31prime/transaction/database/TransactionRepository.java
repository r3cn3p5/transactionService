package com.p31prime.transaction.database;

import com.p31prime.transaction.model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<Transaction, Integer> {



}
