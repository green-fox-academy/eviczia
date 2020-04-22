package com.greenfox.cars.controllers;

import com.greenfox.cars.models.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {


    @GetMapping("/api/search/{brand}")
    public ResponseEntity processRestSearchTerm(String searchterm) {
        return ResponseEntity.status(200).body(new Data());
    }


}
