package com.revature.controller;


import com.revature.entity.Transaction;
import com.revature.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/past_orders")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @GetMapping()
    public List<Transaction> getByName(@RequestParam String user){
        return transactionService.getByName(user);
    }




}
