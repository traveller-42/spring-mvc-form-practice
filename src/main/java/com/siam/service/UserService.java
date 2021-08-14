package com.siam.service;

import com.siam.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> users = new ArrayList<>();
    public User add_user(User user){
        users.add(user);
        return user;
    }
    public List<User> getAllUser(){
        return this.users;
    }
}
