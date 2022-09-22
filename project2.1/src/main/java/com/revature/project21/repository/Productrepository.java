package com.revature.project21.repository;

import com.revature.project21.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Productrepository extends JpaRepository<Product, Long> {

    public Product findByName(String name);
    @Query(value = "SELECT * FROM product where personid = ?1", nativeQuery = true)
    public List<Product> findByBuyerId(Long personid);
}
