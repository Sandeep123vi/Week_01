import java.util.Scanner;

public class FactorialUsingWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter a positive integer to calculate its factorial: ");
        int number = scanner.nextInt(); // Read the input

        // Check if the number is a positive integer
        if (number >= 0) {
            // Initialize variables
            int factorial = 1; // Factorial of 0 is 1
            int i = 1; // Start the loop from 1

            // Compute factorial using while loop
            while (i <= number) {
                factorial *= i; // Multiply factorial with the current value of i
                i++; // Increment i
            }

            // Display the result
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            // If the number is negative, display an error message
            System.out.println("Please enter a positive integer.");
        }
    }
}
