package com.greenfox.mysql.models.dtos;

public class AssigneeDTO {

    private String name;
    private String todoIds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTodoIds() {
        return todoIds;
    }

    public void setAssigneeIds(String assigneeIds) {
        this.todoIds  = assigneeIds;
    }
}
