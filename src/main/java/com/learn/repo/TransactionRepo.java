package com.learn.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.learn.entity.Transaction;

import java.util.Date;
import java.util.List;

public interface TransactionRepo extends JpaRepository<Transaction,Integer> {

    List<Transaction> findByAccountNo(Long accountNo);
    List<Transaction> findByDate(Date date);
}
