package com.revature.project21.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@AllArgsConstructor

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
//    @Column(unique = true, nullable = false)
    private String username;
    private String password;
    private String address;
    private Long cardnumber;
    private Long phonenumber;

    @OneToOne(targetEntity = Cart.class, cascade = CascadeType.ALL)
    private Cart currentcart;

    @OneToMany(targetEntity = Cart.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", referencedColumnName = "id")
    private List<Cart> previous;

    public Person(){
        this.currentcart = new Cart();
        this.previous= new ArrayList<>();
    }
//    public Person(String address, Long phonenumber){
//        this.address = address;
//        this.phonenumber = phonenumber;
//    }
//
//    public Person(String password){
//        this.password = password;
//    }






}
