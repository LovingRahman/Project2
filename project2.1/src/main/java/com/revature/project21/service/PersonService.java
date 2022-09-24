package com.revature.project21.service;

import com.revature.project21.entity.Cart;
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
    @Autowired
    CartService cartService;


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

    public Person getById(Long personid){
        return personrepository.getById(personid);
    }

    public Cart addTocart(Long personid, Long productid, int quantity){
        Person person = getById(personid);
        Cart cart = person.getCurrentcart();
        cartService.addToCart(cart, productid, quantity);
        return cart;
    }

    public void checkout(Long personid){
        Person person = getById(personid);
        person.getPrevious().add(person.getCurrentcart());
        personrepository.save(person);
    }

    public List<Cart> getAllPreviousOrder(Long personid){
        return personrepository.getById(personid).getPrevious();
    }

}
