package com.greenfox.programmerclub.models;

public enum Tricks {

    JAVA("Codes in Java"),
    PYTHON("Writes wicked Python codes"),
    SCRATCH("Is expert in Scratch"),
    COFFEE("Makes the most splendid coffee"),
    RECITE("Recites Crime and Punishment off by heart");


    public final String name;


    Tricks(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
