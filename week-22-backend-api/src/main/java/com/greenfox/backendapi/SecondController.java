package com.greenfox.backendapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {


    @GetMapping("/doubling")
    public Doubler multiplyByTwo(@RequestParam(name = "input") int received) {
        return new Doubler(received);
    }

    @GetMapping("/greeter")
    public Greeter welcome(@RequestParam(name = "name") String name, @RequestParam(name = "title") String title) {
        return new Greeter(name, title);
    }



}
