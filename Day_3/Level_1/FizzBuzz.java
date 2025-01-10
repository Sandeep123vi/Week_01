import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // Scanner to take input from user
        Scanner input = new Scanner(System.in);

        // Ask user for a number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Validate input to ensure the number is positive
        if (number <= 0) {
            System.err.println("Error: Please enter a positive integer.");
            System.exit(0); // Exit if the number is invalid
        }

        // Create a String array to store the results of FizzBuzz
        String[] results = new String[number + 1]; // Array size is number + 1 (to include 0 to number)

        // Loop through numbers from 0 to the entered number
        for (int i = 0; i <= number; i++) {
            // Check the FizzBuzz conditions
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";  // If divisible by both 3 and 5, store "FizzBuzz"
            } else if (i % 3 == 0) {
                results[i] = "Fizz";  // If divisible by 3, store "Fizz"
            } else if (i % 5 == 0) {
                results[i] = "Buzz";  // If divisible by 5, store "Buzz"
            } else {
                results[i] = Integer.toString(i);  // Otherwise, store the number itself
            }
        }

        // Loop through the results array and display the output
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
        }

        // Close the scanner
        input.close();
    }
}
