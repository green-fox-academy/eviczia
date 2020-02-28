package com.greenfox.programmerclub.models;

import java.time.LocalDateTime;

public enum Drinks implements Trackable {

    FAITH("faith"),
    WATER("water"),
    MILK("milk"),
    WINE("wine"),
    ZERO_COLA("zero cola"),
    COFFEE("coffee");

    public final String name;


    Drinks(String name) {
        this.name = name;
    }

    public static String[] toStringArray() {
        String[] stringArray = new String[Drinks.values().length];
        for (int i = 0; i < Drinks.values().length; i++) {
            stringArray[i] = Drinks.values()[i].toString();
        }
        return stringArray;
    }

    public static Drinks valueOfName(String name) {
        for (Drinks drink : values()) {
            if (drink.name.equals(name)) {
                return drink;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public String timeStamp(String newFaveDrink) {
        return LocalDateTime.now().toString() + " : Favorite drink has been changed from: " + name + " to: " + newFaveDrink;
    }
}
