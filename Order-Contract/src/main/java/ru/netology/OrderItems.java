package ru.netology;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItems {
    private String orderName;
    private int quantity;
    private double price;
}
