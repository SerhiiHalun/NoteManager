package com.example.NoteManager.auterification;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;



@Service
public class AuthService {
    public boolean hasAuthority(String name){
        return getUser().getAuthorities().stream().map(it -> it.getAuthority()).anyMatch(it ->it.equals(name));

    }
    public String getUsername(){
        return getUser().getUsername();
    }
    private User  getUser(){
        return (User) getAuthentication().getPrincipal();
    }
    private Authentication getAuthentication(){
        SecurityContext context = SecurityContextHolder.getContext();

        return  context.getAuthentication();
    }
}
