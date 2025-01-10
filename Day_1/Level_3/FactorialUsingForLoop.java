import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter a positive integer to calculate its factorial: ");
        int number = scanner.nextInt(); // Read the input

        // Check if the number is a positive integer
        if (number >= 0) {
            // Initialize the factorial variable to 1 (Factorial of 0 is 1)
            int factorial = 1;

            // Compute factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply factorial by i at each iteration
            }

            // Display the result
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            // If the number is negative, display an error message
            System.out.println("Please enter a positive integer.");
        }
    }
}
