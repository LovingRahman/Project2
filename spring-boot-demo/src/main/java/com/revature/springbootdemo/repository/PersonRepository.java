package com.revature.springbootdemo.repository;

import com.revature.springbootdemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> { // long is for the id, just like in item




}
