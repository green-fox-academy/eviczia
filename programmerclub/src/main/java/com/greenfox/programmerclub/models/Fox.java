package com.greenfox.programmerclub.models;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fox {

    private String name;
    private HashMap<String, Trackable> faveFoodAndDrink;
    private HashMap<Tricks, Boolean> trickTracker;
    private List<String> loggedActions;


    public Fox() {
        initializeFaveFoodAndDrink();
        initializeTrickTracker();
        loggedActions = new ArrayList<>();
    }

    public Fox(String name) {
        this();
        this.name = name;
    }

    private void initializeFaveFoodAndDrink() {
        faveFoodAndDrink = new HashMap<>();
        faveFoodAndDrink.put("Favorite food", Food.HOPE);
        faveFoodAndDrink.put("Favorite drink", Drinks.FAITH);
    }

    private void initializeTrickTracker() {
        trickTracker = new HashMap<>();
        for (int i = 0; i < Tricks.values().length; i++) {
            trickTracker.put(Tricks.values()[i], false);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Trackable> getFaveFoodAndDrink() {
        return faveFoodAndDrink;
    }

    public HashMap<Tricks, Boolean> getTrickTracker() {
        return trickTracker;
    }

    public List<String> getLoggedActions() {
        return loggedActions;
    }

    public void updateFood(String food) {
        Trackable oldFood = faveFoodAndDrink.get("Favorite food");
        Trackable newFood = Food.valueOfName(food);
        if (oldFood != newFood) {
            faveFoodAndDrink.replace("Favorite food", newFood);
            loggedActions.add(oldFood.timeStamp(food));
        }
    }

    public void updateDrink(String drink) {
        Trackable oldDrink = faveFoodAndDrink.get("Favorite drink");
        Trackable newDrink = Drinks.valueOfName(drink);
        if (oldDrink != newDrink) {
            faveFoodAndDrink.replace("Favorite drink", newDrink);
            loggedActions.add(oldDrink.timeStamp(drink));
        }
    }

    public void addTrick(String trick) {
        for (Map.Entry<Tricks, Boolean> entry : trickTracker.entrySet()) {
            if (trick.equals(entry.getKey().toString())) {
                entry.setValue(true);
                loggedActions.add(entry.getKey().timeStamp(trick));
            }
        }
    }

    public List<Tricks> learntTricks() {
        List<Tricks> tricks = new ArrayList<>();
        for (Map.Entry<Tricks, Boolean> entry : trickTracker.entrySet()) {
            if (entry.getValue()) {
                tricks.add(entry.getKey());
            }
        }
        return tricks;
    }

    public List<String> getLastFiveActions() {
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