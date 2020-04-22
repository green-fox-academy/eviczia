package com.greenfox.cars.controllers;

import com.greenfox.cars.models.entities.Car;
import com.greenfox.cars.services.CarService;
import com.greenfox.cars.services.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class MainController {

    private CarService carService;

    @Autowired
    public MainController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/")
    public String mainPage(Model model, @ModelAttribute(name = "searchterm") String searchterm) {
        List<Car> queriedCars = searchterm.equals("") ? carService.findAllCars() : carService.returnQuery(searchterm);
        model.addAttribute("cars", queriedCars);
        return "index";
    }

    @GetMapping("/search/{brand}")
    public String filteredDatabase(String searchterm) {
        return "index";
    }

}
