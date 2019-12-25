package com.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class BankingController {

    @Autowired
    private BankingService bankingService;

    @GetMapping(value = "/getAll")
    public List<Transaction> getTransaction() {
        bankingService.findAll();
    }

    @PostMapping(value = "/create")
    public void createEmployee(@RequestBody Transaction transaction) {
        bankingService.create();

    }
    @PutMapping(value = "/update")
    public void updateEmployee(@RequestBody Transaction transaction) {
        bankingService.update();

    }

    @DeleteMapping(value = "/deleteById")
    public void deleteEmployee(@RequestParam Integer id) {
        employeeService.deleteEmployee(id);

    }

}
