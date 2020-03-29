package com.greenfox.backendapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {


    @GetMapping("/doubling")
    public Doubler multiplyByTwo(Doubler doubler, @RequestParam(name = "input") int received) {
        doubler.setReceived(received);
        doubler.setResult();
        return doubler;
    }



}
