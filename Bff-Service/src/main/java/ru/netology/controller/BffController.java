package ru.netology.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.model.UserAndOrder;
import ru.netology.service.BffService;

@RestController
@RequestMapping("/api/site-bff")
public class BffController {
    private BffService bffService;

    public BffController(BffService bffService) {
        this.bffService = bffService;
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<UserAndOrder> getById(@PathVariable int userId) {
        try {
            UserAndOrder userAndOrder = bffService.getById(userId);
            return new ResponseEntity<>(userAndOrder, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
