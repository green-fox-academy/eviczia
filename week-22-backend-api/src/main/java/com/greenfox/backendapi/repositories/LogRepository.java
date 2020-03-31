package com.greenfox.backendapi.repositories;

import com.greenfox.backendapi.models.entities.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {

    List<Log>findAll();


}
