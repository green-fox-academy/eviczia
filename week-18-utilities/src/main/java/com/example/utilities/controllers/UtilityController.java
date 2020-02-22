package com.example.utilities.controllers;

import com.example.utilities.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilityController {

    private UtilityService utilityService;

    @Autowired
    public UtilityController(UtilityService utilityService) {
        this.utilityService= utilityService;
    }

    @GetMapping("/useful")
    public String showLinks() {
        return "main";
    }

    @GetMapping("/useful/color")
    public String colourBackground() {
        return "colored";
    }

    @GetMapping("/useful/validate")
    public String goToEmailValidator() {
        return "main";
    }
    @GetMapping("/useful/encode")
    public String goToEncoder() {
        return "main";
    }
    @GetMapping("/useful/decode")
    public String goToDecoder() {
        return "main";
    }


}
