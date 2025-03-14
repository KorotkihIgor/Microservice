package ru.netology.repository;

import org.springframework.stereotype.Repository;
import ru.netology.model.Order;
import ru.netology.model.OrderItems;

import java.util.Map;
import java.util.Optional;

@Repository
public class OrderRepository {
    private final Map<Integer, Order> orders = Map.of(1, new Order(1, 1, 600, "RUB",
                    new OrderItems("Роза", 3, 200)),
            2, new Order(2, 2, 1000, "RUB",
                    new OrderItems("Роза", 5, 200)));

    public Optional<Order> getById(int userId) {
        return Optional.ofNullable(orders.get(userId));
    }
}
