import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt(); // Read the input

        // Check if the number is a natural number (non-negative)
        if (n >= 0) {
            // Compute the sum using the formula
            int sumByFormula = n * (n + 1) / 2;

            // Compute the sum using a while loop
            int sumByLoop = 0; // Initialize the sum
            int i = 1; // Start from 1
            while (i <= n) {
                sumByLoop += i; // Add the current value of i to the sum
                i++; // Increment i
            }

            // Display both results
            System.out.println("Sum using formula: " + sumByFormula);
            System.out.println("Sum using while loop: " + sumByLoop);

            // Compare the results
            if (sumByFormula == sumByLoop) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("There is a discrepancy in the results.");
            }
        } else {
            // If the number is not a natural number
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}
