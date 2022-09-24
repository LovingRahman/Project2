package com.revature.project21.controller;

import com.revature.project21.entity.Cart;
import com.revature.project21.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carts")
public class CartController {
    @Autowired
    CartService cartService;


    @PostMapping()
    public Cart add(@RequestBody Cart cart){
        cartService.add(cart);
        return cart;
    }

    @GetMapping
    public List<Cart> getAllCart(){
       return cartService.getAll();

    }
    @GetMapping("/{id}")
    public Cart getById(@RequestBody Long id){
        return cartService.getById(id);
    }
}
