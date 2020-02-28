package com.greenfox.programmerclub.services;

import com.greenfox.programmerclub.models.Fox;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

    private List<Fox> myFoxes;

    public FoxService() {
        this.myFoxes = new ArrayList<>();
    }

    public Fox findMyFoxByName(String foxName) {
        for (Fox fox : myFoxes) {
            if (fox.getName().equals(foxName)) {
                return fox;
            }
        }
        return null;
    }

    public void addFox(Fox fox) {
        myFoxes.add(fox);
    }

    public String getWelcomeMessage(String name) {
        if (findMyFoxByName(name) == null) {
            addFox(new Fox(name));
            return "New fox added. Please take good care of him!";
        } else return "Hello again!";
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
