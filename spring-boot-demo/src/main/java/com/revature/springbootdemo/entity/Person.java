package com.revature.springbootdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// took out no args??? maybe will fix error

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;



@AllArgsConstructor
@Data
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   // @Column(unique = true, nullable = false)
    @Column(unique = true)
    private String username;
    private String password;

    // todo set up relationship with item class
    // set up many to many
    @ManyToMany(targetEntity = Item.class, cascade = CascadeType.ALL)
    // set up column in item table, keesp track of which preson owns this item - referencing id of person table
    // no longer works after many to many relationship
    @JoinColumn(name = "person_fk", referencedColumnName = "id")
    List<Item> cartItems;
    // List<Item> boughtItems;

    public Person() {
        // initialize myItems to be an empty arraylist
        //boughtItems = new ArrayList<>();
        cartItems = new ArrayList<>();
    }
    public void buy(Item item) {
        cartItems.add(item);
    }
}

