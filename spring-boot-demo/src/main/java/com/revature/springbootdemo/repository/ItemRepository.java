package com.revature.springbootdemo.repository;


import com.revature.springbootdemo.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// Stereotypes  = repository, controller/ service --- all of these are @Component, which means the class/interface
// will be registered as a bean
// specifying this is a bean and that this is our data access layer
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> { // Long is for the id type in item
    // we don't need an implementation of this interface
    // we already have some automatically created methods that will let us interact with the database

    // derived query -- so all we have to do is specify name of method and it should work as expected
    // syntax found here: https://www.baeldung.com/spring-data-derived-queries
    // extra methods
    List<Item> findByName(String name);

    // here we make a custom query
    @Query(value = "SELECT * FROM item where person_fk = ?1", nativeQuery = true)
    // ?1 refers to parameter owner_id, is just a place holder
    public List<Item> findBoughtItems(Long owner_id);

}
