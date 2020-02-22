package com.greenfox.mycolor.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("rp")
@Service
public class Rebeccapurple implements MyColor {
    @Override
    public String printColor() {

        return "It is rebeccapurple in color...";
    }
}
