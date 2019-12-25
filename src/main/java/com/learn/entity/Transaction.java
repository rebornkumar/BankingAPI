package com.learn.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    @Column(name = "account_no")
    private Long accountNo;

    @Column(name = "date")
    private Date date;

    @Column(name = "transaction_detail")
    private String transactionDetail;

    @Column(name = "value_date")
    private Date valueDate;

    @Column(name = "withdrawal_amount")
    private Integer withdrawalAmount;

    @Column(name = "deposit_amount")
    private Integer depositAmount;

    @Column(name = "balance_amount")
    private Integer balanceAmount;
}
