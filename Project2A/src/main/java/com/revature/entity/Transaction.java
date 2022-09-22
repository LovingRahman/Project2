package com.revature.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Transaction {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String productname;
    private double unitprice;
    private int quantity;
    private String description;
    private String creditcard;
    private String address;


}
