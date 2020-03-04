package com.greenfox.mysql.services;

import com.greenfox.mysql.models.Todo;
import com.greenfox.mysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    public Iterable<Todo> findAll() {
        return todoRepository.findAll();
    }

    public Iterable<Todo> findAllByIsDone(boolean b) {
        return todoRepository.findAllByIsDone(b);
    }

    public void save(Todo todo) {
        todoRepository.save(todo);
    }

    public void deleteById(long id) {
        todoRepository.deleteById(id);
    }

    public Todo getById(long id) {
        if (todoRepository.findById(id).isPresent()) {
            return todoRepository.findById(id).get();
        } else return null;
    }

    public void updateTodo(Todo todo) {
        todoRepository.save(todo);
    }
}