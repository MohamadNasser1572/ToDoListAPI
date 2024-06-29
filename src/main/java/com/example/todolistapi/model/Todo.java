package com.example.todolistapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Todo {
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    @Getter
    private String title;
    @Setter
    @Getter
    private String description;
    private boolean completed;

    public Todo() {

    }

    public Todo(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
