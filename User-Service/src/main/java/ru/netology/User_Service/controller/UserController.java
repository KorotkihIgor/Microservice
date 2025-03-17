package ru.netology.User_Service.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.User;
import ru.netology.User_Service.service.UserService;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public Optional<User> getById(@PathVariable int userId) {
        return userService.getById(userId);
    }
}
