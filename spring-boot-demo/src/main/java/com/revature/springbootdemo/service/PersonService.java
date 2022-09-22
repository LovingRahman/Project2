package com.revature.springbootdemo.service;

import com.revature.springbootdemo.entity.Item;
import com.revature.springbootdemo.entity.Person;
import com.revature.springbootdemo.repository.ItemRepository;
import com.revature.springbootdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    ItemRepository itemRepository;

    public Person register(Person person) {
        personRepository.save(person);
        return person;
    }

    public Person login(Person person) {
        Person personDB = personRepository.findById(person.getId()).get();
        if (person.getPassword().equals(personDB.getPassword())) return personDB;
        else return null;
    }

    public Person buy(Long personId, Long itemId) {
        Item item = itemRepository.findById(itemId).get();
        Person person = personRepository.findById(personId).get();
        // update person object
        person.buy(item);
        // persist change to database
        personRepository.save(person);
        return person;

    }

    public List<Item> getBoughtItems(Long personId) {
        // get items that correspond to this persons id

        // if we added more parameters, the syntax would be ?2, ?3, and so on
        return personRepository.findById(personId).get().getBoughtItems();

    }


}
