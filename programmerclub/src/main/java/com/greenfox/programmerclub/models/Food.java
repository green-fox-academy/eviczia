package com.greenfox.programmerclub.models;

import java.time.LocalDateTime;

public enum Food implements Trackable {

    HOPE("hope"),
    SALAD("salad"),
    CHEESE("cheese"),
    MEAT("meat"),
    ICE_CREAM("ice cream");

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

    public static String[] toStringArray() {
        String[] stringArray = new String[Food.values().length];
        for (int i = 0; i < Food.values().length; i++) {
            stringArray[i] = Food.values()[i].toString();
        }
        return stringArray;
    }

    @Override
    public String toString() {
        return name;
    }


    @Override
    public String logEvent(String newFaveFood) {
        return LocalDateTime.now().toString() + " : Favorite food has been changed from: " + name + " to: " + newFaveFood;
    }
}
