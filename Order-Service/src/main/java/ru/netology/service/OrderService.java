package ru.netology.service;

import org.springframework.stereotype.Service;
import ru.netology.model.Order;
import ru.netology.repository.OrderRepository;

import java.util.Optional;

@Service
public class OrderService {
    public OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Optional<Order> getById(int userId) {
        return orderRepository.getById(userId);
    }
}
