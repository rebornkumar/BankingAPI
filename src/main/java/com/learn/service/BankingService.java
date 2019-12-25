package com.learn.service;

import com.learn.entity.Transaction;

import java.util.List;

public interface BankingService {

    //create,update,delete and search methods
    List<Transaction> searchTransaction(Long accountNo);

    void createTransaction();
    void updateTransaction();
    void deleteTransation();

}
