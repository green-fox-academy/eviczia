package com.example.h2.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private boolean isUrgent;
    private boolean isDone;

    public Todo() {
        isDone = false;
        isUrgent = false;
    }

    public Todo(String title) {
        this.title = title;
        isDone = false;
        isUrgent = false;
    }

    @Override
    public String toString() {
        return title;
    }
}
