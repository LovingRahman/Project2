package com.revature.project21.controller;

import com.revature.project21.entity.Cart;
import com.revature.project21.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    CartService cartService;

    @PostMapping ("products/{productid}/people/{personid}/quantity/{quantity}")
    public Cart addToCart(@RequestParam Long productid, @RequestParam Integer quantity){
        return cartService.addToCart(productid, quantity);
    }
}
