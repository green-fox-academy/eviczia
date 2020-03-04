package com.greenfox.mysql.controllers;

import com.greenfox.mysql.models.Todo;
import com.greenfox.mysql.repositories.TodoRepository;
import com.greenfox.mysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(value = {"", "/", "/list"})
    public String list(@RequestParam(name = "isactive", required = false) Boolean isActive, Model model) {

        if (isActive == null) {
            model.addAttribute("todos", todoService.findAll());
        } else
            model.addAttribute("todos", todoService.findAllByIsDone(!isActive));

        return "todolist";
    }

    @GetMapping("/add")
    public String renderAddForm(Model model) {
        model.addAttribute("todo", new Todo());

        return "addtodo";
    }

    @PostMapping("/add")
    public String addNewTodo(@ModelAttribute Todo todo) {
        todoService.save(todo);
        return "redirect:/todo/list";
    }

    @PostMapping(path = "/{id}/delete")
    public String deleteTodo(@PathVariable long id) {
        todoService.deleteById(id);
        return "redirect:/todo/list";
    }

    @GetMapping(path = "/{id}/edit")
    public String renderEditForm(@PathVariable long id, Model model) {
        model.addAttribute("todo", todoService.getById(id));
        return "edit";
    }

    @PostMapping(path = "/{id}/edit")
    public String updateTodo(@ModelAttribute Todo todo) {

        todoService.updateTodo(todo);
        return "redirect:/todo/list";
    }

}
