package com.greenfox.backendapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TargetText {
    @JsonProperty("translated")
    private String targetText;
    @JsonProperty("lang")
    private String targetLanguage;

    public TargetText() {
    }

    public TargetText(String sourceText) {
        this.targetText = translate(sourceText);
        targetLanguage = "teve";
    }

    public String getTargetText() {
        return targetText;
    }

    public String translate(String sourceText) {
        return "There, translated: " + sourceText;

    }

    public void setTargetText(String targetText) {
        this.targetText = targetText;
    }

    public String getTargetLanguage() {
        return targetLanguage;
    }

    public void setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
    }
}
