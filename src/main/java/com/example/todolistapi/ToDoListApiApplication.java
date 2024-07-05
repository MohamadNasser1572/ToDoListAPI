package com.example.todolistapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class ToDoListApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToDoListApiApplication.class, args);
    }
}
