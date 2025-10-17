package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private List<String> users = new ArrayList<>();

    public UserController() {
        users.add("Никита Чураков");
        users.add("Петр Петров");
        users.add("Мария Сидорова");
    }

    @GetMapping
    public List<String> getAllUsers() {
        return users;
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable int id) {
        return (id >= 0 && id < users.size()) ? users.get(id) : "Пользователь не найден";
    }
}