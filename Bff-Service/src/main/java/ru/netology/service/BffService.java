package ru.netology.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.*;

@Service
public class BffService {
    public RestClient restClient;

    public BffService() {
        restClient = RestClient.create();
    }

    public List<String> getById(int userId) {
        List<String> list = new ArrayList<>();

        String user = restClient.get()
                .uri("http://localhost:8081/api/users/{userId}", userId)
                .retrieve()
                .body(String.class);
        list.add(user);

        String order = restClient.get()
                .uri("http://localhost:8082/api/orders/by-user/{userId}", userId)
                .retrieve()
                .body(String.class);
        list.add(order);

        return list;
    }
}
