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

@Controller
public class FoxController {

    private FoxService myFoxes;

    @Autowired
    public FoxController(FoxService myFoxes) {
        this.myFoxes = myFoxes;
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
        model.addAttribute("learnableTricks", myFoxes.findMyFoxByName(name).learnableTricks());
        return "trick_center";
    }

    @PostMapping("/trickCenter")
    public String sendTricksData(@RequestParam(value = "name") String name, @ModelAttribute(name = "trick") String trick) {
        myFoxes.findMyFoxByName(name).addTrick(trick);
        return "redirect:/?name="+name;

    }

    @GetMapping("/actionHistory")
    public String showLog(Model model, @RequestParam(value = "name") String name) {
        model.addAttribute("myFox", myFoxes.findMyFoxByName(name));
        model.addAttribute("timeStamps", myFoxes.findMyFoxByName(name).getTimeStamps());
        return "action_history";
    }
}
