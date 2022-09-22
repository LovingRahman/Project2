package com.revature.springbootdemo.controller;


import com.revature.springbootdemo.entity.Item;
import com.revature.springbootdemo.entity.Person;
import com.revature.springbootdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping()
    public Person auth(@RequestBody Person person, @RequestParam(value = "auth", required = true) String authType) {
        // required = true guarantees that we need a request parameter with the key "auth"
        if(authType.equals("login")) {
            return personService.login(person);
        } else if (authType.equals("register")) {
            return personService.register(person);
        } else {
            return null;
        }

    }

    // sample request ex: localhost:8080/people/1/items/3
    // indicate that person with id 1 is buying item with id 3
    @PatchMapping("/{personId}/items/{itemId}")
    public Person buy(@PathVariable("personId") Long personId, @PathVariable("itemId") Long itemId) {
        return personService.buy(personId, itemId);
    }

    @GetMapping("{personId}/items")
    public List<Item> getBoughtItems(@PathVariable("personId") Long id) {
        return personService.getBoughtItems(id);
    }


}
