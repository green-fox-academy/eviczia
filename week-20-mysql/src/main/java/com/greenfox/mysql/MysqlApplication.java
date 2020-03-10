package com.greenfox.mysql;

import com.greenfox.mysql.models.Assignee;
import com.greenfox.mysql.models.Todo;
import com.greenfox.mysql.repositories.AssigneeRepository;
import com.greenfox.mysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlApplication implements CommandLineRunner {

    private TodoRepository todoRepository;
    private AssigneeRepository assigneeRepository;

    public static void main(String[] args) {
        SpringApplication.run(MysqlApplication.class, args);
    }

    @Autowired
    public MysqlApplication(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
        todoRepository.save(new Todo("Finish my sandwich"));
        todoRepository.save(new Todo("Call mum"));
        todoRepository.save(new Todo("Do shopping", true));
        Todo todo = todoRepository.findById(2L).get();
        todo.setIsDone(true);
        todoRepository.save(todo);
        todoRepository.findById(3L).get().setIsDone(true);
        todoRepository.save(todoRepository.findById(3L).get());
        assigneeRepository.save(new Assignee("Eszter", "eviczia@gmail.com"));
        assigneeRepository.save(new Assignee("Dani", "dczaganyi@gmail.com"));
        assigneeRepository.save(new Assignee("Bandi", "b.czaganyi@gmail.com"));
    }
}
