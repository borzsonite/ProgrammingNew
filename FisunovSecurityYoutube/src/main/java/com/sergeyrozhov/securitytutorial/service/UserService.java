package com.sergeyrozhov.securitytutorial.service;

import com.sergeyrozhov.securitytutorial.models.Role;
import com.sergeyrozhov.securitytutorial.models.User;
import com.sergeyrozhov.securitytutorial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UserService implements UserDetailsService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUserByUserName(String username) {
        return userRepository.findUserByUsername(username);
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = findUserByUserName(username);
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), rolesToAuthorities(user.getRoles()));
    }


    private Collection<? extends SimpleGrantedAuthority> rolesToAuthorities(Collection<Role> roles) {
        return roles.stream().map(s -> new SimpleGrantedAuthority(s.getName())).collect(Collectors.toList());
    }
}
