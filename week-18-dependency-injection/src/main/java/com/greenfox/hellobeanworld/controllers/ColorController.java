package com.greenfox.hellobeanworld.controllers;

import com.greenfox.hellobeanworld.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ColorController {

    UtilityService utilityService;

    @Autowired
    public ColorController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String homePage() {

        return "index";
    }
    @GetMapping("/useful/colored")
    public String displayBackground(Model model) {
        model.addAttribute("color", utilityService);

        return "colored";
    }
    @GetMapping("/useful/email")
    public String displayBackground(@RequestParam(value = "email", required = false) String email ) {

        return "evaluate";
    }

}
