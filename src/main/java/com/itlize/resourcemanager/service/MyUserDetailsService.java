package com.itlize.resourcemanager.service;


import com.itlize.resourcemanager.entity.User;
import com.itlize.resourcemanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("[MyUserDetailsService] I got a username:"+username);
        Optional<User> user = usersRepository.findByUsername(username);
        user.orElseThrow(()-> new UsernameNotFoundException("Not found: "+ username));
        return user.map(MyUserDetails::new).get();
    }
}
