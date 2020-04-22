package com.greenfox.cars.repositories;

import com.greenfox.cars.models.entities.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, String> {

    List<Car> findAll();


    List<Car> findAllByPlateContaining(String searchterm);

    List<Car> findAllByCarBrand(String searchterm);
}

