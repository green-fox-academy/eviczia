package com.greenfox.mysql.controllers;

import com.greenfox.mysql.models.entities.Assignee;
import com.greenfox.mysql.models.entities.Todo;
import com.greenfox.mysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(value = {"", "/", "/list"})
    public String list(Model model,
                       @RequestParam(name = "active", required = false) Boolean isActive,
                       @RequestParam(name = "urgent", required = false) Boolean isUrgent,
                       @RequestParam(name = "text", required = false) String text,
                       @RequestParam(name = "create-date", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate createDate,
                       @RequestParam(name = "due-date", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dueDate,
                       @RequestParam(name = "assigneeId", required = false) Long assigneeId
    ) {
        Iterable<Todo> todos;
        if (isActive == null || isUrgent == null || text == null || createDate == null || dueDate == null || assigneeId == null) {
            todos = todoService.findAll();
        } else {
            Object[] searchParams = {isActive, isUrgent, text, createDate, dueDate, assigneeId};
            todos = todoService.findAllBySearchParams(searchParams);
        }
        model.addAttribute("todo", new Todo());
        model.addAttribute("todos", todos);
        return "todolist";

    }

    @GetMapping("/add")
    public String renderAddForm(Model model) {
        model.addAttribute("todo", new Todo());
        model.addAttribute("assignees", todoService.getAssignees());

        return "add-todo";
    }

    @PostMapping("/add")
    public String addNewTodo(@ModelAttribute Todo todo, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate deadline) {
        todoService.save(todo);
        return "redirect:/todo/list";
    }

    @PostMapping(path = "/{id}/delete")
    public String deleteTodo(@PathVariable Long id) {
        todoService.deleteById(id);
        return "redirect:/todo/list";
    }

    @GetMapping(path = "/{id}/edit")
    public String renderEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("todo", todoService.getById(id));
        model.addAttribute("assignees", todoService.getAssignees());
        return "edit-todo";
    }

    @PostMapping(path = "/{id}/edit")
    public String updateTodo(@ModelAttribute Todo todo, Long assigneeId, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate deadline) {
        todoService.updateTodo(todo, assigneeId, deadline);
        return "redirect:/todo/list";
    }

    @GetMapping(path = "/{id}/list-todos")
    public String listAssigneesTodos(@PathVariable Long id, Model model) {
        Assignee queriedAssignee = todoService.findAssigneeById(id);

        model.addAttribute("assignee", todoService.findAssigneeById(id));
        model.addAttribute("todos", todoService.findAssigneesTodos(id));


        return "show-assignee";
    }
}
