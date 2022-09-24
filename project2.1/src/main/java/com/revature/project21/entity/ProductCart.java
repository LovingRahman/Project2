package com.revature.project21.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class ProductCart {
    @Id
    @GeneratedValue
    private Long id;

    private int quantity;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Cart cart;

    public ProductCart(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public double getPrice(){
        return this.quantity * this.product.getPrice();
    }
}
