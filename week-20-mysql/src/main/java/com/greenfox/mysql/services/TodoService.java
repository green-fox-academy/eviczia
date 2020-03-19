package com.greenfox.mysql.services;

import com.greenfox.mysql.models.entities.Assignee;
import com.greenfox.mysql.models.entities.Todo;
import com.greenfox.mysql.repositories.AssigneeRepository;
import com.greenfox.mysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private TodoRepository todoRepository;
    private AssigneeRepository assigneeRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }

    public Iterable<Todo> findAll() {
        return todoRepository.findAll();
    }

    public Iterable<Todo> findAllByDate(LocalDate creationDate) {
        return todoRepository.findAllByDate(creationDate);
    }

    public Iterable<Todo> findAllByDueDate(LocalDate deadline) {
        return todoRepository.findAllByDueDate(deadline);
    }

    public Iterable<Todo> findAllByText(String text) {
        if (text == null) return todoRepository.findAll();
        return todoRepository.findByTitleContaining(text);
    }

    public Iterable<Todo> findAllByIsDone(boolean b) {
        return todoRepository.findAllByIsDone(b);
    }

    public Iterable<Todo> findAllByIsUrgent(boolean b) {
        return todoRepository.findAllByIsUrgent(b);
    }

    public Iterable<Todo> findAssigneesTodos(Long id) {
        return todoRepository.findAllByAssignee(findAssigneeById(id));
    }

    public void save(Todo todo) {
        todoRepository.save(todo);
    }

    public void deleteById(Long id) {
        todoRepository.deleteById(id);
    }

    public Todo getById(Long id) {
        Optional<Todo> todo = todoRepository.findById(id);
        return todo.orElse(null);
    }

    public List<Assignee> getAssignees() {
        return assigneeRepository.findAll();
    }


    public void saveAssignee(Assignee assignee) {
        assigneeRepository.save(assignee);
    }

    public Assignee findAssigneeById(Long assigneeId) {
        Optional<Assignee> assignee = assigneeRepository.findById(assigneeId);

        return (assignee.orElse(null));
    }


    public void updateTodo(Todo todo, Long assigneeId, LocalDate deadline) {
        Assignee assignee = findAssigneeById(assigneeId);
        saveAssignee(assignee);
        todo.setAssignee(assignee);
        todo.setDueDate(deadline);
        save(todo);

    }

    //Object[] searchParams = {isActive, isDone, text, createDate, dueDate, assignees};
//        model.addAttribute("todos", todoService.findAllBySearchParams(searchParams));
    public Iterable<Todo> findAllBySearchParams(Object[] searchParams) {
        if (searchParams == null) return null;
        return todoRepository.findAllByIsDoneAndIsUrgentAndAssigneeIdAndTitleContainingAndDateAndDueDate(
                (boolean) searchParams[0],
                (boolean) searchParams[1],
                (Long) searchParams[2],
                (String) searchParams[3],
                (LocalDate) searchParams[4],
                (LocalDate) searchParams[5]
        );

    }
}