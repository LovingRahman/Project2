package com.revature.project21.repository;

import com.revature.project21.entity.Cart;
import com.revature.project21.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Cartrepository extends JpaRepository<Cart, Long > {
//public Cart getCartByStatus(Long personid, Boolean status);


}
