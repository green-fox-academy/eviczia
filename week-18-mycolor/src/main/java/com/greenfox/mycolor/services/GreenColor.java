package com.greenfox.mycolor.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("g")
@Service

public class GreenColor implements MyColor{
    @Override
    public String printColor() {
        return "It is green in color...";

    }
}
