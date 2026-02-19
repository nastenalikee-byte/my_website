package com.shop.cosmetics.controller;

import com.shop.cosmetics.entity.User;
import com.shop.cosmetics.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/add-user")
    public String showAddUserForm(Model model) {
        model.addAttribute("user", new User()); // ← ОБОВʼЯЗКОВО
        return "add-user";
    }

    @PostMapping("/add-user")
    public String addUser(User user) {
        userService.save(user);
        return "redirect:/add-user";
    }
    @GetMapping("/users")
    public String showUsers(Model model) {
        model.addAttribute("users", userService.findAll());
        return "users";
    }


}
