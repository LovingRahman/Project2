package com.revature.project21.repository;

import com.revature.project21.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Cartrepository extends JpaRepository<Cart, Long > {



}