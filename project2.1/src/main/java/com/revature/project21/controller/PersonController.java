package com.revature.project21.controller;

import com.revature.project21.entity.Person;
import com.revature.project21.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping
    public Person update(@RequestBody Person person){
        return personService.update(person);
    }
//    @PatchMapping("/{personid}/products/{productid}")
//    public Person addToCart(@PathVariable Long personid, @PathVariable Long productid){
//       return personService.addToCart(personid, productid);
//    }

    @GetMapping
    public Person showCart(@RequestBody Long personid){
        return (Person) personService.showCart(personid);
    }
}
