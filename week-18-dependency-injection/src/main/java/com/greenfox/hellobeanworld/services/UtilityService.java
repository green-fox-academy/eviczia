package com.greenfox.hellobeanworld.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {


    ArrayList<String> colors;
    Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public boolean emailValidator(String email) {
        if (email.contains(" ")) return false;
        String[] splitEmail = email.split("@");
        if (checkSplitText(splitEmail)) {
            String domain = splitEmail[1];
            String[] splitDomain = domain.split("\\.");
            return (checkSplitText(splitDomain));
        } else return false;
    }


    private boolean checkSplitText(String[] splitText) {
        return splitText.length == 2 && splitText[0].length() > 0 && splitText[1].length() > 0;

    }

    public String caesar(String text, int number) {
        if (number < 0) {
            number = 26 + number;
        }

        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
            result += (char) (((int) text.charAt(i) + number - offset) % 26 + offset);
        }
        return result;
    }


}