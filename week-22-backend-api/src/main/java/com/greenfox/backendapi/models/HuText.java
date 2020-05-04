package com.greenfox.backendapi.models;


public class HuText extends TextToTranslate {

    public HuText(String text) {
        super(text, "hu");
    }

    @Override
    public String translate(String targetLanguage) {
        switch (targetLanguage) {
            case "teve":
                return toTeve(getText());
        }
        return null;
    }

    private String toTeve(String text) {
        return text + "tuvudsz ivigy beveszévélnivi";
    }
}
