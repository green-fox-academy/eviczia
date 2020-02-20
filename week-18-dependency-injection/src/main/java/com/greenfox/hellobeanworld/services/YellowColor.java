package com.greenfox.hellobeanworld.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("yellow")
public class YellowColor implements MyColor {
    @Override
    public String printColor() {
        return "It is yellow in color...";
        
    }
}
