package com.greenfox.mysql.services;

import com.greenfox.mysql.models.entities.Assignee;
import com.greenfox.mysql.models.entities.Todo;
import com.greenfox.mysql.repositories.AssigneeRepository;
import com.greenfox.mysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService{

    private TodoRepository todoRepository;
    private AssigneeRepository assigneeRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
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

    public List<Assignee> getAssignees(){
        return assigneeRepository.findAll();
    }


    public void saveAssignee(Assignee assignee) {
        assigneeRepository.save(assignee);
    }

    public Assignee findAssigneeById(Long assigneeId) {
        return (assigneeRepository.findById(assigneeId).isPresent()?assigneeRepository.findById(assigneeId).get():new Assignee("Eszter", "sv@sv.d"));
    }

    public Iterable<Todo> findAssigneesTodos(Long id) {
        return todoRepository.findAllByAssignee(findAssigneeById(id));
    }
}