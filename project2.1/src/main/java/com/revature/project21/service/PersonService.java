package com.revature.project21.service;

import com.revature.project21.entity.Person;
import com.revature.project21.entity.Product;
import com.revature.project21.repository.Cartrepository;
import com.revature.project21.repository.Personrepository;
import com.revature.project21.repository.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService {
    @Autowired
    Personrepository personrepository;
    @Autowired
    Productrepository productrepository;


    public Person login(Person person){
        Person personDB = personrepository.findByUsername(person.getUsername());
        if(person.getPassword().equals(personDB.getPassword())) return personDB;
        else return null;
    }

    public Person register(Person person){
        personrepository.save(person);
        return person;
    }

    public Person update(Person person){
        personrepository.save(person);
        return person;
    }

//    public Person addToCart(Long personid, Long productid){
//        Person person = personrepository.findById(personid).get();
//        Product product = productrepository.findById(productid).get();
//        person.addtoCart(product);
//        personrepository.save(person);
//        return person;
//
//    }

    public List<Product> showCart(Long personid){
        return productrepository.findByBuyerId(personid);
    }
}
