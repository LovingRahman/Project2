package com.revature.project21.repository;

import com.revature.project21.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Personrepository extends JpaRepository<Person, Long> {
    public Person findByUsername(String username);
}
