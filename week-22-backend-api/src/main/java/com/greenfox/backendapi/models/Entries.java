package com.greenfox.backendapi.models;

import com.greenfox.backendapi.models.entities.Log;

public class Entries {

    private Iterable<Log> entries;

    public Entries(Iterable<Log> entries) {
        this.entries = entries;
    }

    public Iterable<Log> getEntries() {
        return entries;
    }

    public void setEntries(Iterable<Log> entries) {
        this.entries = entries;
    }
}
