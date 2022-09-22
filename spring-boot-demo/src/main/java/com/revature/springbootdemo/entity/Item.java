package com.revature.springbootdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
// data gives us getters/setters/toString/hashCode/Equals etc
@Entity
// entity annotation indicates that this class  should be persisted to a database, there will be a
// item table in database


public class Item {
    // id tells us this id field will be primary key
    // can make it a serial id using @GeneratedId (so it increments)
    // changing the strategy type: https://docs.oracle.com/javaee/6/api/index.html
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Integer quantity;


}

