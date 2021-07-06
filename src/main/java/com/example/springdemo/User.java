package com.example.springdemo;

import org.springframework.data.annotation.Id;

import java.util.UUID;

public class User {
    @Id
    UUID id;

    String name;
    String email;
    String password;
}
