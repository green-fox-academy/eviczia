package com.greenfox.mysql.repositories;

import com.greenfox.mysql.models.entities.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {



}
