package com.greenfox.programmerclub.models;

import java.time.LocalDateTime;

public enum Drinks implements Loggable {

    WATER("Water"),
    MILK("Milk"),
    WINE("Wine"),
    ZERO_COLA("Zero Cola"),
    COFFEE("Coffee");

    public final String name;


    Drinks(String name) {
        this.name = name;
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
