package com.greenfox.mysql;

import com.greenfox.mysql.models.entities.Assignee;
import com.greenfox.mysql.models.entities.Todo;
import com.greenfox.mysql.repositories.AssigneeRepository;
import com.greenfox.mysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;

import java.util.TimeZone;

@SpringBootApplication
public class MysqlApplication implements CommandLineRunner {


/*    @Bean
    public Java8TimeDialect java8TimeDialect() {
        return new Java8TimeDialect();
    }*/

    private TodoRepository todoRepository;
    private AssigneeRepository assigneeRepository;

    @Autowired
    public MysqlApplication(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(MysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
        todoRepository.save(new Todo("Finish my sandwich"));
        todoRepository.save(new Todo("Call mum"));
        todoRepository.save(new Todo("Do shopping", new Assignee("Miki"), true));
        Todo todo = todoRepository.findById(2L).get();
        todo.setIsDone(true);
        todoRepository.save(todo);
        todoRepository.findById(3L).get().setIsDone(true);
        todoRepository.save(todoRepository.findById(3L).get());
        assigneeRepository.save(new Assignee("Eszter", "eszter@gmail.com"));
        assigneeRepository.save(new Assignee("Bandi", "bandi@gmail.com"));

        if (todoRepository.findById(4L).isPresent()) {
            Todo todo2 = todoRepository.findById(4L).get();
            assigneeRepository.save(todo2.getAssignee());
            System.out.println(todo2.getAssignee().getName());
        }
    }
}
