package com.learn.controller;

import com.learn.entity.Transaction;
import com.learn.service.BankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/transaction")
public class BankingController {

    @Autowired
    private BankingService bankingService;

    @GetMapping(value = "/getAll")
    public List<Transaction> getTransaction(@RequestParam Long accountNo) {
        return bankingService.searchTransaction(accountNo);
    }

    @PostMapping(value = "/create")
    public void createEmployee(@RequestBody Transaction transaction) {
        bankingService.createTransaction(transaction);

    }
    @PutMapping(value = "/update")
    public void updateEmployee(@RequestBody Transaction transaction) {
        bankingService.updateTransaction(transaction);

    }

    @DeleteMapping(value = "/deleteById")
    public void deleteEmployee(@RequestParam Integer id) {
        bankingService.deleteTransation(id);

    }

}
