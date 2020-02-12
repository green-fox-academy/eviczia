package com.greenfoxacademy.springstart.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloFizzBuzWoofController {
    private AtomicLong numberOfCalls = new AtomicLong(0);
    private int size;


    @RequestMapping("/web/count-downloads")
    public String greeting(Model model) {

        numberOfCalls.incrementAndGet();
        String fizzBuzzWoofCounter = convertToFizzBuzzWoof(numberOfCalls);

        model.addAttribute("loads", fizzBuzzWoofCounter);
        model.addAttribute("size", size);
        return "count-downloads";
    }

    private String convertToFizzBuzzWoof(AtomicLong numberOfCalls) {
        if (numberOfCalls.get() % (3*5*7) == 0) {
            size = 72;
            return "FizzBuzzWoof";
        } else if (numberOfCalls.get() % (3*5) == 0) {
            size = 48;
            return "FizzBuzz";
        } else if (numberOfCalls.get() % (3*7) == 0) {
            size = 48;
            return "FizzWoof";
        } else if (numberOfCalls.get() % (5*7) == 0) {
            size = 48;
            return "BuzzWoof";
        } else if (numberOfCalls.get() % 3 == 0) {
            size = 24;
            return "Fizz";
        } else if (numberOfCalls.get() % 5 == 0) {
            size = 24;
            return "Buzz";
        } else if (numberOfCalls.get() % 7 == 0) {
            size = 24;
            return "Woof";
        } else {
            size = 18;
            return numberOfCalls.toString();
        }
    }
}
