package com.greenfox.programmerclub.models;

import java.time.LocalDateTime;

public enum Tricks implements Trackable {

    JAVA("Codes in Java"),
    PYTHON("Writes wicked Python codes"),
    SCRATCH("Is expert in Scratch"),
    COFFEE("Makes the most splendid coffee"),
    RECITE("Recites Crime and Punishment off by heart");


    public final String name;


    Tricks(String name) {
        this.name = name;
    }

    public static Tricks valueOfName(String name) {
        for (Tricks trick : values()) {
            if (trick.name.equals(name)) {
                return trick;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public String timeStamp(String newTrick) {
        return LocalDateTime.now().toString() + " : New trick has been added: " + name;
    }

}
