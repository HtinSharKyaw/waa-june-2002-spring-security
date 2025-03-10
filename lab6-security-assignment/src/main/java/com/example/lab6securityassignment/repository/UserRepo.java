package com.example.lab6securityassignment.repository;


import com.example.lab6securityassignment.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {
    User findByEmail(String email);
}
