package com.siam.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelloService {
    List<String> names=new ArrayList<>();
    HelloService(){
        names.add("SIAM");
        names.add("RAJ");
        names.add("AKASH");
        names.add("RIFAT");
        names.add("Abir");
    }
    public List<String> getNames(){
        return this.names;
    }
    public String getName(){
        return "MSI BD";
    }
}
