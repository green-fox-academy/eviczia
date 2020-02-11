package com.greenfoxacademy.springstart.contollers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

    private AtomicLong greetCount;
    private String content;

    public Greeting(AtomicLong greetCount, String content) {
        this.greetCount = greetCount;
        this.content = content;
    }

    public AtomicLong getGreetCount() {
        return greetCount;
    }

    public String getContent() {
        return content;
    }
}
