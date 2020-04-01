package com.greenfox.backendapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HuText implements Translatable{
    @JsonProperty("text")
    private String sourceText;
    @JsonProperty("lang")
    private String sourceLanguage;

    public HuText() {
    }

    public void setSourceText(String sourceText) {
        this.sourceText = sourceText;
    }

    public String getSourceText() {
        return sourceText;
    }

    public String getSourceLanguage() {
        return sourceLanguage;
    }

    public void setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
    }

    public HuText(String sourceText, String sourceLanguage) {
        this.sourceText = sourceText;
        this.sourceLanguage = sourceLanguage;


    }

    @Override
    public TargetText translate(String huText) {
        return null;
    }
}
