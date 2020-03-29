package com.greenfox.backendapi.models;

public class Appender {

    private String appended;

    public Appender(String appendable) {
        appended = appendable + "a";
    }

    public Appender() {
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
