package ru.netology.User_Service.service;

import org.springframework.stereotype.Service;
import ru.netology.User_Service.model.User;
import ru.netology.User_Service.repository.UserReposirory;

import java.util.Optional;

@Service
public class UserService {

    private UserReposirory userReposirory;

    public UserService(UserReposirory userReposirory) {
        this.userReposirory = userReposirory;
    }

    public Optional<User> getById(int userId) {
        return userReposirory.getById(userId);
    }
}
