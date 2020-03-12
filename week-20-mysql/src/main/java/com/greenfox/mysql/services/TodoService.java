package com.greenfox.mysql.services;

import com.greenfox.mysql.models.entities.Todo;
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


    public Iterable<Todo> findAllByText(String text) {
        if (text == null) return todoRepository.findAll();
        return todoRepository.findByTitleContaining(text);
    }

    public Iterable<Todo> findAllByIsDone(boolean b) {
        return todoRepository.findAllByIsDone(b);
    }

    public void save(Todo todo) {
        todoRepository.save(todo);
    }

    public void deleteById(Long id) {
        todoRepository.deleteById(id);
    }

    public Todo getById(Long id) {
        if (todoRepository.findById(id).isPresent()) {
            return todoRepository.findById(id).get();
        } else return null;
    }
}