package com.greenfox.hellobeanworld.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("red")
public class RedColor implements MyColor {
    @Override
    public String printColor() {
        return "It is red in color...";
        
    }
}
