package com.example.h2;

import com.example.h2.models.Todo;
import com.example.h2.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2Application implements CommandLineRunner {

    private TodoRepository todoRepository;

    public static void main(String[] args) {
        SpringApplication.run(H2Application.class, args);
    }

    @Autowired
    public H2Application(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
    }
}
