package com.greenfox.mysql.controllers;

import com.greenfox.mysql.models.Todo;
import com.greenfox.mysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping({"/", "/list"})
    public String list(@RequestParam(name = "isactive", required = false) Boolean isActive, Model model) {


        if (isActive == null) {
            model.addAttribute("todos", todoRepository.findAll());
        } else

            model.addAttribute("todos", todoRepository.findAllByIsDone(!isActive));

        return "todolist";
    }

    @GetMapping("/add")
    public String renderAddForm(Model model) {
        model.addAttribute("todo", new Todo());

        return "addtodo";
    }

    @PostMapping("/add")
    public String addNewTodo(@ModelAttribute Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo/list";
    }
    @RequestMapping(path = "/{id}/delete", method = RequestMethod.POST)
    public String deleteTodo(@PathVariable long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo/list";
    }

}
