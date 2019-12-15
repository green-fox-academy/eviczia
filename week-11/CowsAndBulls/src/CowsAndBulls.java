import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CowsAndBulls {

    private int numberToGuess;
    private boolean isPlaying;
    private int countGuesses;

    public CowsAndBulls() {
        numberToGuess = (int)(Math.random()*9000+1000);
        isPlaying = true;
        countGuesses = 0;
    }

    public int getNumberToGuess() {
        return numberToGuess;
    }

    public String isPlaying() {
        return (isPlaying ? "playing" : "finished");
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public int getCountGuesses() {
        return countGuesses;
    }

    public void setCountGuesses(int countGuesses) {
        this.countGuesses = countGuesses;
    }

    public HashMap<String, Integer> numberToHashMap(int fourDigitNumber) {
        HashMap<String, Integer> fourDigitsHashMap = new HashMap<>();
        int n = fourDigitNumber;
        fourDigitsHashMap.put("first", n / 1000);
        n = n % 1000;
        fourDigitsHashMap.put("second", n / 100);
        n = n % 100;
        fourDigitsHashMap.put("third", n / 10);
        n = n % 10;
        fourDigitsHashMap.put("fourth", n);

        return fourDigitsHashMap;
    }
    public int[] compareNumbers (int guess) {
        int cowCounter = 0;
        int bullCounter = 0;
        HashMap<String, Integer> myGuess = this.numberToHashMap(guess);
        HashMap<String, Integer> guessThis = this.numberToHashMap(numberToGuess);

        for (Map.Entry digitGuess : myGuess.entrySet()) {
            for (Map.Entry digitNumber : guessThis.entrySet()) {
                if (digitGuess.getKey() == digitNumber.getKey() & digitGuess.getValue() == digitNumber.getValue()) {
                    cowCounter++;
                    guessThis.remove(digitNumber.getKey());
                    myGuess.replace((String)digitGuess.getKey(), -1);
                    System.out.println(guessThis);
                    System.out.println(myGuess);
                    break;
                }
            }
        }
        for (Map.Entry digitGuess : myGuess.entrySet()) {
            for (Map.Entry digitNumber : guessThis.entrySet()) {
                if (digitGuess.getValue() == digitNumber.getValue()) {
                    bullCounter++;
                    guessThis.remove(digitNumber.getKey());
                    break;
                }
            }
        }
        return new int[]{cowCounter, bullCounter};
    }

    public String getResult (int[] cowBullresult) {
        return cowBullresult[0] + " cow, " + cowBullresult[1] + " bull";
    }

}