package com.greenfox.cars.controllers;

import com.greenfox.cars.services.CarService;
import com.greenfox.cars.services.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private CarService carService;
    private ValidationService validationService;


    @Autowired
    public MainController(CarService carService, ValidationService validationService) {
        this.carService = carService;
        this.validationService = validationService;
    }





    @GetMapping("/")
    public String mainPage(Model model, @ModelAttribute(name = "searchterm") String searchterm) {
        model.addAttribute("cars", carService.returnQuery(searchterm));
        return "index";
    }

    @GetMapping("/search/{brand}")
    public String filteredDatabase(String searchterm) {
        return "index";
    }

}
