import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Initialize a variable to store the total sum
        double total = 0.0;

        // Use an infinite while loop
        while (true) {
            // Prompt the user to enter a number
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = scanner.nextDouble(); // Read the input number

            // Check if the number is 0 or negative
            if (number <= 0) {
                break; // Exit the loop if the number is 0 or negative
            }

            // Add the number to the total sum
            total += number;
        }

        // After the loop ends, print the total sum
        System.out.println("The total sum is: " + total);
    }
}

