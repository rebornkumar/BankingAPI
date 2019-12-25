package com.learn.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.learn.entity.Transaction;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction,Integer> {

    List<Transaction> findByAccountNo(Long accountNo);
    List<Transaction> findByDate(Date date);


    @Modifying
    @Transactional
    @Query(value = "insert into transaction(id,account_no,date,transaction_detail,value_date,withdrawal_amount,deposit_amount,balance_amount) values (?1,?2,?3,?4,?5,?6,?7,?8)", nativeQuery = true)
    void create(Integer id,Long accountNo,Date date, String transactionDetail, Date valueDate, Integer withdrawalAmount, Integer depositAmount, Integer balanceAmount);

    @Modifying
    @Transactional
    @Query(value = "update transaction SET transaction_detail = ?3, value_date = ?4, withdrawal_amount = ?5, deposit_amount = ?6, balance_amount = ?6 where id = ?1 and account_no = ?2", nativeQuery = true)
    void update(Integer id,Long accountNo, String transactionDetail, Date valueDate, Integer withdrawalAmount, Integer depositAmount, Integer balanceAmount);

//    deleteById();


}
