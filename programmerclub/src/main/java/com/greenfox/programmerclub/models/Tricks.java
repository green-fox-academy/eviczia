package com.greenfox.programmerclub.models;

public enum Tricks {

    RIDE("Ride a bike"),
    COFFEE("Make coffee"),
    WHISTLE("Whistle with two paws"),
    JUGGLE("Juggle balls"),
    RECITE("Recite Crime and Punishment off by heart");

    public final String name;


    Tricks(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
