package com.greenfox.mysql.models.entities;

import javax.persistence.*;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "assignee_id")
    private Assignee assignee;
    private boolean isUrgent;
    private boolean isDone;

    public Todo() {
    }

    public Todo(String title, Assignee assignee, boolean isDone) {
        this.title = title;
        this.isDone = isDone;
        this.assignee = assignee;
        isUrgent = false;
    }

    public Todo(String title) {
        this.title = title;
        isDone = false;
        isUrgent = false;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    public boolean getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setIsDone(boolean done) {
        isDone = done;
    }


    @Override
    public String toString() {
        return title;
    }
}
