package com.revature.project21.controller;

import com.revature.project21.entity.Cart;
import com.revature.project21.entity.Person;
import com.revature.project21.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {
    @Autowired
    PersonService personService;
    @PostMapping
    public Person auth(@RequestBody Person person, @RequestParam(value = "auth", required = true) String authType){
        if(authType.equals("register")) return personService.register(person);
        else if (authType.equals("login")) return personService.login(person);
        else return null;

    }

    @PostMapping("/update/{personid}")
    public Person update(@RequestBody Person person){
        return personService.update(person);
    }

    @GetMapping("/{id}")
    public Person getById(@PathVariable("id") Long id){
        return personService.getById(id);
    }

    @PatchMapping("/{personid}/products/{productid}")
    public Cart addToCart(@PathVariable("personid")Long personid, @PathVariable("productid") Long productid, @RequestParam(value = "quantity", required = false)Integer quantity){
        if(quantity == null){
            quantity = 1;
        }
        return personService.addTocart(personid, productid, quantity);
    }
    @PatchMapping("/{personid}")
    public void checkout(@PathVariable("personid") Long personid){
        personService.checkout(personid);
    }
    @GetMapping
    public List<Cart> getAllPreviousOrders(@RequestBody Long personid){
        return personService.getAllPreviousOrder(personid);
    }
}
