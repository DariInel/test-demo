package com.example.testdemo.service.impl;

import com.example.testdemo.entity.User;
import com.example.testdemo.repository.UserRepository;
import com.example.testdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        User myUser = userRepository.findByUsername(username);
        return new org.springframework.security.core.userdetails.User(myUser.getUsername(),
                myUser.getPassword(), mapRolesToAthorities(myUser.getRoles()));
    }

    private List<? extends GrantedAuthority> mapRolesToAthorities(Set<Role> roles)
    {
        return roles.stream().map(r -> new SimpleGrantedAuthority("ROLE_" +
                r.getRoleName())).collect(Collectors.toList());
    }
}
