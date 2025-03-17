package ru.netology.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import ru.netology.Order;
import ru.netology.User;
import ru.netology.model.UserAndOrder;

import java.util.*;

@Service
public class BffService {
    private RestClient restClient;

    public BffService() {
        restClient = RestClient.create();
    }

    public Optional<UserAndOrder> getById(int userId) {

        User user = restClient.get()
                .uri("http://localhost:8081/api/users/{userId}", userId)
                .retrieve()
                .body(User.class);

        Order order = restClient.get()
                .uri("http://localhost:8082/api/orders/by-user/{userId}", userId)
                .retrieve()
                .body(Order.class);

        return Optional.of(new UserAndOrder(user, order));
    }
}
