package com.example.h2.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    private long id;
    private String title;
    private boolean isUrgent;
    private boolean isDone;

    public Todo() {
        isDone = false;
        isUrgent = false;
    }
}
