package com.greenfox.simba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/hi")
    public String sayHi() {
        return "index";

    }


}
