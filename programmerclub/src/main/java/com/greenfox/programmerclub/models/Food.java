package com.greenfox.programmerclub.models;

import java.time.LocalDateTime;

public enum Food implements Trackable {

    SALAD("Salad"),
    CHEESE("Cheese"),
    MEAT("Meat"),
    ICE_CREAM("Ice cream");

    public final String name;


    Food(String name) {
        this.name = name;
    }

    public static Food valueOfName(String name) {
        for (Food food : values()) {
            if (food.name.equals(name)) {
                return food;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return name;
    }


    @Override
    public String timeStamp(String newFaveFood) {
        return LocalDateTime.now().toString() + " : Favorite food has been changed from: " + this.name + " to: " + newFaveFood;
    }
}
