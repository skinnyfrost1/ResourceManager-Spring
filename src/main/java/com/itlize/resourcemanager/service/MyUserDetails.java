package com.itlize.resourcemanager.service;

import com.itlize.resourcemanager.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MyUserDetails implements UserDetails {
    private String username;
    private String password;
//    private String email;
//    private String first_name;
//    private String last_name;
//    private String role;
    private boolean active;
    private List<GrantedAuthority> authorities;

    public MyUserDetails(User user){
        System.out.println("MyUserDetails constructor.");
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.active = user.isActive();
        this.authorities = Arrays.stream(user.getRoles().split(","))
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }

    public MyUserDetails(){}

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        System.out.println("getAutho method");
        return authorities;
    }

    @Override
    public String getPassword() {
        System.out.println("getting password");
        return password;
    }

    @Override
    public String getUsername() {
        System.out.println("getting username");
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        System.out.println("is enable");
        return active;
    }
}
