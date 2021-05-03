package com.p31prime.transaction.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Transaction {

    @Id
    Integer id;

    String payload;
}
