package com.revature.project21.service;

import com.revature.project21.entity.Cart;
import com.revature.project21.entity.Person;
import com.revature.project21.entity.Product;
import com.revature.project21.repository.Cartrepository;
import com.revature.project21.repository.Personrepository;
import com.revature.project21.repository.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
    @Autowired
    Personrepository personrepository;
    @Autowired
    Productrepository productrepository;

    @Autowired
    Cartrepository cartrepository;

public Cart createCart(Long personid){
    Person person = personrepository.findById(personid).get();

    Cart cart= new Cart();
    cart.setPerson(person);
    cart.setStatus(true);
    cart.setProductincart(new ArrayList<>());

   return cartrepository.save(cart);

}

    public Cart addToCart(Long personid,Long productid, Integer quantity){
        Cart cart = createCart(personid);
        Product product = productrepository.findById(productid).get();
        cart.setLocalquantity(quantity);


        cartrepository.save(cart);
        return cart;

    }




}
