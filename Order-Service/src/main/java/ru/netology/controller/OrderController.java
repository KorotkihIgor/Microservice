package ru.netology.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.netology.Order;
import ru.netology.service.OrderService;

import java.util.Optional;

@RestController
@RequestMapping("/api/orders/")
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/by-user/{userId}")
    public Optional<Order> getById(@PathVariable int userId) {
        return orderService.getById(userId);
    }
}
