package com.revature.service;


import com.revature.entity.Transaction;
import com.revature.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;


    public List<Transaction> getByName(String name){
        return transactionRepository.findByUsername(name);
    }

}
