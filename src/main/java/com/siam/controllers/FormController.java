package com.siam.controllers;

import com.siam.model.User;
import com.siam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class FormController {
    @Autowired
    private UserService userService;
    @GetMapping("/add")
    public String addName_get(Model model){
        model.addAttribute("user",new User());
        return "userForm";
    }
    @PostMapping("/add")
    public String addUser_post(Model model, @ModelAttribute User user){
        userService.addUser(user);
        return "redirect:/users/all";
    }
    @GetMapping("/all")
    public String showAll(Model model){
        model.addAttribute("users",userService.getUser());
        return "showUsers";
    }
}
