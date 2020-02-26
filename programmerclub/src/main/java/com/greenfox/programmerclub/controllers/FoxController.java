package com.greenfox.programmerclub.controllers;

import com.greenfox.programmerclub.models.Fox;
import com.greenfox.programmerclub.models.Tricks;
import com.greenfox.programmerclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

    private FoxService myFoxes;

    @Autowired
    public FoxController(FoxService myFoxes) {
        this.myFoxes = myFoxes;
    }





}
