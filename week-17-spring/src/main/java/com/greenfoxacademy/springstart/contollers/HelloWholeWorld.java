package com.greenfoxacademy.springstart.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWholeWorld {


    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam(value = "color", required = false) String color, @RequestParam(value = "size", required = false) int size, Model model) {


        model.addAttribute("color", color);
        model.addAttribute("size", size);

        return "greeting";
    }
}
