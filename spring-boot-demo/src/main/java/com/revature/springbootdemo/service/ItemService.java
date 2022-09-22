package com.revature.springbootdemo.service;

import com.revature.springbootdemo.entity.Item;
import com.revature.springbootdemo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    // these methods are in JpaRepository interfaces or whatever it extends

    @Autowired      // this will automatically inject repository bean into this class
    ItemRepository itemRepository;

    public Item insert(Item item) {
        // insert our item object into database with .save(item)
        itemRepository.save(item);               // method is from jparepository
        // because we are generating id of item, we want to return it
        return item;
    }

    public Item getById(Long id) {
        return itemRepository.findById(id).get();
    }

    public List<Item> getByStatus(String status) {
        System.out.println(status);

        return itemRepository.findByStatus(status);

                // repository and put findByStatus
    }
    public Item getByName(String name) {
        return (Item) itemRepository.findByName(name);
    }


    public List<Item> getAll() {
        return itemRepository.findAll();
    }

    public Item update(Item item) {
        itemRepository.save(item);
        return item;
    }

    public void delete(Long id) {
        itemRepository.deleteById(id);
    }

}
