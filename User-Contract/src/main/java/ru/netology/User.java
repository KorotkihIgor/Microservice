package ru.netology;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String fioUser;
    private String address;
    private String phoneNumber;
    private String email;
}
