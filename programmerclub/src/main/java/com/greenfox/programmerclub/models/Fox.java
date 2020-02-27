package com.greenfox.programmerclub.models;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fox {

    private String name;
    private String thisFoxesFood;
    private String thisFoxesDrink;
    private HashMap<Tricks, Boolean> learntTricks;


    public Fox() {
        learntTricks = new HashMap<>();
        thisFoxesFood = "porridge";
        thisFoxesDrink = "water";
        for (int i = 0; i < Tricks.values().length; i++) {
            learntTricks.put(Tricks.values()[i], false);
        }
    }

    public Fox(String name) {
        this.name = name;
        learntTricks = new HashMap<>();
        thisFoxesFood = "porridge";
        thisFoxesDrink = "water";
        for (int i = 0; i < Tricks.values().length; i++) {
            learntTricks.put(Tricks.values()[i], false);
        }
    }

    public int countKnownTricks() {
        int countTrue = 0;
        for (Boolean knowsIt : learntTricks.values()) {
            if (knowsIt) {
                countTrue++;
            }
        }
        return countTrue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThisFoxesFood() {
        return thisFoxesFood;
    }

    public void setThisFoxesFood(String thisFoxesFood) {
        this.thisFoxesFood = thisFoxesFood;
    }

    public String getThisFoxesDrink() {
        return thisFoxesDrink;
    }

    public void setThisFoxesDrink(String thisFoxesDrink) {
        this.thisFoxesDrink = thisFoxesDrink;
    }

    public HashMap<Tricks, Boolean> getLearntTricks() {
        return learntTricks;
    }

    public void setLearntTricks(HashMap<Tricks, Boolean> learntTricks) {
        this.learntTricks = learntTricks;
    }

    public void addTrick(String trick) {
        for (Map.Entry<Tricks, Boolean> entry : learntTricks.entrySet()) {
            if (trick.equals(entry.getKey().toString())) {
                entry.setValue(true);
            }
        }
    }

    public List<Tricks> learnableTricks() {
        List<Tricks> learnableTricks = new ArrayList<>();
        for (Map.Entry<Tricks, Boolean> entry : learntTricks.entrySet()) {
            if (!entry.getValue()) {
                learnableTricks.add(entry.getKey());
            }
        }
        return learnableTricks;
    }

    public List<Tricks> learntTricks() {
        List<Tricks> tricks = new ArrayList<>();
        for (Map.Entry<Tricks, Boolean> entry : learntTricks.entrySet()) {
            if (entry.getValue()) {
                tricks.add(entry.getKey());
            }
        }
        return tricks;
    }

    @Override
    public String toString() {
        return "This is " + name + ". Currently living on " + thisFoxesFood + " and " + thisFoxesDrink + ". He knows " + countKnownTricks() + " trick(s).";
    }
}
