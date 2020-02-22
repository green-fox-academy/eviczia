package com.greenfox.mycolor.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {

    MyColor myColor;

    @Autowired
    public Printer(@Qualifier("lg") MyColor myColor) {
        this.myColor = myColor;
    }

    public void log() {
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + myColor.printColor());
    }
}

