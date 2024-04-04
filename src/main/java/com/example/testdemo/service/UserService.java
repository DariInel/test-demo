package com.example.testdemo.service;

import com.example.testdemo.entity.PlayerEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserService {

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}