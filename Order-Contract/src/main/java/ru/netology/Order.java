package ru.netology;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private int id;
    private int userId;
    private double orderAmount;
    private String currencyOrder;
    private OrderItems orderItems;
}
