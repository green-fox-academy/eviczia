package com.greenfox.programmerclub.controllers;

import com.greenfox.programmerclub.models.Drinks;
import com.greenfox.programmerclub.models.Food;
import com.greenfox.programmerclub.models.Fox;
import com.greenfox.programmerclub.models.Trackable;
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
        String currentFood = myFoxes.findMyFoxByName(name).getFaveFoodAndDrink().get("Favorite food").toString();
        String currentDrink = myFoxes.findMyFoxByName(name).getFaveFoodAndDrink().get("Favorite drink").toString();
        String[] availableFood =  Food.toStringArray();
        String[] availableDrink =  Drinks.toStringArray();
        model.addAttribute("myFox", myFoxes.findMyFoxByName(name));
        model.addAttribute("availableFood", availableFood);
        model.addAttribute("availableDrinks", availableDrink);
        model.addAttribute("faveFood", currentFood);
        model.addAttribute("faveDrink", currentDrink);


        return "nutrition_store";
    }

    @PostMapping("/nutritionStore")
    public String sendNutritionData(@RequestParam(value = "name") String name, @ModelAttribute(name = "food") String food, @ModelAttribute(name = "drink") String drink) {
        myFoxes.findMyFoxByName(name).updateFood(food);
        myFoxes.findMyFoxByName(name).updateDrink(drink);
        return "redirect:/?name=" + name;
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
        return "redirect:/?name=" + name;
    }

    @GetMapping("/actionHistory")
    public String showLog(Model model, @RequestParam(value = "name") String name) {
        model.addAttribute("myFox", myFoxes.findMyFoxByName(name));
        model.addAttribute("timeStamps", myFoxes.findMyFoxByName(name).getLoggedActions());
        return "action_history";
    }
}