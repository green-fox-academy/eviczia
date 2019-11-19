package Sharpie2;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    //Sharpie Set
    //Reuse your Sharpie class
    //Create SharpieSet class
    List<Sharpie> sharpies = new ArrayList<>();

    public SharpieSet() {
        this.sharpies = new ArrayList<>();
    }

    public int countUsable() {
        int usable = 0;
        for (Sharpie sharpie : sharpies) {
            if (sharpie.inkAmount != 0) {
                usable ++;
            }
        }
        return usable;
    }

    public void removeTrash() {
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount == 0) {
                sharpies.remove(sharpies.get(i));
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < sharpies.size(); i++) {
            result += (i+1) + ". " + sharpies.get(i) + "\n";
        }
        return result;
    }

    //it contains a list of Sharpie
    //countUsable() -> sharpie is usable if it has ink in it
    //removeTrash() -> removes all unusable sharpies
}
