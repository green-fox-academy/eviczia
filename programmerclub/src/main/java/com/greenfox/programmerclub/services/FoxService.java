package com.greenfox.programmerclub.services;

import com.greenfox.programmerclub.models.Fox;
import com.greenfox.programmerclub.models.Tricks;
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

    public void addFox(Fox fox) {
        myFoxes.add(fox);
    }

    public void replace(Fox newFox) {
        for (Fox oldFox : myFoxes) {
            if (oldFox.getName().equals(newFox.getName())) {
                if (!oldFox.getThisFoxesFood().equals(newFox.getThisFoxesFood())){
                    oldFox.getTimeStamps().add(LocalDateTime.now() + " : Food has been changed from: " + oldFox.getThisFoxesFood() + " to: " +newFox.getThisFoxesFood());
                    oldFox.setThisFoxesFood(newFox.getThisFoxesFood());
                }
                if (!oldFox.getThisFoxesDrink().equals(newFox.getThisFoxesDrink())){
                    oldFox.getTimeStamps().add(LocalDateTime.now() + " : Drink has been changed from: " + oldFox.getThisFoxesDrink() + " to: " + newFox.getThisFoxesDrink());
                    oldFox.setThisFoxesDrink(newFox.getThisFoxesDrink());
                }
            }
        }
    }

    public Fox findMyFoxByName(String foxName) {
        for (Fox fox : myFoxes) {
            if (fox.getName().equals(foxName)) {
                return fox;
            }
        }
        return null;
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

    public String getWelcomeMessage(String name) {
        if (findMyFoxByName(name) == null) {
            addFox(new Fox(name));
            return "New fox added. Please take good care of him!";
        } else return "Hello again!";
    }
}
