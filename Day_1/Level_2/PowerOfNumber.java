import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the base number and the exponent (power) from the user
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // Initialize the result variable to 1 (as the identity for multiplication)
        int result = 1;

        // Validate if power is non-negative
        if (power < 0) {
            System.out.println("Please enter a non-negative power.");
        } else {
            // Run a for loop from 1 to power (inclusive)
            for (int i = 1; i <= power; i++) {
                result *= number; // Multiply result by the number in each iteration
            }

            // Print the result
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        }

        // Close the scanner
        scanner.close();
    }
}
