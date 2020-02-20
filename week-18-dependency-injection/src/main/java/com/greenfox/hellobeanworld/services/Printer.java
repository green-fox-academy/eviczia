package com.greenfox.hellobeanworld.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {

    public Printer() {
    }

    public void log(@Qualifier("red") MyColor myColor) {
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + myColor.printColor());
    }
}

