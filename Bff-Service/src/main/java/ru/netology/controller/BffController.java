package ru.netology.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.service.BffService;

import java.util.List;

@RestController
@RequestMapping("/api/site-bff")
public class BffController {
    public BffController(BffService bffService) {
        this.bffService = bffService;
    }

    public BffService bffService;

    @GetMapping("/user/{userId}")
    public List<String> getById(@PathVariable int userId) {
        return bffService.getById(userId);
    }
}
