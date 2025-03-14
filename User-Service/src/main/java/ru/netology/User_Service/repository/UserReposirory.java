package ru.netology.User_Service.repository;

import org.springframework.stereotype.Repository;
import ru.netology.User_Service.model.User;

import java.util.Map;
import java.util.Optional;

@Repository
public class UserReposirory {

    private final Map<Integer, User> users =
            Map.of(1, new User(1, "Иванов Иван", "Моска", "8-900-000-00-01", "User1@com"),
                    2, new User(2, "Сергей Сергеев", "Воронеж", "8-900-000-02", "User2@com"));

    public Optional<User> getById(int userId) {
        return Optional.ofNullable(users.get(userId));
    }


}
