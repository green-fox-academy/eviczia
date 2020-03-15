package com.greenfox.mysql.repositories;

import com.greenfox.mysql.models.entities.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {


    Iterable<Todo> findAllByIsDone(boolean isDone);

    Iterable<Todo> findByTitleContaining(String text);


}
