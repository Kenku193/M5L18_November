package com.example.m5l18_example.controller;

import com.example.m5l18_example.entity.User;
import com.example.m5l18_example.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UsersController {
    private final UserService userService;
    private final List<User> userList;

    public UsersController(UserService userService) {
        this.userService = userService;
        this.userList = userService.findAll();
    }

    @GetMapping("/users")
    public String main(Model model) {
        model.addAttribute("message", "Users List From DB:");
        model.addAttribute("users", userList);
        return "users";
    }
}
