package com.greenfox.programmerclub.controllers;

import com.greenfox.programmerclub.models.Fox;
import com.greenfox.programmerclub.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private FoxService myFoxes;


    public MainController() {
        this.myFoxes = new FoxService();
    }

    @GetMapping("/index")
    public String startPage(Model model, @RequestParam(value = "name") String name) {
        model.addAttribute("myFox", myFoxes.findMyFoxByName(name));
        return "index";
    }

    @GetMapping("/login")
    public String renderLoginFrom() {
        return "login";
    }

    @PostMapping("/login")
    public String sendLoginData(@RequestParam(value = "name") String name) {
        if (name.equals("")) {
            return "redirect:/login";
        } else if (myFoxes.findMyFoxByName(name) == null) {
            myFoxes.addFox(new Fox(name));
            System.out.println("new fox added");
        }
        System.out.println(myFoxes);
        return "redirect:/index?name=" + name;
    }
}
