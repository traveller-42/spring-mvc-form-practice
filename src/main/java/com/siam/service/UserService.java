package com.siam.service;

import com.siam.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> userList=new ArrayList<>();
    public List<User> getUser(){
        return this.userList;
    }
    public void addUser(User user){
        this.userList.add(user);
    }
}
