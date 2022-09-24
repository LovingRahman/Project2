package com.revature.project21.service;

import com.revature.project21.entity.Cart;
import com.revature.project21.entity.Product;
import com.revature.project21.repository.Cartrepository;
import com.revature.project21.repository.Personrepository;
import com.revature.project21.repository.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    Personrepository personrepository;
    @Autowired
    Productrepository productrepository;

    @Autowired
    Cartrepository cartrepository;

    @Autowired
    ProductService productService;

    public void add(Cart cart){
        cartrepository.save(cart);
    }
    public Cart getById(Long id){
       return cartrepository.findById(id).get();
    }

    public List<Cart> getAll(){
        return cartrepository.findAll();
    }

    public Cart addToCart(Cart cart, Long productid, int quantity){
        Product product = productService.getById(productid);
        product.setQuantity(product.getQuantity()-quantity);
        productrepository.save(product);
        cart.addToCart(product, quantity);
        cartrepository.save(cart);
        return cart;
    }

}
