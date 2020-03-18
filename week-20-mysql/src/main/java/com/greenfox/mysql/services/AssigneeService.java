package com.greenfox.mysql.services;

import com.greenfox.mysql.models.entities.Assignee;
import com.greenfox.mysql.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AssigneeService {

    private AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeService(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    public Iterable<Assignee> findAll() {
        return assigneeRepository.findAll();
    }

    public void save(Assignee assignee) {
        assigneeRepository.save(assignee);
    }

    public void deleteById(long id) {
        assigneeRepository.deleteById(id);
    }

    public Assignee getById(long id) {
        Optional<Assignee> assignee = assigneeRepository.findById(id);
        return assignee.orElse(null);
    }

    public Iterable<Assignee> findAllByText(String text) {
        if (text == null) return assigneeRepository.findAll();
        return assigneeRepository.findByNameContaining(text);
    }

}
