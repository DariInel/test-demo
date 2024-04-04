package com.example.testdemo.repository;

import com.example.testdemo.entity.PlayerEntity;
import com.example.testdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
