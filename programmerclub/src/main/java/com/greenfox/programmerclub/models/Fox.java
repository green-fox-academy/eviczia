package com.greenfox.programmerclub.models;


import java.util.ArrayList;
import java.util.List;

public class Fox {

    private String name;
    private List<Tricks> thisFoxesTricks;
    private String thisFoxesFood;
    private String thisFoxesDrink;


    public Fox() {
        thisFoxesTricks = new ArrayList<>();
//        thisFoxesFood = "chocolate";
//        thisFoxesDrink = "tea";
//        thisFoxesTricks.add(Tricks.WHISTLE);
    }

    public Fox(String name) {
        this.name = name;
        thisFoxesTricks = new ArrayList<>();
//        thisFoxesFood = "chocolate";
//        thisFoxesDrink = "coffee";
//        thisFoxesTricks.add(Tricks.COFFEE);
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

    public void addTrick(Tricks trick){
        thisFoxesTricks.add(trick);
    }

    public List<Tricks> getThisFoxesTricks() {
        return thisFoxesTricks;
    }

    public void setThisFoxesTricks(List<Tricks> thisFoxesTricks) {
        this.thisFoxesTricks = thisFoxesTricks;
    }

    public String listTricks() {
        if (thisFoxesTricks.size()==0) {
            return "You know no tricks, yet. Go and learn some.";
        } else {
            StringBuilder trickList = new StringBuilder();
            for (Tricks trick:thisFoxesTricks) {
                trickList.append(trick).append("\n");
            }
            return trickList.toString();
        }
    }


    @Override
    public String toString() {
        return "This is " + name + ". Currently living on " + thisFoxesFood + " and " + thisFoxesDrink + ". He knows " + thisFoxesTricks.size() + " trick(s).";
    }
 }
