package com.greenfox.backendapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String renderIndexPage() {
        return "index";
    }

}
