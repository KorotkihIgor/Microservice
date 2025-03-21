package ru.netology.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import ru.netology.Order;
import ru.netology.User;
import ru.netology.model.UserAndOrder;

@Service
public class BffService {
    private RestClient restClient;

    @Value("${user.service.uri}")
    private String userServiceUri;

    @Value("${order.service.uri}")
    private String orderServiceUri;

    public BffService() {
        restClient = RestClient.create();
    }

    public UserAndOrder getById(int userId) {

        User user = restClient.get()
                .uri(userServiceUri + "/api/users/{userId}", userId)
                .retrieve()
                .body(User.class);

        Order order = restClient.get()
                .uri(orderServiceUri + "/api/orders/by-user/{userId}", userId)
                .retrieve()
                .body(Order.class);

        return new UserAndOrder(user, order);
    }
}
