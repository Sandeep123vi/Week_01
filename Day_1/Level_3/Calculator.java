import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Declare two double variables for the numbers and a string for the operator
        double first, second, result;
        String op;

        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the first number from the user
        System.out.print("Enter the first number: ");
        first = scanner.nextDouble();

        // Get the operator from the user
        System.out.print("Enter the operator (+, -, *, /): ");
        op = scanner.next();

        // Get the second number from the user
        System.out.print("Enter the second number: ");
        second = scanner.nextDouble();

        // Perform the calculation based on the operator using switch...case
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;

            case "/":
                // Check for division by zero
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator! Please enter one of the following: +, -, *, /.");
                break;
        }

        // Close the scanner to avoid memory leak
        scanner.close();
    }
}
