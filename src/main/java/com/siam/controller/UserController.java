package com.siam.controller;

import com.siam.model.User;
import com.siam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
  @Autowired private UserService userService;
    List<String> sexTypes = new ArrayList<String>();
    List<String> countryList = new ArrayList<String>();
    public void init(){
        sexTypes.clear();
        countryList.clear();
        sexTypes.add("Male");
        sexTypes.add("Female");
        sexTypes.add("Other");

        countryList.add("Bangladesh");
        countryList.add("India");
        countryList.add("Pakistan");
        countryList.add("Switzerland");
        countryList.add("England");

    }
    @RequestMapping("/")
    public String index(){
        return "index";
    }
   @RequestMapping ("/user-form")
   public String form(Model model){
       init();
       model.addAttribute("actionType", "create");
       model.addAttribute("id", System.currentTimeMillis());
       model.addAttribute("sexTypes", sexTypes);
       model.addAttribute("countryList", countryList);
       model.addAttribute("user", new User());
       return "form";
   }
    @RequestMapping(method = RequestMethod.POST, value = {"/form-submit"})
    public String formSubmit(Model model, @ModelAttribute("user") User user, @RequestParam("actionType") String actionType){
            userService.add_user(user);
            model.addAttribute("user", user);
            return "formData";
    }
    @RequestMapping("/all-users")
    public String getAllUsers(Model model){
        model.addAttribute("users", userService.getAllUser());
        return "allUsers";
    }
}
