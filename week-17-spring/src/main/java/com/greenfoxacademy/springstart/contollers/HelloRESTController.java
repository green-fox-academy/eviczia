package com.greenfoxacademy.springstart.contollers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    AtomicLong numberOfCalls = new AtomicLong(0);

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Greeting greeting(@RequestParam(value = "name", required = false) String name/*,
                             Model model*/) {
//        model.addAttribute("name", name);

        numberOfCalls.incrementAndGet();

        return new Greeting(numberOfCalls, "Hello, " + name +"!");

    }

}
