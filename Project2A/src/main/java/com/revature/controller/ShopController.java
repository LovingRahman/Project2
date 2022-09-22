package com.revature.controller;


import com.revature.entity.Shop;
import com.revature.entity.Transaction;
import com.revature.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Store")
public class ShopController {
    @Autowired
    ShopService shopService;



    @GetMapping()
    public void addToCart(@RequestParam String name){
        Shop itemdb = shopService.getByName(name);
        Shop item = new Shop(name);
        List<Shop> cart = new ArrayList<>();
        cart.add(item);
        System.out.println(item);
        System.out.println(cart);
    }













}
