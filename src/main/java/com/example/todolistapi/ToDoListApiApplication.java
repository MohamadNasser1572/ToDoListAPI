package com.example.todolistapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoListApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToDoListApiApplication.class, args);
        System.out.println("DB Username: " + System.getenv("DB_USERNAME"));
        System.out.println("DB Password: " + System.getenv("DB_PASSWORD"));
    }
}
