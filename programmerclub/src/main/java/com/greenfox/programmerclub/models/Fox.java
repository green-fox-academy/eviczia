package com.greenfox.programmerclub.models;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fox {

    private String name;
    private HashMap<String, Loggable> faveFoodAndDrink;
    private HashMap<Tricks, Boolean> trackTrickProgress;
    private List<String> loggedActions;


    public Fox() {
        initializeFaveFoodAndDrink();
        initializeTrackTrickProgress();
        loggedActions = new ArrayList<>();
    }

    public Fox(String name) {
        this.name = name;
        initializeFaveFoodAndDrink();
        initializeTrackTrickProgress();
        loggedActions = new ArrayList<>();
    }

    private void initializeFaveFoodAndDrink() {
        faveFoodAndDrink = new HashMap<>();
        faveFoodAndDrink.put("Favorite food", Food.SALAD);
        faveFoodAndDrink.put("Favorite drink", Drinks.WATER);
    }

    private void initializeTrackTrickProgress() {
        trackTrickProgress = new HashMap<>();
        for (int i = 0; i < Tricks.values().length; i++) {
            trackTrickProgress.put(Tricks.values()[i], false);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Loggable> getFaveFoodAndDrink() {
        return faveFoodAndDrink;
    }

    public HashMap<Tricks, Boolean> getTrackTrickProgress() {
        return trackTrickProgress;
    }

    public List<String> getLoggedActions() {
        return loggedActions;
    }

    public void updateFood(String food) {
        Loggable oldFood = faveFoodAndDrink.get("Favorite food");
        Loggable newFood = Food.valueOfName(food);
        if (oldFood != newFood) {
            faveFoodAndDrink.replace("Favorite food", newFood);
            loggedActions.add(oldFood.timeStamp(food));
        }
    }

    public void updateDrink(String drink) {
        Loggable oldDrink = faveFoodAndDrink.get("Favorite drink");
        Loggable newDrink = Drinks.valueOfName(drink);
        if (oldDrink != newDrink) {
            faveFoodAndDrink.replace("Favorite drink", newDrink);
            loggedActions.add(oldDrink.timeStamp(drink));
        }
    }

    public void addTrick(String trick) {
        for (Map.Entry<Tricks, Boolean> entry : trackTrickProgress.entrySet()) {
            if (trick.equals(entry.getKey().toString())) {
                entry.setValue(true);
                loggedActions.add(entry.getKey().timeStamp(trick));
            }
        }
    }

    public List<Tricks> learnableTricks() {
        List<Tricks> learnableTricks = new ArrayList<>();
        for (Map.Entry<Tricks, Boolean> entry : trackTrickProgress.entrySet()) {
            if (!entry.getValue()) {
                learnableTricks.add(entry.getKey());
            }
        }
        return learnableTricks;
    }

    public List<Tricks> learntTricks() {
        List<Tricks> tricks = new ArrayList<>();
        for (Map.Entry<Tricks, Boolean> entry : trackTrickProgress.entrySet()) {
            if (entry.getValue()) {
                tricks.add(entry.getKey());
            }
        }
        return tricks;
    }

    public List<String> getTruncatedTimeStamps() {
        if (loggedActions.size() > 5) {
            List<String> truncList = new ArrayList<>();
            for (int i = loggedActions.size() - 5; i < loggedActions.size(); i++) {
                truncList.add(loggedActions.get(i));
            }
            return truncList;
        } else return loggedActions;
    }

    @Override
    public String toString() {
        return "This is " + name + ". Currently living on " + faveFoodAndDrink.get("Favorite food") + " and " + faveFoodAndDrink.get("Favorite drink") + ". He knows " + learntTricks().size() + " trick(s).";
    }
}