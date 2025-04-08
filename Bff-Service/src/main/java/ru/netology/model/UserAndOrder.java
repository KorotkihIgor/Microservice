package ru.netology.model;

import lombok.*;
import ru.netology.Order;
import ru.netology.User;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserAndOrder {
    private User users;
    private Order orders;

}
