package com.revature.project21.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@AllArgsConstructor
@Data
@Entity

public class Cart implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer localquantity;

//for an given cart we're giong to have multiple product
    @OneToMany
    private List<ProductCart> productsInCart;


    public Cart(){
        this.productsInCart = new ArrayList<ProductCart>();
    }

    public void addToCart(Product newProduct, int localquantity){
        for(int i = 0; i <productsInCart.size(); i++){
            ProductCart current = productsInCart.get(i);
            if(current.getProduct().getId()== newProduct.getId()){
                current.setQuantity(current.getQuantity() + localquantity);
                productsInCart.set(i,current);
                return;
            }
        }
        productsInCart.add(new ProductCart(newProduct, localquantity));
    }













}
