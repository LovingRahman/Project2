package com.revature.springbootdemo.controller;


import com.revature.springbootdemo.entity.Item;
import com.revature.springbootdemo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping()
    public Item insert(@RequestBody Item item) {
        return itemService.insert(item);
    }

    @GetMapping()
    public List<Item> getAll() {
        return itemService.getAll();
    }

    @GetMapping("/{id}")
    public Item getById(@PathVariable("id") Long id) {
        return itemService.getById(id);
    }

    @PutMapping()
    public Item update(@RequestBody Item item) {
        return itemService.update(item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        itemService.delete(id);
    }


}

