package com.revature.springbootdemo.dto;


import com.revature.springbootdemo.entity.Item;
import com.revature.springbootdemo.entity.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


// Data Transfer Object
// used when we want to package multiple classes/fields into one request body
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemPerson {
    Item item;
    Person person;
}
