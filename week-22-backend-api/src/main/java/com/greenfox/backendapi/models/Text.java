package com.greenfox.backendapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Text {

    private String text;

    public Text(String text) {
        this.text = text;
    }

    public Text() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
