package com.greenfox.backendapi;

public class Doubler {

    private int received;
    private int result;


    public Doubler() {
    }

    public Doubler(int input) {
        received = input;
        setResult();
    }

    public int getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public int getResult() {
        return result;
    }

    public void setResult() {
        this.result = 2 * received;
    }
}
