package com.greenfox.backendapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.greenfox.backendapi.models.entities.Log;

import java.util.List;

public class Entries {

    private List<Log> entries;
    @JsonProperty("entry_count")
    private Integer count;

    public Entries(List<Log> entries) {
        this.entries = entries;
        count = entries.size();
    }

    public Iterable<Log> getEntries() {
        return entries;
    }

    public void setEntries(List<Log> entries) {
        this.entries = entries;
    }
}
