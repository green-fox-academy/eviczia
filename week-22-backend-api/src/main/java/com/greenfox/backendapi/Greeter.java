package com.greenfox.backendapi;

public class Greeter {

    private String welcomeMessage;

    public Greeter() {
    }

    public Greeter(String name, String title) {
        welcomeMessage = String.format("Oh, hi there %s, my dear %s!", name, title);
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String name, String title) {
        welcomeMessage = String.format("Oh, hi there %s, my dear %s!", name, title);
    }
}
