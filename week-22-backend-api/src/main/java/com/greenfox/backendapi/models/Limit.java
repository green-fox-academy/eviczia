package com.greenfox.backendapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Limit {

    @JsonProperty("until")
    private Integer limit;

    public Limit(Integer limit) {
        this.limit = limit;
    }

    public Limit() {
    }

    public Result sum() {
        return new Result(sumUpTo(limit));
    }

    private Integer sumUpTo(Integer limit) {
        if (limit == 0) return 0;
        return limit + sumUpTo(limit - 1);
    }


    public Result factor() {
        return new Result(multiplyUpTo(limit));
    }

    private Integer multiplyUpTo(Integer limit) {
        if (limit == 1) return 1;
        return multiplyUpTo(limit - 1) * limit;
    }


    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
