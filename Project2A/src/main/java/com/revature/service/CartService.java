package com.revature.service;


import com.revature.entity.Cart;
import com.revature.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    CartRepository cartRepository;

    public Cart addToCart(Cart cart){
        cartRepository.save(cart);
        return cart;
    }
}
