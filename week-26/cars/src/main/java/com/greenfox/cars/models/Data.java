package com.greenfox.cars.models;

import com.greenfox.cars.models.entities.Car;

import java.util.List;

public class Data {

    private List<Car> queriedCars;

    public Data(List<Car> queriedCars) {
        this.queriedCars = queriedCars;
    }

    public Data() {
    }

    public List<Car> getQueriedCars() {
        return queriedCars;
    }

    public void setQueriedCars(List<Car> queriedCars) {
        this.queriedCars = queriedCars;
    }
}
