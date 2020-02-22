package com.greenfox.mycolor.services;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("lg")
@Service

public class Limegreen implements MyColor {


    @Override
    public String printColor() {
        return "It is limegreen in color...";

    }
}
