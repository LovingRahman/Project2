package com.revature.project21.controller;

import com.revature.project21.entity.Product;
import com.revature.project21.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;


    @PostMapping
    public Product insert(@RequestBody Product product){
        return productService.insert(product);
    }
    @GetMapping
    public List<Product> getAll(){
        return productService.getAllProduct();
    }

    @PutMapping
    public Product update(@RequestBody Product product){
        return productService.update(product);
    }

    @DeleteMapping
    public void delete(@RequestBody Long productid){
        productService.delete(productid);
    }


}
