package com.greenfox.backendapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class YodaSpeak {

    @JsonProperty("sith_text")
    private String translated;

    public YodaSpeak(Text text) {
        this.translated = yodaSpeak(text.getText());
    }

    private String yodaSpeak(String text) {
        return "Yoda says" + text;
    }

    public YodaSpeak() {
    }

    public String getTranslated() {
        return translated;
    }

    public void setTranslated(String translated) {
        this.translated = translated;
    }
}
