package com.greenfox.backendapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeter {

    @JsonProperty("welcome_message")
    private String message;

    public Greeter() {
    }

    public Greeter(String name, String title) {
        message = String.format("Oh, hi there %s, my dear %s!", name, title);
    }

    public String getMessage() {
        return message;
    }

    public void setWelcomeMessage(String name, String title) {
        message = String.format("Oh, hi there %s, my dear %s!", name, title);
    }
}
