package com.greenfox.cars.services;

import com.greenfox.cars.models.entities.Car;

import java.util.List;

public interface CarService {

    List<Car> findAllCars();

    List<Car> returnPlateQuery(String searchterm);

    List<Car> returnBrandQuery(String searchterm);
}

