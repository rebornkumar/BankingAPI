package com.learn.serviceImpl;

import com.learn.entity.Transaction;
import com.learn.repo.TransactionRepo;
import com.learn.service.BankingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class BankingServiceImpl  implements BankingService {

    @Autowired
    private TransactionRepo transactionRepo;

    @Override
    public List<Transaction> searchTransaction(Long accountNo) {
        List<Transaction> transactions = new ArrayList<>();
        transactions = transactionRepo.findByAccountNo(accountNo);
        return transactions;
    }

    @Override
    public void createTransaction() {
        transactionRepo.

    }

    @Override
    public void updateTransaction() {

    }

    @Override
    public void deleteTransation() {

    }
}
