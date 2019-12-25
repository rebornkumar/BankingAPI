package com.learn.service;

import com.learn.entity.Transaction;

import java.util.List;

public interface BankingService {

    //create,update,delete and search methods
    List<Transaction> searchTransaction(Long accountNo);

    public void createTransaction(Transaction transaction);
    public void updateTransaction(Transaction transaction);
    public void deleteTransation(Integer id);

}
