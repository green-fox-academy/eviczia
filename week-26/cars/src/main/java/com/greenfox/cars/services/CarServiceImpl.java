package com.greenfox.cars.services;

import com.greenfox.cars.models.ErrorMessage;
import com.greenfox.cars.models.entities.Car;
import com.greenfox.cars.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarRepository carRepository;
    private ValidationService validationService;


    @Autowired
    public CarServiceImpl(CarRepository carRepository, ValidationService validationService) {
        this.carRepository = carRepository;
        this.validationService = validationService;
    }

    private Boolean checkTermIsValid(String searchterm) {
        return validationService.checkInput(searchterm);
    }

    @Override
    public List<Car> findAllCars() {
        return carRepository.findAll();
    }

    @Override
    public List<Car> returnPlateQuery(String searchterm) {
        if (!checkTermIsValid(searchterm)) return null;
        return carRepository.findAllByPlateContaining(searchterm);
    }

    @Override
    public List<Car> returnBrandQuery(String searchterm) {
        return carRepository.findAllByCarBrand(searchterm);
    }
}
