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


    }

}
