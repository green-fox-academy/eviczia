package com.greenfox.mysql.services;

import com.greenfox.mysql.models.entities.Assignee;
import com.greenfox.mysql.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        if (assigneeRepository.existsById(id)) {
            assigneeRepository.deleteById(id);
        }
    }

    public Assignee getById(long id) {
        if (assigneeRepository.findById(id).isPresent()) {
            return assigneeRepository.findById(id).get();
        } else return null;
    }
}
