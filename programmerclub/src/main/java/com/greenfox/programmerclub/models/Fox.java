package com.greenfox.programmerclub.models;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fox {

    private String name;
    private String thisFoxesFood;
    private String thisFoxesDrink;
    private HashMap<Tricks, Boolean> learntTricks;
    private List<String> timeStamps;


    public Fox() {
        thisFoxesFood = "porridge";
        thisFoxesDrink = "water";
        learntTricks = new HashMap<>();
        for (int i = 0; i < Tricks.values().length; i++) {
            learntTricks.put(Tricks.values()[i], false);
        }
        timeStamps = new ArrayList<>();
        timeStamps.add("2017. december 18. 16:22:24 : Food etc. ");
        timeStamps.add("2017. december 18. 16:22:24 : Drink etc. ");
    }

    public Fox(String name) {
        this.name = name;
        thisFoxesFood = "porridge";
        thisFoxesDrink = "water";
        learntTricks = new HashMap<>();
        for (int i = 0; i < Tricks.values().length; i++) {
            learntTricks.put(Tricks.values()[i], false);
        }
        timeStamps = new ArrayList<>();
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

    public List<String> getTimeStamps() {
        return timeStamps;
    }

    public void setTimeStamps(List<String> timeStamps) {
        this.timeStamps = timeStamps;
    }

    public void addTrick(String trick) {
        for (Map.Entry<Tricks, Boolean> entry : learntTricks.entrySet()) {
            if (trick.equals(entry.getKey().toString())) {
                entry.setValue(true);
                timeStamps.add(LocalDateTime.now() + " : New trick has been added: " + name + " now " + trick.toLowerCase());
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
        return "This is " + name + ". Currently living on " + thisFoxesFood + " and " + thisFoxesDrink + ". He knows " + learntTricks().size() + " trick(s).";
    }

    public List<String> getTruncatedTimeStamps() {
        if (timeStamps.size() > 5) {
            List<String> truncList = new ArrayList<>();
            for (int i = timeStamps.size() - 5; i < timeStamps.size(); i++) {
                truncList.add(timeStamps.get(i));
            }
            return truncList;
        } else return timeStamps;
    }
}
