package com.greenfox.cars.services;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.springframework.stereotype.Service;

@Service
public class ValidationServiceImpl implements ValidationService {


    @Override
    public Boolean checkInput(String searchterm) {
        if (searchterm.length() > 7) return false;
        return searchterm.matches(".*[-a-zA-Z0-9]");

    }
}
