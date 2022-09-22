package com.revature.project21.service;

import com.revature.project21.entity.Product;
import com.revature.project21.repository.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    Productrepository productrepository;

    public Product insert(Product product){
       return productrepository.save(product);

    }
    public Product update(Product product){
        return productrepository.save(product);

    }

    public List<Product> getAllProduct(){
        return productrepository.findAll();

    }

    public Product findById(Long productid){
        return productrepository.findById(productid).get();
    }

    public void delete(Long productid){
        productrepository.deleteById(productid);

    }

    public Product findByName(String name){
        return productrepository.findByName(name);
    }
}
