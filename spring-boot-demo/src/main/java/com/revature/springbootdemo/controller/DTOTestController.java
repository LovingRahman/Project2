package com.revature.springbootdemo.controller;

import com.revature.springbootdemo.dto.ItemPerson;
import com.revature.springbootdemo.entity.Item;
import com.revature.springbootdemo.entity.Person;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/dto")
@RestController
public class DTOTestController {

        public void post(@RequestBody ItemPerson itemPerson) {
            System.out.println(itemPerson);
            Item item = itemPerson.getItem();
            Person person = itemPerson.getPerson();
            // do whatever we need to do with entities
        }

}
