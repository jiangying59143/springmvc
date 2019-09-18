package com.my.controller;

import com.my.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserHandler {

    @RequestMapping("/add")
    public String add(User user){
        System.out.println(user);
        return "index";
    }
}
