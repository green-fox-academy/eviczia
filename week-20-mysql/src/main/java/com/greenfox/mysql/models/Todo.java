package com.greenfox.mysql.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private boolean isUrgent;
    private boolean isDone;

    public Todo() {
    }

    public Todo(String title, boolean isDone) {
        this.title = title;
        this.isDone = isDone;
        isUrgent = false;
    }

    public Todo(String title) {
        this.title = title;
        isDone = false;
        isUrgent = false;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    public void setUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return title;
    }
}
