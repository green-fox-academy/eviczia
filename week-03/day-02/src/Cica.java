import java.util.Scanner;

public class Cica {

    public static void main(String[] args) {
        int firstNumber = 3;
        double doubleNumber = 1.5;
        int secondNumber;
        secondNumber = 1;
        boolean isHungry = true;

        char letter = 'a';

        int thirdNumber = firstNumber + secondNumber;
        System.out.println(thirdNumber);

        thirdNumber++;
        System.out.println(thirdNumber);

        thirdNumber = thirdNumber + 5;
        thirdNumber += 5;
        System.out.println(thirdNumber);

        Boolean isThirdBigger = thirdNumber > firstNumber;
        System.out.println(isThirdBigger);

        isThirdBigger = thirdNumber != firstNumber;
        System.out.println(isThirdBigger);

        isHungry = true;

        boolean isSleepy = false;

        System.out.println();
        System.out.println("boolean operators");
        System.out.println(isHungry || isSleepy);

        String name = "Furkesz";
        System.out.println("Hello " + name + "!");

        String anotherString = "Hello " + thirdNumber + "!";
        System.out.println(anotherString);

        System.out.println();
        System.out.println("if statement");

        thirdNumber++;
        if (thirdNumber == 15) {
            System.out.println("third number is 15");
        } else if (thirdNumber < 15){
            System.out.println("third number is lower than 15");
        } else if (thirdNumber > 15){
            System.out.println("third number is bigger than 15");

        }
        System.out.println();
// scanner


        System.out.println("givenNumber");

        System.out.println("please give me a number");
        Scanner scanner = new Scanner(System.in);

        int givenNumber = scanner.nextInt();
        System.out.println("your number is: " + givenNumber);

        System.out.println();
//loop -for


        for(int i = 1; i < givenNumber; i++){
            System.out.println(i);
        }
        System.out.println();
//loop -while
        int a = 4;
        while (a < 10) {
            System.out.println(a);
            a++;
        }
        System.out.println();

//loop -do while
        int b = 4;
        do {
            b++;
            System.out.println(b);

        } while (b < 10);

System.out.println();

//Switch case
        System.out.println("please tell me your name");
        String myName = scanner.nextLine();
        String output;
        if (myName.equals("Furkesz")) {
            output = "Hi Furkesz";
        } else if (myName.equals("Bela")) {
            output = "Nice to meet you Bela";
        } else if (myName.equals("Karoly")) {
            output = "What is up Karoly";
        } else {
            output = "Please leave the room";
        }



    }}

