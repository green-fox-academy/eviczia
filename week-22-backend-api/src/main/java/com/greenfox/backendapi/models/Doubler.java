package com.greenfox.backendapi.models;

public class Doubler {

    private Integer received;
    private Integer result;


    public Doubler() {
    }

    public Doubler(Integer input) {
        received = input;
        setResult();
    }

    public int getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public int getResult() {
        return result;
    }

    public void setResult() {
        this.result = 2 * received;
    }
}
