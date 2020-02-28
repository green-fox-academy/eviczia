package com.greenfox.programmerclub.services;

import com.greenfox.programmerclub.models.Food;
import com.greenfox.programmerclub.models.Fox;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

    private List<Fox> myFoxes;
    //   private Tricks tricksList;

    public FoxService() {
        this.myFoxes = new ArrayList<>();
    }

    public Fox findMyFoxByName(String foxName) {
        for (Fox fox : myFoxes) {
            if (fox.getName().equals(foxName)) {
                return fox;
            }
        }
        return null;
    }

    public void addFox(Fox fox) {
        myFoxes.add(fox);
    }

    public String getWelcomeMessage(String name) {
        if (findMyFoxByName(name) == null) {
            addFox(new Fox(name));
            return "New fox added. Please take good care of him!";
        } else return "Hello again!";
    }

    public void updateFoodOrDrink(Fox newFox) {
        for (Fox oldFox : myFoxes) {
            if (oldFox.getName().equals(newFox.getName())) {
                if (!oldFox.getFaveFoodAndDrink().get("Favorite food").equals(newFox.getFaveFoodAndDrink().get("Favorite food"))) {
//                    oldFox.getLoggedActions().add(dateTimeFormatted() + " : Food has been changed from: " + oldFox.getThisFoxesFood() + " to: " + newFox.getThisFoxesFood());
                    oldFox.getFaveFoodAndDrink().replace("Favorite food", newFox.getFaveFoodAndDrink().get("Favorite food"));
                }
                if (!oldFox.getFaveFoodAndDrink().get("Favorite drink").equals(newFox.getFaveFoodAndDrink().get("Favorite drink"))) {
//                    oldFox.getLoggedActions().add(dateTimeFormatted() + " : Drink has been changed from: " + oldFox.getThisFoxesDrink() + " to: " + newFox.getThisFoxesDrink());
                    oldFox.getFaveFoodAndDrink().replace("Favorite drink", newFox.getFaveFoodAndDrink().get("Favorite drink"));
                }
            }
        }
    }

    private String dateTimeFormatted() {
        return LocalDateTime.now().getYear() +
                ". " +
                LocalDateTime.now().getMonth() +
                " " +
                LocalDateTime.now().getDayOfMonth() +
                ". " +
                LocalDateTime.now().getHour() +
                ":" +
                LocalDateTime.now().getMinute() +
                ":" +
                LocalDateTime.now().getSecond();
    }

    public List<Fox> getMyFoxes() {
        return myFoxes;
    }


    @Override
    public String toString() {
        StringBuilder listFoxes = new StringBuilder();
        for (Fox fox : myFoxes) {
            listFoxes.append(fox.toString()).append("\n");
        }
        return "Hi we are your foxes: " + listFoxes.toString();
    }

}
