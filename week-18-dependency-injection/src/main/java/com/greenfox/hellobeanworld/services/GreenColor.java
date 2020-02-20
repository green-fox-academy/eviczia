package com.greenfox.hellobeanworld.services;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("green")
public class GreenColor implements MyColor {
    @Override
    public String printColor() {
        return "It is green in color...";
        
    }
}
