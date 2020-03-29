package com.greenfox.backendapi.controllers;

import com.greenfox.backendapi.models.Doubler;
import com.greenfox.backendapi.models.ErrorMessage;
import com.greenfox.backendapi.models.Greeter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {


    @GetMapping("/doubling")
    public ResponseEntity multiplyByTwo(@RequestParam(name = "input", required = false) Integer received) {
        if (received == null) return ResponseEntity.status(200).body(new ErrorMessage("Please provide an input!"));
        return ResponseEntity.status(200).body(new Doubler(received));
    }

    @GetMapping("/greeter")
    public ResponseEntity welcome(@RequestParam(name = "name", required = false) String name, @RequestParam(name = "title", required = false) String title) {
        if (name == null && title == null) return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name and a title!"));
        if (name == null) return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name!"));
        if (title == null) return ResponseEntity.status(400).body(new ErrorMessage("Please provide a title!"));
        return ResponseEntity.status(200).body(new Greeter(name, title));
    }



}
