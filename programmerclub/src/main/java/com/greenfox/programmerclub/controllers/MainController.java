package com.greenfox.programmerclub.controllers;

import com.greenfox.programmerclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private FoxService myFoxes;

    @Autowired
    public MainController(FoxService myFoxes) {
        this.myFoxes = myFoxes;
    }

    @GetMapping("/")
    public String startPage(Model model, @RequestParam(value = "name", required = false) String name) {
        if (name == null) {
            return "redirect:/login";
        }
        model.addAttribute("message", myFoxes.getWelcomeMessage(name));
        model.addAttribute("myFox", myFoxes.findMyFoxByName(name));
        model.addAttribute("timeStamps", myFoxes.findMyFoxByName(name).getLastFiveActions());

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
        } else return "redirect:/?name=" + name;
    }

}
