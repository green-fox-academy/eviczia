import java.util.Scanner;

public class GuessMyNumber {
    private static int guesses;
    private static int secretNumber;

    public static void main(String[] args) {

        getParameters();

        playgame();
    }


    private static void playgame() {
        System.out.println("Guess!");
        while (guesses > 0) {
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            if (userInput == secretNumber) {
                System.out.println("Congratulations. You won!");
                return;
            }
            String result = (userInput > secretNumber ? "high" : "low");
            guesses--;
            System.out.printf("Too %s. You have %d lives left.\n", result, guesses);
        }
        System.out.println("The number was: " + secretNumber);


    }

    private static void getParameters() {
        System.out.println("I will think of a number. Please give me a minimum limit.");
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        System.out.printf("My number will be higher than %d. Now please give me a maximum limit.\n", min);
        int max = scanner.nextInt();
        System.out.printf("My number will be between %d and %d. How many guesses do you need?\n", min, max);
        guesses = scanner.nextInt();
        System.out.printf("I've thought of a number between %d-%d. You have %d lives.\n", min, max, guesses);

        secretNumber = (int) (Math.random() * (max - min + 1) + min);
    }
}
