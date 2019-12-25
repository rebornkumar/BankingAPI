package com.learn.serviceImpl;

import com.learn.entity.Transaction;
import com.learn.repo.TransactionRepo;
import com.learn.service.BankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
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
    public void createTransaction(Transaction transaction) {
        transactionRepo.create(transaction.getId(),transaction.getAccountNo(), transaction.getDate(), transaction.getTransactionDetail(), transaction.getValueDate(), transaction.getWithdrawalAmount(), transaction.getDepositAmount(), transaction.getBalanceAmount());
    }

    @Override
    public void updateTransaction(Transaction transaction) {
        transactionRepo.update(transaction.getId(),transaction.getAccountNo(), transaction.getTransactionDetail(), transaction.getValueDate(), transaction.getWithdrawalAmount(), transaction.getDepositAmount(), transaction.getBalanceAmount());
    }

    @Override
    public void deleteTransation(Integer id) {
        transactionRepo.deleteById(id);
    }
}
