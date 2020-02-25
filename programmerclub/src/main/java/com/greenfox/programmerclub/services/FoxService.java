package com.greenfox.programmerclub.services;

import com.greenfox.programmerclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

    List<Fox> myFoxes;

    public FoxService() {
        this.myFoxes = new ArrayList<>();
    }

    public void addFox(Fox fox) {
        myFoxes.add(fox);
    }

    public Fox findMyFoxByName(String foxName) {

        for (Fox fox : myFoxes) {
            if (fox.getName().equals(foxName)) {
                return fox;
            }
        }
        return null;
    }

    public List<Fox> getMyFoxes() {
        return myFoxes;
    }

    public void setMyFoxes(List<Fox> myFoxes) {
        this.myFoxes = myFoxes;
    }

    @Override
    public String toString() {
        StringBuilder listFoxes = new StringBuilder();
        for (Fox fox : myFoxes) {
            listFoxes.append(fox.toString()).append("\n");

        }
        return "Hi we are your foxes: " + listFoxes.toString();
    }
}
