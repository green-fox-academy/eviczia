package com.greenfox.mysql.controllers;

import com.greenfox.mysql.models.Todo;
import com.greenfox.mysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping({"/", "/list"})
    public String list(@RequestParam(name="isActive", required = false) boolean isActive, Model model) {

        Iterable<Todo> myTodos = todoRepository.findAllByIsDone(!isActive);
        if (isActive == Boolean.parseBoolean(null)) {myTodos = todoRepository.findAll();}

        model.addAttribute("todos", myTodos);

        return "todolist";
    }
}
