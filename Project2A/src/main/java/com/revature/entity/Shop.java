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
public class Shop {


    @Id
    @GeneratedValue
    private Long id;
    private String productname;
    private double unitprice;
    private Integer quantity;
    private String description;

    public Shop(String productname, Integer quantity) {
        this.productname = productname;
        this.quantity = quantity;
    }

    public Shop(String productname) {
        this.productname = productname;
    }
}
