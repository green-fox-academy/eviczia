package com.greenfox.mysql.repositories;

import com.greenfox.mysql.models.entities.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {


    Iterable<Assignee> findByNameContaining(String text);

    List<Assignee> findAll();

}
