package com.greenfox.mysql.models.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

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
    private LocalDate date;
    private LocalDate dueDate;

    public Todo() {
        this("", new Assignee(),false);    }

    public Todo(String title) {
        this(title, new Assignee(),false);
    }

    public Todo(String title, Assignee assignee, boolean isUrgent) {
        this.title = title;
        this.isUrgent = isUrgent;
        this.assignee = assignee;
        setInitialDate();
    }

    private void setInitialDate() {
        if (date == null) {
            date = LocalDate.now();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
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

    public LocalDate getDate() {
        return date;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }


    @Override
    public String toString() {
        return title;
    }
}
