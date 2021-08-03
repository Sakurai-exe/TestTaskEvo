package com.example.testtaskforevotor.controller;

import com.example.testtaskforevotor.model.User;
import com.example.testtaskforevotor.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserController{
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;

    }

    @GetMapping("/users")
    public String findUsers(Model model, @RequestParam(defaultValue = "") String name){
        model.addAttribute("users", userService.findByName(name));
        return "list";
    }


    @GetMapping("/user-create")
    public String createUserForm(User user) {
        return "user-create";
    }

    @PostMapping("/user-create")
    public String createUser(User user) {
        userService.saveUser(user);
        return "redirect:/users";
    }


    @GetMapping("/user-delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {

        userService.deleteById(id);
        return "redirect:/users";
    }


    @GetMapping("/user-update/{id}")
    public String updateUserForm(@PathVariable("id") Long id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "/user-update";
    }

    @PostMapping("/user-update")
    public String updateUser(User user) {
        userService.saveUser(user);
        return "redirect:/users";
    }


}
