package com.greenfox.programmerclub.models;


import java.util.ArrayList;
import java.util.List;

public class Fox {

    private String name;
    private List<Tricks> thisFoxesTricks;
    private Food thisFoxesFood;
    private Drinks thisFoxesDrink;


    public Fox() {
        thisFoxesTricks = new ArrayList<>();
    }

    public Fox(String name) {
        this.name = name;
        thisFoxesTricks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food getThisFoxesFood() {
        return thisFoxesFood;
    }

    public void setThisFoxesFood(Food thisFoxesFood) {
        this.thisFoxesFood = thisFoxesFood;
    }

    public Drinks getThisFoxesDrink() {
        return thisFoxesDrink;
    }

    public void setThisFoxesDrink(Drinks thisFoxesDrink) {
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
