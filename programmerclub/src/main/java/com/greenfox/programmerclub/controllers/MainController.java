package com.greenfox.programmerclub.controllers;

import com.greenfox.programmerclub.models.Fox;
import com.greenfox.programmerclub.models.Tricks;
import com.greenfox.programmerclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

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

    @GetMapping("/nutritionStore")
    public String renderNutritionFrom(@RequestParam(value = "name") String name, Model model) {
        model.addAttribute("myFox", myFoxes.findMyFoxByName(name));
        return "nutrition_store";
    }

    @PostMapping("/nutritionStore")
    public String sendNutritionData(@ModelAttribute("") Fox fox) {
        myFoxes.replace(fox);
        return "redirect:/?name=" + fox.getName();
    }

    @GetMapping("/trickCenter")
    public String renderTricksFrom(@RequestParam(value = "name") String name, Model model) {
        model.addAttribute("myFox", myFoxes.findMyFoxByName(name));
        model.addAttribute("tricks", Tricks.values());
        return "trick_center";
    }

    @PostMapping("/trickCenter")
    public String sendTricksData(@ModelAttribute(name = "trick") Tricks trick) {
        System.out.println(trick);
        //myFoxes.findMyFoxByName(name).;
        return "redirect:/trickCenter?name=Sly";
    }
}
