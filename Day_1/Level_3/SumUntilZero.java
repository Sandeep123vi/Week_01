import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Initialize a variable to store the total sum
        double total = 0.0;

        // Create a variable to store the user input value
        double number;

        // Use a while loop to keep asking for numbers until 0 is entered
        do {
            // Prompt the user to enter a number
            System.out.print("Enter a number (enter 0 to stop): ");
            number = scanner.nextDouble(); // Read the input number

            // If the number is not 0, add it to the total sum
            if (number != 0) {
                total += number; // Add the number to the total
            }
        } while (number != 0); // Continue the loop until the user enters 0

        // After the loop ends, print the total sum
        System.out.println("The total sum is: " + total);
    }
}
