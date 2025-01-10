import java.util.Scanner;

public class FactorsOfNumber {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the input number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Validate the input to ensure it is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");

            // Run a for loop from 1 to number - 1
            for (int i = 1; i <= number; i++) {
                // Check if i divides the number perfectly (no remainder)
                if (number % i == 0) {
                    System.out.println(i); // Print the factor
                }
            }
        }

        // Close the scanner
        scanner.close();
    }
}
