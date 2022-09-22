package com.revature.springbootdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@Data
@Entity
public class Checkout {
    // how to have same id as item??
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int totalPrice;
    private String shippingAddress;
    private int paymentMethod;
    // also want a list returned when we checkout - of all items bought/are going to buy


}
