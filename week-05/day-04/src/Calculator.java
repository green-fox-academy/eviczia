import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        String userInput = getUserInput();
        System.out.println(calculate(userInput));

        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
    }

    private static int calculate(String userInput) {
        String[] expressionBits = userInput.split(" ");
        int operand1 = Integer.parseInt(expressionBits[1]);
        int operand2 = Integer.parseInt(expressionBits[2]);
        switch (expressionBits[0]) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            case "%":
                return operand1 % operand2;
        }
        return calculate(getUserInput());
    }

    private static String getUserInput() {
        System.out.println("Please type in the expression:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}