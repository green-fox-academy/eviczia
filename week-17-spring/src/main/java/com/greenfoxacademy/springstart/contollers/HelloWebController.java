package com.greenfoxacademy.springstart.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class  HelloWebController {
    private AtomicLong numberOfCalls = new AtomicLong(0);


    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam(value = "name", required = false) String name, Model model) {

        numberOfCalls.incrementAndGet();

        model.addAttribute("name", name);
        model.addAttribute("loads", numberOfCalls);
        return "greeting";
    }
}
