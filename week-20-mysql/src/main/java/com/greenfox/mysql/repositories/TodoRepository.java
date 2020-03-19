package com.greenfox.mysql.repositories;

import com.greenfox.mysql.models.entities.Assignee;
import com.greenfox.mysql.models.entities.Todo;
import org.apache.tomcat.jni.Local;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {


    Iterable<Todo> findAllByIsDoneAndIsUrgentAndAssigneeIdAndTitleContainingAndDateAndDueDate(
            boolean isDone,
            boolean isUrgent,
            Long assigneeId,
            String text,
            LocalDate creationDate,
            LocalDate deadline
    );

    Iterable<Todo> findAllByIsUrgent(boolean isUrgent);

    Iterable<Todo> findAllByAssignee(Assignee assignee);

    Iterable<Todo> findByTitleContaining(String text);

    Iterable<Todo> findAllByDate(LocalDate creationDate);

    Iterable<Todo> findAllByDueDate(LocalDate deadline);

    Iterable<Todo> findAllByIsDone(boolean b);
}
